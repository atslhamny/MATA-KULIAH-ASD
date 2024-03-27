package minggu7;

public class Mahasiswa04 {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa04(int ni, String n, int u, double ip){
        nim = ni;
        nama = n;
        umur = u;
        ipk = ip;
    }

    void tampil(){
        System.out.println("NIM = "+ nim);
        System.out.println("NAMA = " + nama);
        System.out.println("UMUR = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
