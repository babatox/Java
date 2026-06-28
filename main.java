interface calculator{
    int divide(int a, int b)throws ArithmeticException;
}

class simpleCalculator implements calculator{
   @Override
   public int divide(int a, int b) throws ArithmeticException {
        if(b==0)
            throw new ArithmeticException("Division by zero is not allowed.");
        return a/b;
    }
}

public class main {
    public static void main(String[]args){
        calculator calc = new simpleCalculator();
        try {
            int result = calc.divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
