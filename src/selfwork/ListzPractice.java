package selfwork;

import java.util.*;

public class ListzPractice {
	
	public static void main(String args[]){
		String[] things = {"candy","bars","cars","skills","cookies","soap","opera","fortune"};
		List<String> l = new LinkedList<String>();
		
		for(String x : things)
			l.add(x);
		
		printMe(l);
		removeStuff(l,2,5);
		printMe(l);
		reverseMe(l);
		
	}
	private static void printMe(List<String> list){
		for(String i : list)
			System.out.printf("%s ",i);
		System.out.println("");
	}
	
	private static void removeStuff(List<String> list, int from, int to){
		list.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> list){
		ListIterator<String> it = list.listIterator(list.size());
		while(it.hasPrevious())
			System.out.printf("%s ", it.previous());
	}

}
