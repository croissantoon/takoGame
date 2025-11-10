package game;

public interface Skill {
    String red    = "\u001b[00;31m";
    String green  = "\u001b[00;32m";
    String yellow = "\u001b[00;33m";
    String purple = "\u001b[00;34m";
    String pink   = "\u001b[00;35m";
    String cyan   = "\u001b[00;36m";   
    String end    = "\u001b[00m";
    final int COST = 0;
    void use(Character p,Character t);
}
