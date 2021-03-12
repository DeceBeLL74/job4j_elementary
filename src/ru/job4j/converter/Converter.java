package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int value = 400;
        int in = 400;
        int expected1 = 5;
        int expected2 = 6;
        int out1 = Converter.rubleToEuro(in);
        int out2 = Converter.rubleToDollar(in);
        int euro = Converter.rubleToEuro(value);
        int dollar = Converter.rubleToDollar(value);
        boolean passed = (expected1 == out1) && (expected2 == out2);
        System.out.println(value + " rubles are " + euro + " euro, or " + dollar + " dollar. Test : " + passed);
    }
}
