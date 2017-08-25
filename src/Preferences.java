	import java.util.Scanner ;
	import javafx.scene.media.*;
	import java.util.InputMismatchException ;
public class Preferences {
	private String Topic ;
	private int numberOfRounds;
	private int duration ;
	private String voice_type ;
	Scanner input = new Scanner(System.in);
	public Preferences(){
		setTopic();
		Rounds();
		voiceType();
		duration = 45 ;
	}
	public String setTopic(){
		System.out.println("Enter the rap battle topic");
		Topic = input.nextLine();
		return Topic ;
		
	}
	public int Rounds(){
		int n ;
		boolean continueLoop = true ;
		do{
		try{
		System.out.println(" Enter the number of rounds 3 or 5 ");
		n = input.nextInt();
		numberOfRounds = n ;
		continueLoop = (n==3 || n==5) ? false : true ;
		}
		catch(InputMismatchException e){
			System.err.println("You can only input 3 or 5");
			input.nextLine();
		}
		
		}while(continueLoop);
		return numberOfRounds ;
	}
//	public void setRounds(int n){
//		voi
//	}
	
	public String voiceType(){
		String v ;
		
		boolean continueLoop = true ;
		while(continueLoop){
			System.out.println("Male or female");
			v = input.nextLine();
			
			continueLoop = (v.toLowerCase().equals("male") || v.toLowerCase().equals("female")) ? false : true ;
			
			
//			if(voice_type!= "male" || voice_type != "female"){
//				;
//			}
		}
		return voice_type ;
	}
	public static void main(String args[]){
		new Preferences();
	}
	
	
	
	
		

}
