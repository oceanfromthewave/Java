package exam01;

public class MultiplesOF3 {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i = 1; i<=N; i++) {
			if((i%3==0)) {
				System.out.println(i);
				sum += i;
			}
			
		}
	}
}
		