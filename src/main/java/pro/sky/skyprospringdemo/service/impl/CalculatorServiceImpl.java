package pro.sky.skyprospringdemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.service.CalculatorService;
@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Division by zero is possible";
        }
        return String.valueOf(num1 / num2);
    }
}
