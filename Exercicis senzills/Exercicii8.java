import java.util.Random;
public class Exercicii8{
    public static void main(String[] args) {
      Random aleatori= new Random();
      int premi = aleatori.nextInt(10);
      int intents = 0;
boolean trobat = false;
System.out.println("El número escollit és: "+premi);
int arraynums [] = new int [10];
int i;

for (i=0; i<arraynums.length;i++){
    arraynums[i]=2000;
}

while(!trobat){
int aleatori1 = aleatori.nextInt(10);
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
}
System.out.println("Has necessitat "+intents+" intents");
    }
}