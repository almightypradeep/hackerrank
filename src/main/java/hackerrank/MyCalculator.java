package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int divisor = 1;
        int sum = 0;
        while (divisor <= n) {
            if (n % divisor == 0) {
                sum+=divisor;
            }
            divisor++;
        }
        return sum;
    }

    private static int captureInput(Scanner br) throws IOException {
        try {
            String line = br.nextLine();
            return Integer.parseInt(line);
        } catch (Exception e) {
            throw new RuntimeException("Invalid number of testcases.");
        }

    }

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            MyCalculator calculator = new MyCalculator();
            int n = captureInput(scanner);
            int result = calculator.divisorSum(n);
            System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getSimpleName());
            System.out.println(result);
        }
    }
}
