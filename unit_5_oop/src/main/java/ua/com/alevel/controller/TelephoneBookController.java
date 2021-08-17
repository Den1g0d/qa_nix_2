package ua.com.alevel.controller;

import ua.com.alevel.entity.TelephoneBookEntity;
import ua.com.alevel.service.TelephoneBookService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TelephoneBookController {

    private TelephoneBookService telephoneBookService = new TelephoneBookService();

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
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
        System.out.println("if you want create user and phone number, please enter 1");
        System.out.println("if you want update user and phone number, please enter 2");
        System.out.println("if you want delete user with phone number, please enter 3");
        System.out.println("if you want findById user, please enter 4");
        System.out.println("if you want findAll user, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                create(reader);
                break;
            case "2":
                update(reader);
                break;
            case "3" : delete(reader); break;
            case "4" : findById(reader); break;
            case "5" : findAll(reader); break;
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("UserController.create");
        try {
            System.out.println("Please, enter your name");
            String name = reader.readLine();
            System.out.println("Please, enter your phone");
            String telephoneNumber = reader.readLine();
            TelephoneBookEntity telephoneBookEntity = new TelephoneBookEntity();
            telephoneBookEntity.setTelephoneNumber(telephoneNumber);
            telephoneBookEntity.setName(name);
            telephoneBookService.create(telephoneBookEntity);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("UserController.update");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            System.out.println("Please, enter your name");
            String name = reader.readLine();
            System.out.println("Please, enter your phone");
            String telephoneNumber = reader.readLine();
            TelephoneBookEntity telephoneBookEntity = new TelephoneBookEntity();
            telephoneBookEntity.setId(id);
            telephoneBookEntity.setTelephoneNumber(telephoneNumber);
            telephoneBookEntity.setName(name);
            telephoneBookService.update(telephoneBookEntity);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

        private void delete(BufferedReader reader) {
        System.out.println("UserController.delete");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            telephoneBookService.delete(id);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("UserController.findById");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            TelephoneBookEntity telephoneBookEntity = telephoneBookService.findById(id);
            System.out.println("user = " + telephoneBookEntity);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("UserController.findAll");
        TelephoneBookEntity[] telephoneBookEntities = telephoneBookService.findAll();
        for (TelephoneBookEntity telephoneBookEntity : telephoneBookEntities) {
            System.out.println("user = " + telephoneBookEntity);
        }
    }
}

