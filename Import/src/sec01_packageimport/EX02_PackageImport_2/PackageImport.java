package sec01_packageimport.EX02_PackageImport_2;

import sec01_packageimport.common.A;

public class PackageImport {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
