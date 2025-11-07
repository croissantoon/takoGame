package game;

public class Charge implements Skill{
    public static final int COST = 0;

    @Override
    public void use( Character p, Character t){
        if(p.sp <= p.maxSp - 3){
            System.out.println(p.name + " cant charge more");
            return;
        }
        p.sp += 3;
        System.out.println(p.name + " charged +3 SP");
    }

}
