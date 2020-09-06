import java.io.*;
import java.util.*;

public class Test{
  public static void main (String args[])
  {
    Store store;
    store = new Store(); //instance of class Store
    Scanner input = new Scanner(System.in);

    do {  //loop for taking input of the purchased books
      String s = input.nextLine();
      if(s.equals("0 0")){ //condition for breaking the loop
        break;
      }
      String[] str = s.split(" ");
      int i = Integer.parseInt(str[0]) ; //type casting string to Integer
      double d = Double.parseDouble(str[1]); //type casting string to double
      store.Pdept.addBook(i, d);
    } while(true);

    do { //loop for taking input of the sold books
      String s = input.nextLine();
      if(s.equals("0 0")) //condition for breaking the loop
       break ;

      String[] str = s.split(" ");
      store.Sdept.yearSale.add(Integer.parseInt(str[0])); //add the year in which it was sold to the yearSale list as an Integer
      store.Sdept.bookId.add(str[1]); //stores the book id
    } while(true);

    store.Sdept.printSales(store.Pdept.purchased) ; //calling function from class Sales to print the revenue of last three years

  }
}
