public class Unit1 {
    public void run() {
        // Topic 1.1 
        System.out.print("Hello, this is printed without a newline. "); // MOD-1.A.1
        System.out.println("Now this is printed with a newline.");     // MOD-1.A.2

        String greeting = "Welcome to Unit 1!";                          // VAR-1.A.1
        System.out.println(greeting);

        // Topic 1.2
        int age = 17;                 // VAR-1.C.1
        double gpa = 3.85;            // VAR-1.C.1
        boolean isStudent = true;    // VAR-1.C.1
        final int MAX_SCORE = 100;   // VAR-1.C.4

        // Types are domains with operations (VAR-1.B.1)
        // Primitive types: int, double, boolean (VAR-1.B.2)
        // Reference types: String (VAR-1.B.2, VAR-1.B.3)

        // Memory behavior of primitive variables (VAR-1.C.2, VAR-1.C.3)
        int score = 90;
        System.out.println("Score stored in memory: " + score);

        // Topic 1.3 
        int a = 5 + 3;                // CON-1.A.1 - CON-1.A.3
        double b = 7 / 2.0;          // CON-1.A.5
        int c = 10 % 3;              // CON-1.A.3
        int e = 5 + 3 * 2;           // CON-1.A.6, CON-1.A.7
        int d = 10 / 0;              // (CON-1.A.8)

        int value = 20;
        value = value + 5;           // CON-1.B.1
        int result = value * 2;      // CON-1.B.2
        double calc = result / 3.0;  // CON-1.B.3
        System.out.println("Expression result: " + calc);

        // Topic 1.4 
        int x = 10;
        x += 5;                      // CON-1.B.4
        x -= 3;                      // CON-1.B.4
        x *= 2;
        x++;                        // CON-1.B.5
        System.out.println("Updated x: " + x);

        // Topic 1.5
        double price = 19.99;
        int priceInt = (int) price;  // CON-1.C.2
        double widened = age;        // CON-1.C.3
        int rounded = (int)(price + 0.5); // CON-1.C.4

        // Integer range and overflow (CON-1.C.5, C.6)
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 1;  // Will overflow

        System.out.println("Casting double to int: " + priceInt);
        System.out.println("Widening int to double: " + widened);
        System.out.println("Rounded price: " + rounded);
        System.out.println("Overflowed int value: " + overflow);
    }
}