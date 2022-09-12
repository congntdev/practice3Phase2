package practice301;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 19: count of character 'a'.");
        Practice3Phase2 characterA = new CharacterA(new Scanner(System.in));
        characterA.getPractice3Phase2();

        System.out.println("Lesson 20: count of digit.");
        Practice3Phase2 characterDigit = new CharacterDigit(new Scanner(System.in));
        characterDigit.getPractice3Phase2();

        System.out.println("Lesson 21: string token.");
        Practice3Phase2 stringTokenizer = new StringToken(new Scanner(System.in));
        stringTokenizer.getPractice3Phase2();

        System.out.println("Lesson 22: check primes.");
        Practice3Phase2 checkPrimes = new CheckPrimes(new Scanner(System.in));
        checkPrimes.getPractice3Phase2();

        System.out.println("Lesson 23: greatest divisor.");
        Practice3Phase2 greatestDivisor = new GreatestDivisor(new Scanner(System.in));
        greatestDivisor.getPractice3Phase2();

        System.out.println("Lesson 24: total of inter.");
        Practice3Phase2 totalInter = new TotalInter(new Scanner(System.in));
        totalInter.getPractice3Phase2();

        System.out.println("Lesson 25: The total number of primes is less than N.");
        Practice3Phase2 totalPrimesLessN = new TotalPrimesLessN(new Scanner(System.in));
        totalPrimesLessN.getPractice3Phase2();
    }
}
