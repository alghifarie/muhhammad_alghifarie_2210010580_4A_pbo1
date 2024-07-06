package uas;
public class Mobil {    
// Atribut enkapsulasi
    private String model;   
    private String platNomor;
        // Konstruktor
    public Mobil(String model, String platNomor) {        
        this.model = model;
        this.platNomor = platNomor;    }
    // Mutator (setter)
    public void setModel(String model) {        
        this.model = model;
    }
    public void setPlatNomor(String platNomor) {        
        this.platNomor = platNomor;
    }
    // Akses (getter)    
    public String getModel() {
        return model;    }
    public String getPlatNomor() {
        return platNomor;    }
    public String tampilkanInfo() {
        return "Model: " + getModel() +               
                "\nPlat Nomor: " + getPlatNomor();
    }
    // Polimorfisme overloading    
    public String tampilkanInfo(String warna) {
        return tampilkanInfo() + "\nWarna: " + warna;    }
}