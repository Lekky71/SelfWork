package selfwork;

public class Factori {
	public long factori(long number){
		if(number==0)
			return 1;
		else
			return number * factori(number-1);
	}
	public static void main(String args[]){
		Factori framer = new Factori();
		System.out.println(framer.factori(11));
	}
}
