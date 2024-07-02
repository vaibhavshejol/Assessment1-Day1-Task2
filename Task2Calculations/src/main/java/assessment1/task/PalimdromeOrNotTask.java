package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//implementing runnable interface
public class PalimdromeOrNotTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(PalimdromeOrNotTask.class);


    private int number;
    private String result;

    public PalimdromeOrNotTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            if (reversedNumber == originalNumber) {
                result = originalNumber + " is an Palimdrome number.";
                // System.out.println(result);
                logger.info(result);

            } else {
                result = originalNumber + " is not an Palimdrom number.";
                // System.out.println(result);
                logger.info(result);

            }
        } catch (Exception ex) {
            // System.out.println("Error is : " + ex);
            logger.error("Error occurred: {}", ex.getMessage());
        }
    }

    public String getResult() {
        return result;
    }

}
