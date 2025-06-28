//find
import java.util.Scanner;
class Perimeter{
    public static void main(string[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to perimeter calculator");
        System.out.print("please enter all 4 sides in cms");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();

        double perimeter=a+b+c+d;
        System.out.println(perimeter);
    }
}
