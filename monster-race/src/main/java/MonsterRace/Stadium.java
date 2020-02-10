package MonsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stadium {
    List<Monster> monsters = new ArrayList<>();

    public Stadium(int monsterCount, int gameCount,List<String[]> monstersNameId) {
        makePlayerList(monstersNameId);
        playGame(gameCount);
    }

    private void playGame(int gameCount) {
        for(int i = 0; i < gameCount; i++){
            movingMonster();
        }
    }

    private void makePlayerList(List<String[]> monstersNameId) {
        monstersNameId
                .forEach(monster -> {
                    String name = monster[0];
                    String type = monster[1];
                    monsters.add(new Monster(name,type));
                });
    }

    private void movingMonster() {
        monsters
                .forEach(monster -> {
                    moving(monster);
                });
    }

    private void moving(Monster monster) {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        int ranMove = random.nextInt(100)+1;
        switch (monster.getMonsterType()) {
            case "달리기":
                monster.setTotalMove(ranNum - 4,1);
                break;
            case "비행":
                monster.setTotalMove(ranNum - 6,3);
                break;
            case "에스퍼":
                monster.setTotalMove(ranNum - 9,ranMove);
                break;
            default:
                System.out.println("올바르지 않은 타입이네요??");
                break;
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