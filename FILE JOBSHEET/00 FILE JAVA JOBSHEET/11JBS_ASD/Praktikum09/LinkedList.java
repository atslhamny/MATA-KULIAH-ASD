/**
 * LinkedList
 */
public class LinkedList {

    Node head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            System.out.print("isi linked list: ");
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()) {
            head = newNode;
        }else{
            Node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node newNode = new Node(input, null);

        if (!isEmpty()) {
            Node currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                } 
            } while (currentNode != null);
        }else{
            System.out.print("Linked List Kosong");
        }
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
    
        Node newNode = new Node(input, null);
    
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            int currentIndex = 0;
    
            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            } else {
                System.out.println("Index melebihi linked list");
            }
        }
    }

    public int getData(int index){
        if (index < 0 || isEmpty()) {
            System.out.println("linked list kosong");
            return -1;
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode.next == null) {
                System.out.println("Index melebihi linked list");
                return -1; 
            }
            currentNode = currentNode.next;
        }
        return currentNode.data;

    }

    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if (!isEmpty()) {
            head = head.next;
        }else{
            System.out.println("Linked List kosong");
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }else if(head.next == null){
            head = null;
        }else{
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key){
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        }else if(head.data == key){
            removeFirst();
        }else{
            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("linked list kosong");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode != null && currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        } else {
            System.out.println("Index melebihi linked list");
        }
    }

    public void insertBefore(int key, int input){
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (head.data == key) {
            addFirst(input);
            return;
        }

        Node newNode = new Node(input, null);
        Node currentNode = head;

        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }

        if (currentNode.next == null) {
            System.out.println("Node dengan data " + key + " tidak ditemukan");
        }else{
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }
}