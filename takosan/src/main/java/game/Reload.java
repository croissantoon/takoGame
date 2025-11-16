package game;

public class Reload implements Skill{
    public static final int COST = 0;

    @Override
    public void use(Character p, Character t){
        //int cost = COST;
        if(p.ammo >= p.maxAmmo){
            System.out.println(red + p.name + " cant reload more" + end);
            return;
        }
        p.ammo = p.maxAmmo;
        System.out.println(green + p.name + " reload" + end);
    }

}
