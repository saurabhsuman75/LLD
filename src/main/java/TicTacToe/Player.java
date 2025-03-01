package TicTacToe;

public abstract class Player {
    private GameSymbol symbol;

     Player(GameSymbol symbol) {
         this.symbol = symbol;
     }
    public GameSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(GameSymbol symbol) {
        this.symbol = symbol;
    }
}
