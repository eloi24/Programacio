import java.util.Random;

public class matrius {
  public static void main(String[] args) {
    Random r = new Random();
    int array[][] = new int[3][9];
    int mesgran = 0;
    int array0[] = new int[9];
    String arraybingo[][] = new String[3][9];


    
    for (int i = 0; i < array.length; i++) {

      for (int j = 0; j < array[i].length; j++) {

        array[i][j] = r.nextInt(8) + 1 + (10 * j);

      }

    }
    // Cambiar si el num es igual
    for (int j = 0; j < array[2].length; j++) {
      for (int i = 0; i < array.length; i++) {
        if (array[2][j] == array[0][j]) {
          array[2][j] = r.nextInt(8) + 1 + (10 * j);
        }
        if (array[2][j] == array[1][j]) {
          array[2][j] = r.nextInt(8) + 1 + (10 * j);
        }
        if (array[1][j] == array[0][j]) {
          array[1][j] = r.nextInt(8) + 1 + (10 * j);
        }
      }
    }
    // Ordenar nums
    for (int j = 0; j < array[2].length; j++) {

      for (int i = 0; i < array.length; i++) {
        if (array[2][j] < array[0][j]) {
          mesgran = array[0][j];
          array[0][j] = array[2][j];
          array[2][j] = mesgran;
        }
        if (array[2][j] < array[1][j]) {
          mesgran = array[1][j];
          array[1][j] = array[2][j];
          array[2][j] = mesgran;
        }
        if (array[1][j] < array[0][j]) {
          mesgran = array[0][j];
          array[0][j] = array[1][j];
          array[1][j] = mesgran;
        }
      }
    }

    // Generar 0
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < array0.length; i++) {
      boolean surt = false;
      while (!surt) {
        int num = r.nextInt(3);

        if (num == 0) {
          if (count0 < 3) {
            array0[i] = 0;
            count0++;
            surt = true;
          }
        } else if (num == 1) {
          if (count1 < 3) {
            array0[i] = 1;
            count1++;
            surt = true;
          }
        } else {
          if (count2 < 3) {
            array0[i] = 2;
            count2++;
            surt = true;
          }
        }
        if (count0 == 3 && count2 == 3 && count1 == 3) {
          surt = true;
        }
      }
    }
    // Posar 0 array

    for (int j = 0; j < array0.length; j++) {
      if (array0[j] == 0) {
        array[0][j] = 0;
      }
      if (array0[j] == 1) {
        array[1][j] = 0;
      }
      if (array0[j] == 2) {
        array[2][j] = 0;
      }
    }

    // Posar x en el lloc de 0

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == 0) {
          arraybingo[i][j] = "x";
        } else {
          arraybingo[i][j] = Integer.toString(array[i][j]);
        }
      }
    }

    System.out.print("\n");
    System.out.print("\n");
    System.out.print("\n");
    System.out.print("Prem Intro per començar");
    System.console().readLine();

    for (int i = 0; i < arraybingo.length; i++) {
      System.out.print("\n");
      System.out.print("\n");

      for (int j = 0; j < arraybingo[i].length; j++) {
        System.out.print(" " + arraybingo[i][j] + "\t");
      }
    }

    // Tirar daus i guanyar
    int daus[] = new int[90];
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    boolean comtador = false;
    int random = 0;
    boolean linia=false;
    boolean linia1=false;
    boolean linia2=false;



    for (int e = 0; e < daus.length; e++) {
      System.out.print("\n");

      if (linia == true && linia1 == true && linia2 == true){
        System.out.print("\n");
        System.out.println("Bingo");
        System.out.println("Bola n: " + contador4);
        break;
      }
      comtador = false;
      while (!comtador) {

        if (linia == true && linia1== true && linia2 == true) {
          System.out.print("\n");
          System.out.println("Bola n: " + contador4);
          System.out.println("Bingo");
          break;
        }
        if (daus[random] == random) {
          random = r.nextInt(88) + 1;
        } else {
          System.out.print("\n");
          contador4++;
          System.out.println("Ha sortit: " + random);
          if (random != daus[random]) {
            System.out.println("Bola n: " + contador4);
            System.out.print("apreta intro per generar num ");
            System.console().readLine();
            daus[random] = random;
            for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == random) {
                  arraybingo[i][j] = "€";
                  System.out.print("\n");
                  System.out.println(random + " Trobat!");
                  if (i == 0) {
                    contador1++;
                  }
                  if (i == 1) {
                    contador2++;
                  }
                  if (i == 2) {
                    contador3++;
                  }
                  if (contador1 == 6 && !linia) {
                    System.out.println("Fila 1 Complerta!");
                    linia=true;

                    

                  }
                  if (contador2 == 6 && !linia1) {
                    System.out.println("Fila 2 Complerta!");
                   
                    linia1=true;

                  }
                  if (contador3 == 6 && !linia2) {
                    System.out.println("Fila 3 Complerta!");
                    linia2=true;

                  }

                  for (int d = 0; d < arraybingo.length; d++) {
                    System.out.print("\n");
                    System.out.print("\n");

                    for (int f = 0; f < arraybingo[d].length; f++) {
                      System.out.print(" " + arraybingo[d][f] + "\t");
                    }
                  }

                  comtador = true;
                }
              }
            }
          }
        }
      }

    }

  }
}
