public class Exercici5{
    public static void main(String[] args) {
    String preg1;
    String preg2;
    int preg3;
    int preg4;
    int punts;

preg3= 0;
preg2 = "h";
preg4 = 0;
punts = 0;
preg1 = "";

System.out.println("Quin és l'animal terrestre més ràpid?");
preg1 = System.console().readLine();

if (preg1.equalsIgnoreCase("Guepard")){
    punts = 1; 
    System.out.println("Has guanyat "+punts+ " punts");
    System.out.println("Quin és l'animal Marí més Gran? ");
preg2= System.console().readLine();}


 if (preg2.equalsIgnoreCase("Balena Blava")){
    punts =punts+1;
    System.out.println("Resposta Correcte, ara tens "+punts+" punts");
    System.out.println("Quin va ser l'any del meu neixement? ");
    preg3 = Integer.parseInt(System.console().readLine());}
   

    if (preg3==2001){
        punts =punts+1;
        System.out.println("Resposta Correcte, ara tens "+punts+" punts");
        System.out.println("Quants anys tinc? ");
        preg4 = Integer.parseInt(System.console().readLine());}
        
       if (preg4 == 18 ){
            punts =punts+1;
            System.out.println("Resposta Correcte, HAS GUANYAT! amb "+punts+" punts");}
            else {
                System.out.println("Has perdut amb "+punts+" punts");
            }
    
    
    

    }
}


       
        
       
    

    
