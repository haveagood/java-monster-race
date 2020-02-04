package MonsterRace;

import java.util.ArrayList;
import java.util.List;

public class Stadium {
    private List<Monster> playerList = new ArrayList<>();
    private int gameCnt;

    public void playGame(Game game) {
        initStadium(game);

    }

    public void initStadium(Game game) {
        int monsterCnt = game.getMonsterCnt();
        this.gameCnt = game.getGameCnt();
        for(int i = 0; i < monsterCnt; i++){
            this.playerList.add(new Monster(i));
        }
    }

    public void movingMonster() {

    }

}
