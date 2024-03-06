
public class Transaksi04 {

    Barang04[] pembelians;

    Transaksi04(Barang04[] pembelians) {
        this.pembelians = pembelians;
    }

    void TampilkanBarang(){
        System.out.println("Daftar Barang Toko: ");
        for (Barang04 barang04 : pembelians) {
            barang04.TampilkanBarang();
        }
    }

    void TampilkanBeli(){
        System.out.println("Daftar Barang Yang Dibeli: ");
        for (Barang04 barang04 : pembelians) {
            barang04.TampilkanBarang();
        }
    }

    void Pembelian(String pembelian){
        for (Barang04 barang04 : pembelians) {
            if (barang04.kode.equals(pembelian)) {
                System.out.println("Pembelian Barang Berhasil");
                barang04.TampilkanBarang();
            }else{
                break;
            }
        }
    }
}
