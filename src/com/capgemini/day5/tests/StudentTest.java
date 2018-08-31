package com.capgemini.day5.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.NameNotValidException;
import com.capgemini.day5.Student;

class StudentTest {

	@Test
	void testStudentWithValidInput() throws AgeNotWithinRangeException,NameNotValidException {
		assertNotNull(new Student(1234,"tom",17,"btech"));
	}

}
