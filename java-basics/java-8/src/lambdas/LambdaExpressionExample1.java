package lambdas;

interface Calculator{
	void test();
	
	default int add(int a, int b) {
		return a+b;
	}
}

//class MyCalculator implements Calculator{
//	
//	@Override
//	public void test() {
//		System.out.println("Calculator working fine..");
//	}
//}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		
//		Calculator obj=new MyCalculator();
		
//		Calculator advCalculator= new Calculator() {
//			
//			@Override
//			public void test() {
//				
//				System.out.println("Advanced Calculator");
//			}
//		};
		
		Calculator proCalculator= ()-> System.out.println("Professional Calculator");
	 
		
		proCalculator.test();
	}
	
}
