import java.util.Random;
import java.util.Scanner;

public class caracters {
public static int random=0;
public static Scanner sc = new Scanner(System.in); 
public static Random r = new Random();
public static int cont1;
public static int cont2;
    public static void main(String[] args) {
        String consonant[] = { "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "Ñ", "P", "Q", "R", "S", "T", "V","W", "X", "Y", "Z" };
        String vocal[] = { "A", "E", "I", "O", "U" };
        
        
        System.out.println("Introdueix numero de rondes:");
        Integer rondes = Integer.parseInt(sc.nextLine());
        String jugadors[][] = new String[2][2];
        String paraula[] = new String[9];
        // Jugadors demanar
        for (int i = 0; i < jugadors.length; i++) {
            System.out.println("Introdueix el jugador " + (i + 1));
            jugadors[i][0] = sc.nextLine();
            for (int j = 0;j < jugadors[0].length;j++){  
            }
        }
        
for (int i=0;i<rondes;i++){
    System.out.println("Ronda "+(i+1));
    generar(paraula,vocal,consonant);
for (int f =0;f<jugadors.length;f++){
    System.out.println("----------------------");
    System.out.println("Torn del jugador: "+jugadors[f][0]);
    mostrar(paraula);
    String resultat = sc.nextLine();
    for (int j=0;j<jugadors[0].length;j++){

    }
}




}
       
        




    }
        
        
     
       

         
       public static void generar(String [] paraula,String [] vocal, String [] consonant){
           for (int i=0;i<paraula.length;i++){
        boolean taulell=false;
           while (!taulell){
            random= r.nextInt(2);
if (random==0 && cont1<4){
    random= r.nextInt(5);
    paraula[i]=vocal[random];
    cont1++;
    break;
}if (random==1 && cont2<5){
    random= r.nextInt(22);
    paraula[i]=consonant[random];
    cont2++;
    break;
}
    
    
}

            }
       

            
        }

public static void mostrar (String[] paraula){
    for (int i =0;i<paraula.length;i++){
        System.out.print("| "+paraula[i]+" | \t" );
    }
    System.out.print("\n");
}




    }
    
    