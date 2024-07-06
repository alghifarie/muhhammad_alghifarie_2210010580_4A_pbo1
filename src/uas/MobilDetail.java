package uas;
// Inheritancepublic 
class MobilDetail extends Mobil {
    // Overriding konstruktor    
    public MobilDetail(String model, String platNomor) {
        super(model, platNomor);    }
    
    public int getTahun() {        
        return Integer.parseInt(getPlatNomor().substring(0, 2)) + 2000;
    }    
    public String getTipe() {        
        String kode = getPlatNomor().substring(2, 4);
        // Seleksi if
        if (kode.equals("01")) {            
            return "SUV";
        } else {            
            return "Sedan";
        }    }
        public String getMerk() {
        String kode = getPlatNomor().substring(4, 6);        
// Seleksi switch
        switch (kode) {            
            case "01":
                return "Toyota";            
            case "02":
                return "Honda";           
            default:
                return "Merk Lain";        }
    }    
    public int getNoRegistrasi() {       
        return Integer.parseInt(getPlatNomor().substring(6));
    }    
    // Polimorfisme overriding    
    @Override
    public String tampilkanInfo() {       
        return super.tampilkanInfo() +
               "\nTahun: " + getTahun() +               
                "\nTipe: " + getTipe() +
               "\nMerk: " + getMerk() +               
                "\nNo Registrasi: " + getNoRegistrasi();
    }}