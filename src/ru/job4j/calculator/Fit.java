package ru.job4j.calculator;

public class Fit {

    public static float manWeight(short height) {
        float rsl = 100 * 1.15f;
        return rsl;
    }

    public static float womanWeight(short height) {
        float rsl = 110 * 1.15f;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        float man = Fit.manWeight(height);
        float woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }

}