import java.util.Scanner;

public class KaryawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Karyawan: ");
        int karyawans = input.nextInt();
        input.nextLine();

        Karyawan[] arrKaryawan = new Karyawan[karyawans];

        for (int i = 0; i < arrKaryawan.length; i++) {

            
            System.out.println("Masukkan Data Karyawan ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan No Hp: ");
            String NoHp = input.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            char jenkel = input.next().charAt(0);

            arrKaryawan[i] = new Karyawan(nama, alamat, jenkel, NoHp);
        }

        int jumlah = 0;
        for (Karyawan karyawan : arrKaryawan) {
            System.out.println("Data Karyawan ke-" + (jumlah+1));
            karyawan.cetakInfo();
        }

        for (Karyawan karyawan : arrKaryawan) {
            karyawan.absensi();
            karyawan.inputIzin();
            karyawan.lihatGaji();
        }
    }
}
