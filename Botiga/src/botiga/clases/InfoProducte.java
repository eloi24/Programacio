package botiga.clases;
public class InfoProducte{
    int quantitat;
    Producte producte;

    public InfoProducte() {
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }
    public void mostrainfoproducte(){
        System.out.println("Referencia: "+this.getProducte().getRef()+" Descripció: "+this.getProducte().getDesc()+" - Quantitat en stock: "+this.quantitat+" Preu/U: "+this.getProducte().getPreu());
    }
    
}