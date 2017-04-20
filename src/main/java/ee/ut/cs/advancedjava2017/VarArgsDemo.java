package ee.ut.cs.advancedjava2017;

import java.util.Arrays;
import java.util.List;

public class VarArgsDemo {

    public static void main(String[] args) {
        print("tere");
        print("tere", "tere");
        print(new String[]{"tere", "tere", "vana", "kere"});
        print();

        List<String> stringList = Arrays.asList("tere", "tere");
    }

    public static void print(String string) {
        System.out.println("print single string:");
        System.out.println(string);
    }

    public static void print(String... strings) {
        String[] copy = strings; //can assign array type to varargs type
        System.out.println("print varargs strings");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
