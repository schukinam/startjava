public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 7;
        System.out.println("Первое число: " + firstNumber);
        int secondNumber = 3;
        System.out.println("Второе число: " + secondNumber);
        // available opertations: + - * / ^ %
        char operation = '^';
        System.out.println("Операция: " + operation);
        float mathResult = 0f;

        if(operation == '+') {
            mathResult = firstNumber + secondNumber;
        } else if(operation == '-') {
            mathResult = firstNumber - secondNumber;
        } else if(operation == '*') {
            mathResult = firstNumber * secondNumber;
        } else if(operation == '/') {
            mathResult = (float) firstNumber / secondNumber;
        } else if(operation == '^') {
            mathResult = firstNumber;
            for(int i = 2; i <= secondNumber; i++) {
                mathResult *= firstNumber;
            }
        } else if(operation == '%') {
            mathResult = firstNumber % secondNumber;
        } else {
            System.out.println("Операция не выбрана");
            return;
        }
        System.out.println("Результат выполнения операции: " + mathResult);
    }
}