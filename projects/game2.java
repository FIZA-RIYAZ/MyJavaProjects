package projects;
import java.util.*;
public class game2 {
    int randomNo;
    int userInput;
    int Limit;

    

    game2(){
        System.out.println("Welcome to guess number game!!!!");
        Random var=new Random();
        randomNo =var.nextInt(100)+1;
    }

    void takeUserInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100: ");
        userInput=sc.nextInt();
       
    }

    boolean isCorrectNo(){

        Limit++;
        if(randomNo > userInput){
            System.out.println("enter a larger number");
            return false;
        }
        else if(randomNo < userInput){
            System.out.println("enter a smaller number");
            return false;
        }

        else if(randomNo == userInput){
            System.out.println("Congrtulations You Have Guessed The Correct Number");
            return true;
        }

        else {
           System.out.println("wrong number entered");
            return false;
        }
    }
        int getLimit(){
            return Limit;
        }
    
        public static void main(String[] args) {
        game2 obj =new game2();

        //System.out.println(randomNo);
    
        
        while(true){
            obj.takeUserInput();
            if(obj.isCorrectNo()){
                System.out.println("Attempts Taken:  " + obj.getLimit());
                break;
            }

        }
         

}
}