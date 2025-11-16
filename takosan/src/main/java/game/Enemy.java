package game;

public class Enemy extends Character{
    //@Override
    public Enemy(String name, int hp,int sp,int stag,int atk,int dfe){
        super(name,hp,sp,stag,atk,dfe);
        this.hp = this.maxHp;
        this.sp = this.maxSp;
    }

}
