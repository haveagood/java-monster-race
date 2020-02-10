package MonsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Scanner scanner;
    private int monsterCount;
    private int gameCount;
    private List<String[]> monstersNameId = new ArrayList<>();

    public Game() {
        scanner = new Scanner(System.in);
        inputMonsterCount();
        inputMonsterNameId();
        inputGameCount();
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        Stadium stadium = game.createStadium();
        stadium.printResult();
    }

    private Stadium createStadium() {
        return new Stadium(monsterCount, gameCount);
    }

    private void inputMonsterCount() {
        String monsterCountMessage = "<스릴만점 건전한 몬스터 경주>\n몬스터는 모두 몇 마리인가요?";
        System.out.println(monsterCountMessage);
        monsterCount = Integer.parseInt(scanner.nextLine());
    }

    private void inputMonsterNameId() {
        String monsterNameIdMessage = "경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분).";
        System.out.println(monsterNameIdMessage);
        for(int i = 0; i < monsterCount; i++) {
            monstersNameId.add(scanner.nextLine().split(","));
        }
    }

    private void inputGameCount() {
        String gameCountMessage = "시도할 회수는 몇 회 인가요?";
        System.out.println(gameCountMessage);
        gameCount = Integer.parseInt(scanner.nextLine());
    }
}