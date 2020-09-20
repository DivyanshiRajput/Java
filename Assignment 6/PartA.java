import java.util.*;
import java.io.*;

public class PartA{
  public static void main(String[] args) {
    String s = "My Name is Divyanshi".toLowerCase();
    System.out.println(NoOfWords(s));
    Words(s);
    String[] list = {"hello", "world", "code", "pizza", "life", "friends"};
    linkedHashSet(list);
    shuffle(list);
    hashset(list);
    System.out.println(sortedset(list));
    comparator(list);
    linkedHashSet(list);
  }

  public static int NoOfWords (String str)
  {
    String[] s = str.split(" ");
    return s.length;
  }

  public static void Words (String str)
  {
    String[] s = str.split(" ");
    List<String> words_list = Arrays.asList(s);
    System.out.println (Collections.max(words_list));
    System.out.println (Collections.min(words_list));
  }

  public static void shuffle (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    Collections.shuffle(words_list);
    System.out.println(words_list);
  }

  public static void hashset (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    Set<String> hSet = new HashSet<String>(words_list);
    System.out.println(hSet);
  }

  public static SortedSet<String> sortedset (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    SortedSet<String> sSet = new TreeSet<String>(words_list);
    //System.out.println(sSet);
    return sSet;
  }

  public static void comparator (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    SortedSet<String> unique_words = new TreeSet<String>(new SortBySize());
    unique_words.addAll(words_list);
    System.out.println(unique_words);
  }

  public static void linkedHashSet (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    LinkedHashSet<String> hs = new LinkedHashSet<String>(words_list);
    System.out.println(hs);
  }

  public static void sortByFrequency (String[] list)
  {
    List<String> words_list = Arrays.asList(list);
    Map<String, Integer> hm = new HashMap<String, Integer>();
    for (String i : words_list)
    {
      Integer j = hm.get(i);
      hm.put(i, (j == null) ? 1 : j + 1);
    }
  }
}


class SortBySize implements Comparator<String>
{
  public int compare(String a, String b)
  {
    if (a.length() != b.length())
      return a.length() - b.length();

    return a.compareTo(b);
  }
}
