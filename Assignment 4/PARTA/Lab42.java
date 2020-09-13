public class Lab42 {

	public static void main(String[] args) {
		File f = new File("test1");
    System.out.println(f);

		TextFile t1 = new TextFile("text1", "contents of the text file");
		File f1 = t1;

		f1.getName();
		// f1.getText(); // get text function is not a method of File class.
		t1.getText();
		f1.getSize();
		t1.getSize();

		System.out.println(f1);
		System.out.println(t1);

		t1 = (TextFile)f1;
		t1.getName();
		t1.getSize();

		System.out.println(t1);

		// ImageFile i1 = t1; //we cannot cast one derived class to other derived class
		// ImageFile i2 = f1;

		// i1.getSize();
		// i2.getSize();

	}

}

// Move these classes into different files

class File {
  String name;
	File(String name) {
    this.name = name;
	}

	String getName() {
    return this.name;
	}

	int getSize() {
    return 32;
  } // size of the file in bytes
  // Assume this is a fixed overhead for all types of files

  // override the toString method to print out the name and size of the file
  public String toString(){
    return this.name + " " + Integer.toString(32);
  }
}

class TextFile extends File {
	// add constructor - takes name and String text.
  String text;
  TextFile(String name, String text)
  {
    super(name);
    this.text = text;
  }

	String getText() {
    return this.text;
  }

  int getSize(){
    return text.length() + 32;
  }
	// redefine getSize.
	// Size can be computed as length of the string, converted to bytes plus the overhead

  public String toString(){
    return this.name + " " + this.text + " " + Integer.toString(this.getSize());
  }
}

class ImageFile extends File {
  int width;
  char[] image;
	// add constructor - takes name, image width, image (char array) - compute size from this array
  ImageFile(String name, int width, char[] image)
  {
    super(name);
    this.width = width;
    this.image = image;
  }

	char[] getImage() {
    return this.image;
	}
	// redefine getSize. Size can be computed as size of the image array plus overhead
  int getSize(){
    return this.image.length + 32;
  }

  public String toString(){
    String str = String.valueOf(this.image);
    return this.name + " " + str;
  }
}
