package selfwork;
import java.util.ArrayList;

public class ExtremePrepOne {
    static ArrayList<Integer> numbers;
    public static void main(String[] args){
        numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);
        System.out.println(findSum(numbers));
    }
    private static int findSum(ArrayList<Integer> array){
        ArrayList<Integer> sumArray = new ArrayList<>();
        for(int n : array){
            if(n%2 ==0 &&  array.indexOf(n) == array.lastIndexOf(n)){
                    sumArray.add(n);
                }
        }
        int sum =0;
        for(int n : sumArray){
            sum +=n;
        }
        return sum;
    }
}
