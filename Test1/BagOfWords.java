import java.util.ArrayList;
import java.util.Scanner;

public class BagOfWords {
	ArrayList<String> bag = new ArrayList<String>();
	public BagOfWords() {

	}
	public void add(String word) {
		if (!bag.contains(word))
		{
			bag.add(word);
		}
	}

	public int size() {
		return bag.size();
	}
	public void remove(String word) {
		bag.remove(word);
	}

	public String get(int i) {
		return bag.get(i);
	}

	public static void main(String[] args) {
		BagOfWords bag = new BagOfWords();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String sentence = s.nextLine();
			String[] words = sentence.split(" ",0);
			// add each of the word in words to bag
			for (String i: words)
			{
				bag.add(i);
			}


			for(int i =0; i<bag.size();i++) {
				System.out.println(bag.get(i));
			}
			// remove words "and", "the" from the bag.
			bag.remove("and");
			bag.remove("the");


			for(int i =0; i<bag.size();i++) {
				System.out.println(bag.get(i));
			}
		}

	}

	private ArrayList<String> words;
}
