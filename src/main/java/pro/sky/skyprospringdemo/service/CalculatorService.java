package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService  {

    int plus(int num1, int num2);

    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2);


}
