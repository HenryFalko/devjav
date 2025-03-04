package com.monprojet;

    public class Utilisateur {
        private int id;
        private String prenom;
        private String nom;
        private String email;
    
        public Utilisateur(int id, String prenom, String nom, String email) {
            this.id = id;
            this.prenom = prenom;
            this.nom = nom;
            this.email = email;
        }    
}
