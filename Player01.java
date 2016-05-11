import java.awt.*;
import javax.swing.*;
public class Player01
{
 private String PlayerName;
 private double Luck;
 private int HP;
 private int ATK;
 private double STR;
 private double INT;
 private double CON;
 private double AGL;
 private double Presence;
 private int BODY;
 private int MIND;
 private int SPIRIT;
 private int RESOLVE;
 private Armour equiped;
 public Player01(){
     PlayerName =   JOptionPane.showInputDialog("Enter Character Name");
     HP = 1;
     ATK = 0;
     STR = 0;
     INT = 0;
     CON = 0;   
     AGL = 0;
     Presence = 0;
     BODY = 1;
     MIND = 1;
     SPIRIT = 1;
     RESOLVE = 0;
     equiped = new Armour("None",0);
     String Ans = JOptionPane.showInputDialog("What is more important?/n BODY, SPIRIT, or MIND");
     if(Ans.equals("BODY"))
     BODY += 5;
     else if(Ans.equals("SPIRIT"))
     SPIRIT += 5;
     else if(Ans.equals("MIND"))
     MIND += 5;
    }
    public int getDef(){
        return (int)(CON * equiped.GETDEF());
    }
    
 
}
