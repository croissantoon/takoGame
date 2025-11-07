package game;

public class Enemy extends Character{
    //@Override
    public Enemy(String name, int hp,int sp,int stag,int atk,int dfe,Weapon weapon,Gun gun){
        super(name,hp,sp,stag,atk,dfe,weapon,gun);
        this.hp = this.maxHp;
        this.sp = this.maxSp;
        this.maxAmmo=gun.ammo;
        this.ammo=this.maxAmmo;
    }

}
