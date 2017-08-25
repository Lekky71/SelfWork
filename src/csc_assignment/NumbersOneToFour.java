package csc_assignment;

/**
 * Created by oluwalekefakorede on 03/07/2017.
 */
import java.util.Scanner;
public class NumbersOneToFour {
    static String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 9 : ");
        int number = input.nextInt();
        showWord(number);
        showStringOfNumber(number);
        showNumberOfBottles(number);
        factori(number);
    }

    public static void showWord(int num) {
        if (!(num >= 0 && num < 10)) { //number 1
            System.out.println("fool, enter a number between 0 and 9");
        } else {
            System.out.println(words[num]);
        }
    }

    public static void showStringOfNumber(int num) {
        System.out.println(String.valueOf(num)); // number 2
    }

    public static void showNumberOfBottles(int num) { // number 3
        if (num > 1) {
            System.out.println(num + " green bottles are on the wall");
        } else if (num < 1)
            System.out.println("there is no green bottle on the wall");
        else
            System.out.println("there is one green bottle on the wall");

    }
    public static void factori(int number){
        int result = 1;
        for(int i = number ; i >=1 ; i--){ //number 4
            result *= i;
        }
        System.out.println("The factorial of "+number+" is "+result);
    }
}
