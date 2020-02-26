package figures.templates;
public class Rodona extends Figura{
private double radi;

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }
    @Override
    public void CalcularArea(){
    this.area=Math.PI*Math.pow(this.radi, 2);
    }
    @Override
    public void CalcularPerímetre(){
this.perímetre=2*Math.PI*radi;
    }
    public Rodona(String mesura, double radi) {
        super(mesura);
        this.radi = radi;
    }
    public void mostra(){
        System.out.println("############################################");
        System.err.println(this.getClass().getSimpleName());
        System.out.println("Area: "+df.format(this.area)+this.getMesura()     );
        System.out.println("Perímetre: "+df.format(this.perímetre)+this.getMesura());
        System.out.println("############################################");
           }
    
}