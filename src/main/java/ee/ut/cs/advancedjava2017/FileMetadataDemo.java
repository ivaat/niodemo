package ee.ut.cs.advancedjava2017;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Iterator;
import java.util.Set;

public class FileMetadataDemo {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src");
        boolean exists = Files.exists(path);
        boolean notExists = Files.notExists(path);
        //why two methods though?

        boolean isDir = Files.isDirectory(path);
        boolean isFile = Files.isRegularFile(path); //LinkOption.NOFOLLOW_LINKS;
        boolean isLink = Files.isSymbolicLink(path);

        boolean isSameFile = Files.isSameFile(path, Paths.get("C:", "CasinoSVN", "niodemo" , "src"));

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            Iterator<Path> iterator = ds.iterator();
            while (iterator.hasNext()) {
                Path iterPath = iterator.next();
                System.out.println(iterPath);
                System.out.println(iterPath.toAbsolutePath());
                System.out.println("--");
            }
        }

        long size = Files.size(path);

        FileTime time = Files.getLastModifiedTime(path);
        long millis = time.toMillis();

        boolean isReadable = Files.isReadable(path);
        boolean isWritable = Files.isWritable(path);
        boolean isExecutable = Files.isExecutable(path);
        boolean isHidden = Files.isHidden(path);

        String ownerName = Files.getOwner(path).getName();

        Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
    }
}