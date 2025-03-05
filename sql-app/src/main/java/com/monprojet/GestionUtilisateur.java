package com.monprojet;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.ResultSet;

public class GestionUtilisateur
{
    ArrayList listUser = new ArrayList<>();

    

    public void add (Connexion connect, Scanner sc)
    {
        sc.nextLine();
        System.out.println("Nom de l'utilisateur");
        String lastName = sc.nextLine();

        System.out.println("Prénom de l'utilisateur");
        String firstName = sc.nextLine();
        
        System.out.println("Email de l'utilisateur");
        String email = sc.nextLine();
        
        try {
            String sqlInsert = "INSERT INTO utilisateurs (prenom, nom, email) VALUES (?, ?, ?)";
            PreparedStatement pstmtInsert = connect.connexion.prepareStatement(sqlInsert);
            pstmtInsert.setString(1, firstName);
            pstmtInsert.setString(2, lastName);
            pstmtInsert.setString(3, email);

            int rowsAffected = pstmtInsert.executeUpdate();
            System.out.println("Insertion réussie, lignes affectées : " + rowsAffected);
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
        }
    }
    
    public void listUsers(Connexion connect)
    {
        String sqlSelect = "SELECT id, nom, email FROM utilisateurs";
        try {
            PreparedStatement pstmtSelect = connect.connexion.prepareStatement(sqlSelect);
            ResultSet rs = pstmtSelect.executeQuery("SELECT id, nom, email FROM utilisateurs");
            System.out.println("Liste des utilisaateurs :");
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id") + ", Nom : " +
                rs.getString("nom") + ", Email : " + rs.getString("email"));
                }
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
        }


    }

    public void delete(Connexion connect, int id)
    {
        try {
            String sqlDelete = "DELETE FROM utilisateurs WHERE id = ?";
            PreparedStatement pstmtDelete = connect.connexion.prepareStatement(sqlDelete);
            pstmtDelete.setInt(1, id);
            int rowsAffected = pstmtDelete.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Utilisateur avec ID " + id + " supprimé avec succès !");
            } else {
                System.out.println("Aucun utilisateur trouvé avec cet ID.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
            }
    }
    public void edit(Connexion connect, int id, String prenom, String nom, String email)
    {
        try {
            String sqlUpdate = "UPDATE utilisateurs SET prenom = ?, nom = ?, email = ? WHERE id = ?";
            PreparedStatement pstmtUpdate = connect.connexion.prepareStatement(sqlUpdate);
            pstmtUpdate.setString(1, prenom);
            pstmtUpdate.setString(2, nom);
            pstmtUpdate.setString(3, email);
            pstmtUpdate.setInt(4, id);
            
            int rowsAffected = pstmtUpdate.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Utilisateur avec ID " + id + " modifié avec succès !");
            } else {
                System.out.println("Aucun utilisateur trouvé avec cet ID.");
            }
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
        }
    }

    public void searchById (Connexion connect, int id)
    {
        try {
            String sqlSearch = "SELECT * FROM utilisateurs WHERE id = ?";
            PreparedStatement pstmtSearch = connect.connexion.prepareStatement(sqlSearch);
            pstmtSearch.setInt(1, id);
            ResultSet rs = pstmtSearch.executeQuery();
            if (rs.next()) {
                System.out.println("ID : " + rs.getInt("id") + ", Nom : " + rs.getString("nom") + ", Prénom : " + rs.getString("prenom") + ", Email : " + rs.getString("email"));
            } else {
                System.out.println("Aucun utilisateur trouvé avec cet ID.");
            }
            rs.close();
            } catch (SQLException e) {
                System.err.println("Erreur SQL : " + e.getMessage());
                }
                }
            
    public void searchByNameorMail(Connexion connect, String search)
    {
    try {
        String sqlSearch = "SELECT * FROM utilisateurs WHERE nom = ? OR email = ?";
        PreparedStatement pstmtSearch = connect.connexion.prepareStatement(sqlSearch);
        pstmtSearch.setString(1, search);
        pstmtSearch.setString(2, search);
        ResultSet rs = pstmtSearch.executeQuery();
        boolean found = false; 
        while (rs.next()) {
            System.out.println("ID : " + rs.getInt("id") + ", Nom : " + rs.getString("nom") + ", Prénom : " + rs.getString("prenom") + ", Email : " + rs.getString("email"));
            found = true;
        }
        if (!found) {
            System.out.println("Aucun utilisateur trouvé avec ce nom ou cet email.");
        }
        rs.close();
    } catch (SQLException e) {
        System.err.println("Erreur SQL : " + e.getMessage());
    }
}

}
