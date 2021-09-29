package ua.com.alevel.crud;

import java.io.IOException;

public interface FileCrudService {

    void deleteFile(String pathToFile);
    void readFile(String pathToFile) throws IOException;
    void uniqueFileWriting(String pathFromFile, String pathToFile);
    void isPalindrome(String pathFromFile, String pathToFile);
    void sentenceAmount(String pathFromFile, String pathToFile);
    }
