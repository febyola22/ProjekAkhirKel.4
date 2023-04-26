package chatime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<MilkTea> dataMilktea     = new ArrayList<>();
    static ArrayList<TeaPresso> dataTeapresso = new ArrayList<>();
    static ArrayList<Smoothies> dataSmoothies = new ArrayList<>();
    static ArrayList<TeaRRIFIC> dataTearrific = new ArrayList<>();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  
    public static void main(String[] args) throws IOException {
        Implementasi impl = new Implementasi();
        
        int pilihan;
        
        while (true) {
            System.out.println("\n=============================================");
            System.out.println("|                 Menu Awal                 |");
            System.out.println("=============================================");
            System.out.println("| 1. Admin                                  |");
            System.out.println("| 2. Pengunjung                             |");
            System.out.println("| 0. Exit                                   |");
            System.out.println("=============================================");
            System.out.print("| Masukkan pilihan (0-2): ");
            try {
                pilihan = Integer.parseInt(input.readLine());
                switch (pilihan) {
                    case 1:
                        System.out.println("=============================================");
                        System.out.println("|              Input Password               |");
                        System.out.println("=============================================");
                        System.out.print("| Masukkan password: ");
                        int password = Integer.parseInt (input.readLine());
                        System.out.println("=============================================\n");
                        if (password == 12345){
                            System.out.println("\n=============================================");
                            System.out.println("|                   Admin                   |");
                            System.out.println("=============================================");
                            System.out.println("| 1. Input data                             |");
                            System.out.println("| 2. Tampilkan data                         |");
                            System.out.println("| 3. Edit data                              |");
                            System.out.println("| 4. Hapus data                             |");
                            System.out.println("| 0. Exit                                   |");
                            System.out.println("=============================================");
                            System.out.print("| Masukkan pilihan (0-4): ");
                            pilihan = Integer.parseInt(input.readLine());
                            System.out.println("=============================================\n");

                            switch (pilihan) {
                                case 1:
                                    System.out.println("=============================================");
                                    System.out.println("|                Input Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. MilkTea                                |");
                                    System.out.println("| 2. TeaPresso                              |");
                                    System.out.println("| 3. Smoothies                              |");
                                    System.out.println("| 4. TeaRRIFIC                              |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");
                                    if (pilihan == 1) {
                                        BuatMilkTea();
                                        impl.ADD();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        BuatTeaPresso();
                                        impl.ADD();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 3) {
                                        BuatSmoothies();
                                        impl.ADD();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 4) {
                                        BuatTeaRRIFIC();
                                        impl.ADD();
                                        froze();
                                        break;
                                    }
                                    else {
                                        System.out.println(" Pilihan 0-4 !!!");
                                        froze();
                                    }
                                    break;
                                case 2:
                                    System.out.println("=============================================");
                                    System.out.println("|                Semua Menu                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. MilkTea                                |");
                                    System.out.println("| 2. TeaPresso                              |");
                                    System.out.println("| 3. Smoothies                              |");
                                    System.out.println("| 4. TeaRRIFIC                              |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilMilkTea();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilTeaPresso();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 3) {
                                        TampilSmoothies();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 4) {
                                        TampilTeaRRIFIC();
                                        froze();
                                        break;
                                    } 
                                    else {
                                        System.out.println(" Pilihan 1-4 !!!");
                                        froze();
                                    }
                                    break;
                                case 3:
                                    System.out.println("=============================================");
                                    System.out.println("|                 Edit Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. MilkTea                                |");
                                    System.out.println("| 2. TeaPresso                              |");
                                    System.out.println("| 3. Smoothies                              |");
                                    System.out.println("| 4. TeaRRIFIC                              |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilMilkTea();
                                        EditMilkTea();
                                        impl.EDIT();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilTeaPresso();
                                        EditTeaPresso();
                                        impl.EDIT();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 3) {
                                        TampilSmoothies();
                                        EditSmoothies();
                                        impl.EDIT();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 4) {
                                        TampilTeaRRIFIC();
                                        EditTeaRRIFIC();
                                        impl.EDIT();
                                        froze();
                                        break;
                                    }
                                    else {
                                        System.out.println(" Pilihan 1-4 !!!");
                                        froze();
                                    }
                                    break;
                                case 4:
                                    System.out.println("=============================================");
                                    System.out.println("|                Hapus Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. MilkTea                                |");
                                    System.out.println("| 2. TeaPresso                              |");
                                    System.out.println("| 3. Smoothies                              |");
                                    System.out.println("| 4. TeaRRIFIC                              |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilMilkTea();
                                        HapusMilkTea();
                                        impl.DELETE();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilTeaPresso();
                                        HapusTeaPresso();
                                        impl.DELETE();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 3) {
                                        TampilSmoothies();
                                        HapusSmoothies();
                                        impl.DELETE();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 4) {
                                        TampilTeaRRIFIC();
                                        HapusTeaRRIFIC();
                                        impl.DELETE();
                                        froze();
                                        break;
                                    } 
                                    else {
                                        System.out.println(" Pilihan 1-4 !!!");
                                        froze();
                                    }
                                    break;
                                case 0:
                                    System.exit(0);
                                default:
                                    System.out.println(" Pilihan 0-4 !!!");
                                    froze();
                                    break;
                            }
                        }
                        else {
                            System.out.println(" Password Salah !!!");
                            froze();
                        }
                        break;
                    case 2:
                        System.out.print("| Masukkan nama: ");
                        String nama = input.readLine();
                        System.out.println("\n=============================================");
                        System.out.println("|                Halooo " + nama);
                        System.out.println("=============================================");
                        System.out.println("| Anda masuk sebagai pembeli                |");
                        System.out.println("| 1. Beli                                   |");
                        System.out.println("| 2. Tentang                                |");
                        System.out.println("| 0. Exit                                   |");
                        System.out.println("=============================================");
                        System.out.print("| Masukkan pilihan (0-2): ");
                        pilihan = Integer.parseInt(input.readLine());
                        System.out.println("=============================================\n");
                        switch(pilihan){
                            case 1:
                                System.out.println("=============================================");
                                System.out.println("|                Semua Menu                 |");
                                System.out.println("=============================================");
                                System.out.println("| 1. MilkTea                                |");
                                System.out.println("| 2. TeaPresso                              |");
                                System.out.println("| 3. Smoothies                              |");
                                System.out.println("| 4. TeaRRIFIC                              |");
                                System.out.println("=============================================");
                                System.out.print("Masukan pilihan (1-4) : ");
                                pilihan = Integer.parseInt(input.readLine());
                                System.out.println("=============================================");

                                if (pilihan == 1) {
                                    BeliMilkTea();
                                    froze();
                                    break;
                                } 
                                if (pilihan == 2) {
                                    BeliTeaPresso();
                                    froze();
                                    break;
                                } 
                                if (pilihan == 3) {
                                    BeliSmoothies();
                                    froze();
                                    break;
                                } 
                                if (pilihan == 4) {
                                    BeliTeaRRIFIC();
                                    froze();
                                    break;
                                } 
                                else {
                                    System.out.println(" Pilihan 1-4 !!!");
                                    froze();
                                }
                                break;
                            case 2:
                                System.out.println("=============================================");
                                System.out.println("|                 Tentang                   |");
                                System.out.println("=============================================");
                                System.out.println("| 1. Chatime                                |");
                                System.out.println("| 2. MilkTea                                |");
                                System.out.println("| 3. TeaPresso                              |");
                                System.out.println("| 4. Smoothies                              |");
                                System.out.println("| 5. TeaRRIFIC                              |");
                                System.out.println("=============================================");
                                System.out.print("Masukan pilihan (1-5) : ");
                                pilihan = Integer.parseInt(input.readLine());
                                System.out.println("=============================================");

                                if (pilihan == 1) {
                                    Tentang();
                                    froze();
                                    break;
                                } 
                                if (pilihan == 2) {
                                    Tentang(1);
                                    froze();
                                    break;
                                } 
                                if (pilihan == 3) {
                                    Tentang(2);
                                    froze();
                                    break;
                                } 
                                if (pilihan == 4) {
                                    Tentang(3);
                                    froze();
                                    break;
                                }
                                if (pilihan == 5) {
                                    Tentang(4);
                                    froze();
                                    break;
                                }
                                else {
                                    System.out.println(" Pilihan 1-5 !!!");
                                    froze();
                                }
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println(" Pilihan 1-5 !!!");
                                froze();
                                break;
                        }
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println(" Pilihan 0-2 !!!");
                        froze();
                        break;
                }
            }
            catch(NumberFormatException e){
                System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
                froze();
            }
    } 
}
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
    }

    public static void BuatMilkTea()throws IOException{
        System.out.println("=============================================");
        System.out.println("|              Input MilkTea                |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        try{
            int Regular      = Integer.parseInt(input.readLine());
            System.out.print("| Large       : ");
            int Large      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            dataMilktea.add(new MilkTea(ID, Seri, Nama, Regular, Large));
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BuatTeaPresso()throws IOException{
        System.out.println("=============================================");
        System.out.println("|              Input TeaPresso               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        try{
            int Regular      = Integer.parseInt(input.readLine());
            System.out.print("| Large       : ");
            int Large      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            dataTeapresso.add(new TeaPresso(ID, Seri, Nama, Regular, Large));
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BuatSmoothies()throws IOException{
        System.out.println("=============================================");
        System.out.println("|             Input Smoothies               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        try{
            int Regular      = Integer.parseInt(input.readLine());
            System.out.print("| Large       : ");
            int Large      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            dataSmoothies.add(new Smoothies(ID, Seri, Nama, Regular, Large));
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BuatTeaRRIFIC()throws IOException{
        System.out.println("=============================================");
        System.out.println("|             Input TeaRRIFIC               |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        String ID    = input.readLine();
        System.out.print("| Seri menu   : ");
        String Seri   = input.readLine();
        System.out.print("| Nama menu   : ");
        String Nama   = input.readLine();
        System.out.print("| Regular     : ");
        try{
            int Regular      = Integer.parseInt(input.readLine());
            System.out.print("| Large       : ");
            int Large      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            dataTearrific.add(new TeaRRIFIC(ID, Seri, Nama, Regular, Large));
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
  public static void TampilMilkTea()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu MilkTea             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataMilktea.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataMilktea.get(i).tampil();
        }
    }
    public static void TampilTeaPresso()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu TeaPresso            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTeapresso.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTeapresso.get(i).tampil();
        }
    }
    public static void TampilSmoothies()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu Smoothies            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataSmoothies.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataSmoothies.get(i).tampil();
        }
    }
    public static void TampilTeaRRIFIC()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu TeaRRIFIC             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTearrific.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTearrific.get(i).tampil();
        }
    }
    
    public static void EditMilkTea()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|               Update MilkTea              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");
        String id = input.readLine();
        System.out.println("=============================================");    
        for (MilkTea i : dataMilktea) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                try{
                    i.setRegular(Integer.parseInt(input.readLine()));
                    System.out.print("| Large       : ");
                    i.setLarge(Integer.parseInt(input.readLine()));
                    System.out.println("=============================================");
                }
                catch(NumberFormatException e){
                    System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
                }
            }
        }
    }
    public static void EditTeaPresso()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Update TeaPresso             |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");
        String id = input.readLine();
        System.out.println("=============================================");    
        for (TeaPresso i : dataTeapresso) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                try{
                    i.setRegular(Integer.parseInt(input.readLine()));
                    System.out.print("| Large       : ");
                    i.setLarge(Integer.parseInt(input.readLine()));
                    System.out.println("=============================================");
                }
                catch(NumberFormatException e){
                    System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
                }
            }
        }
    }
    public static void EditSmoothies()throws IOException{
         
        
        System.out.println("\n=============================================");
        System.out.println("|               Update Smoothies              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");    
        String id = input.readLine();
        System.out.println("=============================================");
        for (Smoothies i : dataSmoothies) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                try{
                    i.setRegular(Integer.parseInt(input.readLine()));
                    System.out.print("| Large       : ");
                    i.setLarge(Integer.parseInt(input.readLine()));
                    System.out.println("=============================================");
                }
                catch(NumberFormatException e){
                    System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
                }
            }
        }
    }
    public static void EditTeaRRIFIC()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|               Update TeaRRIFIC              |");
        System.out.println("=============================================");
        System.out.print("Masukan ID menu : ");    
        String id = input.readLine();
        System.out.println("=============================================");    
        for (TeaRRIFIC i : dataTearrific) {
            if (i.getID().equals(id)) {
                System.out.print("| ID menu     : ");
                i.setID(input.readLine());
                System.out.print("| Seri menu   : ");
                i.setSeri(input.readLine());
                System.out.print("| Nama menu   : ");
                i.setNama(input.readLine());
                System.out.print("| Regular     : ");
                try{
                    i.setRegular(Integer.parseInt(input.readLine()));
                    System.out.print("| Large       : ");
                    i.setLarge(Integer.parseInt(input.readLine()));
                    System.out.println("=============================================");
                }
                catch(NumberFormatException e){
                    System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
                }
            }
        }
    }
    
    public static void HapusMilkTea()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete MilkTea               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataMilktea.size(); i++) {
            if (dataMilktea.get(i).getID().equals(id)){
            dataMilktea.remove(i);
            }
        }
    }
    public static void HapusTeaPresso()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete TeaPresso               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataTeapresso.size(); i++) {
            if (dataTeapresso.get(i).getID().equals(id)){
            dataTeapresso.remove(i);
            }
        }
    }
    public static void HapusSmoothies()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete Smoothies               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataSmoothies.size(); i++) {
            if (dataSmoothies.get(i).getID().equals(id)){
            dataSmoothies.remove(i);
            }
        }
    }
    public static void HapusTeaRRIFIC()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete TeaRRIFIC               |");
        System.out.println("=============================================");
        System.out.print("| Masukan ID menu: ");
        String id = input.readLine();
        System.out.println("=============================================");
        for (int i = 0; i < dataTearrific.size(); i++) {
            if (dataTearrific.get(i).getID().equals(id)){
            dataTearrific.remove(i);
            }
        }
    }
    
    public static void BeliMilkTea()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu MilkTea             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataMilktea.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataMilktea.get(i).tampil();
        }
        try{
            System.out.print("Masukan nomor menu yang ingin dipesan : ");
            int pilihan = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            if (pilihan > dataMilktea.size()) {
                System.out.println("| Pilihan salah !!!");
            } 
            else {
                System.out.println("| Pesanan anda:");
                dataMilktea.get(pilihan-1).tampil();
                System.out.println("\n Terima kasih telah memesan");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BeliTeaPresso()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu TeaPresso            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTeapresso.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTeapresso.get(i).tampil();
        }
        try{
            System.out.print("Masukan nomor menu yang ingin dipesan : ");
            int pilihan = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            if (pilihan > dataTeapresso.size()) {
                System.out.println("| Pilihan salah !!!");
            } 
            else {
                System.out.println("| Pesanan anda:");
                dataTeapresso.get(pilihan-1).tampil();
                System.out.println("\n Terima kasih telah memesan");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BeliSmoothies()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|           Semua Menu Smoothies            |");
        System.out.println("=============================================");
        for (int i = 0; i < dataSmoothies.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataSmoothies.get(i).tampil();
        }
        try{
            System.out.print("Masukan nomor menu yang ingin dipesan : ");
            int pilihan = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            if (pilihan > dataSmoothies.size()) {
                System.out.println("| Pilihan salah !!!");
            } 
            else {
                System.out.println("| Pesanan anda:");
                dataSmoothies.get(pilihan-1).tampil();
                System.out.println("\n Terima kasih telah memesan");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    public static void BeliTeaRRIFIC()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu TeaRRIFIC             |");
        System.out.println("=============================================");
        for (int i = 0; i < dataTearrific.size(); i++) {
            System.out.println("Menu ke - " + (i + 1));
            System.out.println("---------------------------------------------");
            dataTearrific.get(i).tampil();
        }
        try{
            System.out.print("Masukan nomor menu yang ingin dipesan : ");
            int pilihan = Integer.parseInt(input.readLine());
            System.out.println("=============================================");

            if (pilihan > dataTearrific.size()) {
                System.out.println("| Pilihan salah !!!");
            } 
            else {
                System.out.println("| Pesanan anda:");
                dataTearrific.get(pilihan-1).tampil();
                System.out.println("\n Terima kasih telah memesan");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e + " Bukanlah angka, masukkan angka yang benar!!");
        }
    }
    
    public static void Tentang()throws IOException{
        System.out.println("=============================================");
        System.out.println("|                 Tentang                   |");
        System.out.println("=============================================");
        System.out.println("Chatime pertama kali didirikan di Taiwan pada tahun 2005 dan sejak itu telah berkembang menjadi lebih dari 1.000 gerai di seluruh dunia, termasuk di Asia, Amerika, Eropa, dan Australia. Chatime dikenal dengan minuman boba yang berkualitas tinggi dan rasa yang konsisten di setiap gerai.");
        System.out.println("=============================================");
    }

    public static void Tentang(int i)throws IOException{
        if(i == 1){
            System.out.println("=============================================");
            System.out.println("|                 MilkTea                   |");
            System.out.println("=============================================");
            System.out.println("Milk Tea adalah salah satu minuman boba yang paling populer pada menu Chatime. Seperti namanya, Milk Tea adalah campuran antara teh dan susu, yang disajikan dengan bola tapioka dan pilihan topping lainnya seperti jelly atau buah-buahan segar. Chatime menyajikan Milk Tea dengan pilihan berbagai jenis teh, seperti teh hitam, teh hijau, teh oolong, dan teh matcha, yang dapat disesuaikan dengan selera masing-masing pelanggan.");
            System.out.println("=============================================");
        }else if (i == 2){
            System.out.println("=============================================");
            System.out.println("|                 TeaPresso                 |");
            System.out.println("=============================================");
            System.out.println("Chatime menawarkan minuman dengan nama TeaPresso yang menggunakan teh yang diseduh dengan TeaPresso sebagai bahan dasarnya. Minuman ini biasanya termasuk dalam kategori Classic & Finest Tea Selection pada menu Chatime, yang terdiri dari berbagai macam teh yang berkualitas tinggi seperti Chatime Roasted Tea, Green Tea Latte, Black Tea, dan lain-lain");
            System.out.println("=============================================");
        }
        else if (i == 3){
            System.out.println("=============================================");
            System.out.println("|                 Smoothies                 |");
            System.out.println("=============================================");
            System.out.println("Smoothies adalah salah satu jenis minuman boba yang tersedia di menu Chatime. Minuman ini terbuat dari campuran buah-buahan segar dan susu, yang disajikan dengan bola tapioka dan topping lainnya. Chatime menyajikan berbagai macam Smoothies dengan pilihan berbagai jenis buah, seperti mangga, stroberi, melon, dan kiwi.");
            System.out.println("=============================================");
        }
        else if (i == 4){
            System.out.println("=============================================");
            System.out.println("|                 TeaRRIFIC                 |");
            System.out.println("=============================================");
            System.out.println("TeaRRIFIC adalah salah satu minuman boba pada menu Chatime. Minuman ini terdiri dari campuran teh hitam dan susu, dengan tambahan bola tapioka yang kenyal dan topping jelly atau buah-buahan segar. Chatime menyajikan minuman TeaRRIFIC dengan variasi tingkat manis yang dapat disesuaikan dengan selera masing-masing pelanggan.");
            System.out.println("=============================================");
        }
        else {
            System.out.println("idk how did you get here?");
        }
    }
}
