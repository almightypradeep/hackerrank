package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int i = Integer.parseInt(br.readLine());
            double d = Double.parseDouble(br.readLine());
            String s = br.readLine();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
