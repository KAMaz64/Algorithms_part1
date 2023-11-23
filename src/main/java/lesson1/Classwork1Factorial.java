package lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class Classwork1Factorial {

    public static void main(String[] args){
        int n = 10;
        AtomicInteger counter = new AtomicInteger(0);
        int factorial = factorial(n, counter);
        System.out.println("Factorial: " + factorial);
        System.out.println("Counter: " + counter.get());
    }

    public static int factorial(int position, AtomicInteger counter){
        counter.incrementAndGet();
        if (position ==0 || position == 1) {
            return 1;
        }
        return factorial(position - 1, counter) * position;
    }
}
