package csc_assignment;
import java.util.Scanner;
public class NumberFive {
    public static void main(String[] args){
        int firstNum;
        int secondNum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number");
        firstNum = in.nextInt();
        System.out.println("Enter your second number");
        secondNum = in.nextInt();
        if(firstNum == secondNum)
            System.out.println("numbers are equal");
        else
            System.out.println("NUMBERS ARE NOT EQUAL");

    }
}
