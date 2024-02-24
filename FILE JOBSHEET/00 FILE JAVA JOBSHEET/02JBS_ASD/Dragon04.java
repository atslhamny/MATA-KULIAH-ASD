public class Dragon04 {

    int x, y, width, height;

    public static void main(String[] args) {
        
        Dragon04 dragon = new Dragon04(800, 600, 100, 100);
                                                            
        dragon.moveLeft();
        dragon.moveUp();
        dragon.moveRight();
        dragon.moveDown();
    }
    
    //ATSILAH 04

    public Dragon04(int Widht, int Height, int mulaiX, int mulaiY){
        x = mulaiX;
        y = mulaiY;
        width = Widht;
        height = Height;

    }

    void moveLeft(){
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveRight(){
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }

    }

    void moveUp(){
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }

    }

    void moveDown(){
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void detectCollision(){
        System.out.println("GAME OVER");
    }
}
