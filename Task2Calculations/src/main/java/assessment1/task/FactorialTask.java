package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//implementing runnable interface
public class FactorialTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(FactorialTask.class);

    private int number;
    private String result;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }

            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            result = "Factorial of " + number + " is " + factorial + ".";
            // System.err.println(result);
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
