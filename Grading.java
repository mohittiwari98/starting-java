//imp
import java.util.Scanner;
class Grading{
    public static void main(string[] args){
       //enter input value
        Scanner input = new Scanner(system.in);
        System.out.println("welcome\n");
        System.out.print("please enter your percentage");
        float percentage=input.nextFloat();
        //using conditional statements

        if(percentage>=90){
            System.out.println("A");
        } else if(percentage>=75){
            System.out.println("B");
        } else if(percentage>=60){
            System.out.println("C")
        }
        else{
            System.out.println("D")
        }
    }
}
