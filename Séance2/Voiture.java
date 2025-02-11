package Séance2;

public class Voiture {
    public String[] couleursAutorisees = {"rouge", "bleu", "vert", "noir", "blanc"};

    public String marque;
    public String modele;
    public String couleur;

    public void demarrer() {
        System.out.println("La voiture demarre");
    }
    public void freiner() {
        System.out.println("La voiture freine");
    }
    public void accelerer() {
        System.out.println("La voiture accelere");
    }
}
