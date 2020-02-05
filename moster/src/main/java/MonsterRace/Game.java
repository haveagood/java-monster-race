package MonsterRace;

import java.util.List;
import java.util.Scanner;

public class Game {

    Scanner scanner;
    private int monsterCount;
    private int gameCount;

    public Game() {
        inputMonsterCount();
        inputGameCount();
    }

    public void setMonsterCount(int monsterCount) {
        this.monsterCount = monsterCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void inputMonsterCount() {
        scanner = new Scanner(System.in);
        String monsterCountMessage = "<스릴만점 건전한 몬스터 경주>\n" + "몬스터는 모두 몇 마리인가요?";
        System.out.println(monsterCountMessage);
        setMonsterCount(Integer.parseInt(scanner.nextLine()));
    }

    public void inputGameCount() {
        String gameCountMessage = "시도할 회수는 몇 회 인가요?";
        System.out.println(gameCountMessage);
        setGameCount(Integer.parseInt(scanner.nextLine()));
        scanner.close();
    }

    public void printResult(GameInfo gameInfo) {
        List<Monster> playerList = gameInfo.getPlayerList();
        playerList.stream()
                .forEach(monster -> {
                    System.out.println(makeDash(monster));
                });
    }

    public String makeDash(Monster monster) {
        int totalMove = monster.getTotMove();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < totalMove; i++){
            sb.append("-");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Game game = new Game();

    }
}
