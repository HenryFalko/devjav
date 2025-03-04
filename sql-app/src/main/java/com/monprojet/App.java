package com.monprojet;

import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        Connexion connexion = new Connexion();
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        GestionUtilisateur gu = new GestionUtilisateur();    

        do {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Ajouter un utilisateur");
            System.out.println("2 - Lister les utilisateurs");
            System.out.println("3 - Supprimer un utilisateur");
            System.out.println("4 - Modifier un utilisateur");
            System.out.println("5 - Rechercher un utilisateur par ID");
            System.out.println("6 - Rechercher un utilisateur par Nom/E-mail");
            System.out.println("0 - quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    gu.add(connexion, sc);
                    break;
                case 2:
                    gu.listUsers(connexion);
                    break;
                case 3:
                    System.out.println("Entrez l'ID de l'utilisateur à supprimer :");
                    int idToDelete = sc.nextInt();
                    gu.delete(connexion, idToDelete); 
                    break; 
                case 4:
                    System.out.println("Entrez l'ID de l'utilisateur à modifier :");
                    int idToUpdate = sc.nextInt(); 
                    sc.nextLine();
                    System.out.println("Entrez le nouveau prénom :");
                    String prenom = sc.nextLine();
                    System.out.println("Entrez le nouveau nom :");
                    String nom = sc.nextLine();
                    System.out.println("Entrez le nouveau email :");
                    String email = sc.nextLine();
                    gu.edit(connexion, idToUpdate, prenom, nom, email);
                    break;        
                case 5:
                    System.out.println("Entrez l'ID à rechercher :");
                    int idToSearch = sc.nextInt();
                    gu.searchById(connexion, idToSearch);
                    break;
                case 6:
                    System.out.println("Entrez l'email ou le nom à rechercher :");
                    sc.nextLine(); 
                    String search = sc.nextLine();
                    gu.searchByNameorMail(connexion, search);
                    break;    
                default:
                    System.out.println("L'action demandé n'existe pas !");
            }
    
        } while (choix != 0);
    
        connexion.close();
        sc.close();
    }
}
