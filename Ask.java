import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Création de l'objet

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); //Lecture de la ligne

        System.out.print("Entrez votre age : ");
        int age = scanner.nextInt(); //Lecture d'un entier

        if (age < 18) {
            System.out.println("Vous êtes mineur");
            }
            else {
                System.out.println("Vous êtes majeur");
                }
        
        
        System.out.println("Bonjour " + nom + " !"); //Affichage de la ligne

        scanner.close(); //Fermeture du scanner
        }
}
