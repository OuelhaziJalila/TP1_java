package tp1_ex3;
import java.util.Scanner;

public class TestPoint {
	 public static void main(String[] args) {
	        MaDate d1 = new MaDate(14, 2, 2020);
	        MaDate d2 = new MaDate(20, 9, 2024);
	        MaDate d3 = new MaDate(2000);
	        d3.setJour(31);
	        d3.setMois(12);
	        System.out.println("La première date: " + (d1.toString()));
	        System.out.println("La deuxième date 2: " + (d2.toString()));
	        System.out.println("La troisième date 3: " +( d3.toString()));
	        if (d1.equals(d2)) {
	            System.out.println("La première date et La deuxième date sont identiques");
	        } else {
	            System.out.println("La première date et La deuxième date sont différentes");
	        }
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\n Choisissez une opération :");
	        System.out.println("1. Ajout d'un jour");
	        System.out.println("2. Ajout de plusieurs jours");
	        System.out.println("3. Ajout d'un mois");
	        System.out.println("4. Ajout d'une année");
	        int choix = scanner.nextInt();
	        switch (choix) {
            case 1:
                d1.ajouterUnJour();
                System.out.println("Date après l'ajout d'un jour sera: " +(d1.toString()));
                break;
            case 2:
                System.out.print("Entrez le nombre de jours à ajouter: ");
                int n = scanner.nextInt();
                d1.ajouterPlusieursJours(n);
                System.out.println("Date après l'ajout de " + n + " jours: " + (d1.toString()));
                break;
            case 3:
                d1.ajouterUnMois();
                System.out.println("Date après l'ajout d'un mois sera: " + (d1.toString()));
                break;
            case 4:
                d1.ajouterUnAn();
                System.out.println("Date après l'ajout d'une année sera: " +(d1.toString()));
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }

        scanner.close();
    }
}
