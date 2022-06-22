package com.hibernate.JUnitMaven;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import junit.framework.TestCase;

class BasicSalaryCalaculatorTest  {
	private BasicSalaryCalaculatorTest basicSalaryCalculator;
	@Before
	void init() {
		basicSalaryCalculator = new BasicSalaryCalaculatorTest();
	}
	@Test
	void testBasicSalaryWithValidSalary() {
		double basicSalary = 4000;
		basicSalaryCalculator.setBasicSalary(basicSalary);
		double expectedSocialInsurance = basicSalary * 0.25;
		assertEquals(expectedSocialInsurance, basicSalaryCalculator.getSocialInsurance());
		double expectedAddionalBonus = basicSalary * 0.1;
		assertEquals(expectedAddionalBonus, basicSalaryCalculator.getAdditionalBonus());
		double expectedGross = basicSalary + expectedSocialInsurance + expectedAddionalBonus;
		assertEquals(expectedGross, basicSalaryCalculator.getGrossSalary());
	}
	private Object getGrossSalary() {
		
		return null;
	}
	private Object getAdditionalBonus() {
		
		return null;
	}
	private Object getSocialInsurance() {
		
		return null;
	}
	private void setBasicSalary(double basicSalary) {
		
		
	}
	@DisplayName("Test BasicSalaryCalculator with invalid salary")
	@Test
	void testBasicSalaryWithInValidSalary() {
		final double basicSalary = -100;
		assertThrows(IllegalArgumentException.class, () -> {
			basicSalaryCalculator.setBasicSalary(basicSalary);
		});
	}
	@After
	void tearDown() {
		basicSalaryCalculator = null;
	}
}

