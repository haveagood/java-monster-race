package MonsterRace;

import java.util.ArrayList;
import java.util.List;

public class GameInfo {
    private int monsterCnt;
    private int gameCnt;
    private List<Monster> playerList = new ArrayList<>();

    public void setMonsterCnt(String monsterCnt) {
        this.monsterCnt = Integer.parseInt(monsterCnt);
    }

    public void setGameCnt(String gameCnt) {
        this.gameCnt = Integer.parseInt(gameCnt);
    }

    public void setPlayerList(List<Monster> playerList) {
        this.playerList = playerList;
    }

    public List<Monster> getPlayerList() { return this.playerList; }

    public int getMonsterCnt() {
        return this.monsterCnt;
    }

    public int getGameCnt() {
        return this.gameCnt;
    }

}
