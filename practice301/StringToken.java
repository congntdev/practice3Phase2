package practice301;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken extends Practice3Phase2 {
    public StringToken() {
        super();
    }
    public StringToken(Scanner sc) {
        super(sc);
    }
    @Override
    void getPractice3Phase2() {
        System.out.println("Input a string:");
        inputString = sc.nextLine();
        StringTokenizer st = new StringTokenizer(inputString);
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
