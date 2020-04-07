package geekbrains.lesson.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Guess the number");
        int range = 100;
        int number = (int)(Math.random() * range);
        playLevel(range, number);
        scanner.close();
    }

    private static void playLevel(int range, int number){
        while (true){
            System.out.println("Print the number from 0 to " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("You are right");
                break;
            } else if (input_number > number){
                System.out.println("Need less");
            } else {
                System.out.println("Need More");
            }
        }

    }
}
