package selfwork;

/**
 * Created by root on 5/8/17.
 */
public class Numberroot {

    public static void main(String args[]){
        double target = 256;
        double answer = 0;
        double start = 1;
        while(start > Math.pow(9, -14)) {
            answer = answer + start;
            double current = Math.pow(answer,answer);
            if(current>target){
                answer = answer - start;
                start = start /10;
            }else if(current==target){
                break;
            }
        }
        System.out.println(answer);
        System.out.println(usingFormula(100));
    }
    public static double usingFormula(double number){
        double xnew, xold =3.5;
        while(true) {
            xnew = xold - (Math.pow(xold, xold)-number)/(Math.pow(xold, xold)*(Math.log(xold)+1)); //newton aphson iteration formula
            if(Math.abs(xnew-xold)<0.000001) break;  //test for convergence
            else xold = xnew;
        }
        return xnew;
    }
}
