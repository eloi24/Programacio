public class Act2{
    public static void main(String[] args) {
        String frase;
        int llargada;
        System.out.println("Escriu una frase per calcular la llargada");
        frase=System.console().readLine();
llargada=frase.length();
System.out.println("La llargada de la frase és: " +llargada);
    }
}