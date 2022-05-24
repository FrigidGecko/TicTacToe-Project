import javax.swing.*;

public class TicTacToe {
    public static final int SIDE_LENGTH = 600;
    public static void main(String[] args){
        JFrame window = new JFrame("Tic Tac Toe");
        window.setSize(SIDE_LENGTH, SIDE_LENGTH + 28); // 28 menu bar height
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new TicTacToePanel());
        window.setVisible(true);
    }
}
