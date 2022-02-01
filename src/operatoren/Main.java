package operatoren;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int summe = a + b;
        System.out.println(summe);
        System.out.println("Summe: " + summe);

        double d = 2.3456;
        System.out.println(Math.round(d * 100) / 100.0);

        int e = Integer.MAX_VALUE + 1;
        System.out.println(e);

        double r = Math.random() * 100;
        System.out.println(Math.round(r));

        String name = "Klaus";
        name = "Klara";
        String newName = name.toLowerCase();
        System.out.println(newName);

        var s = "Name";
        System.out.println();

    }
}
