package botiga.clases;
public class Producte{
    private String ref,desc;
    private float preu;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public Producte(String ref) {
        this.ref = ref;
    }
    public void mostraproducte(){
        System.out.println("Descripció "+this.desc+" Referencia: "+this.ref+" Preu/Unitat: "+this.preu);
    }
    
}