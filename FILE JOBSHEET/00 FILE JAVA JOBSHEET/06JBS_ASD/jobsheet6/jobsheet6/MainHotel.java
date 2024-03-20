package jobsheet6;

/**
 * MainHotel
 */
public class MainHotel {

    public static void main(String[] args) {
        HotelService daftar = new HotelService();

        Hotel04 htl1 = new Hotel04("SULIS", "MALANG", 200000, (byte) 2);
        Hotel04 htl2 = new Hotel04("BUDI", "BATU", 300000, (byte) 3);
        Hotel04 htl3 = new Hotel04("ARMIN", "NGANJUK", 400000, (byte) 4);
        Hotel04 htl4 = new Hotel04("EREN", "PASURUAN", 500000, (byte) 5);

        daftar.tambah(htl1);
        daftar.tambah(htl2);
        daftar.tambah(htl3);
        daftar.tambah(htl4);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                        DATA SEBELUM SORTING                      -");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        daftar.TampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-    DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT    -");
        System.out.println("--------------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.TampilAll();

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-  DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT   -");
        System.out.println("--------------------------------------------------------------------");
        daftar.selectionSort();
        daftar.TampilAll();
    }
}