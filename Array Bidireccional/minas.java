import java.util.Random;


public class minas{
    public static void main(String[] args) {
     Random r = new Random(); 
     String [][] mina = new String [6][6];
     String [][] mostrapantalla = new String [6][6];
     
// Posar Valors Array
for (int i=1;i<mina.length-1;i++){
    for (int j=1;j<mina[i].length-1;j++){
    mina[i][j]="b";
    }
}
// Array final omplir
for (int i=1;i<mostrapantalla.length-1;i++){
    for (int j=1;j<mostrapantalla[i].length-1;j++){
    mostrapantalla[i][j]="▩";
    }
}
     
// Posar mina array
for (int i=0;i<4;i++){
    int Posiciox=r.nextInt(4)+1;
    int Posicioy=r.nextInt(4)+1;
if(mina[Posiciox][Posicioy]!="x"){
    mina[Posiciox][Posicioy]="x";
}
else{

while(mina[Posiciox][Posicioy]=="x"){
     Posiciox=r.nextInt(4)+1;
     Posicioy=r.nextInt(4)+1;
     if (mina[Posiciox][Posicioy]!="x"){
         mina[Posiciox][Posicioy]="x";
         break;
     }
}
}
}
for (int i=1;i<mostrapantalla.length-1;i++){
    System.out.print("\n");
    System.out.print("\n");
    for (int j=1;j<mostrapantalla[i].length-1;j++){
    System.out.print(mostrapantalla[i][j]+"\t");
    }
}
for (int i=1;i<mina.length-1;i++){
    System.out.print("\n");
    System.out.print("\n");
    for (int j=1;j<mina[i].length-1;j++){
    System.out.print(mina[i][j]+"\t");
    }
}


// demanar i contar
int victoria=0;
int contador;
boolean explota =false;
while (!explota | victoria==12){
    contador=0;
    System.out.println("\n");
    System.out.println("Escull Posició X");
    int x = Integer.parseInt(System.console().readLine()) ;
    System.out.println("Escull Posició Y");
    int y = Integer.parseInt(System.console().readLine()) ;

    if (mina[x][y]=="x"){
System.out.println("MINA TROBADA, Has perdut");
explota=true;
mostrapantalla[x][y]="x";
    } else{
        if (mina[x][y]!="x" && mina[x][y]=="b"){

if (mina[x+1][y]=="x"){
    contador++;
}
if (mina[x-1][y]=="x"){
    contador++;
}
if (mina[x+1][y+1]=="x"){
    contador++;
}
if (mina[x+1][y-1]=="x"){
    contador++;
}
if (mina[x][y+1]=="x"){
    contador++;
}
if (mina[x][y-1]=="x"){
    contador++;
}
if (mina[x-1][y-1]=="x"){
    contador++;
}
if (mina[x-1][y+1]=="x"){
    contador++;
}
mina[x][y]=Integer.toString(contador);

mostrapantalla[x][y]=Integer.toString(contador);

victoria++;
if (victoria==12){
    System.out.println("Has Guanyat!");
    break;
}

for (int i=1;i<mostrapantalla.length-1;i++){
    System.out.print("\n");
    System.out.print("\n");
    for (int j=1;j<mostrapantalla[i].length-1;j++){
    System.out.print(mostrapantalla[i][j]+"\t");
    }
}

// For per veure on són les mines x mines b no mina

// for (int i=1;i<mina.length-1;i++){
//     System.out.print("\n");
//     System.out.print("\n");
//     for (int j=1;j<mina[i].length-1;j++){
//     System.out.print(mina[i][j]+"\t");
//     }
// }


        }
    }


}

    }
}