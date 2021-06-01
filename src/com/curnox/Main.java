package com.curnox;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte byte_1 = -1;
        short short_1 = -32768;
        long long_1 = 101011;
        long long_2 = 8912321313L;
        float float_1 = 12.2321F;
        // byte: -128 to 127
        // short: -32768 to 32767
        // int: -2147483648 to 2147483647
        // long: -9223372036854775808 to 9223372036854775807
        // float: 5 to 7 decimal digits
        // double: 15 decimal digits
        // boolean: true or false
        // char: a single letter or ASCII values
        int num_1 = 101;
        double num_2 = 101.0;
        String str_1 = "Curnox";
        Date date_1 = new Date();
        System.out.println("Stop me");
        System.out.println(date_1);
        String name_1 = new String("this Sucks");
        System.out.println(name_1.toLowerCase(Locale.ROOT));
        LocalDate now = LocalDate.now();
        System.out.println(str_1+" "+now);
        System.out.println(now.getMonth().toString().toLowerCase());
        double double_a = 101.0;
        double double_b = 10.1;
        double_a = double_b; // only get the current state of
        // value of the variable in java
        double_b -= 8;
        System.out.println("##############################");
        System.out.println(
                "double a was 101.0 and double b was 10.1\n" +
                        "after double a referenced double b:\n" +
                        "double a = " + double_a + " double b = " +
                        double_b
        );

        Person user_1 = new Person(
                "John Denver",
                18,
                177.5F,
                58.0F,
                "Hong Kong");

        Person user_2 = user_1;

        System.out.println(
                String.format("before modified:\n%s %s",user_1.name,user_2.name)
        );

        user_2.name = "Curry Netty";
        user_2.location = "Kiv";

        System.out.println(
                String.format("after modified:\n%s %s",user_1.name,user_2.name)
        );

        System.out.printf(
                "user no.2 name and location are %s and %s%n"
        ,user_2.name,user_2.location);

        String sample_string = new String("This is your new home");
        System.out.printf("index 9 of the string %s%n",sample_string);
        System.out.println(sample_string.charAt(9));
        System.out.println(sample_string.getBytes()); // less
        System.out.println(sample_string.chars()); // less
        System.out.println(
                sample_string.compareTo(user_1.name));
        String joke = new String("Glücklichkeit");
        String joke_1 = new String("lich");
        System.out.println("check if the string contain another string");
        System.out.println(joke.contains(joke_1));
        System.out.println("check if the string == another string");
        System.out.println(joke.equals(joke_1));
        java.sql.Date date__1 = new java.sql.Date(1);
        System.out.println(date__1);
        // reserved keywords
        // package, void, main, static, public, ......
        System.out.println("new section");
        int aa = 1;
        int bb = 2, cc = 2;
        cc = 3;
        System.out.println(aa+bb+cc); // 1 + 2 + 3 = 6
        System.out.println(aa/cc);
        System.out.println(3%(aa+2));
        System.out.println(Math.abs(-100)/bb);
        System.out.println(
                Math.max(
                        3.5,123.0
                ) // only two digits allowed
        );
        System.out.println(
                Math.min(
                        3.5,123.0
                ) // only two digits allowed
        );
        System.out.println(
                (int) Math.pow(5,10) // set (int) turn from
                // float into integer
        );
        System.out.println(
                (int) Math.sqrt(24)
        ); // this is like the floor function in Math
        System.out.println(
                Math.sqrt(24)
        );
        System.out.printf(
                "a = 10; b = 11; c = 10\na < b %s\n"+
                        "a > b %s\na == c %s",10<11,10>11,10==10
                );
        System.out.printf("a <= b %s\nb >= 12 %s",10<=11,11>=12);
        boolean isTeen = true;
        boolean isEvil = false;
        boolean isStrong = false;
        boolean isLazy = true;
        System.out.println(isTeen && isEvil);
        // both true then true
        System.out.println(isStrong || isLazy);
        System.out.println((isStrong || isTeen) && isLazy);
        // either one is true then true
        System.out.println((isLazy&&!isStrong)&&isEvil);
        // If statements
        long jason = 21892123223232L;
        System.out.println(jason);
        String type = ((Object)jason).getClass().getSimpleName();
        System.out.println(type);
        if (((Object)jason).getClass().getSimpleName() == type) {
            System.out.println("This is fantastic");
        }
        int a = 5, b = 6, c = 9, d = 19;
        if (a < 6 && a > c) {
            System.out.println("a is smaller than 6 and > 9");
        } else if (a >= 6 || a < d) {
            System.out.println("Ya man");
        } else {
            System.out.println("Finance");
        }
        // Ternary Operator
        String message = (a == 6) ? "School Kid" : "Kid"; // if else
        System.out.println(message);
        // Switch statements
        String msg_1 = "Cat";
        switch (msg_1) {
            case "Cat":
                System.out.println("this is a cat");
                break;
            case "Unicorn":
                System.out.println("No one has seen an unicorn");
            default:
                break;
        }
        // Array
        int [] array = new int[4]; // size = 4
        boolean [] arrbool = new boolean[2];
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrbool));
        for (int i = 0;  i< array.length;i++)
        {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
        float [] hike = {1,2,3,4}; // no size specified
        System.out.println(hike.length);
        for (int i = hike.length-1;i>=0;i--){
            System.out.println((int )hike[i]);
        }
        // Enhanced loop
        System.out.println("Enhanced version:");
        for (float num : hike) {
            System.out.println(num);
        }
        Arrays.stream(array).forEach(System.out::println);
        // Break and Continue
        System.out.println("Break and Continue");
        int [] mountains = {1,2,4,4,5,6,234,3,3};
        for (int hill: mountains) {
            if (hill == 234){
                break;
            } else if (hill <= 2) {
                continue;
            } else {
                System.out.println(hill);
            }
        }
    }

    static class Person {
        String name;
        int age;
        float height;
        float weight;
        String location;

        Person(
                String name,
                int age,
                float height,
                float weight,
                String location
        ) {
            this.location = location;
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    }
}
