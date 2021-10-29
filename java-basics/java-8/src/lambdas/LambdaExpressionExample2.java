package lambdas;

interface ProCalculator{
	int calculate(int a, int b);
}


public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		
		ProCalculator adder=(x,y) -> x+y;
		
		int result = adder.calculate(5, 6);
		
		System.out.println("Sum = "+result);
		
		ProCalculator findLargest = (a,b) -> {
									if(a>b) {
										return a;
									}
									return b;
			
		};
		
		result=findLargest.calculate(5, 6);
		
		System.out.println("Largest = "+result);
		

	}
	
}
