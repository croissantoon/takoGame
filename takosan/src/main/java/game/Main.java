package game;
import java.util.*;
import java.util.Scanner;
public class Main implements Skill{
    public static void main(String[] args) {
        Main m=new Main();
        Scanner scanner = new Scanner(System.in);
        int weapon;
        int armor;
        int items[];
        int n=0;
        
        Character player = new Character("YOU",100,10,60,10,5);//"名前",HP,SP,STAGGER,ATK,DFE
        Character enemy = new Character("ENEMY",80,5,50,10,5);
        player.show();
        System.out.println(enemy.name + "が現れた！");
		for(int i=0; i<20; i++){
            System.out.println("Select your move: 0:charge 1:slash 2:heal 3:stab");
            n = scanner.nextInt();
			m.use(n,player,enemy);
            if(enemy.sp > 0){
                m.use(1,enemy,player);
            }else{
                m.use(0,enemy,player);
            }
            
            
            player.show();
            enemy.show();
            if(enemy.stag == enemy.maxStag){
                System.out.println(enemy.name + " ready to move ...");
            }
	    }
        scanner.close();
    }
    @Override
    public void use(int n,Character p,Character t){
        if(p.stag > 0){
            int dmg,stg,cost;
            switch (n){
                case 0:
                if(p.sp >= p.maxSp){
                        System.out.println(p.name + " cant charge more");
                        break;
                }else{
                    System.out.println(p.name + " charged +1 SP");
                    p.sp += 1;
                    break;
                }
                case 1:
                    dmg = 10;
                    stg = 10;
                    cost = 1;
                    if(p.sp < cost){
                        System.out.println(p.name + " cant slash becouse SP is low");
                        break;
                    }else{
                        p.sp -= cost;
                        System.out.println(p.name + " slash to " + t.name);
                        t.damaged(dmg,stg);
                        break;
                    }
                    
                case 2:
                    System.out.println(p.name + " heal");
                    //ここに回復するコード（Math.なんとか使用）
                    dmg = 30;
                    System.out.println(p.name + " healed" + dmg + "HP");
                    break;
                case 3:
                    dmg = 25;
                    stg = 5;
                    cost = 2;
                    if(p.sp < cost){
                        System.out.println(p.name + " cant stab becouse SP is low");
                        break;
                    }else{
                        p.sp -= cost;
                        System.out.println(p.name + " Stab to " + t.name);
                        t.damaged(dmg,stg);
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Not found that Skill");
            }
        }else{
            System.out.println(p.name + " cant move becouse stagger !");
        }
    }
}