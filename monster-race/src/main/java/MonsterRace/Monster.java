package MonsterRace;

public class Monster {
    private String monsterName;
    private String monsterType;
    private int totalMove;

    public Monster(String monsterName, String monsterType) {
        this.monsterName = monsterName;
        this.monsterType = monsterType;
    }

    public int getTotalMove() {
        return totalMove;
    }

    public void setTotalMove(int totalMove) {
        this.totalMove = totalMove;
    }
    public String getMonsterName() {
        return monsterName;
    }
}