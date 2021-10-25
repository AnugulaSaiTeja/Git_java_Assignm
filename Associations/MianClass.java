package Associations;

public class MianClass
{
	public static void main(String args[])
	{
		UndergradeStudent u=new UndergradeStudent();
		u.setname("James");
		u.setrollno(101);
		u.setcity("Kolkata");
		u.setyear(2021);
		System.out.println("Student details are \n Name:- "+u.getname()+"\n Rollno:- " +u.getrollno()+"\n Year:- "+u.getyear()+"\n City:- "+u.getcity());
		u.demo();
	}

}
