package MonsterRace;

import java.util.ArrayList;
import java.util.List;

public class GameInfo {
    private int monsterCnt;
    private int gameCnt;
    private List<Monster> playerList = new ArrayList<>();

    public List<Monster> getPlayerList() {
        return this.playerList;
    }

    public void setPlayerList(List<Monster> playerList) {
        this.playerList = playerList;
    }

    public int getMonsterCnt() {
        return this.monsterCnt;
    }

    public void setMonsterCnt(String monsterCnt) {
        this.monsterCnt = Integer.parseInt(monsterCnt);
    }

    public int getGameCnt() {
        return this.gameCnt;
    }

    public void setGameCnt(String gameCnt) {
        this.gameCnt = Integer.parseInt(gameCnt);
    }

}
