package MonsterRace;

import java.util.*;
import static MonsterRace.MonsterType.*;

public class Stadium {
    List<Monster> monsters = new ArrayList<>();
    List<String> monsterNames = new ArrayList<>();
    List<Integer> monstertotMoves = new ArrayList<>();

    public Stadium(int gameCount, List<String[]> monstersNameId) {
        makePlayerList(monstersNameId);
        playGame(gameCount);
    }

    private void playGame(int gameCount) {
        for (int i = 0; i < gameCount; i++) {
            movingMonster();
        }
    }

    private void makePlayerList(List<String[]> monstersNameId) {
        monstersNameId
                .forEach(monster -> {
                    String name = monster[0];
                    String type = monster[1];
                    monsters.add(makeMonsterClass(name, type));
                });
    }

    private Monster makeMonsterClass(String name, String type) {
        if (AIR.getmonsterType().equals(type)) {
            return new Air(name, type);
        }
        if (RUN.getmonsterType().equals(type)) {
            return new Run(name, type);
        }
        if (ESPER.getmonsterType().equals(type)) {
            return new Esper(name, type);
        }
        return null;
    }

    private void movingMonster() {
        Random random = new Random();
        int ranNum = random.nextInt(10);

        monsters.forEach(monster -> {
            moving(monster, ranNum);
        });
    }

    private void moving(Monster monster, int ranNum) {
        monster.setTotalMonsterMove(ranNum);
    }

    public void printResult() {
        StringBuilder sb = new StringBuilder();
        monsters.forEach(monster -> {
            setMonsterNameMove(monster);
            sb.append(monster.getMonsterName());
            sb.append(" [");
            sb.append(monster.getMonsterType());
            sb.append("] : ");
            sb.append(makeDash(monster));
            sb.append("\n");
        });
        System.out.println(sb.toString());
        findWinner();
    }

    private StringBuilder makeDash(Monster monster) {
        int totalMove = monster.getTotalMove();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalMove; i++) {
            sb.append("-");
        }
        return sb;
    }

    private void setMonsterNameMove(Monster monster) {
        monsterNames.add(monster.getMonsterName());
        monstertotMoves.add(monster.getTotalMove());
    }

    private void findWinner() {
        int maxMove = 0;
        List<String> winners = new ArrayList<>();

        for (int i = 0; i < monstertotMoves.size(); i++) {
            if (monstertotMoves.get(i) > maxMove) {
                winners.clear();
                maxMove = monstertotMoves.get(i);
            }

            if (monstertotMoves.get(i) == maxMove) {
                winners.add(monsterNames.get(i));
            }
        }
        System.out.println("최종 승자는 : " + winners.toString() + "입니다.");
    }
}