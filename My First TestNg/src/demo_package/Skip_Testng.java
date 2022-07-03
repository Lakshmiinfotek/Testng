package demo_package;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;
// testing the pass,skip,fail in this example
public class Skip_Testng {
  @Test// we are trying to pass this test
  public void Test1() {
	  System.out.println("Test1 and i will pass ");
  }
// we are trying to skip this test
  @Test
  public void test2() {
    System.out.println("Test2 and I will skip");
    throw new SkipException("I am skipping");//skipexecption is a method, we need to import
  }
  @Test// we are failing this test
  public void test3() {
	  System.out.println("Test3 and i will fail");
	  assertEquals(true,false);// we are importing assertequals static
  }
	  
  }

