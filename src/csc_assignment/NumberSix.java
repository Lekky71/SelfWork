package csc_assignment;
import java.util.Scanner;
public class NumberSix { //number 6
    public static void main(String[] args){
        String message;
        double firstNum, secondNum, sum, guess;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number");
        firstNum = in.nextDouble();
        System.out.println("Enter second number");
        secondNum = in.nextDouble();
        sum = firstNum + secondNum;
        System.out.println("Guess the sum");
        guess = in.nextDouble();
        if(guess == sum)
            message = "Congrats,You are correct!!!";
        else
            message = "Oops, you are wrong";
        System.out.println(message);

    }
}
