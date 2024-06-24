import java.util.Scanner;

public class MainJCF {
    public static void main(String[] args) {
        MahasiswaManager manager = new MahasiswaManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Baca Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    manager.tambahMahasiswa(new Mahasiswa(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    manager.hapusMahasiswa(nimHapus);
                    break;
                case 3:
                    System.out.print("NIM Mahasiswa yang akan dibaca: ");
                    String nimBaca = scanner.nextLine();
                    Mahasiswa m = manager.bacaMahasiswa(nimBaca);
                    if (m != null) {
                        System.out.println(m);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;
                case 4:
                    manager.cetakSemuaMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);
    }
}
