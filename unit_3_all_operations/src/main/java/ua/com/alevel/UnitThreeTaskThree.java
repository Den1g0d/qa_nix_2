package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class UnitThreeTaskThree {
    public void run() throws IOException {
        System.out.println("Please input lesson number from 1 till 10 to find lesson end time:");

        BufferedReader readerInteger = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    //    String sInt = readerInteger.readLine();
        int sInt = 0;
        try {
            sInt = Integer.parseInt(readerInteger.readLine());
        } catch (IOException e) {
            System.out.println("Twe");
        }

        String StartTime = "09:00";
        String lessonDuration = "00:45";
        String smallBreak = "00:05";
        String longBreak = "00:15";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date sT = null;
        Date lD = null;
        Date sB = null;
        Date lB = null;

        try {
            sT = format.parse(StartTime);
            lD = format.parse(lessonDuration);
            sB = format.parse(smallBreak);
            lB = format.parse(longBreak);
        } catch (
                ParseException e) {
            e.printStackTrace();
        }

        long lessonOne = sT.getTime() + lD.getTime();
        long lessonTwo = lessonOne + sB.getTime() + lD.getTime();
        long lessonThree = lessonTwo + lB.getTime() + lD.getTime();
        long lessonFour = lessonThree + sB.getTime() + lD.getTime();
        long lessonFive = lessonFour + lB.getTime() + lD.getTime();
        long lessonSix = lessonFive + sB.getTime() + lD.getTime();
        long lessonSeven = lessonSix + lB.getTime() + lD.getTime();
        long lessonEight = lessonSeven + sB.getTime() + lD.getTime();
        long lessonNine = lessonEight + lB.getTime() + lD.getTime();
        long lessonTen = lessonNine + sB.getTime() + lD.getTime();

        long hoursLessonOne = TimeUnit.MILLISECONDS.toHours(lessonOne);
        long minutesLessonOne = (lessonOne / (60 * 1000)) % 60;

        long hoursLessonTwo = TimeUnit.MILLISECONDS.toHours(lessonTwo);
        long minutesLessonTwo = (lessonTwo / (60 * 1000)) % 60;

        long hoursLessonThree = TimeUnit.MILLISECONDS.toHours(lessonThree);
        long minutesLessonThree = (lessonThree / (60 * 1000)) % 60;

        long hoursLessonFour = TimeUnit.MILLISECONDS.toHours(lessonFour);
        long minutesLessonFour = (lessonFour / (60 * 1000)) % 60;

        long hoursLessonFive = TimeUnit.MILLISECONDS.toHours(lessonFive);
        long minutesLessonFive = (lessonFive / (60 * 1000)) % 60;

        long hoursLessonSix = TimeUnit.MILLISECONDS.toHours(lessonSix);
        long minutesLessonSix = (lessonSix / (60 * 1000)) % 60;

        long hoursLessonSeven = TimeUnit.MILLISECONDS.toHours(lessonSeven);
        long minutesLessonSeven = (lessonSeven / (60 * 1000)) % 60;

        long hoursLessonEight = TimeUnit.MILLISECONDS.toHours(lessonEight);
        long minutesLessonEight = (lessonEight / (60 * 1000)) % 60;

        long hoursLessonNine = TimeUnit.MILLISECONDS.toHours(lessonNine);
        long minutesLessonNine = (lessonNine / (60 * 1000)) % 60;

        long hoursLessonTen = TimeUnit.MILLISECONDS.toHours(lessonTen);
        long minutesLessonTen = (lessonTen / (60 * 1000)) % 60;

   //     int intValue = Integer.parseInt(sInt); //преобразовываем строку в число

        if ((sInt > 0) && (sInt <= 10)) {
            switch (sInt) {
                case 1:
                    System.out.println(hoursLessonOne + " " + minutesLessonOne);
                    break;
                case 2:
                    System.out.println(hoursLessonTwo + " " + minutesLessonTwo);
                    break;
                case 3:
                    System.out.println(hoursLessonThree + " " + minutesLessonThree);
                    break;
                case 4:
                    System.out.println(hoursLessonFour + " " + minutesLessonFour);
                    break;
                case 5:
                    System.out.println(hoursLessonFive + " " + minutesLessonFive);
                    break;
                case 6:
                    System.out.println(hoursLessonSix + " " + minutesLessonSix);
                    break;
                case 7:
                    System.out.println(hoursLessonSeven + " " + minutesLessonSeven);
                    break;
                case 8:
                    System.out.println(hoursLessonEight + " " + minutesLessonEight);
                    break;
                case 9:
                    System.out.println(hoursLessonNine + " " + minutesLessonNine);
                    break;
                case 10:
                    System.out.println(hoursLessonTen + " " + minutesLessonTen);
                    break;
            }
        } else {
            System.out.println("Your input is not in range from 1 till 10");
        }
    }
}
