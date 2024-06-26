package assessment1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import assessment1.task.ArmstrongOrNotTask;
import assessment1.task.CubeTask;
import assessment1.task.EvenOddTask;
import assessment1.task.FactorialTask;
import assessment1.task.PalimdromeOrNotTask;
import assessment1.task.PrimeOrNotTask;
import assessment1.task.ReverseTask;
import assessment1.task.SquareTask;

import java.util.Map;
import java.util.LinkedHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class CalculationController {

    private static final Logger logger = LoggerFactory.getLogger(CalculationController.class);

    @PostMapping("/performcalculation/{number}")
    public Map<String, Object> performCalculation(@PathVariable ("number") int number){

        logger.info("Received calculation request for number: {}", number);

        Map<String, Object> resultMap = new LinkedHashMap<>();

        SquareTask squareTask=new SquareTask(number);
        Thread squreThread=new Thread(squareTask);

        CubeTask cubeTask=new CubeTask(number);
        Thread cubThread=new Thread(cubeTask);

        EvenOddTask evenOddTask=new EvenOddTask(number);
        Thread evenoddThread=new Thread(evenOddTask);

        PrimeOrNotTask primeOrNotTask=new PrimeOrNotTask(number);
        Thread primeThread=new Thread(primeOrNotTask);

        ArmstrongOrNotTask armstrongOrNotTask=new ArmstrongOrNotTask(number);
        Thread armstrongThread=new Thread(armstrongOrNotTask);

        PalimdromeOrNotTask palimdromeOrNotTask=new PalimdromeOrNotTask(number);
        Thread palimdromeThread=new Thread(palimdromeOrNotTask);

        FactorialTask factorialTask=new FactorialTask(number);
        Thread factorialThread=new Thread(factorialTask);

        ReverseTask reverseTask=new ReverseTask(number);
        Thread reverseThread=new Thread(reverseTask);

        squreThread.run();
        cubThread.run();
        evenoddThread.run();
        primeThread.run();
        armstrongThread.run();
        palimdromeThread.run();
        factorialThread.run();
        reverseThread.run();

        resultMap.put("Squre", squareTask.getResult());
        resultMap.put("Cube", cubeTask.getResult());
        resultMap.put("EvenOrOdd", evenOddTask.getResult());
        resultMap.put("PrimeOrNot", primeOrNotTask.getResult());
        resultMap.put("ArmstrongOrNot", armstrongOrNotTask.getResult());
        resultMap.put("PalimdromOrNot", palimdromeOrNotTask.getResult());
        resultMap.put("Factorial", factorialTask.getResult());
        resultMap.put("Reverse", reverseTask.getResult());


        logger.info("Calculation completed for number: {}. Results: {}", number, resultMap);
        
        return resultMap;

    }
}
