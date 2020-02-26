package figures;

import java.util.Scanner;

import figures.templates.Figura;
import figures.templates.Funcions;
import figures.templates.Rectangle;
import figures.templates.Rodona;
import figures.templates.Triangle;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introdueix la quantitat de formes que vols calcular");
        int quantitat = sc.nextInt();
        sc.nextLine();
        Figura [] formes= new Figura[quantitat];
        for(int i =0;i<formes.length;i++){
            Funcions.menu();
        int eleccio= sc.nextInt();
        sc.nextLine();
        switch(eleccio){
            case 1:
            System.out.println("Introdueix la base: ");
            double base=sc.nextDouble();
            sc.nextLine();
            System.out.println("Introdueix la altura: ");
            double altura=sc.nextDouble();
            sc.nextLine();
            System.out.println("Introdueix el sitema de mesura: ");
            String mesura=sc.nextLine();
            formes[i]=(new Triangle(mesura, base, altura));
            break;
            case 2:
            System.out.println("Introdueix la base: ");
             float base1=sc.nextFloat();
             sc.nextLine();
            System.out.println("Introdueix la altura: ");
             float altura1=sc.nextFloat();
             sc.nextLine();
            System.out.println("Introdueix el sitema de mesura: ");
             mesura=sc.nextLine();
            formes[i]=(new Rectangle(mesura, base1, altura1));
            break;
            case 3:
            System.out.println("Introdueix el radi:");
            double radi=sc.nextDouble();
            sc.nextLine();
            System.out.println("Introdueix el sistema de mesura: ");
            mesura=sc.nextLine();
            formes[i]=(new Rodona(mesura, radi));
            break;
        }
        
        }
        for (Figura f : formes) {
            f.CalcularArea();
            f.CalcularPerímetre();
            f.mostra();
            System.out.println();
        }
    }
}