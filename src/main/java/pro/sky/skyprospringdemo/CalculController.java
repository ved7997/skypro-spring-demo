package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculController {
    private final CalculatorServiceIntr calculatorServiceIntr;

    public CalculController(CalculatorServiceIntr calculatorServiceIntr) {
        this.calculatorServiceIntr = calculatorServiceIntr;
    }

    @GetMapping
    public String greeting(){
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping("/plus")
        public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        return  num1 + " + " + num2 + " = " + calculatorServiceIntr.plus(num1, num2);
        }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " - " + num2 + " = " + calculatorServiceIntr.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " * " + num2 + " = " + calculatorServiceIntr.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String didide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return  num1 + " / " + num2 + " = " + calculatorServiceIntr.divide(num1, num2) ;
    }

    }
