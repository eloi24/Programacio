package botiga.funcions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import botiga.clases.*;


public class Funcions{
    private static Float preufinal;
public static void menu(){
    System.out.println();
    System.out.println("###################################");
    System.out.println("Benvingut a la Botiga");
    System.out.println("1- Afegir Producte: ");
    System.out.println("2- Afegir Client:");
    System.out.println("3- Fer una venta: ");
    System.out.println("4- Sortir");
    System.out.println("5- Mostrar stock:");
    System.out.println("6- Mostrar clients: ");
    System.out.println("7- Tancar caixa ");
    System.out.println("8- Mostrar factura de un dia concret:");
    System.out.println("9- Buscar factura de un client ");
    
    System.out.println("###################################");
    System.out.println();


}
public static boolean comprovaproducte(HashMap<String,InfoProducte>productes,String ref){
    if (productes.containsKey(ref)){
        return true;
    }else{
        return false;
    }

}
public static void mostraStock(HashMap<String,InfoProducte>productes){
    productes.forEach((key, value) -> {
      System.out.println("Descripció: "+ value.getProducte().getDesc()+" - Referencia: "+value.getProducte().getRef()+" - Preu: "+value.getProducte().getPreu()+" - Quantitat: "+value.getQuantitat());
    });


}
public static boolean comprovadni(HashMap<String,Client>clients,String dni){
    if (clients.containsKey(dni)){
        return true;
    }else{
        return false;
    }

}
public static int [] destringarrayaint(String [] datastring){
int [] data = new int [3];
for (int i=0;i<datastring.length;i++){
    data[i]=Integer.parseInt(datastring[i]);
}
return data;

}
public static LocalDate deintadate(int []data){
    LocalDate datafinal=LocalDate.of(data[2], data[1], data[0]);
    return datafinal;
}
public static void mostraclients(HashMap<String,Client> clients){
    clients.forEach((key, value) -> {
        value.mostraclient();
      });
}
public static void opcionscomanda(){
    System.out.println("1- Introduir producte ");
    System.out.println("2- Sortir");
}
public static boolean comprovaquantitat(HashMap<String, InfoProducte>stock,int quantitatclient,String referencia){
    if (stock.get(referencia).getQuantitat()<quantitatclient){
return false;
    }else{
        return true;
    }
}
public static Float preufinalcomanda(ArrayList<LiniaComanda> liniacomandes,Comanda comandaclient){
    Float preufinalcomanda=0f;
    LocalDate ara = LocalDate.now();
    for (LiniaComanda liniaComanda : liniacomandes) {
        preufinalcomanda+=liniaComanda.getPreufinal();
    }
    if (comandaclient.getCli().getAniversari().getDayOfMonth()==ara.getDayOfMonth() && comandaclient.getCli().getAniversari().getMonthValue()==ara.getMonthValue()){
        preufinalcomanda+=preufinalcomanda*-0.1f;
        System.out.println("Descompte d'aniversari Aplicat");
    }
    preufinalcomanda+=preufinalcomanda*0.21f;
    return preufinalcomanda;
}
public static Float mostraxdia(LocalDate data,HashMap<LocalDateTime,Comanda>comanda){
     preufinal=0f;
    comanda.forEach((k,v) ->{
if (k.getDayOfMonth()==data.getDayOfMonth()&&k.getMonthValue()==data.getMonthValue()&&k.getYear()==data.getYear()){
    v.mostracomanda();
    preufinal+=v.getPreufinalcomanda();
}
    }); 
    return preufinal;

}
public static void mostraxclient(HashMap<LocalDateTime,Comanda>comanda,Client client){

    comanda.forEach((k,v) ->{
        if (v.getCli().getDni().equals(client.getDni())){
            v.mostracomanda();
        }
            }); 

}



}