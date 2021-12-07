package ru.test;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int summa = x + y;
        String plus = " + ";
        String ravno = " = ";
        System.out.println(x + plus + y + ravno + summa);
        Test test = new Test();
        System.out.println(test.calculator(x, y));
    }

    public String calculator(int x, int y) {
        int summa = x + y;
        return "Результат сложения " + x + " и " + y + " = " + summa;
    }

}
