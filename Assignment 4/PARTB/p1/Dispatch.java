package p1;

import p2.*;
import java.util.*;

public class Dispatch {
	private ArrayList<String> reports = new ArrayList<String>();

	public void processReport(LabTest test)
	{
		String report = test.getPatientId() + " " + test.getTestId() + " " + test.getResult();
		this.reports.add(report);
	}   // called by individual labs

	public ArrayList<String> getAllResults()
	{
		return this.reports;
	}

}
