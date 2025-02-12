package Séance3;

public class main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire("Jean", 1000);
        CompteBancaire compte2 = new CompteBancaire("Paul", 500);
        compte1.deposer(500);
        compte2.deposer(1000);
    }
    
}
