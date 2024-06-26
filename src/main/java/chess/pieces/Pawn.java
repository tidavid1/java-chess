package chess.pieces;

import chess.pieces.enums.Color;
import chess.pieces.enums.Symbol;

public class Pawn extends Piece {

    Pawn(Color color) {
        super(color, color.equals(Color.BLACK) ? Symbol.BLACK_PAWN : Symbol.WHITE_PAWN, 1.0);
    }

}
