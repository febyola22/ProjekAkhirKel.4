package chatime;

import java.text.NumberFormat;
import java.util.Locale;

public class TeaRRIFIC extends Chatime{
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
    
    private String Seri;
    
    public TeaRRIFIC(String ID, String Seri, String Nama, int Regular, int Large){
        super(ID, Nama, Regular, Large);
        this.Seri   = Seri;
    }

    public String getSeri() {
        return Seri;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }
    
    public void tampil() {
        System.out.println("| ID menu       : " + this.ID);
        System.out.println("| Seri menu     : " + this.Seri);
        System.out.println("| Nama menu     : " + this.Nama);
        System.out.println("| Regular       : " + formatRupiah.format(this.Regular) + " Ukuran " + UkuranR + " ml ");
        System.out.println("| Large         : " + formatRupiah.format(this.Large) + " Ukuran " + UkuranL + " ml ");
        this.Dingin();
        System.out.println("=============================================");
    }
    
    @Override
    public void Dingin(){
        System.out.println("| This " +this.Nama+ " is cold");
    }
}
