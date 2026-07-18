/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static hl field_c;
    static String field_f;
    static boolean[] field_a;
    static boolean field_b;
    static int[] field_e;
    static String field_d;

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + n.a(true, "%0a", "\n", param1));
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    final static String b(int param0) {
        return rb.field_Nb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> has lost connection.";
        field_a = new boolean[112];
        field_b = false;
        field_d = "You must play 1 more rated game before playing with the current options.";
    }
}
