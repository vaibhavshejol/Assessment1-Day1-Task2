package assessment1.task;

public class PrimeOrNotTask implements Runnable{

    private int number;

    public PrimeOrNotTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{

            if (number <  0) {
                throw new IllegalArgumentException("Prime is not defined for negative numbers.");
            }

           int count=0;
           for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
           }
           if(count==2){
            System.out.println("Given number "+number+" is Prime number.");
           }
           else{
            System.out.println("Given number "+number+" is Not Prime number.");
           }
            
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
