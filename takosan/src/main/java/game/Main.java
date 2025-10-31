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
        
        Character player = new Character("あなた",100,10,50,10,5);//"名前",HP,SP,STAGGER,ATK,DFE
        Character enemy = new Character("敵",50,5,50,10,5);
        player.show();
        n = scanner.nextInt();
        m.use(n,player,enemy);
        scanner.close();
    }
    @Override
    public void use(int n,Character p,Character t){
        
        int dmg,stg,cost;
        if(p.sp >= cost){
            switch (n){
                case 0:
                    dmg = 10;
                    stg = 20;
                    cost = 1;
                    System.out.println(p.name + ":slash");
                    System.out.println(dmg + "damage!!");
                    t.hp -= dmg;
                    t.stag -= stg;
                    t.show();
                    break;
                case 1:
                    System.out.println("1,heal");
                    break;
                default:
                    throw new IllegalArgumentException("ｵｲｵｲｵｲ");
            }
        }
    }
}