package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class CustomerModule {
@BeforeTest
public void createCustomer()
{
	Reporter.log("createCustomer", true);
}
//@BeforeClass
//public void deleteCustomer()
//{
//	Reporter.log("deleteCustomer()", true);
//}
}
