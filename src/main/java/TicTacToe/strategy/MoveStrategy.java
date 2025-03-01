package TicTacToe.strategy;

import TicTacToe.model.Board;
import TicTacToe.model.BoardCell;

public interface MoveStrategy {
    BoardCell makeMove(Board board);
}
