package jobsheet6;

public class MainMahasiswa {
    public static void main(String[] args) {

        //inisialisasi objek mahasiswa
        DaftarMhsPres04 list = new DaftarMhsPres04();
        Mahasiswa04 m1 = new Mahasiswa04("Nusa", 2017, 25, 3);
        Mahasiswa04 m2 = new Mahasiswa04("Rara", 2012, 19, 4);
        Mahasiswa04 m3 = new Mahasiswa04("Dompu", 2018, 19, 3.5);
        Mahasiswa04 m4 = new Mahasiswa04("Abdul", 2017, 23, 2);
        Mahasiswa04 m5 = new Mahasiswa04("Ummi", 2019, 21, 3.75);

        //penambahan mahasiswa menggunakan fungsi tambah
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        //menampilkan daftar mahasiswa sebelum sorting berdasarkan ipk
        System.out.println("Data Mahasiswa Sebelum sorting = ");
        list.tampil();

        //melakukan bubble sort dengan melakukan pengurutan ipk dari yang terbesar
        System.out.println("[Data Mahasiswa setelah sorting desc berdasarkan ipk]");
        list.BubbleShort();
        list.tampil();

        //melakukan selection sort dengan melakukan pengurutan ipk dari terkecil ke terbesar
        System.out.println("[Data Mahasiswa setelah sorting asc berdasarkan ipk]");
        System.out.println("[SELECTION SORT]");
        list.selectionSort();
        list.tampil();

        // melakukan insertion sort dengan melakukan pengurutan ipk dari terkecil ke terbesar
        System.out.println("[Data Mahasiswa setelah sorting asc berdasarkan ipk]");
        System.out.println("[INSERTION SORT]");
        list.insertionSort();
        list.tampil();
    }
}
