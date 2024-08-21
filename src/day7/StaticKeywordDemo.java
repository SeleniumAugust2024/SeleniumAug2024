package day7;

public class StaticKeywordDemo {

	static int count = 0; //static variable

	StaticKeywordDemo() {
		count++;

		System.out.println(count);
	}

	public static void main(String[] args) { //static method
		// TODO Auto-generated method stub
		
		StaticKeywordDemo obj1 = new StaticKeywordDemo();
		// 1
		StaticKeywordDemo obj2 = new StaticKeywordDemo();
		// 2
		StaticKeywordDemo obj3 = new StaticKeywordDemo();
		// 3

		int result = addition(2, 4);
		System.out.println("Addition Result = " + result);
		System.out.println(staticBlock);
	}

	static int addition(int a, int b) { //static method
		return a + b;
	}

	static int staticBlock; //static block
	static {
		staticBlock = 100;
		System.out.println("Static Block Init");
	}
}
