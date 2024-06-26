package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvenOddTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(EvenOddTask.class);

    private int number;
    private String result;

    public EvenOddTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            result = (number % 2 == 0) ? "Given number " + number + " is even." : "Given number " + number + " is odd.";
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
