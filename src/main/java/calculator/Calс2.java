package calculator;

public class Calс2 extends Calc {

    public Calс2()
    {
        super();
    }

    public float mult()
    {
        return this.getX() * this.getY();
    }

    public float div()
    { if (this.getY() ==0) {throw new ArithmeticException("Деление на ноль!");}
            return this.getX() / this.getY();

    }
}

