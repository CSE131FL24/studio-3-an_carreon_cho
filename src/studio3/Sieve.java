package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		boolean [] isPrime = new boolean[n+1];
		
		for (int i=2; i<=n; i++) {
			isPrime[i] = true;
		}
		for (int i=2; i<=n; i++) {
			if(isPrime[i]) {
				for(int j=2*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		System.out.print("The primes are: ");
		for(int i=2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.print(i + " ");
			}
		}
		in.close();
	}
}
