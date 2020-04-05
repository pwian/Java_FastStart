package geekbrains.lesson.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Input operation");
	    System.out.println("1. Sum");
	    System.out.println("2. Diff");
	    System.out.println("3. Mult");

	    Scanner scanner = new Scanner(System.in);
	    int operation = scanner.nextInt();
	    System.out.println("Input first number:");
	    int firstNumber = scanner.nextInt();
	    System.out.println("Input second number");
	    int secondNumber = scanner.nextInt();

	    int result;
	    if (operation == 1){
	        result = firstNumber + secondNumber;
        } else if (operation == 2){
	        result = firstNumber - secondNumber;
        } else if (operation == 3){
	        result = firstNumber * secondNumber;
        } else{
	        result = firstNumber / secondNumber;
        }

	    System.out.println("Result is : " + result);
    }
}
