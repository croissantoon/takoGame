package game;

public class Charge implements Skill{
    public static final int COST = 0;

    @Override
    public void use( Character p, Character t){
        if(p.sp <= p.maxSp - 3){
            System.out.println(red + p.name + " cant charge more" + end);
            return;
        }
        p.sp += 2;
        System.out.println(green + p.name + " charged +2 SP" + end);
        p.chargeCount += 1;
    }

}
