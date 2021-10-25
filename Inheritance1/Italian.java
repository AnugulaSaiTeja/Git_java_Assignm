package Inheritance1;

public class Italian extends Restaurent{
	public void servespasta()
	{
		System.out.println("Pasta is Italian Favourie");
	}
	
	public static void main(String args[])
	{
		Italian i=new Italian();
		i.useingredians();
		i.usevegetables();
		i.servespasta();
	}

}
