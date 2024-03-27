package TUGAS;

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

    public int findBinarySearch(String cari, int i, int j) {
    int left = 0;
    int right = listMhs.length - 1;
    int count = 0; 

    while (left <= right) {
        int mid = left + (right - left) / 2;
        int cmp = listMhs[mid].nama.compareTo(cari);

        if (cmp == 0) {
            int temp = mid;
            while (temp >= left && listMhs[temp].nama.equals(cari)) {
                count++;
                temp--;
            }
            temp = mid + 1;
            while (temp <= right && listMhs[temp].nama.equals(cari)) {
                count++;
                temp++;
            }
            return count > 1 ? -2 : mid;
        }
        else if (cmp > 0) {
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
    }
    return -1;
}


    public void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + nama + " tidak ditemukan");
        }
    }

    public void tampilData(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Nama\t : " + nama);
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + nama + " tidak ditemukan");
        }
    }

}
