/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_c;
    static java.awt.Frame field_d;
    static th field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -71) {
            field_d = (java.awt.Frame) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + ed.a(-1, param1, "\n", "%0a"));
        if (param0 >= -95) {
            field_a = false;
        }
    }

    static {
        field_c = "to over <%0> great games";
        field_b = null;
    }
}
