import java.util.*;

class Sentence{
  public static void main(String[] args)
  {
    //Scanner input = new Scanner(System.in);
    //String s = input.nextLine();
    String s = "the language Java the language is named after the island Java";
    String[] array = s.split(" ", -2);
    for (int i = array.length - 1; i >= 0; i--)
    {
      System.out.printf ("%s ", array[i]);
    }
  }
}
