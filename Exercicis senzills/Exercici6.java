public class Exercici6 {
    public static void main(String[] args) {
    String escriure;    
    long tempsinicial;
    long tempsfinal;
    String jutges;
    long resta; 
    jutges = "";
    tempsinicial = 0 ;

    System.out.println("Escriu començar per iniciar la prova ");
    escriure = System.console().readLine();

    if (escriure.equalsIgnoreCase("començar")){
        tempsinicial = System.currentTimeMillis();
        System.out.println("Escriu Setze jutges d'un jutjat mengen fetge en un penjat");
jutges = System.console().readLine();
    }
    if (jutges.equalsIgnoreCase("Setze jutges d'un jutjat mengen fetge en un penjat")){
        tempsfinal = System.currentTimeMillis();
        resta = (tempsfinal-tempsinicial)/1000;
        System.out.println("Has tardat "+resta+ " segons ");
    }
    else {
        System.out.println("Has fallat!");
    }
    }
}