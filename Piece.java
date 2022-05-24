import java.awt.*;

/*
a Piece is a space in the Grid that is either blank, contains an X, or contains an O
 */
public class Piece {
    static final int SIDE_LENGTH = TicTacToe.SIDE_LENGTH / 3;
    private char value; // '-' blank, 'X', or 'O'
    private int[] coords;// [0] = x, [1] = y

    public Piece(){
        this.value = '-';// every piece starts out blank
        coords = {0,0};
    }
    public Piece(int x, int y){
      cords[0] = x;
      cords[1] = y;
    }

    public void paint(Graphics g){
        g.drawRect(0,0,sideLength,sideLength);
        Font font = new Font("Comic Sans", Font.BOLD, 100);
        g.setFont(font);
        g.drawString("" + value, 50, 50);
    }
}
