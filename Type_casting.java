public class Type_casting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit Casting: " + num2);

        // Explicit Casting (Narrowing)
        double num3 = 9.78;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Casting: " + num4);
    }
}
