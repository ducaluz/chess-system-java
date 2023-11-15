package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private String color;

    public ChessPiece(Board board, String color) {
        super(board);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
