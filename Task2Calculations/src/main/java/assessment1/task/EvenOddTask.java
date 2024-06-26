package assessment1.task;

public class EvenOddTask implements Runnable {

    private int number;
    private String result;

    public EvenOddTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            result = (number % 2 == 0) ? "Given number " + number + " is even." : "Given number " + number + " is odd.";
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error is : " + ex);
        }
    }

    public String getResult() {
        return result;
    }

}
