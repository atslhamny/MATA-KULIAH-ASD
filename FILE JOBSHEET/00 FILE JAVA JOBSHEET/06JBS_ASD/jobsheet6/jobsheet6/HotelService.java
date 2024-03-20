package jobsheet6;

public class HotelService {
    Hotel04 rooms[] = new Hotel04[4];
    int index;

    void tambah(Hotel04 H){
        if (index < rooms.length) {
            rooms[index] = H;
            index++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void TampilAll(){
        for (Hotel04 H : rooms) {
            H.TampilAll();
        }
    }

    void bubbleSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel04 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga > rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel04 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
