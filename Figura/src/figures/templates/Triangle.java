package figures.templates;
public class Triangle extends Figura{
  protected double base,altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void CalcularPerímetre(){
        double hipotenusa=Math.sqrt((Math.pow(base, 2)+Math.pow(altura,2)));
        super.perímetre=base+Math.pow(hipotenusa,2);
    }
    @Override
    public void CalcularArea(){
        this.area=(base*altura)/2; 
}

public Triangle(String mesura, double base, double altura) {
    super(mesura);
    this.base = base;
    this.altura = altura;
}
public void mostra(){
    System.out.println("############################################");
    System.err.println(this.getClass().getSimpleName());
    System.out.println("Area: "+df.format(this.area)+this.getMesura());
    System.out.println("Perímetre: "+df.format(this.perímetre)+this.getMesura());
    System.out.println("############################################");
       }

}