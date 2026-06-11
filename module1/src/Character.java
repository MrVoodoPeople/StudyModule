final class Character {
    private final String name;
    private final Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon.clone();
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon.clone();
    }

    @Override
    public String toString() {
        return name + " use " + weapon;
    }
}
