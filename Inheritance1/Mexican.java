package Inheritance1;

public class Mexican extends Restaurent{
	public void servesmanchoandpotatos()
	{
		System.out.println("Mxican serves manchos and potatos");
	}
	public static void main(String args[])
	{
		Mexican m=new Mexican();
		m.useingredians();
		m.usevegetables();
		m.servesmanchoandpotatos();
	}

}
