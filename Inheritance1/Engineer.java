package Inheritance1;

public class Engineer extends Employee{
	String desig;
	public void setdesig(String de)
	{
		desig=de;
	}
	
	public String getdesig()
	{
		return desig;
	}
	
	public static void main(String args[])
	{
		Engineer e=new Engineer();
		e.setname("James");
		e.setid(101);
		e.setsalary(300000);
		e.setdesig("Senior Programmer");
		System.out.println("The name is " +e.getname());
		System.out.println("The id is " +e.getid());
		System.out.println("The salary is " +e.getsalary());
		System.out.println("The designation is " +e.getdesig());
	}
	

}
