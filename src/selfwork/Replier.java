package selfwork;

/**
 * Created by oluwalekefakorede on 6/12/17.
 */
import java.util.Scanner;
public class Replier {
    public static void main(String [] args){
        System.out.println("Enter your name");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        switch(text){
            case " ":
                System.out.println("no name entered");
            case "Leke":
                System.out.println("your name is leke");
            case "Gideon":
                System.out.println("your name is "+text);
            default:
                System.out.println("Your name is not registered");

        }
    }
}
