public class Main {
    public static void main(String[] args) {


        Hero[] heroes ={ new Magic(), new Warrior(), new Medic()};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}