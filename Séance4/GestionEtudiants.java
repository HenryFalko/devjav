package Séance4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class GestionEtudiants {
    private static ArrayList<Etudiant> ListeEtudiants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void ajouterEtudiant() {
        System.out.println("Entrez le nom de l'étudiant : ");
        String nom = scanner.nextLine();
        System.out.println("Entrez le prénom de l'étudiant : ");
        String prenom = scanner.nextLine();
        System.out.println("Entrez la classe de l'étudiant : ");
        String classe = scanner.nextLine();
        Etudiant etudiant = new Etudiant(nom, prenom, classe);
        ListeEtudiants.add(etudiant);
    }

    public static void afficherEtudiants() {
        if (ListeEtudiants.isEmpty()) {
            System.out.println("Il n'y a pas encore d'étudiants dans la liste !");
        }
        else{
            System.out.println("Liste des étudiants : ");
            for (Etudiant etudiant : ListeEtudiants) {
            System.out.println(etudiant);
            }
    }
    }
    }


    
}
