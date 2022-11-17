package com.sgtesting.tests;
interface University
{
	void showUniversityName(String name);
}

interface EnggCollege
{
	void showCollegeName(String name);
}

class SLNEngg implements University,EnggCollege
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void showCollegeName(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		University obj=new SLNEngg();
		obj.showUniversityName("VTU Belguam");
		
		EnggCollege obj1=(EnggCollege) obj;
		obj1.showCollegeName("SLN Engineering College");

	}

}
