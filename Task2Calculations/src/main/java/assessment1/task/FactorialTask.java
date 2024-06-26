package assessment1.task;

public class FactorialTask implements Runnable {
    
    private int number;

    public FactorialTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
            
            int factorial = 1;
            
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            System.err.println("Factorial of "+number+" is "+factorial+".");
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }

    
}
