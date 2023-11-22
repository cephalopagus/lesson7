package templates;

public abstract class Hero implements HavingSuperAbility{
    private int hp;

    private int damage;

    private String typeSuperAbility;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuperAbility() {
        return typeSuperAbility;
    }

    public void setTypeSuperAbility(String typeSuperAbility) {
        this.typeSuperAbility = typeSuperAbility;
    }



}
