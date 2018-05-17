// Kcee Landon
// Tic Tac Toe Project



public class TicTacToe {

   private String row1;
   private String row2;
   private String row3;

   public TicTacToe() {
      row1 = "- - -";
      row2 = "- - -";
      row3 = "- - -";
   }
   
   public boolean place(int row, int col, String symbol) {
      if (row > 3 || row < 1 || col < 1 || col > 3) {
         throw new IllegalArgumentException();
      } else if (row == 1) {
         if (row1.charAt((col - 1) * 2) == '-') {
            row1 = row1.substring(0, (col - 1) * 2) + symbol + row1.substring((col - 1) * 2 + 1);
            return true;
         } else {
            return false;
         }
      } else if (row == 2) {
         if (row2.charAt((col - 1) * 2) == '-') {
            row2 = row2.substring(0, (col - 1) * 2) + symbol + row2.substring((col - 1) * 2 + 1);
            return true;
         } else {
            return false;
         }
      } else {
         if (row3.charAt((col - 1) * 2) == '-') {
            row3 = row3.substring(0, (col - 1) * 2) + symbol + row3.substring((col - 1) * 2 + 1);
            return true;
         } else {
            return false;
         }
      }
   }
   
   public String displayRow1() {
      return row1;
   }
   
   public String displayRow2() {
      return row2;
   }
   
   public String displayRow3() {
      return row3;
   }
   
   public boolean gameOver() {
      char one1 = row1.charAt(0);
      char one2 = row2.charAt(0);
      char one3 = row3.charAt(0);
      char two1 = row1.charAt(2);
      char two2 = row2.charAt(2);
      char two3 = row3.charAt(2);
      char three1 = row1.charAt(4);
      char three2 = row2.charAt(4);
      char three3 = row3.charAt(4);
      if ((one1 == one2) && (one1 == one3) && notAllDash(one1, one2, one3)) {
         return true;
      } else if ((one1 == two2) && (one1 == three3) && notAllDash(one1, two2, three3)) {
         return true;
      } else if ((one1 == two1) && (one1 == three1) && notAllDash(one1, two1, three1)) {
         return true;
      } else if ((two1 == two2) && (two1 == two3) && notAllDash(two1, two2, two3)) {
         return true;
      } else if ((three1 == three2) && (three1 == three3) && notAllDash(three1, three2, three3)) {
         return true;
      } else if ((one2 == two2) && (one2 == three2) && notAllDash(one2, two2, three2)) {
         return true;
      } else if ((one3 == two3) && (one3 == three3) && notAllDash(one3, two3, three3)) {
         return true;
      } else if ((three1 == two2) && (three1 == one3) && notAllDash(three1, two2, one3)) {
         return true;
      } else {
         return false;
      }
   }
   
   private boolean notAllDash(char c1, char c2, char c3) {
      return ((c1 != '-') && (c2 != '-') && (c3 != '-'));
   }
}