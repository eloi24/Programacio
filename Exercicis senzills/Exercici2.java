public class Exercici2 {
    public static void main(String[] args) {
    float altura;
    float pes;
    float imc;
      System.out.println("Introdueix la teva alçada en centímetres: ");
      altura = Float.parseFloat(System.console().readLine());
      altura = (altura/100);
      System.out.println("Introdueix el teu pes en kg: ");
      pes = Float.parseFloat(System.console().readLine());
      imc = pes/(altura*altura);

      if (imc< 18.5) {
        System.out.println("Has de menjar més el teu imc és "+imc+" per tant és inferior a 18.5 i has de menjar mes");
      }
      else if (imc >=25){
        System.out.println("Estàs gras, hauries de fer dieta el teu imc és: "+imc);
      }
      else if (imc >= 18.5) {
        System.out.println("Estas en el pes ideal el teu imc és: "+imc);
      }
      
      else{
        System.out.println("El valor no és correcte");
      }
      
    
  }
}