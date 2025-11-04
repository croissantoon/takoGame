package game;

public class Slash implements Skill{
    public static final int COST = 1;

    @Override
    public void use( Character p, Character t){
        int dmg = 10;
        int stg = 10;
        int cost = COST;
        if(p.sp < cost){
            System.out.println(p.name + " cant slash because SP is low");
            return;
        }
        p.sp -= cost;
        System.out.println(p.name + " slash to " + t.name + " by class");
        t.damaged(dmg, stg);
    }
}
