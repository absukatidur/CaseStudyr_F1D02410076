public class Mage extends Character
        implements Attackable, MagicUsable {

    private int mana;
    private int maxMana;

    public Mage(String name, int level, int health,
                int mana, int maxMana) {
        super(name, level, health);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void attack(Character target) {
        useMagic(target);
    }

    @Override
    public void useMagic(Character target) {
        if (mana >= getManaCost()) {
            System.out.println(name + " menggunakan sihir kepada "
                    + target.getName() + "!");

            mana -= getManaCost();
            target.setHealth(target.getHealth() - getAttackPower());

            System.out.println("Damage sihir: " + getAttackPower());
            System.out.println("Sisa mana: " + mana);
        } else {
            System.out.println(name + " kehabisan mana!");
        }
    }

    @Override
    public int getAttackPower() {
        return 20 + (level * 3);
    }

    @Override
    public int getManaCost() {
        return 10;
    }

    public int getMana() {
        return mana;
    }
}