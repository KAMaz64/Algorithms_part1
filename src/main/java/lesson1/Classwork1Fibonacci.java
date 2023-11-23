package lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class Classwork1Fibonacci {

    public static void main(String[] args){
        int n = 10;
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(n, counter);
        System.out.println("Fibonacci: " + fib);
        System.out.println("Counter: " + counter.get());

        int m = 11;
        counter = new AtomicInteger(0);
        fib = fib(m, counter);
        System.out.println("Fibonacci: " + fib);
        System.out.println("Counter: " + counter.get());
    }

    public static int fib(int position, AtomicInteger counter){
        counter.incrementAndGet();
        if (position ==1) {
            return 0;
        }
        if (position ==2){
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
