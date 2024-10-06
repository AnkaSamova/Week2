package by.samova.calcapp._main;
import by.samova.calcapp.util.Calculator;
import java.util.Scanner;
import by.samova.calcapp.service.ResultWriterService;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите первое число:");
    double x = sc.nextInt();

    System.out.println("Введите второе число:");
    double y = sc.nextInt();

    System.out.println("Выберите операцию (+, -, *, /)");
    char operation = sc.next().charAt(0);

    String oper = "";
    double res = 0;

        if (operation == '+') {
            res = Calculator.sumUp(x,y);
            oper = "Операция сложения: ";
        }
        if (operation == '-') {
            res = Calculator.subtract(x,y);
            oper = "Операция вычитания: ";
        }
        if (operation == '*') {
            res = Calculator.multiply(x,y);
            oper = "Операция умножения: ";
        }
        if (operation == '/') {
            res = Calculator.division(x,y);
            oper = "Операция деления: ";
        }

    ResultWriterService.printResult(oper, x, y, operation, res);
    }
    
}