package samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FizzBuzz {
    public static void main(String args[]) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = captureNumberOfTestcases(br);
            FizzBuzzInput fizzBuzzInput = captureInputs(br, N);
            fizzBuzzInput.printOutput();
        }
    }

    private static FizzBuzzInput captureInputs(BufferedReader br, int n) throws IOException {
        System.out.println("Enter the inputs now:");
        return new FizzBuzzInput(n, br.readLine());
    }

    private static int captureNumberOfTestcases(BufferedReader br) throws IOException {
        try {
            System.out.println("Enter number of test cases");
            String line = br.readLine();
            return Integer.parseInt(line);
        } catch (Exception e) {
            throw new RuntimeException("Invalid number of testcases.");
        }

    }
}

class FizzBuzzInput {
    int numberOfTestcases;
    String originalInput;
    private final String[] split;

    public FizzBuzzInput(int numberOfTestcases, String originalInput) {
        this.numberOfTestcases = numberOfTestcases;
        this.originalInput = originalInput;
        split = originalInput.split(" ");
    }

    public void printOutput() throws IOException {
        for (int i = 0; i < numberOfTestcases; i++) {
            int num = Integer.parseInt(split[i].trim());
            for (int j = 1; j <= num; j++) {
                String output = j + "";
                if (j % 3 == 0) {
                    output = "Fizz";
                }
                if (j % 5 == 0) {
                    output = "Buzz";
                }
                if (j % 3 == 0 && j % 5 == 0) {
                    output = "samples.FizzBuzz";
                }
                System.out.println(output);
            }
        }
    }
}