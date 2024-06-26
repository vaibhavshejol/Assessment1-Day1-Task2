package assessment1.task;

public class SquareTask implements Runnable {

    private int number;
    private String result;

    public SquareTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int square = number * number;
            result = "Square of " + number + " is " + square;
            System.out.println(result);

        } catch (Exception ex) {
            System.out.println("Error is : " + ex);
        }
    }

    public String getResult() {
        return result;
    }

}
