package Séance4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n*** Menu : ***");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher les étudiants");
            System.out.println("3. Supprimer un étudiant");
            System.out.println("4. Quitter");
            System.out.println("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    GestionEtudiants.ajouterEtudiant();
                    break;
                case 2:
                    GestionEtudiants.afficherEtudiants();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 4);

        scanner.close();
    
}
}
