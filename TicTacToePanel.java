import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToePanel extends JPanel implements MouseListener {
    /*
    when a class implements an interface, it must write all of the methods in that interface
    if(TicTacToePanel instanceof MouseListener) is a way to check if TicTacToePanel has
    all of the mouse methods
     */
    Piece piece = new Piece();

    public TicTacToePanel(){
        addMouseListener(this);
        setFocusable(true);
        setBackground(Color.CYAN.darker());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        piece.paint(g);
    }

    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
}
