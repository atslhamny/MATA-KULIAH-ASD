public class Fungsi04 {
    private static final int[] hargaBunga = { 75000, 50000, 60000, 10000 };

    public static void main(String[] args) {

        //buat simpen stok
        int[][] stokBunga = {
                { 1, 10, 5, 15, 7 },
                { 2, 6, 11, 9, 12 },
                { 3, 2, 10, 10, 5 },
                { 4, 5, 7, 12, 9 }
        };

        // ngitung pendapatan cabang ygy
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatanCabang = hitungPendapatanCabang(stokBunga[i]);
            System.out.println("Cabang " + stokBunga[i][0] + ": Rp " + pendapatanCabang);
        }

        // buat ngitung stok
        System.out.println("\nJumlah stock setiap jenis bunga pada cabang Royal Garden:");
        int[] stokCabang = hitungStokCabang(stokBunga);
        for (int i = 0; i < stokCabang.length; i++) {
            System.out.println("Stok Bunga " + NamaBunga(i) + ": " + stokCabang[i]);
        }
    }

    private static int hitungPendapatanCabang(int[] stockCabang) {
        int totalPendapatan = 0;
        for (int i = 1; i < stockCabang.length; i++) {
            totalPendapatan += stockCabang[i] * hargaBunga[i - 1];
        }
        return totalPendapatan;
    }

    private static int[] hitungStokCabang(int[][] stockBunga) {
        int[] totalStock = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 1; j < stockBunga[i].length; j++) {
                totalStock[j - 1] += stockBunga[i][j];
            }
        }
        return totalStock;
    }

    private static String NamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
