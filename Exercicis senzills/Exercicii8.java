import java.util.Random;
public class Exercicii8{
    public static void main(String[] args) {
      Random aleatori= new Random();
      int premi = aleatori.nextInt(100);
      int i;
      int intents = 0;
boolean trobat = false;
System.out.println("El número escollit és: "+premi);
int arraynums [] = new int [100];

while(!trobat){
int aleatori1 = aleatori.nextInt(100);
boolean igual = false;

for (i=0;i<arraynums.length;i++){

if (premi==arraynums[i]){
    igual = true;
}
}
if (!igual){
   arraynums[intents]=aleatori1;
   intents++;

}
if (premi==aleatori1){
    trobat=true;
}
else {
    System.out.println("el número "+i+" ja hi era");  
}
}
System.out.println("Hem necessitat "+intents+" intents");
    }
}