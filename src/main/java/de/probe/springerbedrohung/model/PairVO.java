package de.probe.springerbedrohung.model;

/**
 * VO that defines a pair of chess pieces.
 */
public class PairVO {
    private ChessPiece white;
    private ChessPiece black;

    public ChessPiece getWhite() {
        return white;
    }

    public void setWhite(ChessPiece pWhite) {
        this.white = pWhite;
    }

    public ChessPiece getBlack() {
        return black;
    }

    public void setBlack(ChessPiece pBlack) {
        this.black = pBlack;
    }
}
