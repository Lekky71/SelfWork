package selfwork;

import java.util.ArrayList;

/**
 * Created by oluwalekefakorede on 17/06/2017.
 */
public class NumberSuper {
    public static int adder(int num){
        String number = String.valueOf(num);
        ArrayList<Integer> digits = new ArrayList<>();
        for(int i =0; i < number.length();i++){
//            digits.add(number[i]);
            System.out.println(number.indexOf(i));
        }
//        String[] array = String.valueOf(num).;
        int sum = 0;
        for(int numbe : digits){
            sum += numbe;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(adder(10));
    }
}
