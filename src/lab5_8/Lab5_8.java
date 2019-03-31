
package lab5_8;
import java.util.Scanner;


public class Lab5_8 {

   
    public static void main(String[] args) {
        int[] a ={0,0,0,0,0,0,0,0,0};
        boolean f=false;
        boolean g=false;
        int b,c;
        Scanner i = new Scanner(System.in);
        do{
        System.out.println("-------------");
        System.out.println("| " + a[0]+ " | " +a[1]+ " | " +a[2]+ " |");
        System.out.println("-------------");
        System.out.println("| " + a[3]+ " | " +a[4]+ " | " +a[5]+ " |");
        System.out.println("-------------");
        System.out.println("| " + a[6]+ " | " +a[7]+ " | " +a[8]+ " |");
        System.out.println("-------------");
        
        System.out.print("player1-Choose a spot:");
        b=i.nextInt();
        if(a[b]!=0){
         do{
                System.out.print("Player1-Give an unoccupied spot:");
                b=i.nextInt();
            }while(a[b]!=0);
        }
        a[b]=1;
        if(a[0]==1 && a[1]==1&&a[2]==1){
            f=true;
            g=true;
        }
       if(a[0]==1&& a[3]==1 && a[6]==1){
           f=true;
           g=true;
       }
       if(a[0]==1 && a[4]==1&&a[8]==1){
           f=true;
           g=true;
        
       }
        if(a[1]==1 && a[4]==1 &&a[7]==1){
            f=true;
            g=true;
        }
        if(a[2]==1 && a[5]==1 &&a[8]==1){
            f=true;
            g=true;
        }
        if(a[3]==1 && a[4]==1 &&a[5]==1){
            f=true;
            g=true;
        }
        if(a[6]==1 && a[4]==1 &&a[2]==1){
            f=true;
            g=true;
        }
        if(a[6]==1 &&a[7]==1 && a[8]==1){
            f=true;
            g=true;
        }
        if(a[6]==1&& a[4]==1 && a[2]==1){
            f=true;
            g=true;
        }
        
        System.out.print("player2-Choose a spot:");
        c=i.nextInt();
        if(a[c]!=0){
         do{
                System.out.print("Player1-Give an unoccupied spot:");
                c=i.nextInt();
            }while(a[c]!=0);
        }
        a[c]=2;
        if(a[0]==2 && a[1]==2 &&a[2]==2){
            f=true;
            
        }
       if(a[0]==2 && a[3]==2 && a[6]==2){
           f=true;
           
       }
       if(a[0]==2 && a[4]==2 &&a[8]==2){
           f=true;
           
        
       }
        if(a[1]==2 && a[4]==2 && a[7]==2){
            f=true;
            
        }
        if(a[2]==2 && a[5]==2 &&a[8]==2){
            f=true;
            
        }
        if(a[3]==2 && a[4]==2 && a[5]==2){
            f=true;
           
        }
        if(a[6]==2 && a[4]==2 &&a[2]==2){
            f=true;
        }
        if(a[6]==2 &&a[7]==2 && a[8]==2){
            f=true;
           
        }
        if(a[6]==2 && a[4]==2 && a[2]==2){
            f=true;
            
        }
        
        
      }while(f==false);
        
        System.out.println("-------------");
        System.out.println("| " + a[0]+ " | " +a[1]+ " | " +a[2]+ " |");
        System.out.println("-------------");
        System.out.println("| " + a[3]+ " | " +a[4]+ " | " +a[5]+ " |");
        System.out.println("-------------");
        System.out.println("| " + a[6]+ " | " +a[7]+ " | " +a[8]+ " |");
        System.out.println("-------------");
        
        if(g==true){
            System.out.print("The winner is player 1!");
        }else{
            System.out.print("The winner is player 2!");
        }
        
    }
}
    
    

