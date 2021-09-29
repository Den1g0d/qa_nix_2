package ua.com.alevel.crud;

public enum FileOutput {

    FILE_TXT("output.txt");

    private final String path;

    FileOutput(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
