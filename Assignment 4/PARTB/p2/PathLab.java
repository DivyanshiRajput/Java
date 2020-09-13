package p2;

import p1.*;
import java.util.*;

public class PathLab extends Lab{
	private ArrayList<LabTest> pathtests = new ArrayList<LabTest>();
	private int i = 1;
	Dispatch dispatch;

	public void addTest(PathTest test)
	{
		String testId = "P" + Integer.toString(this.i++);
		test.setTestId(testId);
    String id = test.getTestId().substring(1,2);
    int n = Integer.parseInt(id);
		// String report = test.getPatientId() + " " + test.getTestId() + " ";
		if(n%3 == 0){
			test.setResult("malignant") ;
		}

		else {
			test.setResult("benign") ;
		}
		this.dispatch.processReport(test);
		this.pathtests.add(test);
	}

	public ArrayList<LabTest> getTests()
	{
		return this.pathtests;
	}

  public int getSize(){
    return this.pathtests.size();
  }

	public void setDispatch( Dispatch d){
		this.dispatch = d;
	}
}
