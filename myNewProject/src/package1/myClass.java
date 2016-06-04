package package1;

public class myClass {
	int a;
	int b;
	int c;
	int d;
	myClass()
	{
		a = 290;
		b= 20;
		c= 30;
	}
	public void method(int a)
	{
		this.a = a;
		d=a+b;
		System.out.println(d);
		System.out.println("hello Abhinav");
	}

	public static void main(String[] args) {
		System.out.println("Hi this is Abhinav kumar and I work for xyza");
		myClass c = new myClass();
		c.method(30);

	}

}
