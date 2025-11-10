package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Weapon {
    String name;
    int atk;
    int stg;

    List<Skill> skills = new ArrayList<Skill>();
}
