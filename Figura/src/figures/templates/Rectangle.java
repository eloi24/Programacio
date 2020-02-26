package figures.templates;
public class Rectangle extends Figura{
private float base,altura;

    

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void CalcularArea(){
super.area=base*altura;
    }
   public void CalcularPerímetre(){
   super.perímetre=2*(base+altura);    
   }
   public Rectangle(String mesura, float base, float altura) {
       super(mesura);
       this.base = base;
       this.altura = altura;
   }
   @Override
   public void mostra(){
System.out.println("############################################");
System.err.println(this.getClass().getSimpleName());
System.out.println("Area: "+df.format(this.area)+this.getMesura());
System.out.println("Perímetre: "+df.format(this.perímetre)+this.getMesura());
System.out.println("############################################");
   }




   


  

   


}