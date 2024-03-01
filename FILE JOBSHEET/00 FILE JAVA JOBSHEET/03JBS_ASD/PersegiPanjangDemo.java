import java.util.Scanner;

public class PersegiPanjangDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Array :");
        int panjangArr = sc.nextInt();

        PersegiPanjang[] arrPersegiPanjang = new PersegiPanjang[panjangArr];
        int panjang, lebar;

        for (int i = 0; i < panjangArr; i++) {

            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.print("Masukkan Panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            lebar = sc.nextInt();

            arrPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);

            System.out.println("=================================================");

        }
        
        for (int i = 0; i < panjangArr; i++) {
            System.out.println(" ");
            System.out.print("Persegi Panjang ke-" + (i + 1)+ " "); 
            arrPersegiPanjang[i].cetakInfo();
            
        }

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Persegi Panjang ke-" + (i+1) + ", panjang: "
        //     + arrPersegiPanjang[i].panjang + ", lebar: " + arrPersegiPanjang[i].lebar);
        // }

        // arrPersegiPanjang[0] = new PersegiPanjang();
        // arrPersegiPanjang[0].panjang = 100;
        // arrPersegiPanjang[0].lebar = 100;

        // arrPersegiPanjang[1] = new PersegiPanjang();
        // arrPersegiPanjang[1].panjang = 100;
        // arrPersegiPanjang[1].lebar = 100;

        // arrPersegiPanjang[2] = new PersegiPanjang();
        // arrPersegiPanjang[2].panjang = 100;
        // arrPersegiPanjang[2].lebar = 100;

        // System.out.println("Persegi Panjang ke-1 " + arrPersegiPanjang[0].panjang
        // + ", lebar: " + arrPersegiPanjang[0].lebar);

        // System.out.println("Persegi Panjang ke-1 " + arrPersegiPanjang[1].panjang
        //         + ", lebar: " + arrPersegiPanjang[1].lebar);

        // System.out.println("Persegi Panjang ke-1 " + arrPersegiPanjang[2].panjang
        //         + ", lebar: " + arrPersegiPanjang[2].lebar);

    }
}
