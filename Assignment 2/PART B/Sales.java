import java.io.*;
import java.util.*;

public class Sales
{
  // array list to maintain the record of year of sale
  ArrayList<Integer> yearSale = new ArrayList<Integer>() ;

  // arrayl list to maintain the record of id, of the selled item
  ArrayList<String> bookId = new ArrayList<String>() ;

  // print revenue for the year in the format <year> <year-1> <year-2>
  void getRevenue(int year, ArrayList<Book> purchased)
  {
    double r1, r2, r3 ;
    r1 = r2 = r3 = 0 ;


    for(int i = 0 ; i < yearSale.size() ; i++)
    {
      if(yearSale.get(i) == year)
      {
        int bookYear = Integer.parseInt(bookId.get(i).split("-")[0]);
        if(year == bookYear) // if sale year == year of book purchased
        {
          String id = bookId.get(i) ;
          r1 += this.getPriceFromId(id, purchased) ;
        }

        else if(year - 1 == bookYear ) // if sale year - 1  == year of book purchased
        {
          String id = bookId.get(i) ;
          r2 += this.getPriceFromId(id, purchased) ;
        }

        else if(year - 2 == bookYear ) // if sale year - 2 == year of book purchased
        {
          String id = bookId.get(i) ;
          r3 += this.getPriceFromId(id, purchased) ;
        }
      }
    }

    int rev1 = (int) r1 ;
    int rev2 = (int) r2 ;
    int rev3 = (int) r3 ;
    // printing the revenue statement
    System.out.println(year + " " + rev1 + " " + rev2 + " " + rev3);
  }


  // returns selling price of book : takes id and array list of books
  double getPriceFromId(String id, ArrayList<Book> books)
  {
    double price = 0;
    for( Book b : books )
    {
      if(b.getID().equals(id))
        {
          price = b.getSp();
          break ;
        }

    }
    return price ;
  }

  // print the revenue statements from minYear to maxYear
  void printSales(ArrayList<Book> purchased)
  {
      int minYear = Collections.min(yearSale);
      int maxYear = Collections.max(yearSale);
      for (int i = minYear; i <= maxYear; i++)
      {
        getRevenue(i, purchased);
      }
  }
}
