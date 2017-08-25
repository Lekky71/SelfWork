package selfwork;
import java.util.Random;
public class LinearArray {
	private int[] data ;
	private static Random generator = new Random();
	public LinearArray(int size){
		data = new int[size];
		
		for (int i = 0; i < size ; i++){
			data[i] = 10+generator.nextInt(90);
		}
	}
	public int linearSearch(int searchKey){
		for(int index = 0 ; index<data.length ; index++)
			if(data[index] == searchKey)
				return index ;
		return -1 ;
	}
	public String toString(){
		StringBuilder temporary = new StringBuilder();
		// iterate through array
		for ( int element : data )
		temporary.append( element + " " );
		temporary.append( "\n" ); // a
		return temporary.toString();
	}

}
