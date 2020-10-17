import java.util.*;
import java.lang.*;
import java.io.*;

public class Test22 {

	public static void main(String[] args) {
		// // Do not change any statements in main

		Integer[] goodInts = {3, 1, 9};
		Integer[] goodInts2 = {14, 11, 19};

		ArrayList<Integer> whiteList = new ArrayList<>(Arrays.asList(goodInts));
		ArrayList<Integer> whiteList2 = new ArrayList<>(Arrays.asList(goodInts2));

		Integer[] allInts = {1, 2, 3, 9, 5, 7, 1, 9, 11};
		ArrayList<Integer> inList = new ArrayList<>(Arrays.asList(allInts));
		MyList mlist = new MyList(inList);

		// print out all elements of mlist that are in whiteList

		WhiteListIterator iter = mlist.getIterator(whiteList);
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		// print out all elements of mlist that are in whiteList2
		WhiteListIterator iter2 = mlist.getIterator(whiteList2);
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}

}

class MyList {
	// has a copy of the arraylist passed in
	ArrayList<Integer> ints;
	MyList(ArrayList<Integer> ints) {
		this.ints = new ArrayList<Integer>(ints);
	}

	WhiteListIterator getIterator(ArrayList<Integer> wList) { // passed in the WhiteList to be used
		return new WhiteListIterator(wList, this.ints);
	}

}

class WhiteListIterator implements Iterator<Integer> {
	// design constructor to take in WhileList and other appropriate inputs
	Integer CurrentIndex = -1;
	ArrayList<Integer> wlist = new ArrayList<Integer>();
	ArrayList<Integer> ints = new ArrayList<Integer>();;
	 WhiteListIterator(ArrayList<Integer> wlist, ArrayList<Integer> ints)
	 {
		 this.wlist = wlist;
		 this.ints = ints;
	 }

	@Override
	public boolean hasNext() {
		//currentIndex++;
		int index = CurrentIndex + 1;
		while(index < ints.size()){
			if(wlist.contains(ints.get(index))){
				return true;
			}
			else{
				index++;
			}
		}
		return false;
	}

	@Override
	public Integer next() {
		CurrentIndex++;
		while (!wlist.contains(ints.get(CurrentIndex))){
			CurrentIndex++;
		}
		return ints.get(CurrentIndex);
	}

}
