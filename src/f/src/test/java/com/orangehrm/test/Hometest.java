package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.pages.Homepage;

public class Hometest extends Basetest{
	
	@Test
	public void homepagenav() {
		Homepage hp = new Homepage();
		hp.logoutfromorange();
	}

}
