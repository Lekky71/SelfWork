package selfwork;
import java.util.Arrays;
import java.util.Random;
public class BinarySearch {
	private int [] data;
	private static Random  rand = new Random();
	public BinarySearch(int size){
		data = new int[size];
		for(int i = 0 ; i < size;i++)
			data[i] = 10+rand.nextInt(90);
		Arrays.sort(data);
		
	}
	public int binaryFind(int searchElement){
		int low = 0 ;
		int high = data.length - 1;
		int middle = (low + high + 1)/2;
		int location = -1 ;
		
		do{
			System.out.println(remainingElements(low, high));
			
			for(int i = 0; i<middle;i++)
				System.out.print("  ");
			System.out.println(" * ");
			
			if(searchElement == data[middle])
				location = middle ;
			else if(searchElement < data[middle])
				high = middle - 1;
			else 
				low = middle + 1 ;
			middle = (low + high + 1)/2 ;
		}while((low <= high) && (location == -1));
		return location ;
		
	}
	public String remainingElements(int low, int high){
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < low ; i++)
			temp.append("  ");
		for(int i = low ;i <=high ;i++)
			temp.append(data[ i ] +" ") ;
		temp.append("\n");
		return temp.toString();
	}
	public String toString(){
		return remainingElements( 0, data.length - 1);
	}

}
