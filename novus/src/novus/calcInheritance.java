package novus;

public class calcInheritance {
	
	public int a;
	public int b;
	
	public calcInheritance(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public int add () {
		return a + b;
	}
	
	public int subtract () {
		return a - b;
	}
	
	public static void main (String args[]) {
		
		advancedCalc calc = new advancedCalc(5,2);
		System.out.println(calc.multiplication());
		System.out.println(calc.add());
		
	}
}
	class advancedCalc extends calcInheritance {

		public advancedCalc(int a, int b) {
			//invoke base class
			super(a, b);

			this.a = a;
			this.b = b;
		}
		
		public float division () {
			return a/b;
		}
		
		public int multiplication () {
			return a*b;
		}
		
}
	