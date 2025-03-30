import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Jour ");
        int jourInitial = sc.nextInt();
        sc.next();
        int heureInitiale = sc.nextInt();
        sc.next();
        int minuteInitiale = sc.nextInt();
        sc.next();
        int secondeInitiale = sc.nextInt();

        System.out.print("Jour ");
        int jourFinal = sc.nextInt();
        sc.next();
        int heureFinale = sc.nextInt();
        sc.next();
        int minuteFinale = sc.nextInt();
        sc.next();
        int secondeFinale = sc.nextInt();

        // Conversion de tout en secondes
        int instantInitial = secondeInitiale + minuteInitiale * 60 + heureInitiale * 3600 + jourInitial * 86400;
        int instantFinal = secondeFinale + minuteFinale * 60 + heureFinale * 3600 + jourFinal * 86400;

        // Calcul de la différence totale en secondes
        int duree = instantFinal - instantInitial;

        // Conversion en jours, heures, minutes et secondes
        int jours = duree / 86400;
        duree %= 86400;
        int heures = duree / 3600;
        duree %= 3600;
        int minutes = duree / 60;
        int secondes = duree % 60;

        // Affichage du résultat
        System.out.println(jours + " jour(s)");
        System.out.println(heures + " heure(s)");
        System.out.println(minutes + " minute(s)");
        System.out.println(secondes + " seconde(s)");

        sc.close();
    }
}
