//find gcd 
class main{
    public static void main(string[] args){
        //change value according to you
        int n1=81,n2=153;
        int gcd=1;
        //used for loop
        for(int i=1;i<=n1 && i<=n2;++i){
            //used conditional statement
            if(n1 % i==0 && n2%i==0)
            gcd=i;
        }
        //get output 
        System.out.println("GCD of"+n1+"and"+n2+"is"+gcd);
    }
}
