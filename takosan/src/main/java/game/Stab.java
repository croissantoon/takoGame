package game;

public class Stab implements Skill{
    public static final int COST = 2;

    @Override
    public void use(Character p, Character t){
        int dmg = 20;
        int stg = 15;
        int cost = COST;
        if(p.sp < cost){
            System.out.println(p.name + " cant stab because SP is low");
            return;
        }
        p.sp -= cost;
        System.out.println(p.name + " stab to " + t.name);
        t.damaged(dmg, stg);
    }

}
