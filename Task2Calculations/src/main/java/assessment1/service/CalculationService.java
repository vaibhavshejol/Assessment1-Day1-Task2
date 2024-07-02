package assessment1.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import assessment1.task.ArmstrongOrNotTask;
import assessment1.task.CubeTask;
import assessment1.task.EvenOddTask;
import assessment1.task.FactorialTask;
import assessment1.task.PalimdromeOrNotTask;
import assessment1.task.PrimeOrNotTask;
import assessment1.task.ReverseTask;
import assessment1.task.SquareTask;

@Service
public class CalculationService {

    private static final Logger logger = LoggerFactory.getLogger(CalculationService.class);
    
    public Map<String, Object> performCalculation(int number){

        //Created a map referece to store results
        Map<String, Object> resultMap = new LinkedHashMap<>();

        //Here we created object of related task
        //and passed that object as parameter in contructor of Thread class
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

        //Here we call start method of Thread class and it will call internally run method
        squreThread.start();
        cubThread.start();
        evenoddThread.start();
        primeThread.start();
        armstrongThread.start();
        palimdromeThread.start();
        factorialThread.start();
        reverseThread.start();

        try {
            // Join threads to wait for completion
            squreThread.join();
            cubThread.join();
            evenoddThread.join();
            primeThread.join();
            armstrongThread.join();
            palimdromeThread.join();
            factorialThread.join();
            reverseThread.join();
        } catch (InterruptedException e) {
            logger.error("Thread interrupted while waiting for calculation tasks to complete", e);
            Thread.currentThread().interrupt();
        }

        //Here we collecting data or retrieving data
        resultMap.put("Squre", squareTask.getResult());
        resultMap.put("Cube", cubeTask.getResult());
        resultMap.put("EvenOrOdd", evenOddTask.getResult());
        resultMap.put("PrimeOrNot", primeOrNotTask.getResult());
        resultMap.put("ArmstrongOrNot", armstrongOrNotTask.getResult());
        resultMap.put("PalimdromOrNot", palimdromeOrNotTask.getResult());
        resultMap.put("Factorial", factorialTask.getResult());
        resultMap.put("Reverse", reverseTask.getResult());

        return resultMap;
    }
}
