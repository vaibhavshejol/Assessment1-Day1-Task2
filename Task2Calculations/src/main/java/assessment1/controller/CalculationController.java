package assessment1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import assessment1.service.CalculationService;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class CalculationController {

    private static final Logger logger = LoggerFactory.getLogger(CalculationController.class);

    @Autowired
    CalculationService calculationService;

    //API for perform calculation on a number
    @PostMapping("/performcalculation/{number}")
    public Map<String, Object> performCalculation(@PathVariable ("number") int number){

        logger.info("Received calculation request for number: {}", number);

        //Created a map reference for return a result
        Map<String, Object> resultMap=null;

        try {
            //calling to performCalculation method along with a number
            resultMap=calculationService.performCalculation(number);
            logger.info("Calculation tasks started for number: {}", number);
        } catch (Exception ex) {
            logger.error("Exception occurred while performing calculations for number {}: {}", number, ex.getMessage());
        }

        
        logger.info("Calculation completed for number: {}. Results: {}", number, resultMap);
        
        return resultMap;

    }
}
