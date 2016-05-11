import java.io.*;
import java.util.ArrayList;

public class Armoury{
    private ArrayList<Armour> ArmourList;
    public Armoury(){
        Armour woodBuckler = new Armour("Wood Buckler",1);
         Armour None = new Armour("None",0);
     ArmourList = new ArrayList<Armour>();
     ArmourList.add(None);
     ArmourList.add(woodBuckler);
     
    }
    
}
