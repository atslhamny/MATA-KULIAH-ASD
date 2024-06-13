package UAS04;

//Atsilah Amany Putri Harsuma
//2341760011
public class transaksiPajak04 {
    int kode,bulanBayar,nominalBayar,denda;
    kendaraan04 data;
    transaksiPajak04 next;

    transaksiPajak04(kendaraan04 data, int kode, int bulanBayar, int nominalBayar, int denda, transaksiPajak04 next){
        this.data = data;
        this.kode = kode;
        this.bulanBayar = bulanBayar;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.next = next;
    }
}
