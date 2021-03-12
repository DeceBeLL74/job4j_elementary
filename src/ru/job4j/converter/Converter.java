package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        int x = value / 70;
        return x;
    }

    public static float rubleToDollar(int value) {
        int x = value/60;
        return x;
    }

    public static void main(String[] args) {
        int value = 900;
        float euro = Converter.rubleToEuro(value);
        float dollar = Converter.rubleToDollar(value);
        System.out.println(value+ " rubles are " + euro + " euro, or "+ dollar + " dollar.");
    }
}
