package practice301;

import java.util.Scanner;

public class TotalPrimesLessN extends Practice3Phase2{

    public TotalPrimesLessN() {
        super();
    }
    public TotalPrimesLessN(Scanner sc) {
        super(sc);
    }
    public static boolean checkPrimes(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    void getPractice3Phase2() {
        System.out.print("N = ");
        num1 = sc.nextDouble();
        for (int i = 2; i < Math.ceil(num1); i++) {
            if (checkPrimes(i)) {
                total += i;
            }
        }
        System.out.println("The total number of primes is less than " + num1 + " = " + total);
    }
}
