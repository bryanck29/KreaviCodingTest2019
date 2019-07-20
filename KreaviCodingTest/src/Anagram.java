import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	Scanner scanner = new Scanner(System.in);
	
	public Anagram() {
		String kata1 = "";
		String kata2 = "";
		
		System.out.print("Masukan kata 1: ");
		kata1 = scanner.nextLine();
		System.out.print("Masukan kata 2: ");
		kata2 = scanner.nextLine();
		
		if(checkForAnagram(kata1, kata2))
			System.out.println("Ini adalah anagram");
		else
			System.out.println("Ini bukan anagram");
	}

	public boolean checkForAnagram(String k1, String k2) {
		char[] charsOfK1 = k1.toLowerCase().replaceAll(" ", "").toCharArray();
		char[] charsOfK2 = k2.toLowerCase().replaceAll(" ", "").toCharArray();
		Arrays.sort(charsOfK1);
		Arrays.sort(charsOfK2);
		return new String(charsOfK1).equals(new String(charsOfK2));
	}
}
