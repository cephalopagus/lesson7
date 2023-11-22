import templates.Hero;
import templates.Magic;
import templates.Medic;
import templates.Warrior;

public class Main {
    public static void main(String[] args) {

        Hero [] massive = {new Magic(), new Medic(), new Warrior()};

        for (Hero hero : massive) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
        }

    }
}