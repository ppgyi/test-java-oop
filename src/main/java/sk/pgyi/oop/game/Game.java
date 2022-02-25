package sk.pgyi.oop.game;

import sk.pgyi.oop.game.tiles.MineRevealedException;
import sk.pgyi.oop.utility.KeyboardInput;

public class Game {

    private Board board;

    public Game(){
       this.board = new Board();
    }

    public void play(){

        try {
            while (true){
                System.out.println(this.board.draw());
                this.board.reveal(getNextMove());
            }
        } catch (MineRevealedException e) {
            System.out.println("You stepped on a mine!");
            System.out.println(this.board.draw());
        }
    }

    private Move getNextMove(){
        // namiesto String.format staci zavolat metodu printf
//        System.out.printf
//                ("Enter row (a-%s)",
//                        (char)('a' + Board.BOARD_SIZE));
        char row = KeyboardInput.readChar(String.format("Enter row (a-%s)",
                (char)('a' + Board.BOARD_SIZE - 1)));
        int col = KeyboardInput.readInt(String.format("Enter column (0-%d)",
                Board.BOARD_SIZE - 1));
        return new Move(col, row);
    }
}
