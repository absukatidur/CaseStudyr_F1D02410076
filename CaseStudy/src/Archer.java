public class Archer extends Character implements Attackable {
    private int arrowCount;

    public Archer(String name, int level, int health, int arrowCount) {
        super(name, level, health);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack(Character target) {
        if (arrowCount > 0) {
            System.out.println(name + " menembakkan anak panah kepada "
                    + target.getName() + "!");

            shootArrow();
            target.setHealth(target.getHealth() - getAttackPower());

            System.out.println("Damage: " + getAttackPower());
            System.out.println("Sisa anak panah: " + arrowCount);
        } else {
            System.out.println(name + " kehabisan anak panah!");
        }
    }

    @Override
    public int getAttackPower() {
        return 12 + (level * 2);
    }

    public void shootArrow() {
        arrowCount--;
    }

    public int getArrowCount() {
        return arrowCount;
    }
}