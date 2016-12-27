package chapter1;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class Ex3 {

    public File[] listFilesWithExtension(File directory, String extension) {
        validateExtension(extension);
        return directory.listFiles(file -> file.isFile() && FilenameUtils.getExtension(file.getPath()).equals(extension));
    }

    private void validateExtension(String extension) {
        if(extension == null) {
            throw new IllegalArgumentException("extension can't be null");
        }
    }
}
