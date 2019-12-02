package app;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int numarticles = 0;
        int files = 6;
        String[][] descref = new String[files][2];
        int[] unitats = new int[files];
        float[] preunitat = new float[files];
        boolean ok = false;
        String[][] clients = new String[3][5];
        int codiclient = 0;

        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[0].length; j++) {
                clients[i][j] = " ";
            }
        }

        for (int i = 0; i < descref.length; i++) {
            for (int j = 0; j < descref[0].length; j++) {
                descref[i][j] = " ";
            }
        }

        while (!ok) {
            System.out.println("0: Sortir");
            System.out.println("1: Afegir material a inventari");
            System.out.println("2: Veure Stock");
            System.out.println("3: Codi client");
            System.out.println("4: Venda");

            int eleccio = Integer.parseInt(sc.nextLine());
            switch (eleccio) {
            case 0:
                System.out.println("Gràcies per fer servir l’aplicació FactuSoft. Fins un altra!");
                ok = true;
                break;
            case 1:
                numarticles = Afegir(descref, unitats, preunitat, numarticles);
                System.out.println(numarticles);
                break;
            case 2:
                articlemostra(descref, unitats, preunitat, numarticles);
                break;
            case 3:
                codiclient = clients(clients, codiclient);
                break;
            case 4:
                venda(clients, descref, unitats, preunitat,numarticles);
                break;

            }
        }
    }

    public static int Afegir(String[][] descref, int[] unitats, float[] preunitat, int numarticles) {
        while (true) {
            System.out.println("Num Ref");
            int pregunta = Integer.parseInt(sc.nextLine());
            if (pregunta == 0) {
                break;
            }
            descref[0][numarticles] = Integer.toString(pregunta);
            System.out.println("Descripció");
            descref[0][numarticles] = sc.nextLine();
            System.out.println("Unitats:");
            unitats[numarticles] = Integer.parseInt(sc.nextLine());
            System.out.println("Preu/unitat:");
            preunitat[numarticles] = Float.parseFloat(sc.nextLine());
            numarticles++;
            articlemostra(descref, unitats, preunitat, numarticles);

        }
        return numarticles;

    }

    public static void articlemostra(String[][] descref, int[] unitats, float[] preunitat, int numarticles) {
        for (int i = 0; i < numarticles; i++) {
            System.out.print("Ref: ");
            System.out.print(descref[0][i]);
            System.out.print(" -Desc: ");
            System.out.print(descref[1][i]);
            System.out.print(" -Unitats: ");
            System.out.print(unitats[i]);
            System.out.print(" -Preu/Unitat: ");
            System.out.print(preunitat[i]);
            System.out.print("\n");
        }

    }

    public static int clients(String[][] clients, int codiclient) {
        System.out.println("Introdueix el nom del client: ");
        clients[codiclient][1] = sc.nextLine();
        System.out.println("Introdueix el Cognom del client: ");
        clients[codiclient][2] = sc.nextLine();
        System.out.println("Introdueix Població del client: ");
        clients[codiclient][3] = sc.nextLine();
        System.out.println("Introdueix el telèfon del client: ");
        clients[codiclient][4] = sc.nextLine();
        clients[codiclient][0] = Integer.toString(codiclient + 1);
        codiclient++;
        mostraclient(clients, codiclient);

        return codiclient;
    }

    public static void mostraclient(String[][] clients, int codiclient) {
        for (int i = 0; i < codiclient; i++) {
            System.out.print("Codi client: " + clients[i][0]);
            System.out.print(" -nom del client: " + clients[i][1]);
            System.out.print(" -Cognom del client: " + clients[i][2]);
            System.out.print(" -Població del client: " + clients[i][3]);
            System.out.print(" -telèfon del client: " + clients[i][4]);
            System.out.print("\n");

        }
    }

    public static void venda(String[][] clients, String[][] descref, int[] unitats, float[] preunitat, int numarticles) {
int j=0;
        boolean repe = true;
        int [][] botiga= new int [2][20];
        float preu=0;
        loopasso:
        while (repe) {
            System.out.println("Introdueix el nom del client");
            String nomclient = sc.nextLine();

            for (int i = 0; i < clients.length; i++) {
                if (clients[i][1].equalsIgnoreCase(nomclient)) {
                    System.out.println("Número de telefon: ");
                    String telefon = sc.nextLine();
                    if (clients[i][4].equalsIgnoreCase(telefon)) {
                        boolean ok = false;
                        while (!ok) {
                            
                         for (int f =0;f<botiga.length;f++){
                            System.out.println("Ref Article: ");
                            botiga[f][0]=Integer.parseInt(sc.nextLine());
                            if (botiga[f][0]==0){
                                factura(clients, descref, unitats, preunitat, preu, numarticles,nomclient);
                                break loopasso;
                                                            }
                            System.out.println("Unitats: ");
                            botiga[f][1]=Integer.parseInt(sc.nextLine());
                            

                            for (int l=0;l<descref.length;l++){
                                if (descref[l][0].equalsIgnoreCase(Integer.toString(botiga[f][0]))){
                                if (unitats[l]>=botiga[f][1]){
                                     preu = unitats[l]*preunitat[l];
                                    unitats[l]=unitats[l]-botiga[f][1];
                                    System.out.println(preu);
                                    
                                }else{
                                    System.out.println("Fora de stock no serà afegit");
                                    
                                }   
                                }
                            }



                         }



                        }
                    }

                }
            }
            System.out.println("Usuari inexistent afegeix-lo de nou!!!");
            repe = false;

        }

    }
    public static void factura (String[][] clients, String[][] descref, int[] unitats, float[] preunitat,float preu, int numarticles, String nomclient){
        System.out.println("------------------------------------");
        System.out.println("FACTURA FACTUSOFT SA");
        System.out.println("-----------------------------");
for (int i=0;i<clients.length;i++){
    if (nomclient.equalsIgnoreCase(clients[i][1])){
        System.out.println("DADES CLIENT: ");
        System.out.println("NOM: "+ clients[i][1]);
        System.out.println("COGNOM: "+ clients[i][2]);
        System.out.println("POBLACIO"+ clients[i][3]);
        System.out.println("TELEFON: "+ clients[i][4]);
        System.out.println("------------------------------------");
    }




       
        System.out.println("ARTICLES");
        articlemostra(descref, unitats, preunitat, numarticles);
        System.out.println("SUBTOTAL "+preu );
        System.out.println("IVA 21 "+preu*(21/100));
        System.out.println("TOTAL "+(preu*(21/100)+preu)  );






    }
    
}
}