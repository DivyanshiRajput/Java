import p1.*;
import p2.*;

import java.util.*;

public class Lab4B {
	static BioChemLab bioChemLab = new BioChemLab();
	static PathLab pathLab = new PathLab();
	static Billing billing = new Billing();
	static Dispatch dispatch = new Dispatch();

	public static void main(String[] args) {
		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
		Reception reception = new Reception();
		reception.setBilling(billing);
		reception.setBioChemLab(bioChemLab);
		reception.setPathLab(pathLab);
		bioChemLab.setDispatch(dispatch);
		pathLab.setDispatch(dispatch);
		// read in the input for test requests, and send to Reception (addRequest)
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++)
		{
			String s = input.nextLine();
			reception.addRequest(s,Integer.toString(i + 1));
		}

		System.out.printf("Total billed: %d\n", Lab4B.getBilling().getTotal());
		// get all bills from Billing and print out the total for the day

		ArrayList<String> reports = Lab4B.getDispatch().getAllResults();
		System.out.println("Reports:");
		for (int i = 0; i < reports.size(); i++)
		{
			System.out.println(reports.get(i));
		}
		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string
		System.out.println("Total tests:");
		System.out.printf("BioChem: %d\n", Lab4B.getBioChemLab().getSize());
		System.out.printf("Path: %d\n", Lab4B.getPathLab().getSize());
		// get list of tests from each lab, and print out total tests per lab

	}

	public static BioChemLab getBioChemLab(){
		return Lab4B.bioChemLab;
	}

	public static PathLab getPathLab(){
		return Lab4B.pathLab;
	}

	public static Billing getBilling(){
		return Lab4B.billing;
	}

	public static Dispatch getDispatch(){
		return Lab4B.dispatch;
	}

}
