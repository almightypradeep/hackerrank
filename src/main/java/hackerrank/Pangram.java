package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            Set<String> texts = new HashSet<>();
            char[] chars = line.replaceAll(" ", "").toCharArray();
            for (char c : chars){
                texts.add(String.valueOf(c).toLowerCase());
            }
            System.out.println(texts.size());
            if(texts.size() == 26){
                System.out.println("pangram");
            }else{
                System.out.println("not pangram");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}