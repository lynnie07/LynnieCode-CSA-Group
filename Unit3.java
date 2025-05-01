class Unit3 {
    public void run() {
        // Boolean expressions and if/else (CON-1.E.1–E.3, CON-2.A.1–A.4)
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        // Nested if (CON-2.B.1)
        boolean late = true;
        boolean excused = false;
        if (late) {
            if (!excused) {
                System.out.println("Unexcused Tardy");
            }
        }

        // Compound Boolean (CON-1.F.1–F.3)
        boolean hasPass = true;
        boolean hasID = false;
        if (hasPass && hasID) {
            System.out.println("Entry granted.");
        } else {
            System.out.println("Access denied.");
        }

        // Equivalent expressions (CON-1.G.1–G.3)
        boolean expr1 = !(hasPass || hasID);
        boolean expr2 = !hasPass && !hasID;
        System.out.println("Equivalent logic: " + (expr1 == expr2));

        // Comparing objects (CON-1.H.1–H.4)
        String s1 = new String("test");
        String s2 = new String("test");
        String s3 = s1;

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 have equal content");
        }
        if (s1 == s3) {
            System.out.println("s1 and s3 are aliases");
        }
        if (s1 != null) {
            System.out.println("s1 is not null");
        }
    }
}

