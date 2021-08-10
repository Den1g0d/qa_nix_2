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

        System.out.println("Please enter string to reverse by keyword:");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader1.readLine();

        System.out.println("Please enter exact word in string to reverse:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = reader2.readLine();

        SampleReverse obj1 = new SampleReverse();
        System.out.println(obj1.reverse(s1, s2));

        System.out.println("Please enter string to reverse by Index:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String s3 = reader3.readLine();
        System.out.println("Please input first IndexOf string to reverse");
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        int s4 = Integer.parseInt(reader4.readLine());
        System.out.println("Please enter last IndexOf string to reverse");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        int s5 = Integer.parseInt(reader5.readLine());
        StringReverseByIndex obj2 = new StringReverseByIndex();
        System.out.println(obj2.reverse(s3, s4, s5));
    }
}