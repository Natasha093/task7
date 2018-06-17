package calculator;

public class Calculator {
    public static void main(String[] args) {
        Calс2 cal = new Calс2();
        if (cal.operator != '+' && cal.operator != '-' && cal.operator != '*' && cal.operator != '/') {
            System.out.println("You must enter a valid operator");
            cal.set_operator(); //to set operator
        } else {
            switch (cal.operator) {
                case '+':
                    cal.result = cal.sum();
                    break;
                case '-':
                    cal.result = cal.sub();
                    break;
                case '*':
                    cal.result = cal.mult();
                    break;
                case '/':
                    cal.result = cal.div();
                    break;
            }
            System.out.printf("Result: " + "%.4f", cal.result);
        }
    }
}


