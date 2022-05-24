import java.awt.*;

/*
a Piece is a space in the Grid that is either blank, contains an X, or contains an O
 */
public class Piece {
    private int sideLength = TicTacToe.SIDE_LENGTH / 3;
    private char value; // '-' blank, 'X', or 'O'
    private int x, y;

    public Piece(){
        this.value = '-'; // every piece starts out blank
    }

    public void paint(Graphics g){
        g.drawRect(0,0,sideLength,sideLength);
        Font font = new Font("Comic Sans", Font.BOLD, 100);
        g.setFont(font);
        g.drawString("" + value, 50, 50);
    }
}
