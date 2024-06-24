
package LinkedList;

public class LinkedListMahasiswa {
    private Node head;

    public LinkedListMahasiswa() {
        this.head = null;
        // Menambahkan 4 data awal
        tambahMahasiswa(new Mahasiswa("2314760011", "Atsilah", "2004-10-18"));
        tambahMahasiswa(new Mahasiswa("2314760012", "Afifah", "2005-03-27"));
        tambahMahasiswa(new Mahasiswa("2314760013", "Louise", "2005-02-14"));
        tambahMahasiswa(new Mahasiswa("2314760014", "Vivi", "2005-05-05"));
    }

    public void tambahMahasiswa(Mahasiswa m) {
        Node newNode = new Node(m);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void hapusMahasiswa(String nim) {
        if (head == null)
            return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa bacaMahasiswa(String nim) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
