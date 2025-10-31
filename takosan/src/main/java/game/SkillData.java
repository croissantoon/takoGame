package game;

public enum SkillData {
    //dagame,stagger,cost
    SLASH(),
    HEAL(),
    PICK();

    private int dagame[];
    private SkillData(){
        
    }
    public int getDmg(int n){
        return dagame[n];
    }
}
