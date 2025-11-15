package projects;
//student report card generator
import java.util.*;

public class project01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Enter your Roll Number: ");
        int RollNo=sc.nextInt();

        System.out.println("Enter marks obtained in English: ");
        float english=sc.nextFloat();

        System.out.println("Enter marks obtained in Math");
        float math=sc.nextFloat();

        System.out.println("Enter marks obtained in Science");
        float science=sc.nextFloat();


        student std1=new student(name,RollNo,english,math,science);
        std1.printReport();
        


    }
    
}


class student{
    //Fields
    String name;
    int RollNo;
    float english;
    float math;
    float science;
    float totalMarks;
    float percentage;
    char grade;

    //constructor
    student(String name,int RollNo,float english,float math,float science){
        this.name=name;
        this.RollNo=RollNo;
        this.english=english;
        this.math= math;
        this.science=science;

    }

    float CalculateTotal(){
        this.totalMarks= this.english+this.math+this.science;
        return this.totalMarks;

    }
    float calPercentage(){
        this.percentage=(CalculateTotal()/300)*100;
        return this.percentage;


    }
    char CalculateGrade(){
        if(this.percentage >=90){
            return 'A';
        }
        else if(this.percentage >=75){
            return 'B';

        }
        else if(this.percentage >=60){
            return 'C';
        }
            
        else if(this.percentage >= 50){
            return 'D';
            
        }
        else{
            return 'F';
        }
    }

     public void printReport(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : "+RollNo);
        System.out.println("English : "+english);
        System.out.println("Math : "+math);
        System.out.println("Science : "+science);
        System.out.println("Total marks obtained : "+this.CalculateTotal());
        System.out.println("Percentage : "+this.calPercentage());
        System.out.println("Grade : "+this.CalculateGrade());

    }

        

 

}