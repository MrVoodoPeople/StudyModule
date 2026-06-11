final class Character {
    private final String name;
    private final Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = new Weapon(weapon.getName(), weapon.getDamage());
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return new Weapon(weapon.getName(), weapon.getDamage());
    }

    @Override
    public String toString() {
        return name + " use " + weapon;
    }
}
