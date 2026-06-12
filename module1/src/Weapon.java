

final class Weapon implements Cloneable {
    private int damage;
    private String name;

    public Weapon(String name, int damage) {
        if(name == null) {
            throw new IllegalArgumentException("Name cannot be null");}
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + "(" + damage + ") dmg";
    }

    @Override
    public Weapon clone() {
        try {
            return (Weapon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}