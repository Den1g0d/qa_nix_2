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
        System.out.println("Sum of all numbers: " + result);
    }
}