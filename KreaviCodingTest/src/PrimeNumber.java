import java.util.Scanner;

public class PrimeNumber {

	Scanner scanner = new Scanner(System.in);
	
	public PrimeNumber() {
		System.out.print("Masukan angka: ");
		int range = scanner.nextInt();
		
		for(int i = 1; i <= range; i++) {
			if(i == 1 || isPrime(i))
				System.out.print(i + " ");
			else
				System.out.print("* ");
		}
	}
	
	public boolean isPrime(int number) {
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) 
				return true;
		}
		return false;
	}
	
}
