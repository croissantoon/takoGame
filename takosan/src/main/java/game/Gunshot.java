package game;

public class Gunshot implements Skill{
    public static final int COST = 1;

    @Override
    public void use(Character p, Character t){
        int dmg = 10;
        int stg = 30 + p.weaponStg;
        if(p.ammo <= 0){
            System.out.println(red + p.name + " cant gunshot because " + yellow + "Ammo" + " is low" + end);
            return;
        }
        p.ammo -= 1;
        System.out.println(p.name + " gunshot to " + t.name);
        t.damaged(dmg, stg);
    }

}
