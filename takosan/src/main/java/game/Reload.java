package game;

public class Reload implements Skill{
    public static final int COST = 0;

    @Override
    public void use(Character p, Character t){
        int cost = COST;
        if(p.sp < cost){
            System.out.println(p.name + " cant reload because SP is low");
            return;
        }
        p.ammo = p.maxAmmo;
        System.out.println(p.name + " reload");
    }

}
