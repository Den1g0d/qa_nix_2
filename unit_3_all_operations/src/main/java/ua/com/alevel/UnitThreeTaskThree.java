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

    public void run() {
        System.out.println("Please input lesson number from 1 till 10 to find lesson end time:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sInt = 0;

        try {
            sInt = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
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
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assert sT != null;
        assert lD != null;
        assert sB != null;
        assert lB != null;

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
        long minutesLessonOne = lessonOne / 60_000L % 60L;
        long hoursLessonTwo = TimeUnit.MILLISECONDS.toHours(lessonTwo);
        long minutesLessonTwo = lessonTwo / 60_000L % 60L;
        long hoursLessonThree = TimeUnit.MILLISECONDS.toHours(lessonThree);
        long minutesLessonThree = lessonThree / 60_000L % 60L;
        long hoursLessonFour = TimeUnit.MILLISECONDS.toHours(lessonFour);
        long minutesLessonFour = lessonFour / 60_000L % 60L;
        long hoursLessonFive = TimeUnit.MILLISECONDS.toHours(lessonFive);
        long minutesLessonFive = lessonFive / 60_000L % 60L;
        long hoursLessonSix = TimeUnit.MILLISECONDS.toHours(lessonSix);
        long minutesLessonSix = lessonSix / 60_000L % 60L;
        long hoursLessonSeven = TimeUnit.MILLISECONDS.toHours(lessonSeven);
        long minutesLessonSeven = lessonSeven / 60_000L % 60L;
        long hoursLessonEight = TimeUnit.MILLISECONDS.toHours(lessonEight);
        long minutesLessonEight = lessonEight / 60_000L % 60L;
        long hoursLessonNine = TimeUnit.MILLISECONDS.toHours(lessonNine);
        long minutesLessonNine = lessonNine / 60_000L % 60L;
        long hoursLessonTen = TimeUnit.MILLISECONDS.toHours(lessonTen);
        long minutesLessonTen = lessonTen / 60_000L % 60L;

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
            default:
                System.out.println("Your input is not in range from 1 till 10");
        }
    }
}