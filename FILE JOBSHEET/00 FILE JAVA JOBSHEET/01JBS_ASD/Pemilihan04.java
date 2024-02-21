import java.util.Scanner;

/**
 * Perulangan04
 */
public class Pemilihan04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.println("==========================================");
        System.out.print("Masukkan Nilai Tugas yang didapat: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis yang didapat: ");
        int nilaiKuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS yang didapat: ");
        int nilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS yang didapat: ");
        int nilaiUAS = input.nextInt();

        System.out.println("==========================================");

        if (nilaiTugas <= 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
        }else if(nilaiKuis <= 0 || nilaiKuis > 100){
            System.out.println("Nilai Tidak Valid");
        }else if(nilaiUTS <= 0 || nilaiUTS > 100){
            System.out.println("Nilai Tidak Valid");
        }else if(nilaiUAS <= 0 || nilaiUAS > 100){
            System.out.println("Nilai Tidak Valid");
        }    

        int nilaiTotal = (nilaiTugas * 20 / 100) + (nilaiKuis * 20 / 100) + (nilaiUTS * 30 / 100) + (nilaiUAS * 30 / 100);
        String nilaiHuruf;
        if (nilaiTotal >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiTotal >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiTotal >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiTotal >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiTotal >= 50) {
            nilaiHuruf = "C";
        } else if(nilaiTotal >= 39 ) {
            nilaiHuruf = "D";
        } else{
            nilaiHuruf = "E";
        }

        String keterangan = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";

        System.out.println("Nilai Akhir : " + nilaiTotal);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan : " + keterangan);
        
        System.out.println("=========================================");


        
            
    }
}