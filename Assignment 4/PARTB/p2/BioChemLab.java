package p2;

import p1.*;
import java.util.*;

public class BioChemLab extends Lab
{
	private ArrayList<LabTest> biotests = new ArrayList<LabTest>();
	private int i = 1;
	private int result = 100;
	Dispatch dispatch;
	public void addTest(BioChemTest test)
	{
		String testId = "B" + Integer.toString(this.i++);
		test.setTestId(testId);

		test.setResult(Integer.toString(this.result++));
		// generates testId, the report,
    this.dispatch.processReport(test);
		// and then sends it to Dispatch using processReport
		this.biotests.add(test);
	}

	public ArrayList<LabTest> getTests()
	{
		return this.biotests;
	}

  public int getSize(){
    return this.biotests.size();
  }

	public void setDispatch( Dispatch d){
		this.dispatch = d;
	}
}
