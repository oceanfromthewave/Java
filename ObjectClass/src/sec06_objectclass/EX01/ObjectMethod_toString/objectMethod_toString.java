package sec06_objectclass.EX01.ObjectMethod_toString;

class A { 
	int a=3;
	int b=4;
}
class B {
	int a=3;
	int b=4;

	public String toString() {		
		return "필드값(a, b) =" + a +" " +b;
	}	
}
public class objectMethod_toString {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();
		B b = new B();
		
		//#2. 메서드 호출
		System.out.printf("%x\n", a.hashCode()); 
		System.out.println(a.toString()); 
		System.out.println(b);
	}
}


