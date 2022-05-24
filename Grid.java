public class Grid{
    private Piece[][] board;
    private int rows, columns = 3;
	
  public Grid(){
    board = new Piece[rows][columns];
      for(int r = 0; r < board.length; r++){
        for(int c = 0; c < board[r].length; c++){
          int x = Piece.SIDE_LENGTH * r;
          int y = Piece.SIDE_LENGTH * c;
          board[r][c] = new Piece(x, y);
        }
      }
  }

	public void paint(Graphics g){

	}
	
	
}
