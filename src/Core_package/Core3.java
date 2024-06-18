package Core_package;

class Chair
{
	public static void sit()
	{
		System.out.println("Person will sit on chair at back side");
	}
	public static void stand()
	{
		System.out.println("People will be stands on wall at front");
	}
	public void arrange()
	{
		System.out.println("Now a days so many peoples are arranging some topics");
	}
	public void lift()
	{
		System.out.println("In this time apartments and buildings will use lift");
	}
}
public class Core3 {
	
	/*public static void score()
	{
		System.out.println("display score");
	}
	public void marks()
	{
		System.out.println("Enter a marks");
	}*/

	public static void main(String[] args) {
		/*System.out.println("The main method will be starts");
		Core3 core1 = new Core3();
		Core3 core2 = new Core3();
		System.out.println("The main method will be ends");*/
		System.out.println("It is a chair method started");
		Chair chair1 = new Chair();
		Chair chair2 = new Chair();
		Chair chair3 = new Chair();
		System.out.println("It is a chair method ends");

	}

}
