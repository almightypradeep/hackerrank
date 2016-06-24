package hackerrank;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int size = scanner.nextInt();
            for (int i = 1; i <= size; i++) {
                padSpace(size, i);
                padBricks(i);
            }
        }
    }

    private static void padBricks(int bricks) {
        for (int j = 0; j < bricks; j++) {
            System.out.print("#");
        }
        System.out.println();
    }

    private static void padSpace(int size, int i) {
        int idx = i;
        while(size-idx > 0){
            System.out.print(" ");
            idx++;
        }
    }
}