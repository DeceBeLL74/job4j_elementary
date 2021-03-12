package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        return value / 70;
    }

    public static float rubleToDollar(int value) {
        return value/60;
    }

    public static void main(String[] args) {
        int value = 400;
        float euro = Converter.rubleToEuro(value);
        float dollar = Converter.rubleToDollar(value);
        System.out.println(value+ " rubles are " + euro + " euro, or "+ dollar + " dollar.");
    }
}
