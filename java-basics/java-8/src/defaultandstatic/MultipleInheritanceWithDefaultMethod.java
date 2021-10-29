package defaultandstatic;

interface Intr1{
	default void fun() {
		System.out.println("I am having fun..");
	}
}

interface Intr2{
	default void fun() {
		System.out.println("Java 8 is interesting..");
	}
}

class MyClass1 implements Intr1,Intr2{
	
	@Override
	public void fun() {
		System.out.println("Default methods are cool..");
	}
	
}

public class MultipleInheritanceWithDefaultMethod {

	
	public static void main(String[] args) {
		
		MyClass1 obj=new MyClass1();
		
		obj.fun();
		
	}
}
