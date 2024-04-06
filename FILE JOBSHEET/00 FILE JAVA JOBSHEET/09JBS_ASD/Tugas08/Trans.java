package Tugas08;

public class Trans {
    public int nomorTransaksi;
    public String tanggalPembelian;
    public int jumlahBarang;
    public double totalHarga;

    public Trans(int nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHarga) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }

    public void CetakTrans(){
        System.out.println("Nomor Transaksi: " + nomorTransaksi);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total Harga: " + totalHarga);

    }
}
