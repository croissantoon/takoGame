package game;
import java.util.*;
public class Player extends Character{
    List<Skill> deck = new ArrayList<Skill>();
    
    //@Override
    public Player(String name, int hp,int sp,int stag,int atk,int dfe,Weapon wepon,Gun gun){
        super(name,hp,sp,stag,atk,dfe,wepon,gun);
        this.hp = this.maxHp;
        this.sp = this.maxSp;
        this.maxAmmo=gun.ammo;
        this.ammo=this.maxAmmo;
    }

}
