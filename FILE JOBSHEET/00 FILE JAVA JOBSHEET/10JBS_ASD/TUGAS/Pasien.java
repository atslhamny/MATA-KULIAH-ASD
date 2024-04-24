package TUGAS;

public class Pasien {
    private String nama;
    private String noID;
    private char jenisKelamin;
    private int umur;

    public Pasien(String nama, String noID, char jenisKelamin, int umur) {
        this.nama = nama;
        this.noID = noID;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNoID() {
        return noID;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }
}
