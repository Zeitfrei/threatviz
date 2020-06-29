package de.probe.springerbedrohung.model;

import de.probe.springerbedrohung.core.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Chess piece knight to easily instantiate a new knight object with the default set of moves and piece type for this specific chess piece.
 */
public class Knight extends ChessPiece{
    public Knight() {
        // initialize set of moves for knight.
        List<MoveVO> oMoves = new ArrayList<MoveVO>();
        oMoves.add(new MoveVO(-2,-1));
        oMoves.add(new MoveVO(-2,+1));
        oMoves.add(new MoveVO(+2,-1));
        oMoves.add(new MoveVO(+2,+1));
        oMoves.add(new MoveVO(-1,-2));
        oMoves.add(new MoveVO(+1,-2));
        oMoves.add(new MoveVO(-1,+2));
        oMoves.add(new MoveVO(+1,-2));

        this.setPieceType(Constants.PIECE_TYPE_KNIGHT);
        this.setPosition(new PositionVO(0,0));
        this.setMoves(oMoves);
    }
}
