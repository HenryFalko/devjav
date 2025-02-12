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
    try {
        Thread.sleep(2000); 
    } catch (InterruptedException e) {
        System.out.println("Une erreur est survenue pendant la pause.");
    }
    }
    public static void supprimerEtudiant() {
        System.out.println("Entrez le nom de l'étudiant à supprimer : ");
        String nom = scanner.nextLine();
        Iterator<Etudiant> iterator = ListeEtudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant etudiant = iterator.next();
            if (etudiant.getNom().equals(nom)) {
                iterator.remove();
                System.out.println("L'étudiant a été supprimé avec succès !");
                return;
            }
        }
        System.out.println("L'étudiant n'a pas été trouvé !");
    }


    
}
