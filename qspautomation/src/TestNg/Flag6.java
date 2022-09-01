package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="functional")
  public void FTC1() 
  {
	  Reporter.log("funtional csae",true);
  }
  
  @Test(groups="intergration")
  public void IT1() 
  {
	  Reporter.log("intergration 1",true);
  }
  @Test(groups="Smoke")
  public void St1() 
  {
	  Reporter.log("Smoke Test1",true);
  }
  //-----------------------------------
  @Test(groups="functional")
  public void FTC2() 
  {
	  Reporter.log("funtional csae2",true);
  }
  
  @Test(groups="intergration")
  public void IT2() 
  {
	  Reporter.log("Intergration Test2",true);
  }
  @Test(groups="Smoke")
  public void St2() 
  {
	  Reporter.log("Smoke Test2",true);
  }
  //-------------------------------------
  @Test(groups="functional")
  public void FTC3() 
  {
	  Reporter.log("funtional csae3",true);
  }
  
  @Test(groups="intergration")
  public void IT3() 
  {
	  Reporter.log("intergration 3",true);
  }
  @Test(groups="Smoke")
  public void St3() 
  {
	  Reporter.log("Smoke Test3",true);
  }
  //------------------------------
  @Test(groups="functional")
  public void FTC4() 
  {
	  Reporter.log("funtional csae4",true);
  }
  
  @Test(groups="intergration")
  public void IT4() 
  {
	  Reporter.log("intergration 4",true);
  }
  @Test(groups="Smoke")
  public void St4() 
  {
	  Reporter.log("Smoke Test4",true);
  }
  
  
}
