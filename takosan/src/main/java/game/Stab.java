package game;

public class Stab implements Skill{
    public static final int COST = 2;

    @Override
    public void use(Character p, Character t){
        int dmg = 20 + p.TAtk;
        int stg = 20;
        if(p.sp < COST){
            System.out.println(p.name + " cant stab because SP is low");
            return;
        }
        p.sp -= COST;
        System.out.println(p.name + " stab to " + t.name);
        t.damaged(dmg, stg);
    }

}
