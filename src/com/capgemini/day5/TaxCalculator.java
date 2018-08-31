package com.capgemini.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.CountryNotValidException;
import com.capgemini.day5.EmployeeNameInvalidException;
import com.capgemini.day5.TaxCalculator;
import com.capgemini.day5.TaxNotElgibleException;
public class TaxCalculator {
	private String empName;
	private static boolean isIndian;
	static double empSal;
	public TaxCalculator() {
		super();
		
	}
	public TaxCalculator(String empName, boolean isIndian, double empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
		
	}

	public static double calculateTax(String empName,boolean isindian, double empSalary) throws TaxNotElgibleException,EmployeeNameInvalidException,CountryNotValidException  {
		double tax;
		if(isIndian)
		{
		if(empName==""||empName==" ")
		
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		
		else {
			
		
		
		if(empSal>10000) 
		tax=(empSal*8)/100;
		
		
		else if(empSal>=50000 && empSal<=100000) 
			tax=(empSal*6)/100;
			
			
		
		else if(empSal>=30000 && empSal<=50000) 
			tax=(empSal*5)/100;
			
			
		
		else if(empSal>=10000 && empSal<=30000) 
			tax=(empSal*4)/100;
			
			
		
		else 
		
			throw new TaxNotElgibleException("The employee does not need to pay tax");
		}
		}
		
		else
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		
		return tax;
		
	}
}

		
	


