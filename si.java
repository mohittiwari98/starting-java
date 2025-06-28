//find simple interest
import java.util.Scanner;
class si{
    public static void main(string[] args){
        //input value h
        Scanner input=new Scanner(system.in);
        System.out.println("welcome  to si calculator");
        System.out.print("enter your principle");
        int principle=input.nextInt();
         System.out.print("enter your rate");
        Float rate=input.nextFloat();
         System.out.print("enter time");
        int time=input.nextInt();

        float intreset=(principle*rate*years)/100;
        System.out.println(intreset)
    }
}
