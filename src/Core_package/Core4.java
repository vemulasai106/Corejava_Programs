package Core_package;

public class Core4 {
	public static void infosys()
	{
		System.out.println("Infosys method will starts");
		System.out.println("Infosys method will ends");
	}
	public static void cognizant()
	{
		System.out.println("Cognizant company will start");
		System.out.println("Cognizant company will end");
	}
	public void mindtree()
	{
		System.out.println("Mindtree is a very big company");
		infosys();
		cognizant();
		System.out.println("Mindtree is a top most industry");
	}

	public static void main(String[] args) {
		System.out.println("The main method will be started");
		Core4 core = new Core4();
		core.mindtree();
		System.out.println("The main method will be ended");

	}

}
