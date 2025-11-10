package game;

public class ShotGun extends Gun{
    public ShotGun(){
        this.name = "ShotGun";
        this.ammo = 2;
        this.atk = 20;
        this.stg = 15;

        skills.add(new Gunshot());
        skills.add(new Reload());
        skills.add(new DischargeShot());
    }

}
