public class Warrior extends Character implements Attackable {
    private String weapon;

    public Warrior(String name, int level, int health, String weapon) {
        super(name, level, health);
        this.weapon = weapon;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " menyerang " + target.getName()
                + " menggunakan " + weapon + "!");

        target.setHealth(target.getHealth() - getAttackPower());

        System.out.println("Damage: " + getAttackPower());
    }

    @Override
    public int getAttackPower() {
        return 15 + (level * 2);
    }

    public String getWeapon() {
        return weapon;
    }
}