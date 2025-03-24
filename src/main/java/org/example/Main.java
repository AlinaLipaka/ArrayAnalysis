package org.example;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 5, -3, 15, -2, 19, 6, -2, -4, 20, -17};
        int positive = 0, negative = 0, even = 0, odd = 0;

        for (int number : numbers) {
            if (number != 0) {
                if (ifPositive(number)) {
                    positive++;
                } else negative++;
            }

            if (ifEven(number)) {
                even++;
            } else odd++;
        }
        System.out.println("positive: " + positive + ", negative: " + negative + ", even: " + even + ", odd: " + odd);
    }
    public static Boolean ifPositive(int number){
        return number > 0;
    }

    public static Boolean ifEven(int number){
        return number % 2 == 0;
    }
}