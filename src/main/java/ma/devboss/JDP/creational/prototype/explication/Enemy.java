package ma.devboss.JDP.creational.prototype.explication;

public class Enemy implements Cloneable{
    private String enemyType;
    private final int[] startCoordinations = {0,0,0};

    private int enemyDamage = 100;
    private int[] coordination = startCoordinations;

    public Enemy(String enemyType, int enemyDamage) {
        this.enemyType = enemyType;
        this.enemyDamage = enemyDamage;
        this.coordination = this.startCoordinations;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int[] getStartCoordinations() {
        return startCoordinations;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int[] getCoordination() {
        return coordination;
    }

    public void setCoordination(int[] coordination) {
        this.coordination = coordination;
    }

    @Override
    public Enemy clone() {
        try {
            Enemy enemy = (Enemy) super.clone();
            enemy.setCoordination(this.getStartCoordinations());
            return enemy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
