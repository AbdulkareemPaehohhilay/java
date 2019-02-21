import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Battle
{ 
    public static void main(String args[]) 
  {  int  hpPlayer=50 , expPlayer=0;
     int ackPlayer = 10;
     String item[] ={"TOWN PORTAL SCROLL","GLIMMER CAPE","CRYSTALYS","FAERIE FIRE","REAVER","SANGE AND YASHA","PHASE BOOTS","ULTIMATE ORB","BLADES OF ATTACK","VLADMIR'S OFFERING"};

     int hpCom=50;
     int ackCom = 5;
     Scanner Sc = new Scanner(System.in);
     int j=10;
     while(j>0){
     System.out.println(" Select mode ");
     System.out.println(" 1.Battle");
     System.out.println(" 2.Bag");
     int First = Sc.nextInt();
     if(First == 1){
     hpPlayer= randomACK(ackPlayer, ackCom, hpPlayer, hpCom);
     expPlayer = Upexp(hpPlayer,expPlayer);
     if(expPlayer != 0){
     System.out.println("..........................."); 
     System.out.println("You win exp+100");
     System.out.println("exp =" + expPlayer);
     System.out.println("...........................");
     System.out.println("choose item :"); 
     SelectItem(item);
     int x;
     x = Sc.nextInt();
     System.out.println("Item your = " + item[x-1]);
    



      }
     else{
     System.out.println("You lose");
     System.out.println("exp =" + expPlayer);
       }
      
     }
     else{
        Bag(item);
     }
   j--;}
  }
  
   public static void Bag(String[] item) {
      System.out.println(item[3]);
   }

   public static int randomACK(int ackP, int ackC ,int hpP , int hpC)
   {
    System.out.println("HP COM =" + hpC);
    System.out.println("HP PLAYER = " +hpP);
    do{  
    if(ackP > ackC){
       hpC = hpC - ackP;
       hpP = hpP - ackC;
       System.out.println("Damage = -" + ackP);
       System.out.println("HP COM =" + hpC);
       System.out.println("HP PLAYER = " +hpP);
    }
       if(ackP < ackC){
       hpP = hpP - ackC;
       hpC = hpC - ackP;
       System.out.println("Damage = -" + ackC);
       System.out.println("HP PLAYER = " +hpP);
       System.out.println("HP COM =" + hpC);
       }
    }while(hpC != 0);

    return hpP;

   }
   public static int Upexp( int hpP,int expP)
   {
       if(hpP != 0){
       expP = expP + 100;
       }
       return expP;
   }
   public static void SelectItem(String[] item) {
      int i;
      for(i=0;i<10;i++){
      System.out.print(" "+(i+1)+".");
      System.out.println(item[i]);
   }}
}  