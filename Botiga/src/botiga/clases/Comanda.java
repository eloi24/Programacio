package botiga.clases;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Comanda {
    private int numcomanda;
    private Client cli;
    private LocalDateTime data;
    private ArrayList<LiniaComanda> preucomanda = new ArrayList<>();
  private Float preufinalcomanda;

    

    public void setNumcomanda(int numcomanda) {
        this.numcomanda = numcomanda;
    }

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    public Comanda(int  numcomanda) {
        this.numcomanda = numcomanda;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public ArrayList<LiniaComanda> getPreucomanda() {
        return preucomanda;
    }

    public void setPreucomanda(ArrayList<LiniaComanda> preucomanda) {
        this.preucomanda = preucomanda;
    }
    
    public int getNumcomanda() {
        return numcomanda;
    }
    public void mostracomanda(){
        System.out.println();
        System.out.println("#########################################");
        System.out.println("COMANDA nº "+this.numcomanda);
       this.cli.mostraclient();
       System.out.println("Data. "+this.data.getYear()+"-"+this.data.getMonthValue()+"-"+this.data.getDayOfMonth()+" Hora: "+this.data.getHour()+":"+this.data.getMinute());

    for (LiniaComanda s : preucomanda) {
    s.getProducte().mostraproducte();
    System.out.println("Quantitat: "+s.getQuantitat()+" - Preu final del producte: "+s.getPreufinal());

    
}
System.out.println("Preu final + IVA:"+this.preufinalcomanda);
System.out.println("#########################################");
System.out.println();

    }

    public Float getPreufinalcomanda() {
        return preufinalcomanda;
    }

    public void setPreufinalcomanda(Float preufinalcomanda) {
        this.preufinalcomanda = preufinalcomanda;
    }
    



    
}