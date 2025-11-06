package game;

import java.lang.reflect.Method;

public class Character{
    String name;
    int hp,maxHp;
    int sp,maxSp;
    int stag,maxStag;
    int atk;
    int dfe;
    //List<Skill> deck = new ArrayList<Skill>();
    Weapon wepon;
    Gun gun;
    //Armor armor;
    int maxAmmo=gun.ammo;
    int ammo=gun.ammo;

    int TAtk=this.atk + this.wepon.atk;

    public Character(String name,int hp,int sp,int stag,int atk,int dfe,Gun gun){
        this.name=name;
        this.maxHp=hp;
        this.maxSp=sp;
        this.maxStag=stag;
        this.atk=atk;
        this.dfe=dfe;
        this.hp = this.maxHp;
        this.sp = this.maxSp;
        this.stag = this.maxStag;
        this.gun=gun;
    }
    public void damaged(int d,int s){
        
        if(this.stag <= s){
            calcDamage(d, s);
            this.stag = 0;
            System.out.println(this.name + "は体制を崩した");
        }else{
            calcDamage(d, s);
            this.stag -= s;
        }
    }
    public void calcDamage(int dmg,int s){
        int d = ((this.stag == 0) ? dmg*2 : dmg-this.dfe);//スタッグが0のときダメージ2倍、そうでないとき防御力分ダメージ軽減
        if(this.hp< d){//ダメージがマイナスにならないようにする
            System.out.println(d + "damage!!");
            this.hp=0;
            System.out.println(this.name + "は倒れた");
        }else{
            this.hp -= d;
            System.out.println(this.name + " take " + d + " damage!!");
        }
        if(this.stag == 0){
            this.stag = this.maxStag;
            System.out.println("Debag log: stag reset!!!!!!!!!!!!!!!!!!!!!!");
        }
        
    }
    
    public void showAll(){
        System.out.println(this.name);
        System.out.printf("HP:" + this.hp + "/" + this.maxHp);
        for(int i=0; i<this.maxHp/5; i++){
            System.out.printf("■");
        }System.out.println("");
        System.out.println("SP:" + this.sp + "/" + this.maxSp);
        System.out.println("Stagger:" + this.stag + "/" + this.maxStag);
        System.out.println("ATK:" + this.atk);
        System.out.println("DFE:" + this.dfe);
        //System.out.println("");
    }
    public void show(){
        System.out.println(this.name + ":");
        System.out.printf("HP:" + this.hp + "/" + this.maxHp);
        for(int i=0; i<this.hp/5; i++){
            System.out.printf("■");
        }for(int i=0; i<(this.maxHp/5)-(this.hp/5); i++){
            System.out.printf("□");
        }System.out.println("");

        System.out.printf("SP:" + this.sp + "/" + this.maxSp);
        for(int i=0; i<this.sp; i++){
            System.out.printf("●");
        }for(int i=0; i<(this.maxSp-this.sp); i++){
            System.out.printf("○");
        }System.out.println("");

        System.out.println("Stagger:" + this.stag + "/" + this.maxStag);
        System.out.println("");
    }
    
}
