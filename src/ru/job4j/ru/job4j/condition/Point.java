package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = (x2-x1)+(y2-y1)-1;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        Math.pow (result,-2);
        System.out.println("result (0, 0) to (2, 0) " + result);

    }


}
