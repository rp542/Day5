package com.capgemini.day5;

public class Student {
private int rollNo;
private String name;
private int age;
private String course;



public Student() {
	super();
	
}
public Student(int rollNo, String name, int age, String course) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
	this.course = course;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int checkAge(int age) throws AgeNotWithinRangeException
{
	if(this.age<=15 && this.age>=21)
		throw new AgeNotWithinRangeException("Age should be in between 15 and 21");	
return age;
}
public void validateName(String name) throws NameNotValidException
{
	int l;
	int temp = 0;
	l=name.length();
	for(int i=0;i<l;i++)
	{
		char ch;
		ch=name.charAt(i);
		if(ch<'A'||ch>'Z'&&ch<'a'||ch>'z')
			temp=1;
	}

	try 
	{
		String n;
		if(temp==1)
			throw new NameNotValidException();
		else
			n=name;
		
}
	catch(NameNotValidException e)
	{
		System.out.println(e);
	}
}
}
