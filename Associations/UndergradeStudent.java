package Associations;

public class UndergradeStudent extends Student {
	int year;
	public void setyear(int n)
	{
		year=n;
	}
	
	public int getyear()
	{
		return year;
	}
	public void demo()
	{
		Branch b=new Branch();
		b.studiesbanch();
		Soceity s=new Soceity();
		s.collegesoceity();
	}
}
