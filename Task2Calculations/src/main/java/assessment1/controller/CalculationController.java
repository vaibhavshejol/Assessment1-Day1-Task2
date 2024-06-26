package assessment1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    
    @PostMapping("/performcalculation/{number}")
    public String performCalculation(@PathVariable ("number") int number){

        
        return null;

    }
}
