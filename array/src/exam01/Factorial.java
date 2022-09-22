package exam01;

public class Factorial {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 1;
	
		
		for(int i = 1; i<= 10; i++) {
			sum = sum * i;
			N = N + sum;
		}
		
		System.out.println(sum);
	}
}
