package MonsterRace;

public class Monster {
    private int monsterID;
    private int totalMove;

    public Monster(int monsterID) {
        this.monsterID = monsterID;
    }

    public int getTotMove() {
        return totalMove;
    }

    public void setTotMove(int totMove) {
        this.totalMove = totMove;
    }

    public int getMonsterID() {
        return this.monsterID;
    }
}
