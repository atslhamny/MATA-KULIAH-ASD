/**
 * Stack04
 */
public class Stack04 {

    int data[];
    int size;
    int top;

    public Stack04(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void push(int dt){
        if (!isFull()) {
            top++;
            data[top] = dt;
        }else{
            System.out.println("STACK PENUH");
        }
    }

    public void pop(){
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("data yang dikeluarkan dari stack: " + x);

        }else{
            System.out.println("stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("elemen teratas stack: " + data[top]);
    }

    public void print(){
        System.out.println("isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("stack sudah dikosongkan");
        }else{
            System.out.println("stack masih kosong");
        }
    }
}