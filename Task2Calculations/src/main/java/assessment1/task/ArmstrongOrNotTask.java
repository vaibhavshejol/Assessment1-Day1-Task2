package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//implementing runnable interface
public class ArmstrongOrNotTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(ArmstrongOrNotTask.class);


    private int number;
    private String result;

    // constructor
    public ArmstrongOrNotTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int originalNumber = number;
            int numDigits = String.valueOf(number).length();

            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }

            if (sum == originalNumber) {
                result = originalNumber + " is an Armstrong number.";
                // System.out.println(result);
                logger.info(result);

            } else {
                result = originalNumber + " is not an Armstrong number.";
                // System.out.println(result);
                logger.info(result);

            }

        } catch (Exception ex) {
            // System.out.println("Error is : " + ex);
            logger.error("Error occurred while processing number " + number, ex);
        }
    }

    public String getResult() {
        return result;
    }

}
