package app;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static String[][] productes = new String[10][4];

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < productes.length; i++) {
            for (int j = 0; j < productes[0].length; j++) {
                productes[i][j] = " ";
            }
        }

        int numarticle = 0;
        loopsos: while (true) {
            System.out.println("---------Opcions---------");
            System.out.println("Inserir");
            System.out.println("Eliminar");
            System.out.println("Modificar");
            System.out.println("Sortir");
            System.out.println("-------------------------");
            System.out.print("\n");
            String opcio = sc.nextLine();
            switch (opcio.toLowerCase()) {
            case "inserir":
                numarticle = inserir(productes, numarticle);
                mostra(productes, numarticle);
                break;

            case "eliminar":
                System.out.println("Introdueix la referencia per suprimir-la");
                numarticle = eliminar(productes, numarticle);
                mostra(productes, numarticle);
                break;
            case "modificar":
                System.out.println("Introdueix la referència que es vol modificar");
                modificar(productes, numarticle);
                break;

            case "sortir":
                System.out.println("Fins un altre");
                break loopsos;
            }

        }

    }

    public static int inserir(String[][] productes, int numarticle) {
        System.out.println("Introdueix la Referència");
        productes[numarticle][0] = sc.nextLine();
        comprova(productes, numarticle);
        System.out.println("Introdueix Descripció");
        productes[numarticle][1] = sc.nextLine();
        System.out.println("Introdueix preu");
        productes[numarticle][2] = sc.nextLine();
        System.out.println("Inrodueix unitats");
        productes[numarticle][3] = sc.nextLine();
        numarticle++;
        return numarticle;

    }

    public static void comprova(String[][] productes, int numarticle) {
        for (int i = 0; i < productes.length; i++) {
            if (productes[numarticle][0].equalsIgnoreCase(productes[i][0]) && numarticle != i) {
                while (productes[numarticle][0].equalsIgnoreCase(productes[i][0])) {
                    System.out.println("Referencia exsistent, introdueix de nou");
                    productes[numarticle][0] = sc.nextLine();
                }
            }
        }
    }

    public static int eliminar(String[][] productes, int numarticle) {
        String ref = sc.nextLine();
        for (int i=0;i<productes.length;i++){
            if (ref.equalsIgnoreCase(productes[i][0])){
                for (int j=0;j<productes[0].length;j++){
                System.out.print(productes[i][j]+"-");
                }
            }
        }
        System.out.println("\n0");
        System.out.println("Estas segur que vols esborrar-lo? y/n");
        String preg = sc.nextLine();
        switch (preg.toLowerCase()) {
        case "y":
            for (int i = 0; i < productes.length; i++) {
                if (ref.equalsIgnoreCase(productes[i][0])) {
                    ;
                    for (int j = i; j < numarticle; j++) {
                        for (int e = 0; e < productes[0].length; e++) {
                            productes[j][e] = productes[j + 1][e];
                        }
                    }
                }
            }
            numarticle--;
            break;
        case "n":
            break;
        }

        return numarticle;
    }

    public static void mostra(String[][] productes, int numarticle) {
        for (int i = 0; i < numarticle; i++) {
            System.out.print("\n");
            for (int j = 0; j < productes[0].length; j++) {
                System.out.print(productes[i][j] + "-");
            }
        }
        System.out.println("\n");
    }

    public static void modificar(String[][] productes, int numarticle) {
        String ref = sc.nextLine();
        loopsos:
        for (int i=0;i<productes.length;i++){
            if (productes[i][0].equals(ref)){
                System.out.println("Què vols modificar:");
                System.out.println("Referencia");
                System.out.println("Descripcio");
                System.out.println("Preu");
                System.out.println("Unitats");
                System.out.println(" ");
                String elecio=sc.nextLine();
                switch(elecio.toLowerCase()){
                    case "referencia":
                    productes[i][0]=sc.nextLine();
                    break loopsos;
                    case "descripcio":
                    productes[i][1]=sc.nextLine();
                    break loopsos;
                    case "preu":
                    productes[i][2]=sc.nextLine();
                    break loopsos;
                    case "unitats":
                    productes[i][3]=sc.nextLine();
                    break loopsos;
                }
            }
        }
        mostra(productes, numarticle);
        
        
        
    }

}