public class Exercici{
    public static void main(String[] args) {
        String nom;
        String cognom;
        String domini;

        System.out.println("Introdueix el teu Nom");
        nom = System.console().readLine();
        System.out.println("Introdueix el teu Cognom");
        cognom = System.console().readLine();
        System.out.println("Introdueix el teu Domini");
        domini = System.console().readLine();
        
        System.out.println("La teva adreça de correu es: " +nom+"."+cognom+"@"+domini);
    }
}