

import java.util.Scanner;

public class Feltetel6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int szam;
        System.out.print("Enter number: ");
        szam = sc.nextInt();

        if (szam <=50) {
            System.out.println("Pontszám: " + szam);
            System.out.print("Érdemjegy: " + 1);
        }
        else if (51 <= szam && szam < 61) {
            System.out.println("Pontszám: " + szam);
            System.out.println(("Érdemjegy: " + 2));
        }
        else if (61 <= szam && szam < 71) {
            System.out.println("Pontszám: " + szam);
            System.out.println("Érdemjegy: " + 3);
        }
        else if (71 <= szam && szam < 81) {
            System.out.println("Pontszám: " + szam);
            System.out.println("Érdemjegy: " + 4);
        }
        else if (82 <= szam && szam < 101) {
            System.out.println("Pontszám: " + szam);
            System.out.println("Érdemjegy: " + 5);
        }

	}
}
