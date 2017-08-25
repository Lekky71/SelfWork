package selfwork;

public class Firster {
	public long factorial(long number){
		if(number <= 1)
			return 1 ;
		else
			return number * factorial(number -1 );
	}
	public void showFactorials(){
		for(int c=0 ; c<=10 ; c++)
			System.out.printf("%d! = %d\n",c, factorial(c));
	}
	public static void main(String args[]){
		Firster framer = new Firster();
		framer.showFactorials();
		
	}

}
