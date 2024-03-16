package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("===============================");
        // System.out.print("Masukkan Elemen Yang ingin dihitung: ");
        // int elemen = sc.nextInt();

        // Pangkat04[] pangkat = new Pangkat04[elemen];

        // for (int i = 0; i < elemen; i++) {
        //     pangkat[i] = new Pangkat04();
        //     System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) +" : ");
        //     pangkat[i].nilai =sc.nextInt();
        //     System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
        //     pangkat[i].pangkat = sc.nextInt();
        // }

        Pangkat04[] pangkat = new Pangkat04[5];

        pangkat[0] = new Pangkat04(5, 2);
        pangkat[1] = new Pangkat04(4, 2);
        pangkat[2] = new Pangkat04(3, 2);
        pangkat[3] = new Pangkat04(2, 2);
        pangkat[4] = new Pangkat04(1, 2);

        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("========================================== ");
        System.out.println("1. Brute Force ");
        System.out.println("2. Divide Conquer ");
        System.out.println("3. Keluar ");
        System.out.print("Silahkan Pilih Metode : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Brute force ");
                for (int i = 0; i < pangkat.length; i++) {
                    System.out.println("Nilai " + pangkat[i].nilai + " pangkat " + pangkat[i].pangkat + " adalah "
                            + pangkat[i].pangkatBF(pangkat[i].nilai, pangkat[i].pangkat));
                }
                break;
            case 2:
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Devide Conquer ");
                for (int i = 0; i < pangkat.length; i++) {
                    System.out.println("Nilai " + pangkat[i].nilai + " pangkat " + pangkat[i].pangkat + " adalah "
                            + pangkat[i].pangkatDC(pangkat[i].nilai, pangkat[i].pangkat));
                }
                break;
            case 3:
                System.out.println("------------Terima Kasih---------");
                break;
            default:
                System.out.println("------ input yang anda masukkan salah -------");
        }

    }
}
