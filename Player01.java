import java.awt.*;
import javax.swing.*;
public class Player01{
 
 private String PlayerName;
 private double Luck;
 private int HP;
 //private int ATK;
 private double STR; 
 private double INT;
 private double CON;
 private double AGL;
 private double Presence;
 private int BODY;
 private int MIND;
 private int SPIRIT;
 private int RESOLVE;
 private Armour equiped01;
 private Weapon equiped02;
 private Level playerLevel;
 public Player01(){
     PlayerName =   JOptionPane.showInputDialog("Enter Character Name");
     playerLevel = new Level(20);
     
     
     STR = 1;
     INT = 1;
     CON = 1;   
     AGL = 1;
     Presence = 0;
     BODY = 1;
     MIND = 1;
     SPIRIT = 1;
     RESOLVE = 0;
     equiped01 = new Armour("None",0);
     equiped02 = new  Weapon("None", 1);
     
     String Ans = JOptionPane.showInputDialog("What is more important?/n BODY, SPIRIT, or MIND");
     if(Ans.equals("BODY")){
     BODY += 9;
     STR += 4;
     CON += 4;
     AGL  += 2;
     }
     else if(Ans.equals("SPIRIT")){
     SPIRIT += 9;
     INT += 2;
     CON += 4;
     AGL += 4;
     }
     else if(Ans.equals("MIND")){
     MIND += 9;
     INT += 4;
     AGL += 4;
     STR += 2;
     }
     HP = (int)(CON * 10.1);
    }
    public int getDef(){
        return (int)(CON * equiped.GETDEF());
    }
    public void ChangeArmour(Armour New){
     equiped01 = New;
    }
    public int GetAtk(){
     return (int)(STR * equiped02.GETATK());
    }
    public void ChangeWeapon(Weapon New){
     equiped02 = New;
     }
     public void EXPcheck(){
      if(playerLevel.GETEXP() >= playerLevel.GETMaxEXP()){
       playerLevel.MAXMaxEXP();
      String Ans = JOptionPane.showInputDialog("YOU LEVELED UP! What is more important? BODY, SPIRIT, or MIND");
      if(Ans.equals("BODY") || Ans.equals("Body") || Ans.equals("body")){
       BODY += 9;
       STR += 4;
       CON += 4;
       AGL += 2;
      }
      else if(Ans.equals("SPIRIT") || Ans.equals("Spirit") || Ans.equals("spirit")){
       SPIRIT += 9;
       INT += 2;
       CON += 4;
       AGL += 4;
      }
      else if(Ans.equals("MIND") || Ans.equals("Mind") || Ans.equals("mind")){
       MIND += 9;
       INT += 4;
       AGL += 4;
       STR += 2;
      }
      EXPcheck();
      }
      }
     
    }
    
    
 

