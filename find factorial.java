//find factorial
public class factorial{
    public static void main(string[] args){
        int num=10;
        long factorial=1;
        
        for(int i=1; i<=num; ++i)
        {
            factorial*=i;
        }
        System.out.println("factorial of %d=%d",num,factorial)
    }
}
