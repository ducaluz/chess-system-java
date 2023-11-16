package chess;

import java.io.Serial;

public class ChessException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1l;

    public ChessException(String msg) {
        super(msg);
    }
}
