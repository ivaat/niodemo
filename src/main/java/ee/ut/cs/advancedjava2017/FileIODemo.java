package ee.ut.cs.advancedjava2017;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIODemo {

    public static void main(String[] args) throws IOException {
        //READING
        Path src = Paths.get("input.txt");
        byte[] inData = Files.readAllBytes(src);
        List<String> inLines = Files.readAllLines(src); //in real life - provide charset!










        //WRITING
        //StandardOpenOptions & Charsets
        Path dest = Paths.get("output.data");
        byte[] outData = "tere".getBytes();
        Files.write(src, outData);
        List<String> outLines = Arrays.asList("esimene", "teine");
        Files.write(dest, outLines);













        //STREAMS & READERS & WRITERS
        //support StandardOpenOptions!
        InputStream inputStream = Files.newInputStream(src);
        BufferedReader bufferedReader = Files.newBufferedReader(src);

        OutputStream outputStream = Files.newOutputStream(dest);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(dest);

        //reading from one, copying to other
        try (BufferedReader in = Files.newBufferedReader(src);
             BufferedWriter out = Files.newBufferedWriter(dest)) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.write("--> " + line);
                }
        }
    }
}
