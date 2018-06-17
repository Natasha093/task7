package calculator;

import java.util.*;
/**
 * Калькулятор
 * Task 5
 *
 * @author Ежова Наталья
 */

  public class Calc {
        private Scanner scanner;
        float result = 0;
        float val1;
        char operator;
        float val2;

        public Calc() {
            scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            val1 = scanner.nextFloat();
            System.out.println("Enter the second number:");
            val2 = scanner.nextFloat();
            System.out.println("Enter the operator:");
            operator = scanner.next().charAt(0);
        }

        public char set_operator() {
            return operator;
        }

        public float sum() {
            return this.val1 + this.val2;
        }

        public float sub() {
            return this.val1 - this.val2;
        }

        public float getX()
        {
        return this.val1;
        }
        public float getY()
        {
        return this.val2;
        }
}

