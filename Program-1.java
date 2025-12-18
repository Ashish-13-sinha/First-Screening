class Calculator {

    double a;
    double b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
  double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "multiply":
            case "*":
                return a * b;

            case "divide":
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
public Main{
  public static void main(String []args){
     Calculator cal = new Calculator(12.5, 4.5, "divide");
        System.out.println("Result: " + cal.calculate());

        Calculator cal1 = new Calculator(30, 0, "add");
        System.out.println("Result: " + cal1.calculate());
  }
}

