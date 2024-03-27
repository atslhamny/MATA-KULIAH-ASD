package minggu7;

public class PencarianMhs04 {
    Mahasiswa04 listMhs[];
    int idx;

    void tambah(Mahasiswa04 m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil(){
        for (Mahasiswa04 m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FinBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/ 2;
            if (cari == listMhs[mid].nim) {
                return (mid);

            }else if(listMhs[mid].nim > cari){
                return FinBinarySearch(cari, left, mid -1);
            }else{
                return FinBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FinBinarySearchDesc(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);

            } else if (listMhs[mid].nim < cari) {
                return FinBinarySearchDesc(cari, left, mid - 1);
            } else {
                return FinBinarySearchDesc(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks "+ pos);

        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
