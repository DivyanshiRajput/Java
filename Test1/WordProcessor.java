
import java.util.Scanner;
import java.util.ArrayList;

public class WordProcessor {

	public ArrayList<String> process(String sentence) {
		// return the list of words in sentence in reverse order, but only words with
		// more than 4 characters, and for these, at most 8 characters
		String[] words = sentence.split(" ");
		ArrayList<String> bigWords = new ArrayList<String>();
		for (int i = words.length - 1; i >= 0; i--)
		{
			if (words[i].length()>4){
				if (words[i].length()>8)
				{
					bigWords.add(words[i].substring(0,8));
				}
				else
					bigWords.add(words[i]);
			}
		}
		return bigWords;
	}

	public static void main(String[] args) {
		WordProcessor wp = new WordProcessor();

		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String sentence = s.nextLine();

			ArrayList<String> bigWords = wp.process(sentence);

			for (String bw : bigWords) {
				System.out.println(bw);
			}
		}
	}

}
