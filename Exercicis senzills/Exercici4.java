public class Exercici4{
    public static void main(String[] args) {
        String article;
        float Preu;
        float descompte;
        float preufinal;

        System.out.println("Introdueix el nom de l'article:");
        article = System.console().readLine();
        System.out.println("Introdueix el preu original:");
        Preu = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el descompte a aplicar (%)");
        descompte = Float.parseFloat(System.console().readLine()) ;

preufinal = Preu-((Preu*15)/100);
System.out.println("El preu final de "+article+" és "+preufinal+ "El descompte és de el "+descompte+" per cent" );





    }
}