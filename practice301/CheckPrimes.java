package practice301;

import java.util.Scanner;

public class CheckPrimes extends Practice3Phase2 {
    public CheckPrimes() {
        super();
    }
    public CheckPrimes(Scanner sc) {
        super(sc);
    }

    @Override
    void getPractice3Phase2() {
        System.out.print("n = ");
        num1 = sc.nextDouble();
        if (Math.ceil(num1) != Math.floor(num1)) {
            ok = false;
        }
        else {
            if (num1 < 2) {
                ok = false;
            }
            else {
                for (int i = 2; i < Math.floor(num1); i++) {
                    if (num1 % i == 0) {
                        ok = false;
                    }
                    break;
                }
            }
        }
        if (ok == true) {
            System.out.println(num1 + " is a prime!");
        }
        else {
            System.out.println(num1 + " isn't a prime!");
        }
    }
}
