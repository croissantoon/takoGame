package game;

import java.util.List;

public abstract class Weapon {
    String name;
    int atk;
    //Listでスキルを持たせる予定
    List<Skill> skills;
}
