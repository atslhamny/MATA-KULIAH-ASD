/**
 * Barang04
 */
public class Barang04 {

    public String kode;
    public String nama;
    public int harga;
    public int stok;


    //Pembuatan Objek untuk barang yang nantinya akan dipanggil di class transaksi 
    
    public Barang04(String kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void TampilkanBarang(){
        System.out.println("Kode Barang : " + kode 
        + " Nama Barang: " + nama 
        + " Harga Barang: " + harga 
        + " Stok Barang: " + stok);
    }

}