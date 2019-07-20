import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	Scanner scanner = new Scanner(System.in);
	
	public Fibonacci() {
		System.out.print("Range number: ");
		int fibo = scanner.nextInt();
		System.out.println(getFiboArray(fibo));
	}
	
	public List<Integer> getFiboArray(int range) {
		List<Integer> fiboArray = new ArrayList<>();
		for(int i = 0; i < range; i++) {
			if(i == 0)
				fiboArray.add(0);
			else if(i == 1)
				fiboArray.add(1);
			else
				fiboArray.add(fiboArray.get(i-1)+fiboArray.get(i-2));
		}
		return fiboArray;
	}

}
