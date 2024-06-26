package assessment1.task;

public class CubeTask implements Runnable {

    private int number;

    public CubeTask(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try{
            int cube=number*number*number;
            System.out.println("Cube of "+number+" is "+cube);
        }
        catch(Exception ex){
            System.out.println("Error is : "+ex);
        }
    }
    
}
