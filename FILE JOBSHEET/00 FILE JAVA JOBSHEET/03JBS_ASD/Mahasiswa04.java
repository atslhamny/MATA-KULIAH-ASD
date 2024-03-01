public class Mahasiswa04 {
    public String nama;
    public String Nim;
    public char jenkel;
    public double IPK;

    public Mahasiswa04(String nama, String nim, char jeniskelamin, double ipk){
       this.nama = nama;
       this.Nim = nim;
       this.jenkel = jeniskelamin;
       this.IPK = ipk;

    }
    
    public void cetakInfo(){
        System.out.println("NAMA: " + nama + 
        ", Jenis Kelamin: " + jenkel + 
        ", NIM: " + Nim + 
        ", Niai IPK: " + IPK);
    }
}
