package botiga.clases;
public class LiniaComanda{
    private Producte producte;
    private int quantitat;
    private Float preufinal=0f;

    public LiniaComanda() {
       
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public Float getPreufinal() {
        return preufinal;
    }

    public void setPreufinal(Float preufinal) {
        this.preufinal = preufinal;
    }
    
}