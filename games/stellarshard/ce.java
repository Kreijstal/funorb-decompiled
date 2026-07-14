/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_f;
    static long[] field_c;
    static volatile int field_e;
    static int field_b;
    static int field_d;
    static String field_g;
    static pb field_a;
    private static String field_z;

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        if (param0 <= 123) {
          field_e = -62;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ce.A(";
        field_e = 0;
        field_c = new long[32];
        field_d = 20;
        field_f = "Score: ";
        field_g = "Invalid password.";
    }
}
