void main() {
    Weapon sword = new Weapon("Sword", 34);// создаем объект оружия(меч)
    Character hero = new Character("Hero", sword);//создаем объект персонажа и даем ему созданный ранее меч
    System.out.println(hero);//вывдод урона оружия, которое мы дали персонажу
    sword.setDamage(1000000);//Пытаемся поменять урон у оружия, которое дано персонажу
    System.out.println(hero);//Выводим урон, что проверить изменилосб ли значение
    hero.getWeapon().setDamage(1);
    System.out.println(hero);
}