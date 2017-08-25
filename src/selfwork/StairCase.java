package selfwork;

/**
 * Created by root on 5/26/17.
 */
import java.io.*;
import java.util.*;

public class StairCase{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String name;

        for(int i =1;i<=size;i++){
            printStair(size,i);
        }
    }
    public static void printStair(int size,int n){
        for (int i =0;i<size-n;i++){
            System.out.print(" ");
        }
        for(int i =0; i <n;i++){
            System.out.print("#");
        }
        System.out.println("");

    }
}
