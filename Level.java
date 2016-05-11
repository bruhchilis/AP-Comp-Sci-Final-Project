public class Level{
    private int MaxEXP;
    private int EXP;
    private int temp;
    public Level(int Max){
        MaxEXP = Max;
        EXP = 0;
        temp = 0;
    }
    public void addEXP(int i){
        EXP += i;
        
    }
    public int GETEXP(){
        return EXP;
    }
    public int GETMaxEXP(){
        return MaxEXP;
    }
    public void MAXMaxEXP(){
        temp = EXP - MaxEXP;
        MaxEXP += MaxEXP*10.33;
        EXP = temp;
    }
}
