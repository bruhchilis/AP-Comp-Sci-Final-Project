import java.io.*;
import java.util.ArrayList;
public class Weaponry{
    private ArrayList<Weapon> WeaponList;
    public Weaponry(){
     Weapon None = new Weapon("None",0);
     Weapon Stick = new Weapon("Stick",1);
     WeaponList = new ArrayList<Weapon>();
     WeaponList.add(None);
     WeaponList.add(Stick);
    }
    

    
}
