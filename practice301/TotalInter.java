package practice301;

import java.util.Scanner;

public class TotalInter extends Practice3Phase2 {
    public TotalInter() {
        super();
    }
    public TotalInter(Scanner sc) {
        super(sc);
    }
    @Override
    void getPractice3Phase2() {
        System.out.print("Count: ");
        count = sc.nextInt();
        if (count < 1) {
            System.out.println("Count fail!");
            System.out.print("Count: ");
            count = sc.nextInt();
        }
        else {
            System.out.println("The numbers: ");
            for(int i = 0; i < count; i++) {
                numbers = new int[count];
                numbers[i] = sc.nextInt();
                total = total + numbers[i];
            }
        }
        System.out.println("Total of inter: " + total);
    }
}
