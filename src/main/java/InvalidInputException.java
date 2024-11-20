package PACKAGE_NAME;public class InvalidInputException {
}
public class Calculator {

    // Метод додавання
    public double add(double a, double b) {
        return a + b;
    }

    // Метод віднімання
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод множення
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод ділення
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Помилка: Ділення на нуль!");
        }
        return a / b;
    }

    // Метод для перевірки вхідних значень
    public void validateInput(double a, double b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Помилка: Вхідні значення не повинні бути меншими за нуль!");
        }
    }
}
