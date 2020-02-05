package MonsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stadium {

    public void playGame(GameInfo gameInfo) {
        initStadium(gameInfo);
        gameInfo.getPlayerList().stream()
                .forEach(monster ->{
                    movingMonster(monster,gameInfo.getGameCnt());
                });

    }

    public void initStadium(GameInfo gameInfo) {
        int monsterCnt = gameInfo.getMonsterCnt();
        List<Monster> tempPlayerList = new ArrayList<>();
        for(int i = 0; i < monsterCnt; i++){
            tempPlayerList.add(new Monster(i));
        }
        gameInfo.setPlayerList(tempPlayerList);
    }

    public void movingMonster(Monster monster, int gameCnt) {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        if(ranNum > 4){
            monster.setTotMove(monster.getTotMove()+1);
        }
        if(gameCnt > 0){
            movingMonster(monster,gameCnt-1);
        }
    }

}
