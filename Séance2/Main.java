package Séance2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Voiture v = new Voiture();

        System.out.println("Entrez une marque de voiture :");
        v.marque = scanner.nextLine();

        System.out.println("Entrez un modèle de voiture :");
        v.modele = scanner.nextLine();

        System.out.println("Les couleurs autorisées sont :");
        System.out.println(String.join(", ", v.couleursAutorisees));

        System.out.println("Entrez une couleur de voiture :");
        String couleur = scanner.nextLine();
        boolean found = false;

        for (String color : v.couleursAutorisees) {
            if (color.equalsIgnoreCase(couleur)) { 
                v.couleur = couleur;
                found = true;
                break;
            }
        }

        if (!found) { 
            System.out.println("La couleur n'est pas autorisée !");
            System.exit(1);
        }

        v.demarrer(); 
        scanner.close(); 
    }
}
