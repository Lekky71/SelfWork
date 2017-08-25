package csc_assignment;
import java.util.Scanner;
public class NumberSeven {
    public static void main(String[] args){
        double score ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your score");
        score = in.nextDouble();
        if(!(score >=0 && score <=100)){
            System.out.println("Enter a valid score");
        }
        else{
            if(score >=70)
                System.out.println("You have a distinction");
            else
                System.out.println("You have a pass");

        }
    }
}
