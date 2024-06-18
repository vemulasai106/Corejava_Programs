package Core_package;

class Grape
{
	public void apple()
	{
		System.out.println("Apple starts");
		System.out.println("Apple ends");
		
	}
	public static void banana()
	{
		System.out.println("Banana starts");
		System.out.println("Banana ends");
	}
	public static void mango()
	{
		System.out.println("Mango starts");
		Grape f = new Grape();
		f.apple();
		f.banana();
		System.out.println("Mango ends");
	}
}
public class Core5 {

	public static void main(String[] args) {
		System.out.println("The main method will be start");
		Grape f = new Grape();
		f.mango();
		System.out.println("The main method will be end");

	}

}
