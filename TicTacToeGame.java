// Kcee Landon
// TIC TAC TOE GAME
// Main Game for TicTacToe

import java.util.*;

public class TicTacToeGame {

   public static void main(String[] args) {
      TicTacToe init = new TicTacToe();
      Scanner input = new Scanner(System.in);
      boolean player = true;
      while (!init.gameOver()) {
         System.out.println(init.displayRow1());
         System.out.println(init.displayRow2());
         System.out.println(init.displayRow3());
         if (player) {
            String icon = "x";
            System.out.print("What row would you like to place your " + icon + " in (1 - 3)? ");
            int row = input.nextInt();
            System.out.print("What column would you like to place your " + icon + " in (1 - 3)? ");
            int col = input.nextInt();
            if (init.place(row, col, icon)) {
               init.place(row, col, icon);
               player = !player;
            }
         } else {
            String icon = "o";
            System.out.print("What row would you like to place your " + icon + " in (1 - 3)?");
            int row = input.nextInt();
            System.out.print("What column would you like to place your " + icon + " in (1 - 3)?");
            int col = input.nextInt();
            if (init.place(row, col, icon)) {
               init.place(row, col, icon);
               player = !player;
            }
         }
      }
      System.out.println(init.displayRow1());
      System.out.println(init.displayRow2());
      System.out.println(init.displayRow3());
      System.out.println();
      System.out.println("GAME OVER");
   }
}