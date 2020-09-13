package p1;

import p2.*;
import java.util.*;

public class Reception {
	Billing billing;
	BioChemLab bLab;
	PathLab pLab;

	public boolean addRequest(String testType, String patientName) {
		// should create the appropriate sub-type of LabTest,

		if (testType.equals("Bio")){
      BioChemTest bioTest = new BioChemTest(patientName);
			this.bLab.addTest(bioTest);
      this.billing.billTest(bioTest);
			return true;
		}

		if (testType.equals("Path")){
      PathTest pathTest = new PathTest(patientName);
			this.pLab.addTest(pathTest);
      this.billing.billTest(pathTest);
			return true;
		}
		// add that to Billing and
		// then to the specific lab, after generating a patient ID
		return false;
	}

	public void setBilling (Billing b){
		this.billing = b;
	}

	public void setBioChemLab (BioChemLab b){
		this.bLab = b;
	}

	public void setPathLab (PathLab b){
		this.pLab = b;
	}

}
