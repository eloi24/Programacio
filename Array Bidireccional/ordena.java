import java.util.Scanner;

public class ordena {
    public static void main(String[] args) {
        int[] valors = new int[5];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valors.length; i++) {
            System.out.println("Introdueix un valor");
            valors[i] = Integer.parseInt(sc.nextLine());
        }
        menu: while (true) {
            System.out.println("Opcions");
            System.out.println("Sortir");
            System.out.println("Mostrar");
            System.out.println("Mostrar ordenat ascendent");
            System.out.println("Mostrar ordenat descendent");
            String opcio = sc.nextLine();
            switch (opcio.toLowerCase()) {
            case "sortir":
                break menu;

            case "mostrar":
                for (int i = 0; i < valors.length; i++) {
                    if (i==valors.length-1){
System.out.print(valors[i]);
                    }else
                    System.out.print(valors[i]+" - ");
                }
                System.out.println();
                break;
            case "ascendent":


            int [] asc = valors;

for (int i=0;i<asc.length;i++){
    for (int j=0;j<asc.length;j++){
        if (asc[i]>asc[j]){
            int aux= asc[j];
            asc[j]=asc[i];
            asc[i]=aux;
        }
    }
}
for (int i=0;i<asc.length;i++){
    System.out.println(asc[i]);
}
                break;
            case "descendent":
            int [] dsc = valors;

for (int i=0;i<dsc.length;i++){
    for (int j=0;j<dsc.length;j++){
        if (dsc[i]<dsc[j]){
            int aux= dsc[j];
            dsc[j]=dsc[i];
            dsc[i]=aux;
        }
    }
}
for (int i=0;i<dsc.length;i++){
    System.out.println(dsc[i]);
}
                break;

            default:
                System.out.println("Paràmetre incorrecte");
            }
        }

    }
}