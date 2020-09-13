package p1;

import p2.*;
import java.util.*;

public class Billing {
 	private ArrayList<String> bills = new ArrayList<String>();
	private int total = 0;

	public void billTest(LabTest test)
	{
		String temp = test.getTestId();
		String str = temp;
		if (temp.substring(0,1).equals("B")){
			test.setPrice(400);
			str += " 400";
		  this.total += 400;
		}

		else if(temp.substring(0,1).equals("P")){
			test.setPrice(1000);
			str += " 1000";
			this.total += 1000;
		}
		this.bills.add(str);
	}  // called by Reception

	public ArrayList<String> getBills()
  {
    return this.bills;
  }
  // one string for each test
	// each string has testId and billed amount, separated by a space
	public int getTotal(){
		return this.total;
	}
}
