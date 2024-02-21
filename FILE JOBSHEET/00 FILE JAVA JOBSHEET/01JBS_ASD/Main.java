import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah yang Anda ambil: ");
        int jumlahMataKuliah = scanner.nextInt();

        // Membuat array 2 dimensi untuk menampung informasi matakuliah
        String[][] informasiMataKuliah = new String[jumlahMataKuliah][4]; // 4 kolom: nama, nilai angka, nilai huruf,
                                                                          // bobot SKS
        int totalSKS = 0;

        // Input informasi matakuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            scanner.nextLine(); // Membersihkan buffer
            System.out.println("Masukkan informasi mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            informasiMataKuliah[i][0] = scanner.nextLine();
            System.out.print("Nilai Angka: ");
            informasiMataKuliah[i][1] = String.valueOf(scanner.nextInt());
            scanner.nextLine(); // Membersihkan buffer
            System.out.print("Nilai Huruf: ");
            informasiMataKuliah[i][2] = scanner.nextLine();
            System.out.print("Bobot SKS: ");
            informasiMataKuliah[i][3] = String.valueOf(scanner.nextInt());
            totalSKS += Integer.parseInt(informasiMataKuliah[i][3]);
        }

        // Menghitung IP Semester
        double ipSemester = hitungIPSemester(informasiMataKuliah, totalSKS);
        System.out.println("IP Semester Anda adalah: " + ipSemester);
    }

    // Fungsi untuk menghitung IP Semester
    private static double hitungIPSemester(String[][] informasiMataKuliah, int totalSKS) {
        double totalNilaiBobot = 0.0;
        for (int i = 0; i < informasiMataKuliah.length; i++) {
            totalNilaiBobot += Double.parseDouble(informasiMataKuliah[i][1])
                    * Integer.parseInt(informasiMataKuliah[i][3]);
        }
        return totalNilaiBobot / totalSKS;
    }
}
