package MonsterRace;

public class MonsterTemp {
    private String monsterName;
    private String monsterType;
    private int totalMove;

    public MonsterTemp(String monsterName, String monsterType) {
        this.monsterName = monsterName;
        this.monsterType = monsterType;
    }

    public int getTotalMove() {
        return totalMove;
    }

    public void setTotalMove(int ranNum, int ranMove) {
        if (ranNum >= 0) {
            totalMove += ranMove;
        }
    }

    public String getMonsterName() {
        return monsterName;
    }

    public String getMonsterType() {
        return monsterType;
    }
}