package geekbrains.lesson.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        int range = 100;
        int number = (int)(Math.random() * range);
        System.out.println("Print the number from 0 to " + range);
        while (true){
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
        scanner.close();
    }
}
