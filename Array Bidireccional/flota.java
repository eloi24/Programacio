import java.util.Random;

public class flota {





    public static void main(String[] args) {
        String[][] flota = new String[6][6];
        String [][] flotaenemic = new String [6][6];
        String[][] mostraflota = new String[6][6];
        int contador=0;
        Random r = new Random();
        int dreta; 
        int x;
        int dalt;
        int y;

// Omplir Tauler
        for (int i = 0; i < flota.length; i++) {
            for (int j = 0; j < flota[0].length; j++) {

                    flota[i][j] = "A";
                    flotaenemic[i][j] ="A";
                     mostraflota[i][j]="▩";
                 
            }
        }
mostrarray(mostraflota,flota, contador);

// Posar barcos canto màquina 






}












       

    


    public static void mostrarray(String [][] mostraflota, String [][] flota, int contador){
     
     contador++;
     for (int i = 0; i < flota.length; i++){
            System.out.print("\n");
        for (int j = 0; j < flota[0].length; j++) {
            System.out.print(flota[i][j]);
            System.out.print("  ");
            
            
        }
    } 
    System.out.print("\n");
    System.out.print("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");

    for (int e = 0; e < mostraflota.length; e++) {
        System.out.print("\n");
        for (int f = 0; f < mostraflota[0].length; f++) {
            System.out.print(mostraflota[e][f]);
            System.out.print("  ");
        }
    } 

    
    }

   




}