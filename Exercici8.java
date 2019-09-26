public class Exercici8{
    public static void main(String[] args) {
        long aleatori = System.currentTimeMillis()%1000;
        int num; 
        num = 0; 
        while (aleatori!=num){
       num++;
       System.out.println("Intent número "+num );
        }
        System.out.println("Has necessitat "+num+" intents");   
    }
}