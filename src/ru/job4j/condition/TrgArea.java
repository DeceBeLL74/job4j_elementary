package ru.job4j.condition;

public class TrgArea {
    public static double geron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.geron(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl);
    }
}
