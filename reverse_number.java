//code to get revers
class Main{
    public static void main(string[] args){
        int num=1234,reversed=0;
        System.out.println("orginal num"+num);
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        System.out.println("reversed number:"+reversed);
    }
}
