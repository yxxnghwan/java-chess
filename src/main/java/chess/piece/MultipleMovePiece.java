package chess.piece;

import chess.piece.detail.Direction;
import chess.piece.detail.Team;
import chess.square.Square;
import java.util.List;

public abstract class MultipleMovePiece extends NonBlankPiece {

    protected MultipleMovePiece(final Team team, final Square square) {
        super(team, square);
    }

    @Override
    boolean canMove(final Square to) {
        final List<Direction> directions = getAvailableDirections();
        final Direction direction = Direction.findDirection(square, to);
        return directions.contains(direction);
    }
}
