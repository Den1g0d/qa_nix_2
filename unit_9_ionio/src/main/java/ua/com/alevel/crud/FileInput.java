package ua.com.alevel.crud;

public enum FileInput {

    FILE_TXT("input.txt");

    private final String path;

    FileInput(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
