package by.samova.calcapp._main;

import by.samova.calcapp.service.ResultWriterService;
import by.samova.calcapp.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    System.out.println("Введите первое число:");
    double x = sc.nextDouble();
    System.out.println("Введите второе число:");
    double y = sc.nextDouble();
    System.out.println("Выберите операцию (+, -, *, /)");
    char operation = sc.next().charAt(0);
    String operDescript = "";
    double res = 0;
    switch (operation) {
        case '+':
        res = Calculator.sumUp(x,y);
        operDescript = "Операция сложения: ";
        break;
        case '-':
        res = Calculator.subtract(x,y);
        operDescript = "Операция вычитания: ";
        break;
        case '*':
        res = Calculator.multiply(x,y);
        operDescript = "Операция умножения: ";
        break;
        case '/':
        res = Calculator.division(x,y);
        operDescript = "Операция деления: ";
        break;
    }
    ResultWriterService.printResult(operDescript, x, y, operation, res);
    }
}