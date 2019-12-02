import java.util.Scanner;

public class Motsjoc {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introdueix el nombre de rondes: ");
        int rondes = Integer.parseInt(sc.nextLine());
        String paraules[] = new String[rondes];
        String ultims2[] = new String[rondes];
        String jugadors[][] = new String[2][2];

        for (int i = 0; i < jugadors.length; i++) {
            System.out.println("Introdueix el jugador " + (i+1));
            jugadors[i] = sc.nextLine();
        }
        
            for (int f = 0; f < rondes; f++) {
                System.out.println("Introdueix el nom:");
                paraules[f] = sc.nextLine();
                ultims2[f] = paraules[f].substring(paraules[f].length() - 2);
        }
        

    }
}
