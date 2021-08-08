package pl.jaksienauczyc.file.imagefile;

import pl.jaksienauczyc.file.AbstractFile;
import pl.jaksienauczyc.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE ;
    }
}
