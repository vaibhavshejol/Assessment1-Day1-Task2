package assessment1.task;

public class PalimdromeOrNotTask implements Runnable {
    
    private int number;

    public PalimdromeOrNotTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            int originalNumber = number;
        int reversedNumber = 0;
        
        while(number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if(reversedNumber == originalNumber){
            System.out.println(number + " is an Palimdrome number.");
        }
        else{
            System.out.println(number + " is not an Palimdrom number.");
        }
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }

    
}
