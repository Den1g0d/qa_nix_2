package ua.com.alevel.controller;

import ua.com.alevel.crud.FileCrudService;
import ua.com.alevel.crud.FileInput;
import ua.com.alevel.crud.FileOutput;
import ua.com.alevel.crud.iOFileCrudService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrudController {

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want to update output.txt with unique words and their amount descending order from input.txt, please enter 1");
        System.out.println("if you want to update output.txt with palindromes and their amount from input.txt, please enter 2");
        System.out.println("if you want to update output.txt with sentences and their total amount from input.txt, please enter 3");
        System.out.println("if you want to read output.txt, please enter 4");
        System.out.println("if you want to delete, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }
    FileCrudService service = new iOFileCrudService();
    private void crud(String position, BufferedReader reader) throws IOException {
        switch (position) {
            case "1":
                service.uniqueFileWriting(FileInput.FILE_TXT.getPath(), FileOutput.FILE_TXT.getPath());
                break;
            case "2":
                service.isPalindrome(FileInput.FILE_TXT.getPath(), FileOutput.FILE_TXT.getPath());
                break;
            case "3":
                service.sentenceAmount(FileInput.FILE_TXT.getPath(), FileOutput.FILE_TXT.getPath());
                break;
            case "4":
                service.readFile(FileOutput.FILE_TXT.getPath());
                break;
            case "5":
                service.deleteFile(FileOutput.FILE_TXT.getPath());
                break;
        }
        runNavigation();
    }
}
