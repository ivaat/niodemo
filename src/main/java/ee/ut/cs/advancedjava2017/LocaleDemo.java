package ee.ut.cs.advancedjava2017;

import java.util.Locale;

public class LocaleDemo {
    //system default used if not specified
    //affects converting to upper & lower case
    //numbers, currencies, percentages, etc
    public static void main(String[] args) {
        String str = "Taavi";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("EE")));
        System.out.println(str.toUpperCase(Locale.TAIWAN));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));
    }
}
