package botiga.clases;

import java.time.LocalDate;

public class Client{
private String nom,cognom,telef,dni;
private LocalDate aniversari;

    public Client(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getAniversari() {
        return aniversari;
    }

    public void setAniversari(LocalDate aniversari) {
        this.aniversari = aniversari;
    }
    public void mostraclient(){
        System.out.println(this.cognom+","+this.nom+" - DNI: "+this.dni+" - Telefon: "+this.telef+" - Data Naixement: "+this.aniversari);
    }

}