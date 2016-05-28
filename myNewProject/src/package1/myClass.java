package package1;

public class myClass {
	int a;
	public void method(int a)
	{
		this.a = a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("Hi this is Abhinav");
		myClass c = new myClass();
		c.method(30);

	}

}
