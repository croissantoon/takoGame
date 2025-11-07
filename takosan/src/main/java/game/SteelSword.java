package game;

public class SteelSword extends Weapon{
    public SteelSword(){
        this.name = "SteelSword";
        this.atk = 10;
        skills.add(new Slash());
        skills.add(new Slash());
        skills.add(new Stab());
    }

}
