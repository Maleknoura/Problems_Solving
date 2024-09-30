package org.example;

public class Pandrome {
    public int reverseNumbre(int number) {
        int a = 0;
        while (number != 0) {
            int b = number % 10;
            a = a * 10 + b;
            number /= 10;
        }
        return a;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public int sumUntilPalindrome(int number) {
        while (!isPalindrome(number)) {
            number = sumOfDigits(number);
        }
        return number;
    }

    public boolean isPalindrome(int number) {
        return number == reverseNumbre(number);
    }
}
