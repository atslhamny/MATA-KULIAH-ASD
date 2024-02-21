import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================================");
        System.out.print("Masukkan jumlah mata kuliah yang Anda tempuh: ");
        int jmlMatkul = scanner.nextInt();

        double ttlBobotSKS = 0;
        double ttlBobotSKSxNilai = 0;

        double[] nilaiAngka = new double[jmlMatkul];

        int[] bobotSKS = new int[jmlMatkul];

        String[] NmMatkul = new String[jmlMatkul];

        // buat masukin inputan
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("\nMasukkan nama Mata Kuliah ke-" + (i + 1) + ": ");
            scanner.nextLine();
            NmMatkul[i] = scanner.nextLine();
            System.out.print("Masukkan bobot SKS Mata Kuliah ke-" + (i + 1) + ": ");
            bobotSKS[i] = scanner.nextInt();
            System.out.print("Masukkan nilai Angka untuk MK " + NmMatkul[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        System.out.println("============================================================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.println("============================================================");


        // ini buat itung nilai ygy
        for (int i = 0; i < jmlMatkul; i++) {
            double nilaiSetara = 0;
            String nilaiHuruf = "";
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiSetara = 4.0;
                nilaiHuruf = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiSetara = 3.5;
                nilaiHuruf = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiSetara = 3.0;
                nilaiHuruf = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiSetara = 2.5;
                nilaiHuruf = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiSetara = 2.0;
                nilaiHuruf = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiSetara = 1.0;
                nilaiHuruf = "D";
            } else {
                nilaiSetara = 0;
                nilaiHuruf = "E";
            }
            System.out.println(NmMatkul[i] + "\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf + "\t\t" + nilaiSetara);

            ttlBobotSKS += bobotSKS[i];
            ttlBobotSKSxNilai += (nilaiSetara * bobotSKS[i]);
        }

        // nilai IP ini
        System.out.println("============================================================");
        double IPSemester = ttlBobotSKSxNilai / ttlBobotSKS;
        System.out.println("============================================================");

        System.out.println("\nIP: " + String.format("%.2f", IPSemester));
    }
}