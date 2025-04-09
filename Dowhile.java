

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Adjon meg egy pozítív, egész számot: ");
		int szam = sc.nextInt();

		int i = 1;
		boolean isPrime = true;

		System.out.println("A(z) " + szam + " osztói: ");

		do {
			if (szam % i == 0) {
				System.out.print(i + " ");
				if (i != 1 && i != szam) {
					isPrime = false;
				}
			}
			i++;
		} while (i <= szam);

		System.out.println();
		System.out.println("A(z) " + szam + (isPrime ? " egy prímszám." : " nem prímszám."));

		sc.close();

	}
}
