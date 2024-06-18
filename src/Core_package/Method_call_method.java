package Core_package;

// Method will call two static method
public class Method_call_method {

	public static void main(String[] args) {
		System.out.println("main starts");
		cycle();
		System.out.println("main ends");
	}
	public static void cycle()
	{
		System.out.println("Cycle starts");
		run();
		System.out.println("Cycle ends");
	}
	public static void run()
	{
		System.out.println("Run starts");
		System.out.println("Run ends");
	}

}
