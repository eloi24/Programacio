public class Exercici2 {
    public static void main(String[] args) {
    float altura;
    float pes;
    float imc;
      System.out.println("Introdueix la teva alçada en centímetres: ");
      altura = Float.parseFloat(System.console().readLine());
      System.out.println("Introdueix el teu pes en kg: ");
      pes = Float.parseFloat(System.console().readLine());
      altura = (altura/100)
      imc = pes/Math.pow(altura, 2);
      System.out.println(+imc);
    }
}