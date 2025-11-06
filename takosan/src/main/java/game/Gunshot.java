package game;

public class Gunshot implements Skill{
    public static final int COST = 1;

    @Override
    public void use(Character p, Character t){
        int dmg = 10;
        int stg = 5;
        if(p.ammo <= 0){
            System.out.println(p.name + " cant gunshot because SP is low");
            return;
        }
        p.ammo -= 1;
        System.out.println(p.name + " gunshot to " + t.name);
        t.damaged(dmg, stg);
    }

}
