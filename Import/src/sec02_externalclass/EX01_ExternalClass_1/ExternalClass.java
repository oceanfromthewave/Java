package sec02_externalclass.EX01_ExternalClass_1;
class A {
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m+", "+n );
		
	}
}


public class ExternalClass {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}


