package game;

import java.lang.reflect.Method;

public class Character{
    String name;
    int hp,maxHp;
    int sp,maxSp;
    int stag,maxStag;
    int atk;
    int dfe;
    Weapon w=new Weapon();

    public Character(String name,int hp,int sp,int stag,int atk,int dfe){
        this.name=name;
        this.maxHp=hp;
        this.maxSp=sp;
        this.maxStag=stag;
        this.atk=atk;
        this.dfe=dfe;
        this.hp = this.maxHp;
        this.sp = this.maxSp;
        this.stag = this.maxStag;
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
        System.out.println("");
    }
    public void show(){
        System.out.println(this.name);
        System.out.printf("HP:" + this.hp + "/" + this.maxHp);
        for(int i=0; i<this.maxHp/5; i++){
            System.out.printf("■");
        }System.out.println("");
        System.out.println("SP:" + this.sp + "/" + this.maxSp);
        System.out.println("Stagger:" + this.stag + "/" + this.maxStag);
    }
    
}
