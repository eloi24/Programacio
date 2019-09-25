public class Exercici3{
    public static void main(String[] args) {
        String nom;
        String sexe;
        float edat;
        

        System.out.println("Introdueix el teu Nom");
        nom = System.console().readLine();
        System.out.println("Introdueix el teu sexe M/F");
        sexe = System.console().readLine();
        System.out.println("Quina edat tens?");
        edat = Float.parseFloat(System.console().readLine()) ;
        

        if (edat < 16) {
             if (sexe.equals("M")){
                 System.out.println( nom+ " la teva categoria és Junior Masculí");
            }
            else{
                System.out.println(nom+" la teva categoria és Junior Femení");
            }
          }
          
         if (edat >=65) {
            if (sexe.equals("M")) {
                System.out.println(nom+" la teva categoria és Veterà Masculí");
           }
           else{
               System.out.println(nom+" la teva categoria és Veterà Femení");  
         }
        }
        if (edat >=16) {
            if (sexe.equals("M")){
                System.out.println(nom+" la teva categoria és Sènior Masculí");
           }
           else{
               System.out.println( nom+ " la teva categoria és Sènior Femení");  
         }
        }
    }
}