package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Please input your string for output reverse:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringReverseAll obj = new StringReverseAll();
        obj.reverse(s, true);
        System.out.println("Full words reverse:");
        System.out.println(obj.reverse(s, true));
        System.out.printf("Reverse individual words:" + "\n");
        System.out.println(obj.reverse(s, false));

        System.out.println("Please enter string to reverse:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();

        System.out.println("Please enter exact word in string to reverse:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = reader2.readLine();

        SampleReverse obj1 = new SampleReverse();
        obj1.reverse(s1, s2);
        System.out.println(obj1.reverse(s1, s2));
    }
}