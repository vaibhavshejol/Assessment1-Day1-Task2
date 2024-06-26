package assessment1.task;

public class ArmstrongOrNotTask implements Runnable {

    private int number;

    public ArmstrongOrNotTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            int originalNumber = number;
            int numDigits = String.valueOf(number).length();
            
            int sum = 0;
            while(number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }

        if(sum == originalNumber){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }
            
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
