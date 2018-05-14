// Kcee Landon
// Tic Tac Toe Project



public class TicTacToe {

   private int row;
   private int col;

   public TicTacToe() {
      for (int i = 0; i < 3; i++) {
         System.out.println("-  -  -");
      }
   }
   
   public void place(int row, int col) {
      if (row <= 3 && row >= 0 && col <= 3 && col >= 0) {     
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col
         }
      }
   }
   
   public void display() {
   
   }
   
   public boolean gameOver() {
      
   }

}