package selfwork;
import java.util.Scanner;
public class NumbersCSC {
	public void isPrime(int n){
		
		int i = 2 ;
		if(n==2){
			System.out.printf(" %2s", n);
			
		}
		else{
		int sqrt = (int)Math.sqrt(n);
		while(i<= sqrt){
			if(n % i == 0){
//				System.out.printf(" %2s \n", n);
			}
			i++ ;
		}
		}
		System.out.printf(" %2s", n);
		
	}
	public static void showEven(){
		for(int i=2;i<=1000; i=i+2){
			System.out.printf("%2d ",i);
		}
		System.out.println();
	}
	public static void showOdd(){
		for(int i=1;i<=1000; i=i+2){
			System.out.printf("%2d ",i);
		}
	}
	public void receiveMatrix(){
		Scanner input = new Scanner(System.in);
		double a [] = new double[3];
		double b [] = new double[3];
		double c [] = new double[3];
		for(int i = 0; i < a.length;i++){
			System.out.printf("Enter (1,%s)", i+1);
			a[i] = input.nextDouble();
		}
		for(int i = 0; i < b.length;i++){
			System.out.printf("Enter (2,%s)", i+1);
			b[i] = input.nextDouble();
		}
		for(int i = 0; i < c.length;i++){
			System.out.printf("Enter (3,%s)", i+1);
			c[i] = input.nextDouble();
		}
		Matrices matrix = new Matrices();
		System.out.printf("Determinant is %s",matrix.determinant(a[0], a[1], a[2], b[0], b[1], b[2], c[0], c[1], c[2]));
		System.out.println();
		System.out.println("The transpose of the matrix is :");
		System.out.print(matrix.transpose(a[0], a[1], a[2], b[0], b[1], b[2], c[0], c[1], c[2]));
		
	}
	public static void main(String args[]){
		NumbersCSC tester = new NumbersCSC();
//		tester.isPrime(2);
//		showEven();
//		showOdd();
		tester.receiveMatrix();
		
	}

}
