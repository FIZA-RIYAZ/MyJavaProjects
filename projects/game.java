package projects;
import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("0:for rock\n1:for paper\n2:scissor");
        System.out.println("enter a number: ");
        int num=sc.nextInt();


        if(num == 0){
            System.out.println("your choice: RocK");
        }
        else if(num== 1){
            System.out.println("your choice: PapeR");
        }
        else{
            System.out.println("your choice: ScissoR");
        }



        Random ran =new Random();
        int compinput= ran.nextInt(3);
        

        if(compinput == 0){
            System.out.println("computers choice: RocK");
        }
        else if(compinput == 1){
            System.out.println("computers choice: PapeR");
        }
        else{
            System.out.println("computers choice: ScissoR");
        }


        if(num ==compinput){
            System.out.println("Game Draw!");
        }
        else if(num==0 && compinput==2 || num==1 && compinput==0||num==2 && compinput ==1){
            System.out.println("You Win The Game!!!!");
        }
        else{
            System.out.println("You Lose.");
        
        }

    }
}