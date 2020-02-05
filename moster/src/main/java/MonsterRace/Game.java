package MonsterRace;

public class Game {
    InputGameInfo inputGameInfo = new InputGameInfo();
    Stadium stadium = new Stadium();
    OutputGameResult outputGameResult = new OutputGameResult();

    public static void main(String[] args) {
        Game game = new Game();
        GameInfo gameInfo = new GameInfo();

        game.inputGameInfo.getGameInfo(gameInfo);
        game.stadium.playGame(gameInfo);
        game.outputGameResult.printResult(gameInfo);
    }
}
