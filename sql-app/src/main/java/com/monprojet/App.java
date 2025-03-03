package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Connection connexion = new Connection();
        int choix = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("0. Quitter");

            Statement stmt = connexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id,nom,email FROM utilisateur");

            System.out.println("Liste des utilisateurs :");

            //Parcours du ResultSet
            while(rs.next()){
                System.out.println("id : " + rs.getInt("id") + " nom : " + rs.getString("nom") + " email : " + rs.getString("email"));
            }
        }while();
    
        connexion.close();
        sc.close();
        System.exit(0);
    }
        
}