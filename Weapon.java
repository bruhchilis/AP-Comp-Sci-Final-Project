
public class Weapon
{private int Damage;
 private String Name;   
    public Weapon(String N, int ATK){
     Damage =  ATK;
     Name = N;
    }
    public int GETATK(){
     return Damage;
    }
    public String GETNAME(){
     return Name;
    }
}
