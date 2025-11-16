package game;
import java.util.*;
//import game.weapons.*;
//import game.guns.*;
//import game.skills.*;
//import java.*;

public class Main{
    public static void main(String[] args) {
        Main m=new Main();
        Scanner scanner = new Scanner(System.in);
        Weapon weapon = new SteelSword();
        Gun gun = new ShotGun();
        //Armor armor;
        //int items[];
        int n=0;
        Enemy enemylist[] = {new Enemy("Slime",50,3,30,5,1),new Enemy("Goblin",70,4,40,6,2),new Enemy("Orc",90,5,50,7,3)};

        Player player = new Player("YOU",100,10,60,10,5,weapon,gun);//"名前",HP,SP,STAGGER,ATK,DFE
        Character enemy = new Enemy("Enemy",80,5,50,8,3);//"名前",HP,SP,STAGGER,ATK,DFE

        //player.ammo = gun.ammo;

        List<Skill> deck = new ArrayList<Skill>();
        deck.add(new Charge());
        for(int i=0; i < player.weapon.skills.size(); i++){
            deck.add(player.weapon.skills.get(i));
        }
        for(int i=0; i < player.gun.skills.size(); i++){
             deck.add(player.gun.skills.get(i));
        }
        Collections.shuffle(deck);

        List<Skill> hand = new ArrayList<>();
        for (int i = 0; i < 4 ; i++) hand.add(deck.remove(0));
        
        List<Skill> eDeck = new ArrayList<Skill>();
        eDeck.add(new Charge());
        eDeck.add(new Slash());
        eDeck.add(new Slash());
        eDeck.add(new Stab());

        player.show();
        System.out.println(enemy.name + "が現れた！");
		for(int i=0; i<25; i++){//戦闘ループ（whileにする）
            System.out.println("Your deck:");
            for(int j=0; j<deck.size(); j++){
                System.out.println(j + ": " + deck.get(j).getClass().getSimpleName());
            }
            System.out.println("Select your move:");
            for(int j=0; j<hand.size(); j++){
                System.out.println(j + ": " + hand.get(j).getClass().getSimpleName());
            }
            n = scanner.nextInt();
			Skill chosen  = hand.get(n);//これ用のクラスを作る
            chosen.use(player, enemy);
            deck.add(chosen);//デッキに戻す 4 4
            hand.add(deck.remove(0));//デッキから補充 3 5
            hand.remove(i);//手札から消す 3 4
            
            m.wait(500);
            
            if(enemy.hp <= 0){
                System.out.println(enemy.name + " defeated!");
                break;
            }
            if(enemy.sp >= 2){//敵のターン
                chosen = eDeck.get(new Random().nextInt(eDeck.size()-1));
            }else{
                chosen = eDeck.get(0);
            }
            chosen.use(enemy,player);
            
            m.wait(500);

            player.show();
            m.wait(500);
            enemy.show();
            m.wait(500);
            System.out.println();
            if(enemy.stag == enemy.maxStag){
                System.out.println(enemy.name + " ready to move ...");
            }
	    }
        scanner.close();
    }
    public void wait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
    
}