import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.print("""
                    Enter :
                    1 to switch to Sword Attack,
                    2 to switch to Magical Spell Attack,
                    x to perform an attack,
                    q to exit.
                    """);
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    character.setAttackStrategy(new SwordAttackStrategy());
                    break;
                case "2":
                    character.setAttackStrategy(new MagicSpellAttackStrategy());
                    break;
                case "x":
                    character.attack();
                    break;
                case "q":
                    break label;
            }
        }
    }
}