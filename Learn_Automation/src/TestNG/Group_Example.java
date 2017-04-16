package TestNG;

import org.testng.annotations.Test;

public class Group_Example {

	@Test(groups={"Smoke"})
	public void login(){

		System.out.println("Login done");
		System.out.println("Smoke Scenario passed");
		}

	@Test(groups={"Regression"})
	public void register(){
		System.out.println("Registration done");
	}
	
	@Test(groups={"Regression","Smoke"})
	public void Miscellenious(){
		System.out.println("Both smoke and regression passed");
	}
}