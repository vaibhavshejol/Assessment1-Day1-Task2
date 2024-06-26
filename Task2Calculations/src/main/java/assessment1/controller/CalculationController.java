package assessment1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import assessment1.task.CubeTask;
import assessment1.task.SquareTask;


@RestController
public class CalculationController {

    @PostMapping("/performcalculation/{number}")
    public String performCalculation(@PathVariable ("number") int number){

        Thread squreThread=new Thread(new SquareTask(number));
        Thread cubThread=new Thread(new CubeTask(number));
        
        return null;

    }
}
