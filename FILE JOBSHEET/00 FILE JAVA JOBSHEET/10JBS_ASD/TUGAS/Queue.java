package TUGAS;

public class Queue {
    private Pasien[] antrian;
    private int front;
    private int rear;
    private int size;
    private int max;

    public Queue(int max) {
        this.max = max;
        antrian = new Pasien[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien pasien) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = pasien;
            size++;
        } else {
            System.out.println("Antrian penuh");
        }
    }

    public Pasien dequeue() {
        if (!isEmpty()) {
            Pasien temp = antrian[front];
            front = (front + 1) % max;
            size--;
            return temp;
        } else {
            System.out.println("Antrian kosong");
            return null;
        }
    }

    public void print() {
        int count = size;
        int index = front;
        while (count > 0) {
            System.out.println(antrian[index].getNama() + " - " + antrian[index].getNoID());
            index = (index + 1) % max;
            count--;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(antrian[front].getNama());
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println(antrian[rear].getNama());
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekPosition(String nama) {
        int index = front;
        int count = size;
        int position = 1;
        while (count > 0) {
            if (antrian[index].getNama().equals(nama)) {
                System.out.println("Posisi " + nama + " adalah: " + position);
                return;
            }
            index = (index + 1) % max;
            count--;
            position++;
        }
        System.out.println(nama + " tidak ditemukan dalam antrian.");
    }

    public void daftarPasien() {
        print();
    }
}