package templates;

public class Medic extends Hero{
    public int healPoints = 200;
    @Override
    public void applySuperAbility() {
        System.out.println("Медик восполнил всем здоровье до максимума!");
    }
    public void increaseExperience(){
        System.out.println("Было - "+ healPoints);
        healPoints+=healPoints/10;
        System.out.println("Стало - "+ healPoints);

    }
}
