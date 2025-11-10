package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Gun {
    String name;
    int ammo;
    int atk;
    int stg;

    List<Skill> skills = new ArrayList<Skill>();
}
