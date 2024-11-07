package funtions;

import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // exemplesMath();
        // exampleRandom();
        examplesString();

    }

    private static void examplesString() {
        var name = "Jonatan Rodriguez";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0, 13));
        System.out.printf("el caracter en la posicion 5 es '%c' %n ", name.charAt(10));

        var input = "jabcvbd 10452310788  ; ";
        System.out.println(input.trim());
        System.out.println(input.contains("10"));
        System.out.println(input.indexOf("10"));
        System.out.println(input.lastIndexOf("10"));

        var lastSpaceIndex = name.lastIndexOf("null");
        System.out.println(name.substring(lastSpaceIndex +1));
    }

    private static void exampleRandom() {
        var Random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(Random.nextInt(10) + 1);

        }

    }

    private static void examplesMath() {
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 3));
    }
}
