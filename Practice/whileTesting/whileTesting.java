
/**
 * Write a description of class whileTesting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class whileTesting
{
    // instance variables - replace the example below with your own
    private int x;
    
    public void multiplesOfFive(){
        int multCount = 3;
        int currentNo = 10;
        while(currentNo != 100){
            System.out.println(currentNo);
            currentNo = 5 * multCount;
            multCount++;
        }
    }
    
    public void tenSum(){
        int sum = 0;
        int num = 1;
        while(num < 11){
            sum += num;
            num++;
              //  System.out.println(num);
        }
        System.out.println(sum);
    }
    
    public void sum(int first, int second){
        //this is to make sure b is larger (or equal to) a
        //because it makes it easier to figure out the while loop
        int a;
        int b;
        if (first > second){
            a = second;
            b = first;
        }
        else{
            a = first;
            b = second;
        }
        int currentAdd = a;
        int sum = 0;
        while(currentAdd != b+1){
            sum += currentAdd;
            currentAdd++;
        }
        System.out.println(sum);
    }
    
    public boolean isPrime(int n){
        int counter = 2;
        while (counter < n-1){
            if (n % counter == 0){
                return false;
            }      
            counter++;
        }
        return true;
    }
}
