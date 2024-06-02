package Tugas;

public class ScavengerHunt {
    public static void main(String[] args) {
        LinkedList game = new LinkedList();

        game.addPoint("Apa makanan sapi ?", "rumput");
        game.addPoint("Apa warna kesukaan saya?", "hitam");
        game.addPoint("Siapakah megawati itu?", "gatau");

        game.printPoints();
    }
}
