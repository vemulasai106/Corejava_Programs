package Core_package;

public class Company {
	public void tcs()
	{
		System.out.println("Tcs is a one of the governament approval company");
		wipro();
		System.out.println("Tcs is a software works on growing company");
	}
	public static void wipro()
	{
		System.out.println("Wipro is a one of IT industrial company");
		System.out.println("Wipro is a working mapping and other process");
	}

	public static void main(String[] args) {
		System.out.println("The main method will be started");
		Company c = new Company();
		c.tcs();
		System.out.println("The main method will be ended");

	}

}
