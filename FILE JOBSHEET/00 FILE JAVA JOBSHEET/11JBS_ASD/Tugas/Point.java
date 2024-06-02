package Tugas;

public class Point {
    String pertanyaan;
    String jawaban;
    Point next;

    
    public Point(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}
