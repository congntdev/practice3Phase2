package practice301;

import java.util.Scanner;

public class GreatestDivisor extends Practice3Phase2 {
    public GreatestDivisor() {
        super();
    }
    public GreatestDivisor(Scanner sc) {
        super(sc);
    }
    @Override
    void getPractice3Phase2() {
        System.out.print("Number 1: ");
        num1 = sc.nextDouble();
        System.out.print("Number 2: ");
        num2 = sc.nextDouble();
        int max = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }
        System.out.println("Greatest divisor: " + max);
    }
}
