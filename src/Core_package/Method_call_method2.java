package Core_package;

// Method will call two non static method
public class Method_call_method2 {

	public static void bike()
	{
		System.out.println("In this time so many bikes are highly cost");
		car();
		System.out.println("In this time so many bikes are low cost");
	}
	public static void car()
	{
		System.out.println("Cars are very fast and highly cost");
		System.out.println("Cars are very slow and low cost");
	}
	public static void main(String[] args) {
		System.out.println("The main method will be started");
		bike();
		System.out.println("The main method will be ended");

	}

}
