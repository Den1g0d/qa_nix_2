package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class UnitThreeTaskTwo {

    public void run() throws IOException {

        System.out.println("Please input your string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String s = reader.readLine();
        char[] chars = s.toCharArray();

        Arrays.sort(chars);
        char[] specialChars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        int[] freq = new int[118];
        int sort = 1;


        for (int i = 0; i < chars.length; i++) {
                char ch = s.charAt(i);

            for (int j = 0; j < specialChars.length; j++) {
                if (ch == specialChars[j]) {
                    freq[j]++;
                }
            }
        }

        System.out.println("Frequency of latin and cyrillic letters:");

        for (int i = 0; i < specialChars.length; i++) {
            if (freq[i] != 0) {
                int ascCount = sort++;
                System.out.println(ascCount + ". " + specialChars[i] + " - " + freq[i]);
            }
        }

    }
}