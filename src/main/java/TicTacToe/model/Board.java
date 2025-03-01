package TicTacToe.model;

import java.util.List;

public class Board {
    private int size;
    private List<List<BoardCell>> cells;

    public List<List<BoardCell>> getCells() {
        return cells;
    }

    public void setCells(List<List<BoardCell>> cells) {
        this.cells = cells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
