package game;

public class BattleSys {
    int turn = 0;
    Player player;
    Enemy enemy[];
    Main m;
    public BattleSys(Player player,Enemy enemy[], Main m){
        this.player=player;
        this.enemy=enemy;
        this.m = m;
    }
}
