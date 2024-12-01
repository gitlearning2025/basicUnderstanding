package TestNGStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCases {
  @Test(invocationCount=2)
  public void f1(){
	  Assert.fail();
	  Reporter.log(" this method will print 2 time",true);
  }
  @Test(enabled=true)
  public void f2()
  {
	  Reporter.log("i am not able to exicute",true);
  }
  @Test(timeOut=1000)
  public void f3() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("apply time duration",true);
  }
  @Test(dependsOnMethods="f1")
  public void f4()
  {
  }
}
