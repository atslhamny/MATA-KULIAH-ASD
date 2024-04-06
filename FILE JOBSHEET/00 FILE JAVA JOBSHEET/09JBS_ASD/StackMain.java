import java.util.Scanner;

public class StackMain {
   public static void main(String[] args) {
       Stack stk = new Stack(10);

       Scanner sc = new Scanner(System.in);

       do{
       System.out.println("=======================================");
       System.out.println("SELAMAT DATANG DI PROGRAM INPUT PAKAIAN");
       System.out.println("========================================");
       System.out.println("PILIH MENU ANDA");
       System.out.println("1. MEMASUKKAN DATA PAKAIAN");
       System.out.println("2. PEEK");
       System.out.println("3. POP");
       System.out.println("4. PRINT");
       System.out.println("5. GET MAX");
       System.out.println("6. EXIT");
       System.out.println("PILIH : ");
       int pilihan = sc.nextInt();

       sc.nextLine();

       switch (pilihan) {
        case 1:
            char pilih;
            do {
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();

                Pakaian04 p = new Pakaian04(jenis, warna, merk, ukuran, harga);
                System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
                stk.push(p);

            } while (pilih == 'y');
        break;

        case 2:
            stk.peek();
        break;

        case 3:
            stk.pop();
        break;

        case 4:
            stk.print();
        break;

        case 5:
            stk.getMax();
        break;

        case 6:
            System.exit(pilihan);
        break;
       
        default:
            break;
       }

    }
       while (true);
   }
}
