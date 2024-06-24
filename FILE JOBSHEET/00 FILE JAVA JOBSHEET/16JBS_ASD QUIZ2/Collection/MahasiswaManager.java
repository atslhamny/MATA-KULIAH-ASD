import java.util.ArrayList;
import java.util.List;

public class MahasiswaManager {
    private List<Mahasiswa> mahasiswaList;

    public MahasiswaManager() {
        mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("2314760011", "Atsilah", "2004-10-18"));
        mahasiswaList.add(new Mahasiswa("2314760012", "Afifah", "2005-03-27"));
        mahasiswaList.add(new Mahasiswa("2314760013", "Louise", "2005-02-14"));
        mahasiswaList.add(new Mahasiswa("2314760014", "Vivi", "2005-05-05"));
    }

    public void tambahMahasiswa(Mahasiswa m) {
        mahasiswaList.add(m);
    }

    public void hapusMahasiswa(String nim) {
        mahasiswaList.removeIf(m -> m.getNim().equals(nim));
    }

    public Mahasiswa bacaMahasiswa(String nim) {
        return mahasiswaList.stream()
                .filter(m -> m.getNim().equals(nim))
                .findFirst()
                .orElse(null);
    }

    public void cetakSemuaMahasiswa() {
        mahasiswaList.forEach(System.out::println);
    }
}
