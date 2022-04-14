package chess.piece;

import chess.piece.detail.Direction;
import chess.piece.detail.Team;
import chess.square.Square;
import java.util.List;

public class Queen extends MultipleMovePiece {

    public Queen(final Team team, final Square square) {
        super(team, square);
    }

    @Override
    List<Direction> getAvailableDirections() {
        return Direction.getEveryDirections();
    }
}
