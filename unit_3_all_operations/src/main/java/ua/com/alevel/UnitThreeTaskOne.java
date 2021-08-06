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
        int i = 0;
        while (i < chars.length) {
            int a = Character.getNumericValue(chars[i]);
            if ((a >= 0) && (a <= 9)) {
                result += a;
            }
            i++;
        }

        if (result <= Integer.MAX_VALUE) {
            System.out.println("Sum of all numbers: " + result);
        } else {
            System.out.println("Max output result is exceeded");
        }
    }
}
