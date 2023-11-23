package lesson1;

import java.util.ArrayList;
import java.util.List;


//Необходимо найти допустимые делители для числа
public class Classwork1 {

    //1. Поиск делителей числа number
   /* public static void main(String[] args) {
        List<Integer> availableDivider = findAvailableDivider(12);
        for (Integer integer : availableDivider) {
            System.out.println(integer);
        }
    }*/

    //2. Поиск простых чисел до max
    public static void main(String[] args) {
        List<Integer> availableDivider = findSimpleNumbers(12);
        for (Integer integer : availableDivider) {
            System.out.println(integer);
        }
    }
    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i =1; i < number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max){
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++){
            boolean simple = true;
            for (int j = 2; j < i; j++){
                ++counter;
                if (i % j == 0){
                    simple = false;
                    break; //благодаря break сокращается количество циклов
                }
            }
            if (simple){
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}