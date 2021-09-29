package ua.com.alevel.crud;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class iOFileCrudService implements FileCrudService {



    @Override
    public void deleteFile(String pathToFile) {

        File file = new File(pathToFile);
        file.delete();
    }

    @Override
    public void uniqueFileWriting(String pathFromFile, String pathToFile) {

        try {
            List<String> list = Files.lines(Paths.get(pathFromFile))
                    .map(line -> line.split("[\\p{Punct}\\s]+")).flatMap(Arrays::stream)
                    .map(String::valueOf)
                    .collect(Collectors.toList());

            Collections.sort(list, Collections.reverseOrder());

            TreeSet<String> unique = new TreeSet<String>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });

            unique.addAll(list);
            FileWriter fileWriter = new FileWriter(pathToFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (String key : unique) {

                bw.write(key + ": " + Collections.frequency(list, key));
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File input.txt is not exist! Please create input.txt file in unit_9_ionio root folder and fill with data!");
        }
    }

    @Override
    public void isPalindrome(String pathFromFile, String pathToFile) {

        try {
            List<String> list = Files.lines(Paths.get(pathFromFile))
                    .map(line -> line.split("[\\p{Punct}\\s]+")).flatMap(Arrays::stream)
                    .map(String::toLowerCase)
                    .map(String::valueOf)
                    .collect(Collectors.toList());

            HashSet<String> unique = new HashSet<>(list);
            FileWriter fileWriter = new FileWriter(pathToFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (String key : unique) {
                if (key.equalsIgnoreCase(new StringBuilder(key).reverse().toString())) {
                    bw.write(key + ": " + Collections.frequency(list, key));
                    bw.write("\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File input.txt is not exist! Please create input.txt file in unit_9_ionio root folder and fill with data!");
        }
    }

    @Override
    public void sentenceAmount(String pathFromFile, String pathToFile) {

        try {
            List<String> list = Files.lines(Paths.get(pathFromFile))
                    .map(line -> line.split("[\\\\.\\\\?!]")).flatMap(Arrays::stream)
                    .map(String::trim)
                    .map(String::valueOf)
                    .collect(Collectors.toList());

            ArrayList<String> unique = new ArrayList<>(list);
            FileWriter fileWriter = new FileWriter(pathToFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            int count = 0;
            for (String key : unique) {
                count++;
            }
            bw.write("Total count of sentences is: " + count + "\n");
            bw.write("See them all below:" + "\n");
            for (String key : unique) {
                bw.write(key);
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File input.txt is not exist! Please create input.txt file in unit_9_ionio root folder and fill with data!");
        }
    }

    @Override
    public void readFile(String pathToFile) {

        File file = new File(pathToFile);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int singleCharInt;
            char singleChar;

            while ((singleCharInt = fileInputStream.read()) != -1) {
                singleChar = (char) singleCharInt;
                System.out.print(singleChar);
            }
        } catch (IOException e) {
            System.out.println("File output.txt is not exist!");
        }

    }
}
