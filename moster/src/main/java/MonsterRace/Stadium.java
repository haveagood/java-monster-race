package MonsterRace;

import java.util.ArrayList;
import java.util.List;

public class Stadium {
    private List<Monster> playerList = new ArrayList<>();
    private int gameCnt;

    public void getPlayer(Monster monster) {
        this.playerList.add(monster);
    }

    public void getGameCnt(int gameCnt) {
        this.gameCnt = gameCnt;
    }
}
