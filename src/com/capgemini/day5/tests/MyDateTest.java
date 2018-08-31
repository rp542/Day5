package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.InvalidDayException;
import com.capgemini.day5.InvalidMonthException;
import com.capgemini.day5.MyDate;

class MyDateTest {
	MyDate date1;
	MyDate date2;
	MyDate date3;
	MyDate date4;
	@BeforeEach
void setUp()
{
		date1=new MyDate(10,12,1997);
		date2=new MyDate(30,2,2015);
		date3=new MyDate(8,12,1995);
		date4=new MyDate(10,2,1998);
		
		
}
	@Test
	void testwithvalidInput() throws InvalidMonthException, InvalidDayException{
		assertEquals(true,date1.CheckDate());
		assertEquals(true,date3.CheckDate());
	}
	@Test
	void testwithInvalidInputs() 
	{
		Exception e;
		e=assertThrows(Exception.class,()-> date2.CheckDate());
		assertEquals("The entered day is invalid",e.getMessage());
		
	}

}
