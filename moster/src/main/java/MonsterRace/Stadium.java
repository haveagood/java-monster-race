package MonsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stadium {
    List<Monster> playerList = new ArrayList<>();

    public Stadium(int monsterCount, int gameCount) {
        playGame(monsterCount,gameCount);
    }

    private void playGame(int monsterCount,int gameCount) {
        makePlayerList(monsterCount);
        playerList.stream()
                .forEach(monster ->{
                    movingMonster(monster, gameCount);
                });
    }

    private void makePlayerList(int monsterCount) {
        for(int i = 0; i < monsterCount; i++){
            playerList.add(new Monster(i));
        }
    }

    private void movingMonster(Monster monster, int gameCnt) {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        if (ranNum > 4) {
            monster.setTotalMove(monster.getTotalMove()+1);
        }
        if (gameCnt > 0) {
            movingMonster(monster,gameCnt-1);
        }
    }

    public void printResult() {
        playerList.stream()
                .forEach(monster -> {
                    System.out.println(makeDash(monster));
                });
    }

    public String makeDash(Monster monster) {
        int totalMove = monster.getTotalMove();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < totalMove; i++){
            sb.append("-");
        }
        return sb.toString();
    }

}
