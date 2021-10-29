package lambdas;

interface Operation{
	double operate(double x, double y);
}

class AdvancedCalculator{
	
	public double calculate(double x, double y, Operation op) {
		
		double result = op.operate(x, y);
		
		return result;
		
	}
	
}



public class FunctionalProgramming {

	public static void main(String[] args) {
		
		AdvancedCalculator calculator=new AdvancedCalculator();
		
		Operation divide= (x,y)->x/y;
		
		Operation add = (x,y)->x+y;
		
		Operation subtract = (x,y)->x-y;
		
		
		System.out.println(calculator.calculate(7,8,subtract));
		

	}
	
}
