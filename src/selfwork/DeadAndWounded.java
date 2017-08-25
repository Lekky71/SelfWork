package selfwork;
import java.util.Arrays;
import java.util.Random ;
import java.util.Scanner ;
public class DeadAndWounded {
	Random rand = new Random();
	Scanner input = new Scanner(System.in); 
	int preset[] = new int[4];
	int plays[] = new int[4];
	public void generateRandom(){
		for(int i=0; i < preset.length ; i++){
			
            preset[i] = rand.nextInt(10);
			
			
			System.out.printf("%s " ,preset[i]);
            
		}
		if(	preset[0]==preset[1] || preset[0]==preset[2] || preset[0]==preset[3] || preset[1]==preset[2]
				|| preset[1]==preset[3] || preset[2]==preset[3]){
			generateRandom();
//			System.out.printf("%s " ,preset);
		}
		
		
	}
	public void receiveValues(){
		System.out.println("Enter four numbers between 0 and 9 without repetition");
		for(int i=0; i < preset.length ; i++){
			plays[i] = input.nextInt();
			System.out.printf("%s " ,plays[i]);
		} 
	}
	public void getDead(){
		int freqDead = 0 ;

		for(int i=0; i < 4; i++){
			if(preset[i] == plays[i])
				freqDead++ ;

	    }
        System.out.println(freqDead +" Dead");
        if(freqDead==4)
			System.exit(1);
		}
		
		
//		if(preset.equals(plays))
//			System.out.println("You win!!!");
	
	

	public void getWounded(){
		int freqWound = 0 ;
		for(int j=0; j < plays.length ; j++){
			
			int s = preset[j];
			int w = plays[j];
//			Arrays.sort(preset);

			if(s!=w && (Arrays.binarySearch(preset, w ) >= 1 ) )
				freqWound++ ;
		}
		System.out.println(freqWound +" Wounded");
	}
	public static void main(String args[]){
		DeadAndWounded game = new DeadAndWounded();
		game.generateRandom();
		while(!game.plays.equals(game.preset)){
		game.receiveValues();
		game.getWounded();
		game.getDead();
		
//		if(game.preset.equals(game.plays)){
			
//		}

    }
}
}

