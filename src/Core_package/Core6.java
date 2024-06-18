package Core_package;

class Laptop
{
	public void mobile()
	{
		System.out.println("Mobile method starts");
		System.out.println("Mobile method ends");
	}
	public void cell()
	{
		System.out.println("Cell method starts");
		Laptop l = new Laptop();
		l.chat();
		System.out.println("Cell method ends");
	}
	public static void message()
	{
		System.out.println("Message method starts");
		Laptop l = new Laptop();
		l.mobile();
		System.out.println("Message method ends");
	}
	public static void chat()
	{
		System.out.println("Chat method starts");
		System.out.println("Chat method ends");
	}
}
public class Core6 {

	public static void main(String[] args) {
		System.out.println("The main method will starts");
		Laptop l = new Laptop();
		l.message();
		l.cell();
		System.out.println("The main method will be ended");

	}

}
