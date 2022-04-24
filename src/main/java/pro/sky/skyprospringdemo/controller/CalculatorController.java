package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.service.CalculatorService;
import pro.sky.skyprospringdemo.service.impl.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting(){
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping("/plus")
        public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
        }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String didide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

    }
