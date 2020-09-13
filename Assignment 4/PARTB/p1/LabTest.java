package p1;

import p2.*;
import java.util.*;

public class LabTest {
  private String patientId;
  private String testId;
  private String result;
  private int price;

	public LabTest(String patientId){
    this.patientId = patientId;
	 }   // note that this should never get called explicitly

	public String getPatientId(){
    return this.patientId;
  }

	public int getPrice() {
    return this.price;
  }

	public String getResult() {
    return this.result;
  }

  public String getTestId(){
    return this.testId;
  }

  public void setResult (String result){
    this.result = result;
  }

  public void setTestId (String id){
    this.testId = id;
  }

  public void setPrice (int p)
  {
    this.price = p;
  }
}
