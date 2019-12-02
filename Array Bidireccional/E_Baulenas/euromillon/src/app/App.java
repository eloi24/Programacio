package app;

import java.util.Random;
import java.util.Scanner;

public class App {


    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args) throws Exception {
        int [] taulerjugador = new int [5];
     int [] taulerjugador2 = new int [2];
     int [] taulermaquina = new int [5];
     int [] taulermaquina2 = new int [2];
     int victoria = 0;
int intents =0;
        System.out.println("Sortir : 0");
        System.out.println("Generar num màquina : 1");
        System.out.println("Generar num jugador : 2");

        int opcio;
        opcio = Integer.parseInt(sc.nextLine());
        switch (opcio) {
        case 0:
            System.out.println("Adeeeeeuuuuuuuu");
            break;
        case 1:
         random(taulerjugador,taulerjugador2);
         randomaquina(taulermaquina, taulermaquina2);

         while(victoria<7){
            random(taulerjugador,taulerjugador2);
            victoria=victoria(taulerjugador, taulerjugador2, taulermaquina, taulermaquina2,victoria);
             intents++;  
         }
         System.out.println("Has necessitat "+intents+" intents");         break;
        case 2:
        randomaquina(taulermaquina, taulermaquina2);
        for (int i=0;i<taulerjugador.length;i++){
            System.out.println("Introdueix un número");
            int num=Integer.parseInt(sc.nextLine());
             for (int j=0;j<taulerjugador.length;j++){
            while (num==taulerjugador[j] || num>50){
                System.out.println("Número incorrecte introdueix de nou");
                num=Integer.parseInt(sc.nextLine());
            }
            }
            taulerjugador[i]=num;
            }

            for (int i=0;i<taulerjugador2.length;i++){
                System.out.println("Introdueix un número de l'1 al 10");
                int num=Integer.parseInt(sc.nextLine());
                 for (int j=0;j<taulerjugador2.length;j++){
                while (num==taulerjugador2[j] || num>10){
                    System.out.println("Número incorrecte, ha de ser menor o igual a 10,  introdueix de nou");
                    num =Integer.parseInt(sc.nextLine());
                }
                }
                taulerjugador2[i]=num;
                }
mostra(taulerjugador, taulerjugador2);

while (victoria<7){
    randomaquina(taulermaquina, taulermaquina2);
    victoria=victoria(taulerjugador, taulerjugador2, taulermaquina, taulermaquina2,victoria);
             intents++;
}
System.out.println("Has necessitat "+intents+" intents");
break;


        }

    }
    public static void random (int [] taulerjugador,int [] taulerjugador2){
for (int i=0;i<taulerjugador.length;i++){
int aleatori=r.nextInt(50)+1;
 for (int j=0;j<taulerjugador.length;j++){
while (aleatori==taulerjugador[j]){
    aleatori =r.nextInt(50)+1;
}
}
taulerjugador[i]=aleatori;
}

for (int i=0;i<taulerjugador2.length;i++){
    int aleatori=r.nextInt(10)+1;
     for (int j=0;j<taulerjugador2.length;j++){
    while (aleatori==taulerjugador2[j]){
        aleatori =r.nextInt(10)+1;
    }
    }
    taulerjugador2[i]=aleatori;
    }

    
}

public static void randomaquina(int [] taulermaquina, int [] taulermaquina2){
    
    for (int i=0;i<taulermaquina.length;i++){
        int aleatori=r.nextInt(50)+1;
         for (int j=0;j<taulermaquina.length;j++){
        while (aleatori==taulermaquina[j]){
            aleatori =r.nextInt(50)+1;
        }
        }
        taulermaquina[i]=aleatori;
        }

    for (int i=0;i<taulermaquina2.length;i++){
        int aleatori=r.nextInt(10)+1;
         for (int j=0;j<taulermaquina2.length;j++){
        while (aleatori==taulermaquina2[j]){
            aleatori =r.nextInt(10)+1;
        }
        }
        taulermaquina2[i]=aleatori;
        }
}

public static int victoria (int [] taulerjugador,int [] taulerjugador2,int [] taulermaquina, int [] taulermaquina2,int victoria){
    victoria=0;
    

    for (int i =0;i<taulermaquina.length;i++){
    for (int j=0;j<taulermaquina.length;j++){
        if (taulermaquina[i]==taulerjugador[j]){
            victoria++;  
        }
    } 

    }

    for (int i =0;i<taulermaquina2.length;i++){
        for (int j=0;j<taulerjugador2.length;j++){
            if (taulermaquina2[i]==taulerjugador2[j]){
                victoria++; 
            }

        }
    }
return victoria;
    
}

public static void mostra (int [] taulerjugador,int [] taulerjugador2){
    for (int i =0;i<taulerjugador.length;i++){
  System.out.println(taulerjugador[i]);
}
for (int i =0;i<taulerjugador2.length;i++){
    System.out.println(taulerjugador2[i]);
}

}
}
