public class Exercici7{
    public static void main(String[] args) {
     long num= 0;
     boolean veritat = false;    
     long aleatori = System.currentTimeMillis()%1000;

     while (veritat==false){
    num = System.currentTimeMillis()%1000; 
    System.out.println("Intent número "+num );

if (num==aleatori){
    veritat=true;
}
     }
     System.out.println("Has necessitat "+num+" intents");
    }
   
}