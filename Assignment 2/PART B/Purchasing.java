import java.io.*;
import java.util.*;

public class Purchasing
{
  // maintains array list of books purchased by the store
  // have method to add books to the list
  ArrayList<Book> purchased = new ArrayList<Book>();

	void addBook(int year, double cp) //function for adding book in the
	{
	  Book newbook;
    double sp = cp*1.5; //multiplying cost price with the cost factor
	  newbook = new Book(year, sp);
    newbook.setId(year);  // set unique id to book, according to the year
    // format of id : YYYY-000001, YYYY-000002 and so on
    this.purchased.add(newbook); // adding book to the list
	}

}
