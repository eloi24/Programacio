
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class usuaris {
    public static Scanner sc = new Scanner(System.in);
    public static int files = 8;
    public static int columnes = 20;
    public static String[][] usuaris;
    public static int edat[][] = new int[2][columnes];

    public static void main(String[] args) {
        int numusuari = 0;
        usuaris = new String[files][columnes];
        boolean ok = false;
        // Omplir array
        for (int i = 0; i < usuaris.length; i++) {
            for (int j = 0; j < usuaris[0].length; j++) {
                usuaris[i][j] = " ";
            }
        }

        while (!ok) {
            mostraopcio();
            String accio = sc.nextLine();
            switch (accio.toLowerCase()) {
            case "afegir":
                System.out.println("Doncs ara afegirem un usuari");
                numusuari = demanausuari(usuaris, numusuari);
                break;
            case "login":
                System.out.println("Ara farem un login, escriu el teu usuari");
                String user = sc.nextLine();
                System.out.println("Escriu la teva contrasenya: ");
                String contrasenya = sc.nextLine();
                login(usuaris, user, contrasenya);
                break;
            case "sortir":
                System.out.println("Adeu, fins un altre!");
                ok = true;
                break;

            case "buscar":
                System.out.println("Introduiex els paràmetres de busca: ");
                cerca(usuaris);
                break;

            case "ordenar":
                System.out.println("Ordenar de manera ascendent o descendent ?");
                ordenar(edat);
                mostraedats(edat);
                break;
            }
        }

    }

    public static void mostraopcio() {
        System.out.println("Opcions");
        System.out.println("-------------------");
        System.out.println("Afegir");
        System.out.println("Login");
        System.out.println("Buscar");
        System.out.println("Sortir");
        System.out.println("Ordenar");
        System.out.println(" ");

    }

    public static int demanausuari(String[][] usuaris, int numusuari) {
        System.out.println("Escriu teu Nom ");
        usuaris[0][numusuari] = sc.nextLine();
        System.out.println("Escriu el teu cognom");
        usuaris[1][numusuari] = sc.nextLine();
        System.out.println("Escriu la teva adreça ");
        usuaris[2][numusuari] = sc.nextLine();
        System.out.println("Població: ");
        usuaris[3][numusuari] = sc.nextLine();
        data(usuaris, numusuari);
        System.out.println("Escriu nom d'usuari");
        mirausuari(usuaris, numusuari);
        System.out.println("Password: ");
        usuaris[6][numusuari] = sc.nextLine();
        contrasenya(usuaris, numusuari);
        numusuari++;
        return numusuari;
    }

    public static void login(String[][] usuaris, String user, String contrasenya) {

        for (int i = 0; i < columnes; i++) {
            if (usuaris[6][i] == " ") {
                System.out.println("Usuari i contrasenya incorrecte");
                break;
            }

            if (usuaris[5][i].equals(user) && usuaris[6][i].equals(contrasenya)) {
                System.out.print("\n");
                System.out.println("-----Info de l'usuari " + user + " ----------");
                System.out.println("Nom ");
                System.out.println(usuaris[0][i]);
                System.out.println("Cognom ");
                System.out.println(usuaris[1][i]);
                System.out.println("Adreça ");
                System.out.println(usuaris[2][i]);
                System.out.println("Població: ");
                System.out.println(usuaris[3][i]);
                System.out.println("Data de Naixement dd/MM/yyyy");
                System.out.println(usuaris[4][i]);
                System.out.println("Nom d'usuari ");
                System.out.println(usuaris[5][i]);
                System.out.println("Contrasenya: ");
                System.out.println(usuaris[6][i]);
                System.out.println("---------------");
                System.out.print("\n");
                break;

            }

        }

    }

    public static void contrasenya(String[][] usuaris, int numusuari) {
        while (!usuaris[6][numusuari].matches("((?=.*[a-z])(?=.*[A-Z])).{8,}$")) {
            System.out.println("Contrasenya Incorrecte, ha de tenir mínuscules majúscules i minim 8 caràcters");
            usuaris[6][numusuari] = sc.nextLine();
        }
    }

    public static void data(String[][] usuaris, int numusuari) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String[] datavui = format.format(date).split("/");
        System.out.println("Data de Naixement dd/MM/yyyy: ");
        usuaris[4][numusuari] = sc.nextLine();
        String[] datauser = usuaris[4][numusuari].split("/");

        if (Integer.parseInt(datauser[0]) <= Integer.parseInt(datavui[0])) {
            if (Integer.parseInt(datauser[1]) <= Integer.parseInt(datavui[1])) {
                edat[0][numusuari] = Integer.parseInt(datavui[2]) - Integer.parseInt(datauser[2]);
                edat[1][numusuari]=numusuari;

            }
            if (Integer.parseInt(datauser[1]) > Integer.parseInt(datavui[1])) {
                edat[0][numusuari] = Integer.parseInt(datavui[2]) - Integer.parseInt(datauser[2]) - 1;
                edat[1][numusuari]=numusuari;
            }
        } else {
            if (Integer.parseInt(datauser[1]) <= Integer.parseInt(datavui[1])) {
                edat[0][numusuari] = Integer.parseInt(datavui[2]) - Integer.parseInt(datauser[2]);
                edat[1][numusuari]=numusuari;

            }
            if (Integer.parseInt(datauser[1]) > Integer.parseInt(datavui[1])) {
                edat[0][numusuari] = Integer.parseInt(datavui[2]) - Integer.parseInt(datauser[2]) - 1;
                edat[1][numusuari]=numusuari;
            }

        }
        System.out.println(edat[numusuari]);
    }

    public static void mirausuari(String[][] usuaris, int numusuari) {
        boolean repetit = true;
        while (repetit) {
            String nom = sc.nextLine();
            repetit = false;
            for (int i = 0; i < usuaris[0].length; i++) {
                if (nom.equalsIgnoreCase(usuaris[5][i])) {
                    repetit = true;
                    System.out.println("Usuari ja existeix");
                }
            }
            usuaris[5][numusuari] = nom;
        }

    }

    public static void cerca(String[][] usuaris) {
        String busca = sc.nextLine();
        Pattern patro = Pattern.compile(busca);
        bucle:

        for (int i = 0; i < usuaris[0].length; i++) {
            boolean fila = false;
            for (int j = 0; j < usuaris.length; j++) {
                Matcher m = patro.matcher(usuaris[j][i]);
                if (busca.equalsIgnoreCase(usuaris[6][i])) {
                    System.out.println("No es permet buscar per contrasenya");
                    break bucle;
                }
                if (m.find() && !fila) {
                    System.out.print("\n");
                    System.out.println("-----Info de l'usuari que conté el paràmetre ----------");
                    System.out.println("Nom ");
                    System.out.println(usuaris[0][i]);
                    System.out.println("Cognom ");
                    System.out.println(usuaris[1][i]);
                    System.out.println("Adreça ");
                    System.out.println(usuaris[2][i]);
                    System.out.println("Població: ");
                    System.out.println(usuaris[3][i]);
                    System.out.println("Data de Naixement dd/MM/yyyy");
                    System.out.println(usuaris[4][i]);
                    System.out.println("Nom d'usuari ");
                    System.out.println(usuaris[5][i]);
                    System.out.println("Contrasenya: ");
                    System.out.println(usuaris[6][i]);
                    System.out.println("---------------");
                    System.out.print("\n");
                    fila = true;
                }
            }
        }

    }

    public static void ordenar(int[][] edat) {
        String opcio = sc.nextLine();

        switch (opcio.toLowerCase()) {
        case "ascendent":
            for (int i = 0; i < (edat.length - 1); i++) {
                for (int j = 0; j < edat.length; j++) {
                    if (edat[0][i] > edat[0][j]) {
                        int aux = edat[0][i];
                        edat[0][i] = edat[0][j];
                        edat[0][j] = aux;
                    }
                }
            }
            break;
        case "descendent":
            for (int i = 0; i < (edat.length - 1); i++) {
                for (int j = 0; j < edat.length; j++) {
                    if (edat[0][i] < edat[0][j]) {
                        int aux = edat[0][j];
                        edat[0][j] = edat[0][i];
                        edat[0][i] = aux;
                    }
                }   
            }
            break;
        }

    }

    public static void mostraedats(int[][] edat) {
        for (int i = 0; i < edat.length; i++) {
             if (edat[i] == 0) {
            }else{
                System.out.println(edat[i]);
            }
            
        }
    }

}
