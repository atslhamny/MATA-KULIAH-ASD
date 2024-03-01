import java.util.Scanner;

public class Mahasiswa04Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int mahasiswa = input.nextInt();
        input.nextLine();

        Mahasiswa04[] ArrMahasiswas = new Mahasiswa04[mahasiswa];

        for (int i = 0; i < ArrMahasiswas.length; i++) {

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            String nama = input.next();
            System.out.print("Masukkan NIM: ");
            String nim = input.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            char jeniskelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = input.nextDouble();

            ArrMahasiswas[i] = new Mahasiswa04(nama, nim, jeniskelamin, ipk);
        }

        int jumlah = 0;
        for (Mahasiswa04 mahasiswa04 : ArrMahasiswas) {
            System.out.println("Data Mahasiswa ke-" + (jumlah + 1));
            mahasiswa04.cetakInfo();
            jumlah++;
        }
        double totalIPK = 0;
        for (Mahasiswa04 mahasiswa04 : ArrMahasiswas) {
            totalIPK += mahasiswa04.IPK;
        }
        double rataRataIPK = totalIPK / mahasiswa;

        System.out.println("-------------------------------------------------------");
        System.out.println("Rata-rata IPK: " + rataRataIPK);
        System.out.println("-------------------------------------------------------");


    }
}
