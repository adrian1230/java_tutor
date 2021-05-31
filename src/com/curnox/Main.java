package com.curnox;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

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
    }
}
