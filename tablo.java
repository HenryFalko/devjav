import java.util.Arrays;
public class tablo {
    public static void main(String[] args) {
        int[] tab = {14,15,18,19,5,6,7,3,10,17,18};
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = sum + tab[i];
        }
        int moy = sum/ tab.length ;
        System.out.println("La moyenne est de " + moy);

        Arrays.sort(tab);
        double mid = 0;
        if (tab.length % 2 != 0) {
            mid = tab[tab.length / 2];
        }
        else{
            mid = (tab[tab.length / 2] + tab[tab.length / 2 - 1]) / 2.0;
        }
        System.out.println("La mediane est de " + mid);
}
}