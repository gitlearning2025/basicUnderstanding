package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="Regression")
  public void test1() 
  {
		Reporter.log("1 st test",true);
		}
  @Test(groups="Sanity")
  public void test2()
  {
	  Reporter.log("2 nd test",true);
  }
  @Test(groups="Regression")
  public void test3()
  {
	  Reporter.log("3 rd test",true);
  }
  @Test(groups="Sanity")
  public void test4()
  {
	  Reporter.log("4 th test",true);
  }
  
}
