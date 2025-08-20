//implemented
//checking Leap year or non leap year 
public class  main{
    public static void main(string[] args){
        int year=100;
        boolean leap=false;
        if(year%4==0){
            if(year%100=0){
                if(year%400==0){
                    leap =true;
                    else{
                        leap=false;
                    }
                }
            }
        }
    }
}
