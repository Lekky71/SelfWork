package selfwork;

public class Fibonacci {
	public long fibonacci(long number){
		if((number == 0) || (number ==1))
			return 1 ;
		else
			return fibonacci(number -1) + fibonacci(number -2);
	}
	public void showFibonacci(){
		for(int c = 0 ;c <=100 ; c++)
			System.out.printf("The fibonnaci of %s is : %d\n", c, fibonacci(c));
	}
	public static void main(String args[]){
		Fibonacci framer = new Fibonacci();
		framer.showFibonacci();
	}

}
