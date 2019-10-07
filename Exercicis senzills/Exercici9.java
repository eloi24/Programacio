public class Exercici9{
    public static void main(String[] args) {
        boolean noms = false;
       String arraynoms [] = new String [100];
       int i=1;
       boolean temps = false;
       String inici;
       long tempsinici = 0;
       long tempsfinal;
       int a= 1;
       long arraytemps [] = new long [100];
       int arraydorçal [] = new int [100];
    while (!noms ){
        System.out.println("Escriu el nom del corredor, per sortir escriure x");
        arraynoms [i] = System.console().readLine();
         if (arraynoms[i].equalsIgnoreCase("x")){
         noms = true;
         }
         else {
            System.out.println(arraynoms[i]+" té el dorsal "+i);
            i++;
         }
    }
     System.out.println("Apreta intro per començar");
     inici = System.console().readLine();
if (inici.equals("")){
    tempsinici = System.currentTimeMillis();
    temps=false;
   
}
while (!temps){
    System.out.println("Introdueix el dorçal del corredor");
arraydorçal[a]= Integer.parseInt(System.console().readLine());
tempsfinal=System.currentTimeMillis();

for (a=0;a<i;a++){
    arraytemps[a]=(tempsfinal-tempsinici)/1000;
    System.out.println("Ha arribat el corredor "+arraynoms[a]+ " amb el dorçal "+a );
    temps=true;
}
if (temps=true){
    a++;
    arraytemps[a]=(tempsfinal-tempsinici)/1000;
    System.out.println("Ha arribat el corredor "+arraynoms[a]+ " amb el dorçal "+a);
}
}


System.out.println("La cursa ha acabat");
for (int b =0;b<i;b++){
    System.out.println(" El dorçal "+arraydorçal[b]+ " ha arribat " +arraynoms[b]+ " Amb un temps de " +arraytemps[b]+ " segons" );
    }
    }

}