/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static StringBuilder field_a;
    static int field_f;
    static String field_d;
    static int field_b;
    static String field_e;
    static String field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_e = (String) null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        field_z = "mp.A(";
        field_a = new StringBuilder(80);
        field_d = "Confirm Email:";
        field_e = "Invalid password.";
        field_b = 0;
        field_c = "You appear to be telling someone your password - please don't!";
    }
}
