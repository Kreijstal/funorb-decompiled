/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_a;
    static boolean field_b;
    int field_e;
    static String field_c;
    vj field_g;
    static ck field_h;
    static String field_i;
    int field_f;
    static long field_d;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -19893) {
          lb.a(101);
          field_h = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_i = null;
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = "You must play <%1> more rated games before playing with the current options.";
        field_c = "Show chat (1 unread message)";
        field_i = "Inviting <%0>";
    }
}
