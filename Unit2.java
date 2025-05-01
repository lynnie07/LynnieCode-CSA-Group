class Unit2 {
    public void run() {
        // Creating objects (MOD-1.B, MOD-1.C, MOD-1.D)
        String name = new String("Lynnie"); // MOD-1.C.1–C.3
        System.out.println("Created string object: " + name);

        // Overloaded constructor and parameter compatibility (MOD-1.C.4–C.5)
        String copy = new String(name);
        System.out.println("Copy string: " + copy);

        // Call by value explanation (MOD-1.C.6)
        printName(copy);

        // Object creation with 'new', memory reference (MOD-1.D.1–D.4)
        String another = new String("Test");
        System.out.println("Object reference: " + another);

        // Reference types and null (VAR-1.D.1–D.2)
        String nothing = null;
        if (nothing == null) {
            System.out.println("nothing is null");
        }

        // Calling methods (MOD-1.E–G)
        int len = name.length(); // MOD-1.G.1
        System.out.println("Length of name: " + len);

        String sub = name.substring(1, 4); 
        System.out.println("Substring from index 1 to 3: " + sub);

        // String concatenation, immutability, escape (VAR-1.E.1–E.5)
        String intro = "Hello, my name is " + name + ".\n";
        System.out.println(intro);

        // Procedural abstraction (MOD-1.E.2), signature (MOD-1.E.3), void (MOD-1.E.7)
        greet();

        // NullPointerException (MOD-1.E.8)
        String error = null;
        try {
            System.out.println(error.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
        }

        // Overloaded method (MOD-1.F.3)
        greet("Lynnie");

        // Math class static methods and manipulation (MOD-1.H, CON-1.D)
        double square = Math.pow(3, 2); // CON-1.D.3
        double rand = Math.random();    // CON-1.D.3
        int randomInt = (int)(Math.random() * 10 + 1); // CON-1.D.4
        System.out.println("3 squared is: " + square);
        System.out.println("Random number: " + rand);
        System.out.println("Random int (1–10): " + randomInt);
    }

    void printName(String n) {
        System.out.println("Name from method: " + n);
    }

    void greet() {
        System.out.println("Hello there!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
