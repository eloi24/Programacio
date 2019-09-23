public class Exercici {
    public static void main(String[] args) {
        String Nom;
        String Cognom;
        String Domini;

        System.out.println("Introdueix el teu cognom");
        Nom = System.console().readLine();
        System.out.println("Introdueix el teu cognom");
        Cognom = System.console().readLine();
        System.out.println("Introdueix el teu cognom");
        Domini = System.console().readLine();
        
        System.out.println("La teva adreça de correu es:" +Nom+.+Cognom+"@"+Domini);
    }
}