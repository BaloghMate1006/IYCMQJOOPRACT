

public class While1 {
	public static void main(String[] args) {

		int i = 0;
		int parosossz = 0, parosszorzat = 1;

		while (i < 10) {
			if (i % 2 == 0) {
				parosossz += i;
			}
			else {
				parosszorzat *= i;
			}
			i++;

		}
		System.out.println("Páros számok összege: " + parosossz);
		System.out.println("Páratlan számok szorzata: " + parosszorzat);

	}
}
