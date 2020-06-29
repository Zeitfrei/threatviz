package de.probe.springerbedrohung.core;

import de.probe.springerbedrohung.model.PairVO;

import java.util.List;

/**
 * Main class of "Springerbedrohung".
 * springerbedrohung is a program to solve for a given board size and chess piece all possible pairs of chess pieces where they are a threat to one another.
 */
public class Main {
    public static void main(String[] args){
        int[] oBoard;
        String sPieceType;
        String sVisMethod;

        // initialize either from program arguments or from default values
        if (args.length == 4) {
            oBoard = new int[]{Integer.parseInt(args[0]),Integer.parseInt(args[1])};
            sPieceType = args[2];
            sVisMethod = args[3];
        } else if (args.length == 3) {
            oBoard = new int[]{Integer.parseInt(args[0]),Integer.parseInt(args[1])};
            sPieceType = args[2];
            sVisMethod = "ascii";
        } else {
            oBoard = Constants.DEFAULT_BOARD_SIZE;
            sPieceType = Constants.DEFAULT_PIECE_TYPE;
            sVisMethod = Constants.DEFAULT_VIS_METHOD;
        }

        // calculate all possible pairs of chess pieces
        List<PairVO> oAllPairs = Calculator.calculatePairs(oBoard, sPieceType);

        // visualize result with the given method (raw or ascii)
        Visualizer.visualize(oAllPairs, oBoard, sVisMethod);
    }
}
