package Praktikum3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {

    List<mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(mahasiswa... Mahasiswa) {
        mahasiswas.addAll(Arrays.asList(Mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+ mhs.toString());
        });
    }

    int binarySearch(String nim){
    return Collections.binarySearch(mahasiswas, new mahasiswa(nim, null, null), new Comparator<mahasiswa>(){
        public int compare(mahasiswa o1, mahasiswa o2){
            return o1.nim.compareTo(o2.nim);
        }
    });
    }

    void ascSort() {
        Collections.sort(mahasiswas, new Comparator<mahasiswa>() {
            @Override
            public int compare(mahasiswa o1, mahasiswa o2) {
                return o1.nim.compareTo(o2.nim);
            }
        });
    }

    void dscSort() {
        Collections.reverse(mahasiswas);
    }
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        mahasiswa m = new mahasiswa("201234", "Noureen", "021xx1");
        mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
        mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\n----------Data Diurut Secara Ascending Collections--------------");
        lm.ascSort();
        lm.tampil();

        // dsc
        System.out.println("\n----------Data Diurut secara Descending Collections------------");
        lm.dscSort();
        lm.tampil();
    }
}