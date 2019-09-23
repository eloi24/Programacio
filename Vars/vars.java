public class vars{
    public static void main([] args) {
        int num1;
        int num2;

        System.out.println("Introdueix un numero:");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introdueix un altre numero:");
        num2 = Integer.parseInt(System.console().readLine());


    System.out.println("La suma de " +num1+ " i " +num2+ " es " +(num1+num2));
    System.out.println("La resta de " +num1+ " i " +num2+ " es " +(num1-num2));
    System.out.println("la Divisio de " +num1+ " i " +num2+ " es " +((float)num1/num2));
    System.out.println("La Multiplicacio de " +num1+ " i " +num2+ " es " +(num1*num2));
    }
}
