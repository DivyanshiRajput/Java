import java.io.*;
import java.util.*;

public class Book
{
  static int i = 1 ;
  static int prevYear = 0 ; //when every book is created, the prev year is set to year purchase

  private String id ;
  private int year;
  private double sp;

  String getID(){
    return this.id;
  }

  int getYear(){
    return this.year;
  }

  double getSp() //returns selling price of the book
  {
    return this.sp;
  }

  Book(int year, double sp) //constructor storing year in which it was bought and selling price.
  {
    this.year = year;
    this.sp = sp;
  }

  void setId ( int year ) //set id when a new book is added
  {
    if( this.year > prevYear )
    {
      Book.i = 1 ; //resetting the id in a new year
      Book.prevYear = this.year ;
    }
    String y = Integer.toString(year);
    String I = String.format("%06d", i); //formatting string to make 6 digit id
    String id = y +"-"+ I ; //concatanating id
    this.id = id ;
    Book.i++ ;
  }

}
