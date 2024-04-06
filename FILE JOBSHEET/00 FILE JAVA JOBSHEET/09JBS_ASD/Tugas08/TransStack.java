package Tugas08;

public class TransStack {
    public int size = 8;
    public int top;
    public Trans[] data;

    public TransStack() {
        top = -1;
        data = new Trans[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(Trans transaksi) {
        if (!isFull()) {
            data[++top] = transaksi;
            System.out.println("Struk belanja telah dimasukkan ke dalam stack");
        } else {
            System.out.println("STACK PENUH");
        }
    }

    public Trans pop() {
        if (!isEmpty()) {
            System.out.println("Struk belanja yang diambil:");
            return data[top--];
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }

    public Trans peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack masih kosong");
            return null;
        }
    }

    public void display() {
        if (!isEmpty()) {
            System.out.println("Informasi struk belanja yang masih tersimpan di dalam stack:");
            for (int i = top; i >= 0; i--) {
                data[i].CetakTrans();
                System.out.println();
            }
        } else {
            System.out.println("Stack kosong");
        }
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
