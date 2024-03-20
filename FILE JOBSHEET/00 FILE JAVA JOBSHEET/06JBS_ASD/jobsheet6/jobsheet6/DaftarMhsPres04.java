package jobsheet6;

public class DaftarMhsPres04 {
    Mahasiswa04 listMhs[] = new Mahasiswa04[5];
    int idx;
    //pembuatan array of object

    //pembuatan fungsi tambah yang digunakan
    // untuk menambahkan objek dari class mahasiswa
    // ke dalam atribut listmhs
    void tambah(Mahasiswa04 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    //pembuatan fungsi tampil yang digunakan 
    // untuk menampilkan data mahasiswa keseluruhan
    void tampil(){
        for (Mahasiswa04 m : listMhs) {
            m.Tampil();
            System.out.println("============================");
        }
    }

    void BubbleShort(){
        for (int i = 0; i < listMhs.length -1; i++) {
            for (int j = 1; j < listMhs.length -i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa04 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa04 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa04 tmp = listMhs[i];
            int j = i;
            // Melakukan sorting secara ascending
            // while(j>0 && listMhs[j-1].ipk > tmp.ipk){
            // Melakukan sorting secara ascending
            
            while (j > 0 && listMhs[j - 1].ipk < tmp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = tmp; //descending
        }
    }
}
