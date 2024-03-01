class Karyawan {
    public String nama;
    public String alamat;
    public char jenisKelamin;
    public String noHp;
    public int jumlahHadir;
    public int jumlahIzin;
    public double gajiPokok;

    public Karyawan(String nama, String alamat, char jenisKelamin, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.noHp = noHp;
        this.jumlahHadir = 0;
        this.jumlahIzin = 0;
        this.gajiPokok = 5000000; 
    }

    public void absensi() {
        
        this.jumlahHadir += 20; 
    }

    public void inputIzin() {
        
        this.jumlahIzin = 2; 
    }

    public void lihatGaji() {
        double gajiTotal = this.gajiPokok * (this.jumlahHadir / 20.0) - (this.jumlahIzin * 50000);
        System.out.println("\nGaji " + this.nama + " bulan ini: Rp" + gajiTotal);
    }

    public void cetakInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println("No Hp: " + this.noHp);
    }
}