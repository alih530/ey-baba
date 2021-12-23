package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        System.out.println(a);
        System.out.println(b);

        //or operator
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //and operator
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //xor operator
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //not operator
        System.out.println(true);
        System.out.println(false);

        //strings
        System.out.println("Hello".length());
        System.out.println("Hello my dears".indexOf("ea"));
        System.out.println("Hello my dears".toLowerCase());
        System.out.println("Hello my dears".toUpperCase());
        System.out.println("Hello ".concat("my dears"));
        System.out.println("Hello my dears".replace("Hello","Bye"));
        int[] x={1,2,3,4,5};
        System.out.println(x[2]);
        String[] split="my-name-is-ali".split("-");
        System.out.println(split[1]);
        System.out.println("Hello \\\"world\"");
        System.out.println("Hello\nmy friends\t. " + "n\b");
    }
}
