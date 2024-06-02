package Tugas;

public class LinkedList {
    Point head;


    public LinkedList() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addPoint(String pertanyaan, String jawaban) {
        Point newPoint = new Point(pertanyaan, jawaban);

        if (head == null) {
            head = newPoint;
            return;
        }

        Point current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newPoint;
    }

    public void printPoints() {
        if (isEmpty()) {
            System.out.println("Tidak ada point dalam scavenger hunt.");
        } else {
            Point current = head;
            while (current != null) {
                System.out.println("Pertanyaan: " + current.pertanyaan);
                System.out.println("Jawaban: " + current.jawaban);
                current = current.next;
            }
        }
    }
}
