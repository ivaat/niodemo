package ee.ut.cs.advancedjava2017;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ArchiveDemo {
    //ZipFile vs ZipInputStream vs ZipOutputStream vs ZipEntry

    public static void main(String[] args) throws Exception {
        addToArchive(Paths.get("pom.xml"), Paths.get("pom.zip"));
        extractArchive(Paths.get("pom.zip"), Paths.get("pomcopy"));
    }

    //buffered streams would provide better performance
    private static void addToArchive(Path src, Path dest) throws IOException {
        try (ZipOutputStream zipOut = new ZipOutputStream(Files.newOutputStream(dest))) {
            ZipEntry entry = new ZipEntry(src.toString());
            zipOut.putNextEntry(entry);
            zipOut.write(Files.readAllBytes(src));
            zipOut.closeEntry();
        }
    }

    private static void extractArchive(Path src, Path dest) throws Exception {
        try (ZipFile zipFile = new ZipFile(src.toFile())) {
            Enumeration<? extends ZipEntry> en = zipFile.entries();
            while (en.hasMoreElements()) {
                ZipEntry entry = en.nextElement();
                Path path = dest.resolve(entry.getName());
                Files.createDirectories(path.getParent());
                if (!entry.isDirectory()) {
                    try (InputStream in = zipFile.getInputStream(entry)) {
                        Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        }
    }
}
