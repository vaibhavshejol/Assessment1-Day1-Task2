package assessment1.task;

public class EvenOddTask implements Runnable{

    private int number;

    public EvenOddTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            System.out.println((number%2==0)?"Given number "+number+" is even.":"Given number "+number+" is odd.");
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
