package hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageFractionInList {

    public static void main(String[] args) {
        float zeros = 0;
        float positive = 0;
        float negative = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                int input = scanner.nextInt();
                if (input == 0) {
                    zeros++;
                } else if (input > 0) {
                    positive++;
                } else if (input < 0) {
                    negative++;
                }
            }

            DecimalFormat fmt = new DecimalFormat("#.######");
            System.out.println(fmt.format(positive / size));
            System.out.println(fmt.format(negative/size));
            System.out.println(fmt.format(zeros/size));
        }

    }
}