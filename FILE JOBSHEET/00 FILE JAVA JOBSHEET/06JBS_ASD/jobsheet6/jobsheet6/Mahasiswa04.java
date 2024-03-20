package jobsheet6;

/**
 * Mahasiswa04
 */
public class Mahasiswa04 {

    //deklarasi variable
    String nama;
    int thnMasuk, umur;
    double ipk;

    //pembuatan konstruktor
    Mahasiswa04(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    //membuat fungsi tampil yang berisi menampilkan nama, tahun masuk, umur, ipk
    void Tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);

    }

}
