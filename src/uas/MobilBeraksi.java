package uas;
import java.util.Scanner;
public class MobilBeraksi {
    public static void main(String[] args) {        
// IO sederhana
        try {            
            Scanner scanner = new Scanner(System.in);
                        // Array
            MobilDetail[] mobils = new MobilDetail[2];            
            for (int i = 0; i < mobils.length; i++) {                
                System.out.print("Masukkan model mobil ke-" + (i+1) + ": ");
                String model = scanner.nextLine();                
                System.out.print("Masukkan plat nomor mobil ke-" + (i+1) + ": ");
                String platNomor = scanner.nextLine();                
                // Objek                
                mobils[i] = new MobilDetail(model, platNomor);
            }            
            for (MobilDetail mobil : mobils) {                
                System.out.println("============");
                System.out.println("Data mobil: ");                
                System.out.println(mobil.tampilkanInfo());
            }        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());        
            } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format plat nomor: " + e.getMessage());        
        }
        catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());        
        }
    }}