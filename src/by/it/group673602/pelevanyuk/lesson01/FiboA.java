package by.it.group673602.pelevanyuk.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {

        int previous = 0;
        int current = 1;

        int result = 0;

        for(int iteration = 0; iteration < n; iteration++) {
            result = previous + current;

            previous = current;
            current += previous;
        }

        return result;
    }


    BigInteger slowA(Integer n) {

        if (n == 0) {
            return BigInteger.ZERO;
        }

        if (n == 1) {
            return BigInteger.ONE;
        }

        return slowA(n-1).add(slowA(n-2));
    }



}

