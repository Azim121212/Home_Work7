public class GameEntity {
    int damage;
    int life;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String info() {
        return "Damage: "
                + this.damage +
                "\nLife: "
                + this.life;
    }
}