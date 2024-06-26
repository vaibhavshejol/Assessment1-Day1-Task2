package assessment1.task;

public class ReverseTask implements Runnable {

    private int number;

    public ReverseTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            int reversedNumber = 0;
        
        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number of "+number+" is "+reversedNumber+".");
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
