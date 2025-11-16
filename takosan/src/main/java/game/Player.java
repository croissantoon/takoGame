package game;
import java.util.*;
public class Player extends Character{
    List<Skill> deck = new ArrayList<Skill>();
    
    //@Override
    public Player(String name, int hp,int sp,int stag,int atk,int dfe,Weapon wepon,Gun gun){
        super(name,hp,sp,stag,atk,dfe);
        this.hp = this.maxHp;
        this.sp = this.maxSp;
        this.weapon = wepon;
        this.gun = gun;
        this.TAtk = this.atk + this.weapon.atk;
        this.weaponStg = this.weapon.stg;
        this.maxAmmo=gun.ammo;
        this.ammo=this.maxAmmo;
        this.TAtk = this.atk + this.weapon.atk;
    }

}
