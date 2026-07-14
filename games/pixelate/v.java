/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v {
    static String[] field_a;
    static pd field_e;
    static int field_d;
    static int field_c;
    static id field_b;
    private static String field_z;

    abstract void a(int param0, java.awt.Component param1);

    abstract int b(boolean param0);

    abstract void a(java.awt.Component param0, int param1);

    public static void a(boolean param0) {
        if (param0) {
            v.a(true);
            field_b = null;
            field_a = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "v.D(";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
