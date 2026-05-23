public class OperatorDemo{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        
        arithmeticOperators(a, b);
        relationalOperators(a, b);
        logicalOperators();
        assignmentOperators(a);
    }
    private static void arithmeticOperators(int a, int b) {
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

    }
    private static void relationalOperators(int a, int b) {
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));
    }
    private static void logicalOperator(){
        boolean x=true,y=false;
        System.out.println("\nRelational Operators:");
        System.out.println("x && y: "+(x && y));//AND
        System.out.println("x|| y" + ( x || y));//OR
        System.out.println("!x   : " + ( !x));//NOT
        
}
    private static void assignmentOperators(int a){
        System.out.println("\nRelational Operators:");
        int c;
        c=a;
        c = a;
        System.out.println("c = a : " + c);
        c +=5;
        System.out.println("c -= 3 : " + c);
        c -=3;
        System.out.println("c -= 3 : " + c);
        c *=2;
        System.out.println("c *= 2 : " + c);
        c /=2;
        System.out.println("c /= 2 : " + c);
        c %=3;
        System.out.println("c %= 3 : " + c);
    }