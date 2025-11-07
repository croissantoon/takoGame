package game;

public class HandGun extends Gun{
    public HandGun(){
        this.name = "HandGun";
        this.ammo = 5;
        this.atk = 15;

        skills.add(new Gunshot());
        skills.add(new Gunshot());
        skills.add(new Reload());
    }

}
