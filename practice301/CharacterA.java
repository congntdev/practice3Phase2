package practice301;

import java.util.Scanner;

public class CharacterA extends Practice3Phase2 {
    public CharacterA() {
        super();
    }
    public CharacterA(Scanner sc) {
        super(sc);
    }
    @Override
    void getPractice3Phase2() {
        System.out.println("Input a string of character:");
        inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                count ++;
            }
        }
        System.out.println("The character 'a' has been entered " + count + " times");
    }
}
