public class Act3 {
    public static void main(String[] args) {
     boolean primer = true;
     System.out.println("Introdueix un valor de l'1 al 20: ");
     int num = Integer.parseInt(System.console().readLine());
     
     for (int i = 2;(num/i)>=i;i++){

     if (num%i==0){
         primer=false;
        break;
     }
     
    }
   if (primer){
       System.out.println("És primer");
   }
   else {
       System.out.println("No és primer");
   }
   
     
     
     }
     
    }
