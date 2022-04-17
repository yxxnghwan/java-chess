package chess.piece.detail;


import java.util.List;

public enum Direction {

    N(0, 1),
    NE(1, 1),
    E(1, 0),
    SE(1, -1),
    S(0, -1),
    SW(-1, -1),
    W(-1, 0),
    NW(-1, 1),

    NNE(1, 2),
    ENE(2, 1),
    ESE(2, -1),
    SSE(1, -2),
    SSW(-1, -2),
    WSW(-2, -1),
    WNW(-2, 1),
    NNW(-1, 2),
    NONE(0, 0);

    private final int xDegree;
    private final int yDegree;

    Direction(final int xDegree, final int yDegree) {
        this.xDegree = xDegree;
        this.yDegree = yDegree;
    }

    public static List<Direction> getWhitePawnDirections() {
        return List.of(N, NW, NE);
    }

    public static List<Direction> getBlackPawnDirections() {
        return List.of(S, SW, SE);
    }

    public static List<Direction> getEveryDirections() {
        return List.of(N, NE, E, SE, S, SW, W, NW);
    }

    public static List<Direction> getVerticalAndHorizontalDirections() {
        return List.of(N, E, S, W);
    }

    public static List<Direction> getDiagonalDirections() {
        return List.of(NW, NE, SE, SW);
    }

    public static List<Direction> getKnightDirections() {
        return List.of(NNE, ENE, ESE, SSE, SSW, WSW, WNW, NNW);
    }

    public int getXDegree() {
        return xDegree;
    }

    public int getYDegree() {
        return yDegree;
    }
}


