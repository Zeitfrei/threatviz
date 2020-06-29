package de.probe.springerbedrohung.core;

import de.probe.springerbedrohung.model.PairVO;

import java.util.List;

/**
 * Visualizer class that holds all necessary visualization methods.
 * Class is final and methods are public final static to be tied to the class and accessed without a class instance.
 */
public final class Visualizer {

    /**
     * Visualizes the result of the calculation using the
     * @param pAllPairs
     * @param pBoardSize
     * @param pVisualizeMethod
     */
    public static void visualize(List<PairVO> pAllPairs, int[] pBoardSize, String pVisualizeMethod) {
        switch (pVisualizeMethod) {
            case Constants.VIS_METHOD_RAW:
                visualizeRaw(pAllPairs);
                break;
            case Constants.VIS_METHOD_ASCII:
                visualizeAscii(pAllPairs, pBoardSize);
                break;
            default:
                visualizeAscii(pAllPairs, pBoardSize);
        }
    }

    public static void visualizeRaw(List<PairVO> pAllPairs) {
        System.out.println("Pairs:");
        for (PairVO oPair : pAllPairs) {
            System.out.print("[" + oPair.getWhite().getPosition().getX() + "," + oPair.getWhite().getPosition().getY() + "]|");
            System.out.print("[" + oPair.getBlack().getPosition().getX() + "," + oPair.getBlack().getPosition().getY() + "]\n");
        }
        System.out.println("Result size: " + pAllPairs.size());
    }

    public static void visualizeAscii(List<PairVO> pAllPairs, int[] pBoardSize) {
        System.out.println("Result:");
        for (PairVO oPair : pAllPairs) {
            System.out.println("[" + oPair.getWhite().getPosition().getX() + "," +  oPair.getWhite().getPosition().getY() + "]|[" + oPair.getBlack().getPosition().getX() + "," + oPair.getBlack().getPosition().getY() + "]:");
            for (int y = pBoardSize[1] - 1; y >= 0; y--) {
                for (int x = 0; x < pBoardSize[0]; x++) {
                    if (oPair.getWhite().getPosition().getX() == x && oPair.getWhite().getPosition().getY() == y) {
                        System.out.print("W ");
                    } else if (oPair.getBlack().getPosition().getX() == x && oPair.getBlack().getPosition().getY() == y) {
                        System.out.print("B ");
                    } else {
                        System.out.print("o ");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("---\n");
        }
        System.out.println("Result size: " + pAllPairs.size());
    }
}
