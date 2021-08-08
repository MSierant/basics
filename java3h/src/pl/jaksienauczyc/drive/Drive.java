package pl.jaksienauczyc.drive;

import pl.jaksienauczyc.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
