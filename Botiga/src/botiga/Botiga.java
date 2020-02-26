package botiga;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import botiga.clases.*;
import botiga.funcions.*;

public class Botiga {
    public static Scanner sc = new Scanner(System.in);
public static int numcomanda=0;
    public static void main(String[] args) {
        HashMap<String, InfoProducte> stock = new HashMap<>();
        HashMap<String, Client> clients = new HashMap<>();
        HashMap<LocalDateTime,Comanda> comanda = new HashMap<>();

        loopsos: while (true) {
            Funcions.menu();
            int eleccio = sc.nextInt();
            sc.nextLine();
            switch (eleccio) {
            case 1:
                InfoProducte ipr = new InfoProducte();
                System.out.println("introdueix la referencia: ");
                String ref = sc.nextLine();

                if (Funcions.comprovaproducte(stock, ref) == false) {
                    Producte pr = new Producte(ref);
                    System.out.println("Introdueix una Descripció: ");
                    pr.setDesc(sc.nextLine());
                    System.out.println("Introdueix el preu");
                    pr.setPreu(sc.nextFloat());
                    System.out.println("Introdueix la quantitat");
                    ipr.setQuantitat(sc.nextInt());
                    sc.nextLine();
                    ipr.setProducte(pr);
                    stock.put(ref, ipr);
                } else {
                    System.out.println("Introdueix la quantitat que vols afegir");
                    stock.get(ref).setQuantitat(stock.get(ref).getQuantitat() + sc.nextInt());
                    sc.nextLine();
                }
                break;
            case 2:
                System.out.println("Introdueix el teu dni: ");
                String dni = sc.nextLine();
                if (Funcions.comprovadni(clients, dni)) {
                    System.out.println("Dni registrat a la base de dades:");
                    break;
                } else {
                    Client client = new Client(dni);
                    System.out.println("Introdueix el teu nom: ");
                    client.setNom(sc.nextLine());
                    System.out.println("Introdueix el teu cognom: ");
                    client.setCognom(sc.nextLine());
                    System.out.println("Introdueix el teu telefon: ");
                    client.setTelef(sc.nextLine());
                    System.out.println("Introdueix la data del teu aniversari: dd/mm/yyyy");
                    String[] datastring = sc.nextLine().split("/");
                    client.setAniversari(Funcions.deintadate(Funcions.destringarrayaint(datastring)));
                    clients.put(dni, client);
                }
                break;
            case 3:
            System.out.println("Introdueix el dni del client: ");
            String dniclient=sc.nextLine();
if (Funcions.comprovadni(clients, dniclient)){
    clients.get(dniclient).mostraclient();
    numcomanda++;
    Comanda comandaclient = new Comanda(numcomanda);
    ArrayList<LiniaComanda> liniacomandes= new ArrayList<>();
    loopasso:while(true){
        Funcions.opcionscomanda();
        int eleccio1=sc.nextInt();
        sc.nextLine();
        switch(eleccio1){
            case 1:
            
            System.out.println("Introdueix la referencia del producte: ");
            String referencia=sc.nextLine();
            if (Funcions.comprovaproducte(stock, referencia)){
                stock.get(referencia).mostrainfoproducte();
                System.out.println("Introdueix la quantitat que vols afegir");
                int quantitatclient=sc.nextInt();
                sc.nextLine();
                if (Funcions.comprovaquantitat(stock, quantitatclient, referencia)){
                    LiniaComanda liniacomanda = new LiniaComanda();
                    liniacomanda.setProducte(stock.get(referencia).getProducte());
                    liniacomanda.setQuantitat(liniacomanda.getQuantitat()+quantitatclient);
                    liniacomanda.setPreufinal(liniacomanda.getPreufinal()+stock.get(referencia).getProducte().getPreu()* liniacomanda.getQuantitat()+quantitatclient);
                    stock.get(referencia).setQuantitat(stock.get(referencia).getQuantitat()-quantitatclient);
                    liniacomandes.add(liniacomanda);
                    
                    
                }else{
                    System.out.println("No disposem d'aquesta quantitat");
                }

            }else{
                System.out.println("Producte no consta en stock");
            }
            

            
            break;
            case 2:
            comandaclient.setData(LocalDateTime.now());
            comandaclient.setCli(clients.get(dniclient));
            comandaclient.setPreucomanda(liniacomandes);
            comandaclient.setPreufinalcomanda(Funcions.preufinalcomanda(liniacomandes,comandaclient));
            comandaclient.mostracomanda();
            comanda.put(comandaclient.getData(), comandaclient);
            break loopasso;
        }
    }
}else{
    System.out.println("Client no registrat");
}
            
                break;
            case 4:
                break loopsos;
            case 5:
                Funcions.mostraStock(stock);
                break;
            case 6:
                Funcions.mostraclients(clients);
                break;
            case 7:
            Float preufinaldeldia=Funcions.mostraxdia(LocalDate.now(), comanda);
            System.out.println("Avui s'han fet "+preufinaldeldia+"€");
            System.out.println("Caixa TANCADA");
            break loopsos;
            case 8:
            System.out.println("Introdueix el dia que vols mostrar dd/MM/yyyy");
            Funcions.mostraxdia(Funcions.deintadate(Funcions.destringarrayaint(sc.nextLine().split("/"))), comanda);
            break;
            case 9:
            System.out.println("Introdueix el dni del client: ");
            dni=sc.nextLine();
            if(Funcions.comprovadni(clients, dni)){
Funcions.mostraxclient(comanda, clients.get(dni));
            }else{
                System.out.println("Dni no existeix");
            }
            break;
            default:
            System.out.println("Opció incorrecte");
            break;
            }
        }
    }
}