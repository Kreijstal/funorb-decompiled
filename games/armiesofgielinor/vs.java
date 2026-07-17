/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static String field_d;
    static boolean field_j;
    static String field_c;
    static int field_a;
    static String field_i;
    static int field_f;
    static je field_g;
    static ne[] field_e;
    static String field_h;
    static String field_b;

    final static void a(int param0, mq param1) {
        if (param1 == null) {
            return;
        }
        try {
            qd.field_I = param1;
            as.field_E.field_fb.b(75);
            as.field_E.a((je) (Object) qd.field_I, 105);
            if (param0 != 256) {
                field_j = true;
            }
            iu.field_h = true;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vs.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 >= -50) {
          return;
        } else {
          field_g = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Macroing or use of bots";
        field_h = "<%0> Mana";
        field_i = "all 6 devotee Achievements.";
        field_b = "Enemies";
        field_f = 256;
    }
}
