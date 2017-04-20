package ee.ut.cs.advancedjava2017;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {

    //java.io.File - both path + file operations
    //java.nio.file.Path - only path
    //java.nio.file.Files - only file operations

    //better support for symbolic links, relative paths, directory listings

    public static void main(String[] args) {
        Paths.get("C:\\CasinoSVN\\niodemo\\src");
        Paths.get("/CasinoSVN/niodemo/src");
        Paths.get("src");
        Paths.get("C:", "CasinoSVN", "niodemo", "src");

        Path relativePath = Paths.get(
                "src", "main", "java", "ee", "ut", "cs", "advancedjava2017");

        Path absolutePath = Paths.get(
                "C:", "CasinoSVN", "niodemo", "src", "main", "java", "ee", "ut",
                "cs" , "advancedjava2017");

        int nameCount = relativePath.getNameCount();

        Path subPath = absolutePath.subpath(1, 4);

        Path resolvedPath = absolutePath.resolve(Paths.get("PathsDemo.java"));

        Path relativizedPath = subPath.relativize(Paths.get("src", "test"));

        //relativePath.toString() vs absolutePath.toString()?

        //relativePath.getName() vs absolutePath.getName()?

        //relativePath.isAbsolute() vs absolutePath.isAbsolute()?

        //relativePath.getFileName() vs absolutePath.getFileName()?

        //relativePath.getParent() vs absolutePath.getParent()?

        //relativePath.getRoot() vs absolutePath.getRoot()?

        //relativePath.normalize() vs  absolutePath.normalize()?

        //relativePath.toRealPath() vs absolutePath.toRealPath()?
    }

}
