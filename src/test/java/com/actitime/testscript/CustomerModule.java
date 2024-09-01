package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass {
	
	@Test
	public void testing() {
		Reporter.log("Test",true);
	}

}
