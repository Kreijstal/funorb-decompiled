/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static String field_b;
    static cr field_c;
    static String field_a;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        var2 = (-268435329 & param1) << 4;
        ke.field_e[3] = oo.field_h[var2];
        if (!param0) {
          return;
        } else {
          ke.field_e[4] = 0;
          ke.field_e[5] = -oo.field_j[var2];
          ke.field_e[7] = 65536;
          ke.field_e[6] = 0;
          ke.field_e[8] = 0;
          ke.field_e[9] = oo.field_j[var2];
          ke.field_e[10] = 0;
          ke.field_e[11] = oo.field_h[var2];
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Send private message to <%0>";
        field_a = "Drawn";
    }
}
