package Séance4;

public class Etudiant {
    private String nom;
    private String prenom;
    private String classe;

    public Etudiant(String nom, String prenom, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }
    @Override
    public String toString() {
        return "etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + '}';
    }
}
