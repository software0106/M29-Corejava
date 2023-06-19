package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitAnnotatioDemo {

	@Test
	void test() {
		
		
		System.out.println("First");
	}


	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First Junit");
	}
	

	@Test
	@BeforeAll
	static void display1()
	{
		System.out.println("First Junit");
	}
	
	
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("loading");
	}
	
	
}