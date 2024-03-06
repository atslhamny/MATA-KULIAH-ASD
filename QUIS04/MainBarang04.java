import java.util.Scanner;

public class MainBarang04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Barang04[] barangs = {
            new Barang04("BR01", "SABUN CUCI", 1000, 12),
            new Barang04("BR02", "PELEMBAB", 12000, 3),
            new Barang04("BR03", "UMPAN IKAN", 14000, 32),
            new Barang04("BR04", "SABUN MANDI", 4000, 12),
            new Barang04("BR05","KAIL PANCING ", 5000, 10)
        };

        Transaksi04 transaksi = new Transaksi04(barangs);

        boolean menu = false;

        while (!menu) {
            System.out.println("==============================");
            System.out.println("==========PROGRAM PEMBELIAN==========");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih MENU 1-4: ");
            int pilih = sc.nextInt();
            sc.next();

            System.out.println("==============================");
            
            switch (pilih) {
                case 1:
                    transaksi.TampilkanBarang();
                    break;
                case 2:
                    System.out.print("Masukkan Barang Yang ingin Dibeli: ");
                    String KodeBarang = sc.nextLine();
                    transaksi.Pembelian(KodeBarang);

                    System.out.println("Apakah Anda Ingin Menambahkan Lagi: (Y/T)");
                    String pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("Y")) {
                        transaksi.Pembelian(KodeBarang);
                    }else if(pilihan.equalsIgnoreCase("T")){
                        break;
                    }
                    break;
                case 3:
                    transaksi.TampilkanBeli();
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Pilihan Anda Tidak Valid");
                    break;
            }
        }
    }
}
