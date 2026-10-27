public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur", 5, 150, "Excalibur");
        Mage mage = new Mage("Merlin", 5, 100, 50, 50);
        Archer archer = new Archer("Robin", 5, 120, 10);

        System.out.println("=== GAME CHARACTER SYSTEM ===");

        Character[] characters = {warrior, mage, archer};

        System.out.println("\n=== DAFTAR KARAKTER ===");

        for (Character character : characters) {
            System.out.println(
                    character.getName()
                    + " | Level: " + character.getLevel()
                    + " | Health: " + character.getHealth()
            );
        }

        System.out.println("\n=== PERTARUNGAN ===");

        Character target = warrior;

        for (Character character : characters) {
            if (character != target) {
                character.attack(target);

                System.out.println(
                        "Health " + target.getName()
                        + " sekarang: " + target.getHealth()
                );

                System.out.println();
            }
        }

        System.out.println("=== STATUS AKHIR ===");

        for (Character character : characters) {
            System.out.println(
                    character.getName()
                    + " - Health: " + character.getHealth()
            );
        }
    }
}