import java.util.*;

public class SmallPrinter {

	public static void main(String[] args) {
		ArrayList<Printable> plist = new ArrayList<Printable>();

		Scanner s = new Scanner(System.in);
		boolean end = false; // set to true when input has "end" as file name
		while (!end && s.hasNext()) {
			// read two lines at a time. First line is the file name, second is the file contents
			// End processing of input if file name is "end"
			String input1 = s.nextLine();
			if (input1.equals("end"))
			{
				end = true;
			}

			else
			{
				String input2 = s.nextLine();
				String str = input2.toLowerCase();
				//String[] list = input.split(" ");

				// create a TextFile from this data
				TextFile temp = new TextFile(input1, input2);
				String[] words = str.split(" ");
				List <String> words_list = Arrays.asList(words);
				if (words_list.contains("junk") == false)
				{
					plist.add(temp);
				}
				// add this text file to plist only if the file contents does not contain the word "junk"

			}
		}

		// iterate through plist and print each item using its print() method
			for (Printable i: plist)
			{
				i.print();
			}
	}


}


interface Printable {
	void print();
}

class File {
	private String name;
	File(String name) {
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}
}

// TextFile "is a" File and "is a" Printable
class TextFile extends File implements Printable{
	private String text;
	TextFile(String name, String text) {
		super(name);
		this.text = text;
	}

	public String getText()
	{
		return this.text;
	}

	public void print()
	{
		System.out.println(this.getName());
		System.out.println(this.getText());
	}
}
