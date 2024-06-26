package assessment1.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CubeTask implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(CubeTask.class);


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
            // System.out.println(result);
            logger.info(result);

        } catch (Exception ex) {
            // System.out.println("Error is : " + ex);
            logger.error("Error occurred while calculating cube for number " + number, ex);
        }
    }

    public String getResult() {
        return result;
    }

}
