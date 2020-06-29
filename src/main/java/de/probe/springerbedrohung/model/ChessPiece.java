package de.probe.springerbedrohung.model;

import java.util.List;

/**
 * Super class chess piece defines a generic chess piece.
 */
public class ChessPiece {

    private String pieceType;
    private PositionVO position;
    private List<MoveVO> moves;

    public ChessPiece() {
    }

    public ChessPiece(String pieceType, PositionVO position, List<MoveVO> moves) {
        this.pieceType = pieceType;
        this.position = position;
        this.moves = moves;
    }

    public String getPieceType() {
        return pieceType;
    }

    public void setPieceType(String pieceType) {
        this.pieceType = pieceType;
    }

    public PositionVO getPosition() {
        return position;
    }

    public void setPosition(PositionVO position) {
        this.position = position;
    }

    public List<MoveVO> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveVO> moves) {
        this.moves = moves;
    }
}

