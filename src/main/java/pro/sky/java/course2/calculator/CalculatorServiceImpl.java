package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcomeCalculator() {
        return "<h2>Добро пожаловать <b>в калькулятор!</b></h1>";
    }

    @Override
    public String plus(String arg1, String arg2) {
        try {
            Double num1 = Double.valueOf(arg1);
            Double num2 = Double.valueOf(arg2);

            if (num1.isNaN()) {
                return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
            }

            if (num2.isNaN()) {
                return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
            }

            double result = num1 + num2;
            NumberFormat nf = new DecimalFormat("#.######");
            String resultString = nf.format(result);
            return arg1.replace(".", ",") + " + " + arg2.replace(".", ",") + " = " + resultString;
        } catch (NumberFormatException e) {
            String error = "Неверно задан операнд! " + e.getMessage();
            return error;
        }
    }
    @Override
    public String minus(String arg1, String arg2) {
        try {
            Double num1 = Double.valueOf(arg1);
            Double num2 = Double.valueOf(arg2);

            if (num1.isNaN()) {
                return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
            }

            if (num2.isNaN()) {
                return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
            }

            double result = num1 - num2;
            NumberFormat nf = new DecimalFormat("#.######");
            String resultString = nf.format(result);
            return arg1.replace(".", ",") + " - " + arg2.replace(".", ",") + " = " + resultString;
        } catch (NumberFormatException e) {
            String error = "Неверно задан операнд! " + e.getMessage();
            return error;
        }
    }

    @Override
    public String multiply(String arg1, String arg2) {
        try {
        Double num1 = Double.valueOf(arg1);
        Double num2 = Double.valueOf(arg2);

        if (num1.isNaN()) {
            return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
        }

        if (num2.isNaN()) {
            return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
        }

        double result = num1 * num2;
        NumberFormat nf = new DecimalFormat("#.######");
        String resultString = nf.format(result);
        return arg1.replace(".", ",") + " * " + arg2.replace(".", ",") + " = " + resultString;
        } catch (NumberFormatException e) {
            String error = "Неверно задан операнд! " + e.getMessage();
            return error;
        }
    }

    @Override
    public String divide(String arg1, String arg2) {
        try {
        Double num1 = Double.valueOf(arg1);
        Double num2 = Double.valueOf(arg2);

        if (num1.isNaN()) {
            return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
        }

        if (num2.isNaN()) {
            return "Ошибка! Аргумент \"" + arg1 + "\" не является числом!";
        }

        // проверка на нуль
        if (Math.abs(num2) < 2 * Double.MIN_VALUE ) {
            return "Ошибка! В переменной \"num2\" указан нуль!";
        }

        double result = num1 / num2;
        NumberFormat nf = new DecimalFormat("#.######");
        String resultString = nf.format(result);
        return arg1.replace(".", ",") + " / " + arg2.replace(".", ",") + " = " + resultString;
        } catch (NumberFormatException e) {
            String error = "Неверно задан операнд! " + e.getMessage();
            return error;
        }
    }
}
