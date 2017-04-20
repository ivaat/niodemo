package ee.ut.cs.advancedjava2017;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CharsetDemo {

    public static void main(String[] args) throws IOException {
        //charset - characters-to-bytes mapping
        //use UTF-8 when possible, and provide it explicitly!
        Charset charset = StandardCharsets.UTF_8;
        List<String> lines = Files.readAllLines(Paths.get("source.txt"), charset);
        Files.write(Paths.get("dest.txt"), lines, charset);
    }
}
