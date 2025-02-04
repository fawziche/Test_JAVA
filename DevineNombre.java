import java.util.Random;
import java.util.Scanner;

public class DevineNombre 
{
    public static void rechercheNombre()
    {
        Random rnd = new Random();
        int nbAlea = rnd.nextInt(100);
        int nbSaisie = 0;
        Scanner sc = new Scanner(System.in);
        String msg = "";
        int nbCoup = 0;

        while (nbSaisie != nbAlea)
        {
            System.out.println("Saisissez un nombre entre 0 et 100 :");
            nbSaisie = sc.nextInt();
            nbCoup++;

            if (nbSaisie > nbAlea)
                msg = "Trop grand !";
            else if (nbSaisie < nbAlea)
                msg = "Trop petit !";
            else
                msg = "Trouvé en " + nbCoup + " coups !";

            System.out.println(msg); 
        }

        sc.close();

    }
}
