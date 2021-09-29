package ua.com.alevel;

import ua.com.alevel.controller.CrudController;

import java.io.IOException;

public class IoNioMain {

    public static void main(String[] args) throws IOException {

        new CrudController().start();
    }
}
