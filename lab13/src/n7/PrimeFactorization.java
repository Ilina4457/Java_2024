package n7;

import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n (n > 1): ");
        int n = scanner.nextInt();

        System.out.println("Простые множители числа " + n + ":");
        primeFactorize(n);

        scanner.close();
    }

    public static void primeFactorize(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}
