package defaultandstatic;

interface MyInterface{
	 void show() ;
	default void test() {
		System.out.println("Default Implementation");
	}
	
	static void fun() {
		System.out.println("Have fun..");
	}
	
}

class MyClass implements MyInterface{

	@Override
	public void show() {
		System.out.println("Hello from Class 1");
	}
	
	@Override
	public void test() {
		System.out.println("....");
		
	}
	
}

class MyClass2 implements MyInterface{

	@Override
	public void show() {
		
		System.out.println("Hello from Class 2");
	}
	
}

public class DefaultAndStaticInterfaceMethod {

	public static void main(String[] args) {
		
	MyInterface obj=new MyClass();
	obj.show();
	
	MyInterface.fun();
	
	}
	
	
}
