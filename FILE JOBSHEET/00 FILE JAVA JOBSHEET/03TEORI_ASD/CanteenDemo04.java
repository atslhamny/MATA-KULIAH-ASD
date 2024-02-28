/**
 * CanteenDemo04
 */
public class CanteenDemo04 {

    public static void main(String[] args) {

        Item04 item1 = new Item04();
        item1.name = "Pecel";
        item1.price = 10000;
        item1.stock = 10;

        Item04 item2 = new Item04();
        item2.name = "Bubur";
        item2.price = 11000;
        item2.stock = 12;

        Item04 item3 = new Item04();
        item3.name = "Punel";
        item3.price = 20000;
        item3.stock = 3;

        item1.displayInfo();
        item2.displayInfo();
        item3.displayInfo();

    }
}