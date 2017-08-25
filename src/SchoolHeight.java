/**
 * Created by oluwalekefakorede on 17/07/2017.
 */
import java.util.Arrays;
import java.util.Scanner;

public class SchoolHeight {
    static Scanner input = new Scanner(System.in);
    static double [] boysHeight;
    static double [] girlsHeight;
    static double averageBoy = 0; //new
    static double averageGirl = 0; //new

    @SuppressWarnings("Duplicates")
    public static int receiveInput(){
        System.out.println("what is the number of boys ?");
        int num = input.nextInt();
        boysHeight = new double[num];
        for(int i= 0 ;i<num;i++){
            boysHeight[i] = input.nextDouble();
            double sumBoy = 0;
            sumBoy += boysHeight[i];
            averageBoy = sumBoy / num; // new

        }
        System.out.println("what is the number of girls ?");
        int num1 = input.nextInt();
        girlsHeight = new double[num1];
        for(int i= 0 ;i<num1;i++){
            girlsHeight[i] = input.nextDouble();
            double sumGirl = 0;
            sumGirl += girlsHeight[i];
            averageGirl = sumGirl / num1;
        }
        return num + num1;
    }
    public static void main(String[] args){
        int totalStudents = receiveInput();
        Arrays.sort(boysHeight);
        Arrays.sort(girlsHeight);
        double maxBoy = boysHeight[boysHeight.length-1];
        double maxGirl = girlsHeight[girlsHeight.length-1];
        System.out.println("The maximum height of boys is : "+ maxBoy);
        System.out.println("The maximum height of girls is : "+ maxGirl);
        double maxHeight = maxBoy > maxGirl ? maxBoy : maxGirl;
        System.out.println("The maximum height of the school students is : "+ maxHeight);
        System.out.println("The total number of students in the school is : "+totalStudents);
        System.out.println("The average height of boys is : "+averageBoy);
        System.out.println("The average height of girls is : "+averageGirl);

    }
}
