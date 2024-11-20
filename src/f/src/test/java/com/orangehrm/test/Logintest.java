package com.orangehrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orangehrm.pages.Loginpage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class Logintest extends Basetest{
	
	@Test
	public void logintoapplication() throws InvalidFormatException, IOException
	{
		Loginpage lp = new Loginpage();
		//lp.logintoapp(ExcelUtility.getTestdata(i, 0), ExcelUtility.getTestdata(i, 1));
		
		lp.logintoapp(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"));
	}
}
