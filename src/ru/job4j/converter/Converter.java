package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(int value) {
        int rsl = value/60;
        return rsl;
    }

    public static void main(String[] args) {
        int value = 600;
        float euro = Converter.rubleToEuro(value);
        float dollar = Converter.rubleToDollar(value);
        System.out.println(value+ " rubles are " + euro + " euro, or "+ dollar + " dollar.");
    }
}
