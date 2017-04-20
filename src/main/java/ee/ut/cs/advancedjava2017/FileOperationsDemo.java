package ee.ut.cs.advancedjava2017;

import java.io.IOException;
import java.nio.file.*;

public class FileOperationsDemo {

    public static void main(String[] args) throws IOException {

        //CREATING A FILE
        Path file = Paths.get("create_file.txt");
        Files.createFile(file); //throws exceptions!

        //throws exception if dir exists
        Files.createDirectory(file.getParent());
        Files.createFile(file);

        //does not throw exception if exists.
        //also might create only some dirs.
        Files.createDirectories(file.getParent());
        Files.createFile(file);


        //DELETING A FILE
        Files.delete(file); //throws exception if doesn't exist!
        Files.deleteIfExists(file); //"quiet"?


        //COPYING A FILE
        Path src = Paths.get("source.txt");
        Path dest = Paths.get("destination.txt");

        Files.copy(src, dest);
        Files.copy(
                src,
                dest,
                StandardCopyOption.ATOMIC_MOVE,
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES);

        //MOVING:
        Files.move(src, dest); //also supports StandardCopyOption values
    }
}
