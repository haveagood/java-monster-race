package MonsterRace;

public class Game {
    InputGameInfo inputGameInfo;
    Stadium stadium;
    OutputGameResult outputGameResult;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void start() {
        GameInfo gameInfo = new GameInfo();

        inputGameInfo = new InputGameInfo(gameInfo);
        stadium = new Stadium(gameInfo);
        outputGameResult = new OutputGameResult(gameInfo);
    }
}
