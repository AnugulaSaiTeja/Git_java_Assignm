package Inheritance1;

public class Employee extends HumanBeing {
	int id;
	double salary;
	public void setid(int i)
	{
		id=i;
	}
	
	public void setsalary(double i)
	{
		salary=i;
	}
	public int getid()
	{
		return id;
	}
	public double getsalary()
	{
		return salary;
	}
	public static void main(String arg[])
	{
		Employee e=new Employee();
		e.setname("Robin");
		e.setid(101);
		e.setsalary(20000);
		System.out.println("The name is " +e.getname());
		System.out.println("The id is " +e.getid());
		System.out.println("The salary is " +e.getsalary());
	}

}
