package assessment1.task;

public class SquareTask implements Runnable{

    private int number;

    public SquareTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            int square = number * number;
        System.out.println("Square of " + number + " is " + square);
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
