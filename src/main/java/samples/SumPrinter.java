package samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class SumPrinter {
    public static void main(String args[] ) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = captureNumberOfTestcases(br);
            List<Input> inputs = captureInputs(br, N);
            printOutputs(inputs);
        }
    }

    private static void printOutputs(List<Input> inputs) {
        for (Input input : inputs) {
            System.out.println(input.result());
        }
    }

    private static List<Input> captureInputs(BufferedReader br, int n) throws IOException {
        System.out.println("Enter the inputs now:");
        List<Input> inputs = new ArrayList<Input>();
        for (int i = 0; i < n; i++) {
            inputs.add(new Input(br.readLine()));
        }
        return inputs;
    }

    private static int captureNumberOfTestcases(BufferedReader br) throws IOException {
        try{
            System.out.println("Enter number of test cases");
            String line = br.readLine();
            return Integer.parseInt(line);
        } catch (Exception e){
            throw new RuntimeException("Invalid number of testcases.");
        }

    }
}

class Input {
    Integer a;
    Integer b;

    String originalInput;

    public String getOriginalInput() {
        return originalInput;
    }

    public Input(String originalInput) {
        this.originalInput = originalInput;
        process();

    }

    public void process(){
        try{
            String[] split = originalInput.split(" ");
            a = Integer.parseInt(split[0].trim());
            b = Integer.parseInt(split[1].trim());
        }catch (Exception e){
            throw new RuntimeException("Invalid samples.Input. A or B cannot be empty and have to be valid integers.");
        }
    }

    public Integer result(){
        return a + b;
    }
}