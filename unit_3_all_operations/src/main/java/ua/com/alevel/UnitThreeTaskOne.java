package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitThreeTaskOne {

    public void run() throws IOException {

        System.out.println("Please input your string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        int result = 0;

        // Optimized for-each loop
        for (char a : chars) {
            int i = Character.getNumericValue(a);
            if (i >= 0 && i <= 9) {
                result += i;
            }
        }

//        Previous for loop:
//        for (int i = 0; i < chars.length; i++) {
//            int a = Character.getNumericValue(chars[i]);
//            if (a >= 0 && a <= 9) {
//                result += a;
//            }
//        }

        System.out.println("Sum of all numbers: " + result);

    }
}