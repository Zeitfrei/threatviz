package de.probe.springerbedrohung.core;

import de.probe.springerbedrohung.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator class that holds all necessary calculation methods.
 * Class is final and methods are public final static to be tied to the class and accessed without a class instance.
 */
public final class Calculator {

    /**
     * Calculates all possible pairs and returns them.
     *
     * @param pBoardSize the board size as an array for x and y coordinates
     * @param pPieceType piece name to determine which moves are possible
     * @return List of all possible pairs with the given board size and chess piece type
     */
    public static List<PairVO> calculatePairs(final int[] pBoardSize, final String pPieceType) {
        // Initialize variables depending on chess piece type
        List<PairVO> oAllPairs = new ArrayList<PairVO>();
        ChessPiece oPiece;
        switch (pPieceType.toUpperCase()) {
            case Constants.PIECE_TYPE_KNIGHT:
                oPiece = new Knight();
                break;
            default:
                oPiece = new Knight();
                break;

        }

        // iterate over boards x and y axis and calculate possible moves a chess piece can make for each field
        for (int x = 0; x < pBoardSize[0]; x++) {
            for (int y = 0; y < pBoardSize[1]; y++) {
                int[] oPositionCurr = new int[]{x, y};
                // iterate over all possible moves for the requested chess piece
                for (MoveVO oMove : oPiece.getMoves()) {
                    // calculate destination position by adding move to the pieces current position
                    int[] oPositionDest = new int[]{oPositionCurr[0] + oMove.getX(), oPositionCurr[1] + oMove.getY()};
                    // check if calculated destination position is within board boundary
                    if (oPositionDest[0] >= 0 && oPositionDest[0] < pBoardSize[0] && oPositionDest[1] >= 0 && oPositionDest[1] < pBoardSize[1]) {
                        // check if a pair is already in list either in the same order or in reverse
                        boolean bIsUnique = oAllPairs.stream().noneMatch(s -> (oPositionCurr[0] == s.getWhite().getPosition().getX() &&
                                oPositionCurr[1] == s.getWhite().getPosition().getY() &&
                                oPositionDest[0] == s.getBlack().getPosition().getX() &&
                                oPositionDest[1] == s.getBlack().getPosition().getY()) ||
                                (oPositionDest[0] == s.getWhite().getPosition().getX() &&
                                oPositionDest[1] == s.getWhite().getPosition().getY() &&
                                oPositionCurr[0] == s.getBlack().getPosition().getX() &&
                                oPositionCurr[1] == s.getBlack().getPosition().getY()));

                        if (bIsUnique) {
                            PairVO oPair = new PairVO();
                            ChessPiece oWhite = new Knight();
                            ChessPiece oBlack = new Knight();
                            oWhite.setPosition(new PositionVO(oPositionCurr[0], oPositionCurr[1]));
                            oBlack.setPosition(new PositionVO(oPositionDest[0], oPositionDest[1]));

                            oPair.setWhite(oWhite);
                            oPair.setBlack(oBlack);
                            oAllPairs.add(oPair);
                        }
                    }
                }
            }
        }
        return oAllPairs;
    }
}
