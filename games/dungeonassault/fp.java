/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp {
    static cn field_b;
    static String field_e;
    static int[] field_c;
    static String field_a;
    static tf field_d;

    public static void a() {
        field_a = null;
        field_d = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        bl.field_r.a((byte) 62);
        if (param0 > 51) {
          if (!hb.field_a.b((byte) 60)) {
            int discarded$10 = 0;
            return bk.a();
          } else {
            return 0;
          }
        } else {
          int discarded$11 = fp.a((byte) 113);
          if (!hb.field_a.b((byte) 60)) {
            int discarded$12 = 0;
            return bk.a();
          } else {
            return 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<col=8B1717>Charge</col> - <%col_attack>+1 Attack</col>, <%col_defence>-1 Defence</col>";
        field_a = "That name is not available";
    }
}
