package Core_package;


/*class Demo
{
	public static void run()
	{
		System.out.println("Man will runs 15 kms per every day");
	}
	public void play()
	{
		System.out.println("I will play shuttle and vallyball every day");
	}
}*/
public class Core2 {

	public static void kick()
	{
		System.out.println("Kick a ball on human being");
	}
	public void defend()
	{
		System.out.println("People moves a defend ball");
	}
	public static void main(String[] args) {
		/*Demo d  = new Demo();
		d.run();
		d.play();*/
		System.out.println("The main method will be starts");
		kick();
		Core2 core = new Core2();
		core.defend();
	
		System.out.println("The main method will be ends");
		

	}

}
