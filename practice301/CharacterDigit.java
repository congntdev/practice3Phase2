package practice301;

import java.util.Scanner;

public class CharacterDigit extends Practice3Phase2 {
    public CharacterDigit() {
        super();
    }
    public CharacterDigit(Scanner sc) {
        super(sc);
    }
    @Override
    void getPractice3Phase2() {
        System.out.println("Input a string of character:");
        inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                count++;
            }
        }
        System.out.println(count + " numbers have been entered");
    }

}
