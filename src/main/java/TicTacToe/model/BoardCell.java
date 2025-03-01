package TicTacToe.model;

public class BoardCell {

    private int row;
    private int col;
    private GameSymbol symbol;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public GameSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(GameSymbol symbol) {
        this.symbol = symbol;
    }
}
