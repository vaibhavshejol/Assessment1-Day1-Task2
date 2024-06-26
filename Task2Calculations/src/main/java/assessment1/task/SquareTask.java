package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SquareTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(SquareTask.class);


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
            // System.out.println(result);
            logger.info(result);

        } catch (Exception ex) {
            // System.out.println("Error is : " + ex);
            logger.error("Error occurred: {}", ex.getMessage());
        }
    }

    public String getResult() {
        return result;
    }

}
