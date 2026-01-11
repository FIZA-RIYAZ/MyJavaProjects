import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("0:for rock\n1:for paper\n2:scissor");
        System.out.println("enter a number: ");
        int num=sc.nextInt();

        Random ran =new Random();
        int compinput= ran.nextInt(3);
        System.out.println("computer entered "+compinput);
        
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