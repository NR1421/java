package com.hibernate.JUnitMaven;

public class BasicCalculator 
{
 private double basicSalary;
 public double getBasicSalary()
 {
	 return basicSalary;
 }
 public void setBasicSalary(double basicSalary)
 	{
	 	if(basicSalary < 0)
	 	{
	    throw new IllegalArgumentException("Neagative Salary is invalid");
	 	}
	 	this.basicSalary=basicSalary;
 	}
 	public double getGrossSalary()
 	{
 		return this.basicSalary + getSocialInsurance() + getAdditionBonus();	
 		}
 	public double getSocialInsurance()
 	{
 		return this.basicSalary * 25 / 100;
 	}
 	public double getAdditionBonus()
 	{
 		return this.basicSalary /10;
 	}
}
 	


