package TicTacToe.model;

public class HumanPlayer extends Player {

    private User user;
    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }
}
