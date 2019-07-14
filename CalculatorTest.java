public class CalculatorTest {

	public static void main(String[] args) {
		Calculator test1 = new Calculator(10.5,"*",5.2);
		Calculator test2 = new Calculator(100.0,"/",20.0);
		test1.performOperation();
		test1.getResults();
		test2.performOperation();
		test2.getResults();
	}
}