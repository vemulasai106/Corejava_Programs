package Core_package;


class Fruits
{
	public static void apple()
	{
		System.out.println("My favourite fruit in apple");
		Fruits f = new Fruits();
		f.banana();
		System.out.println("My favourite fruit not in apple");
	}
	public void banana()
	{
		System.out.println("The banana is a very famous fruit");
		System.out.println("The banana is a little famous fruit");
	}
}
public class Method_call_method3 {

	public static void main(String[] args) {
		System.out.println("The main method will be started");
		Fruits f = new Fruits();
		f.apple();
		System.out.println("The main method will be ended");

	}

}
