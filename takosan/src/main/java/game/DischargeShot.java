package game;

public class DischargeShot implements Skill{//Gunスキル
    public static final int COST = 1;

    @Override
    public void use(Character p, Character t){
        int dmg = (int) Math.round((p.TAtk)*(p.chargeCount+1 * 1.0));
        int stg = (int) Math.round((10 + p.weaponStg)*(1+(p.chargeCount * 1.1)));
        if(p.sp > p.chargeCount){
            if(p.ammo >= 0){
                System.out.println(p.name + "DischargeShot!");
                p.sp -= p.chargeCount;
                p.ammo -= 1;
                p.chargeCount = 0;
                t.damaged(dmg, stg);
            }else{
                System.out.println(red + p.name + " cant gunshot because " + yellow + "Ammo" + " is low" + end);
            return;
            }
        }else{
            System.out.println(red + p.name + " cant gunshot because " + yellow + "SP" + " is low" + end);
            
            return;
        }
        
    }

}
