package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ReverseTask.class);


    private int number;
    private String result;

    public ReverseTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            result = "Reversed of " + originalNumber + " is " + reversedNumber + ".";
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
