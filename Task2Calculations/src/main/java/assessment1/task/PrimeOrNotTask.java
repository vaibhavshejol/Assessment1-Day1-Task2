package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeOrNotTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(PrimeOrNotTask.class);


    private int number;
    private String result;

    public PrimeOrNotTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {

            if (number < 0) {
                throw new IllegalArgumentException("Prime is not defined for negative numbers.");
            }

            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result = "Given number " + number + " is Prime number.";
                // System.out.println(result);
                logger.info(result);

            } else {
                result = "Given number " + number + " is Not Prime number.";
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
