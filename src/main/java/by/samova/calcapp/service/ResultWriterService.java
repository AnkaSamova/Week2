package by.samova.calcapp.service;

public class ResultWriterService {
    public static void printResult (String oper, double x, double y, char operation, double res) {
        System.out.println(oper + x + " " + operation + " " + y + " " + "= " + res);
    }
}