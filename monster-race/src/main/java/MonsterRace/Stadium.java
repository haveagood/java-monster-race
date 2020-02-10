package MonsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stadium {
    List<Monster> monsters = new ArrayList<>();

    public Stadium(int monsterCount, int gameCount,List<String[]> monstersNameId) {
        makePlayerList(monstersNameId);
        playGame(monsterCount, gameCount);
    }

    private void playGame(int monsterCount, int gameCount) {
        for (int i = 0; i < monsters.size(); i++) {
            movingMonster(monsters.get(i), gameCount);
        }
    }

    private void makePlayerList(List<String[]> monstersNameId) {
        monstersNameId.stream()
                .forEach(monster ->{
                    String name = monster[0];
                    String type = monster[1];
                    monsters.add(name,type);
                });
    }

    private void movingMonster(Monster monster, int gameCnt) {
        while (gameCnt > 0) {
            moving(monster);
            gameCnt--;
        }
    }

    private void moving(Monster monster) {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        if (ranNum > 4) {
            monster.setTotalMove(monster.getTotalMove() + 1);
        }
    }

    public void printResult() {
        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(makeDash(monsters.get(i)));
        }
    }

    private String makeDash(Monster monster) {
        int totalMove = monster.getTotalMove();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalMove; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

}