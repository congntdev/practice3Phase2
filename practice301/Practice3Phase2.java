package practice301;

import java.util.Scanner;

public abstract class Practice3Phase2 {
    protected Scanner sc;
    protected boolean ok = true;
    protected String inputString;
    protected int total = 0;

    protected int count;
    protected int[] numbers;

    protected double num1;
    protected double num2;
    public Practice3Phase2() {

    }
    public Practice3Phase2(Scanner sc) {
        this.sc = sc;
    }

    abstract void getPractice3Phase2();
}
