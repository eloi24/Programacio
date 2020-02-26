package figures.templates;

import java.text.DecimalFormat;

public abstract class Figura{
protected double area,perímetre;
protected String mesura;
protected DecimalFormat df = new DecimalFormat("#.###");
    public Figura() {
    }

    

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerímetre() {
        return perímetre;
    }

    public void setPerímetre(double perímetre) {
        this.perímetre = perímetre;
    }

    public String getMesura() {
        return mesura;
    }

    public void setMesura(String mesura) {
        this.mesura = mesura;
    }
    public abstract void CalcularArea();

    public abstract void CalcularPerímetre();
    
    public abstract void mostra();


    public double getArea() {
        return area;
    }

    public Figura(String mesura) {
        this.mesura = mesura;
    }

}