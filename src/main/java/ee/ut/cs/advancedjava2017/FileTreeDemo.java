package ee.ut.cs.advancedjava2017;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTreeDemo {
    //filevisitor vs simplefilevisitor

    public static void main(String[] args) throws IOException {
        FileVisitor<Path> visitor; //TODO - expand & show

        SimpleFileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                if (path.toString().endsWith(".java")) {
                    System.out.println(path.toAbsolutePath());
                }

                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(Paths.get("src"), simpleFileVisitor);
    }

}
