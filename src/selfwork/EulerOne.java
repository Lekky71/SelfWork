package selfwork;

/**
 * Created by root on 5/27/17.
 */
public class EulerOne {
    public static void main(String[] args){
        int sum =0;
        for(int i =1;i <1000;i++){
            if(i%3==0 || i%5 ==0)
                sum = sum + i;
        }
        System.out.println(sum);
    }
}
