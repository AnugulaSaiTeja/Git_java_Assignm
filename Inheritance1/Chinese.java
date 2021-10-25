package Inheritance1;

public class Chinese extends Restaurent{
	public void Noodles()
	{
		System.out.println("Noodles is a chinese food");
	}
	public static void main(String args[])
	{
		Chinese c=new Chinese();
		c.useingredians();
		c.usevegetables();
		c.Noodles();
	}
}
