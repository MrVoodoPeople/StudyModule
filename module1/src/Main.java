void main() {
    Weapon sword = new Weapon("Sword", 34);
    Character hero = new Character("Hero", sword);
    System.out.println(hero);
    sword.setDamage(1000000);
    System.out.println(hero);
    hero.getWeapon().setDamage(12);
    System.out.println(hero);
    System.out.println(sword);
}