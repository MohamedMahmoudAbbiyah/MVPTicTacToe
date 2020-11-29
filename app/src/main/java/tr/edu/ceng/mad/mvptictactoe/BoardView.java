package tr.edu.ceng.mad.mvptictactoe;

public interface BoardView {

    char PLAYER_1 = 'X';
    char PLAYER_2 = 'O';

    byte DRAW = 0;
    byte PLAYER_1_WINNER = 1;
    byte PLAYER_2_WINNER = 2;
    byte PLAYER_1_SYMBOL = 0;
    byte PLAYER_2_SYMBOL = 1;

    void newGame();

    void putSymbol(char symbol, byte row, byte col);

    void gameEnded(byte winner);

    void putSymbol(byte player1Symbol, byte row, byte col);

    void invalidPlay(byte row, byte col);
}
