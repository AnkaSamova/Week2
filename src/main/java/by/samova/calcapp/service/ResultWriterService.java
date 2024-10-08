package by.samova.calcapp.service;

public class ResultWriterService {
    public static void printResult (String operDescript, double x, double y, char operation, double res) {
        System.out.println(operDescript + x + " " + operation + " " + y + " " + "= " + res);
    }
}