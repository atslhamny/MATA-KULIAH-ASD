package UAS04;

//Atsilah Amany Putri Harsuma
//2341760011
import java.util.Scanner;

public class SLL04 {
    Scanner sc = new Scanner(System.in);
    node04 head;
    node04 tail;
    kendaraan04 kendaraan;
    transaksiPajak04 h;
    transaksiPajak04 t;
    int tarif, total, denda, totalAkhir, kode=0;

    public boolean isEmpty(){
        return head==null;
    }

    public boolean isEmptyTrfPajak(){
        return h == null;
    }

    public void addFirst(kendaraan04 input){
        node04 nodeInput = new node04(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        }else{
            nodeInput.next = head;
            head = nodeInput;
        }
    }

    public void addLast(kendaraan04 input){
        node04 nodeInput = new node04(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        }else{
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }

    public void addLastTrfPajak(kendaraan04 input, int kode, int nominalBayar, int denda, int bulanBayar){
        transaksiPajak04 pajak = new transaksiPajak04(input, kode, bulanBayar, nominalBayar, denda, null);
        if (isEmptyTrfPajak()) {
            h = pajak;
            t = pajak;
        }else{
            t.next = pajak;
            t = pajak;
        }
    }

    public void print(){
        if (!isEmpty()) {
            node04 tmp = head;
            System.out.println("No TNKB\t" + "Nama\t" + "Jenis\t" + "CC\t" + "Tahun\t" + "Bulan\t");
            while (tmp != null) {
                System.out.print(tmp.data.no_tnkb+"\t");
                System.out.print(tmp.data.nama + "\t");
                System.out.print(tmp.data.jenis + "\t");
                System.out.print(tmp.data.cc + "\t");
                System.out.print(tmp.data.tahun + "\t");
                System.out.print(tmp.data.bulan + "\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("");
        }
        else{
            System.out.println("Linked List Masih Kosong");
        }
    }

    public void sortByName() {
        if (isEmptyTrfPajak() || h == t) {
            return; // Tidak ada atau hanya satu elemen, tidak perlu diurutkan
        }

        boolean swapped;
        transaksiPajak04 current;
        transaksiPajak04 prev = null;

        do {
            swapped = false;
            current = h;

            while (current.next != prev) {
                if (current.data.nama.compareTo(current.next.data.nama) > 0) {
                    // Tukar node
                    transaksiPajak04 temp = current;
                    current = current.next;
                    current.next = temp;
                    swapped = true;
                }
                current = current.next;
            }
            prev = current;
        } while (swapped);
    }

    public void printTrfPajak() {
        if (!isEmptyTrfPajak()) {
            transaksiPajak04 tmp = h;
            System.out.println("Daftar Transaksi Pembayaran Pajak");
            System.out.print("NO TNKB\t");
            System.out.print("Kode\t");
            System.out.print("Nominal Bayar\t");
            System.out.print("Denda\t");
            System.out.print("Bulan Bayar\t");

            while (tmp != null) {
                System.out.println("");
                System.out.print(tmp.data.no_tnkb + "\t");
                System.out.print(tmp.kode + "\t");
                System.out.print(tmp.nominalBayar + "\t");
                System.out.print(tmp.denda + "\t");
                System.out.print(tmp.bulanBayar + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked Listt Masik Kosong");
        }
    }

    public boolean denda(int no_tnkb){
        node04 tmp = head;
        while (tmp != null) {
            if (tmp.data.no_tnkb == no_tnkb) {
                kode++;
                System.out.println("List Data");
                System.out.print("Jenis Kendaraan: ");
                System.out.println("Roda " + tmp.data.jenis);
                System.out.print("CC Kendaraan: ");
                System.out.println(tmp.data.cc + "CC");

                if (tmp.data.jenis == 2) {
                    if (tmp.data.cc < 100) {
                        System.out.println("Tarif pajak adalah = 100000");
                        tarif = 100000;
                    } else if (tmp.data.cc >= 100 && tmp.data.cc <= 250) {
                        System.out.println("Tarik pajak adalah = 250000");
                        tarif = 250000;
                    } else if (tmp.data.cc > 250) {
                        System.out.println("Tarik pajak adalah = 500000");
                        tarif = 500000;
                    }
                } else if (tmp.data.jenis == 4) {
                    if (tmp.data.cc < 1000) {
                        System.out.println("tarif pajak adalah = 750000");
                        tarif = 750000;
                    } else if (tmp.data.cc >= 1000 && tmp.data.cc <= 2500) {
                        System.out.println("Tarik pajak adalah = 1000000");
                        tarif = 1000000;
                    } else if (tmp.data.cc > 2500) {
                        System.out.println("Tarik pajak adalah = 1500000");
                        tarif = 1500000;
                    }
                }
                System.out.print("Bulan wajib bayar\t");
                System.out.println("");
                System.out.println("Bulan: " + tmp.data.bulan);
                System.out.println("Bulan Bayar");
                int bayar = sc.nextInt();
                int byr= bayar-tmp.data.bulan;
                System.out.println("Telat Bayar " + byr + " Bulan");
                if (byr <= 3) {
                    System.out.println("Denda 50000");
                    denda = 50000;
                    total = tarif + 50000;
                }else{
                    total= tarif*50000;
                }
                addLastTrfPajak(tmp.data, kode, tarif, denda, bayar);
                totalAkhir += total;
                return true;
            }
                tmp = tmp.next;
            }
    
            System.out.println("Data tidak ditemukan");
            return false;
        }
    }