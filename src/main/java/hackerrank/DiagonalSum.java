package hackerrank;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int sum;
            int size = scanner.nextInt();
            int[][] array = new int[size][size];
            int diagonal1=0;
            int diagonal2=0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = scanner.nextInt();
                    if(i==j){
                        diagonal1+=array[i][j];
                    }
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("\n");
            }

            System.out.println(diagonal1);

            for (int i = 0; i < size; i++) {
                for (int j = size-i-1; j >= 0; j--) {
                    diagonal2+=array[i][j];
                    break;
                }
            }

            sum=Math.abs(diagonal1-diagonal2);
            System.out.println(sum);
        }
    }
}