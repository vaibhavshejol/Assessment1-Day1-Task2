package assessment1.task;

public class CubeTask implements Runnable {

    private int number;
    private String result;

    public CubeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int cube = number * number * number;
            result = "Cube of " + number + " is " + cube;
            System.out.println(result);

        } catch (Exception ex) {
            System.out.println("Error is : " + ex);
        }
    }

    public String getResult() {
        return result;
    }

}
