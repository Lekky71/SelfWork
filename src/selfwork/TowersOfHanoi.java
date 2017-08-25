package selfwork;
public class TowersOfHanoi {
	int numDisks ;
	public TowersOfHanoi(int disk){
		numDisks = disk ;
	}
	public void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg){
		if(disks==0){
			System.out.printf("\n%d --> %d",sourcePeg, destinationPeg);
			return;
		}
		else{
			solveTowers(disks-1, sourcePeg, tempPeg, destinationPeg);
			
			System.out.printf("\n%d --> %d",sourcePeg, destinationPeg);
			
			solveTowers(disks - 1,tempPeg, destinationPeg, sourcePeg );
		}
			
	}
	public static void main(String args[]){
		int startPeg = 1;
		// value 1 used to indicate startPeg in output
		int endPeg = 3;
		// value 3 used to indicate endPeg in output
		int tempPeg = 2;
		// value 2 used to indicate tempPeg in output
		int totalDisks = 64; // number of disks
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi( totalDisks );
		// initial nonrecursive call: move all disks.
		towersOfHanoi.solveTowers( totalDisks, startPeg, endPeg, tempPeg );
	}

}
