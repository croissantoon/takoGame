package game;

public class Slash implements Skill{
    public static final int COST = 1;

    @Override
    public void use( Character p, Character t){
        int dmg = (int) Math.round(10 + (p.TAtk * 0.8));
        int stg = 10;
        if(p.sp < COST){
            System.out.println(p.name + " cant slash because SP is low");
            return;
        }
        p.sp -= COST;
        System.out.println(p.name + " slash to " + t.name);
        t.damaged(dmg, stg);
    }
}
