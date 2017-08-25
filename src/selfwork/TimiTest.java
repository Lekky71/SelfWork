package selfwork;

public class TimiTest {
	public static void main(String[] args){
		String name = "Babalola" ;
		int age = 19;
		String school ="oauife                             ";
		Timi guy = new Timi(name,age);
		System.out.println("My surname is "+guy.getSurname());
		System.out.println(guy.getSurname().substring(0, 4));
		System.out.println(school.trim()+age);
		for(int i =0;i <=9;i++){
		
		boolean conti = true;
		int number =0;
		while(conti){
			System.out.println("I'm running forever!!!");
			number++;
			if(number == 1587){
				conti = false ;
			}
		}
		int num = (int) 87676.62727287;
		double numm = (double) 6372233;
		System.out.printf("The casted int is %2d and the casted double is %2s, and I'm %s\n",num,numm,"done");
		}
	}
	/*
	 * We learnt :
	 * 				Constructor
	 * 				Escape Sequence
	 * 				Conditional statements
	 * 				Loops
	 * 				casting and promoting
	 * 				Strings*/
}
