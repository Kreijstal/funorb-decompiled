/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static tf field_h;
    static double field_f;
    static int field_a;
    static int field_b;
    static boolean field_c;
    static int field_d;
    static int field_g;
    static wm field_e;
    static ak field_i;

    final static int a(double param0, int param1) {
        if (param1 != 65536) {
            field_i = null;
            return (int)(65536.0 * param0);
        }
        return (int)(65536.0 * param0);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 59) {
            return;
        }
        field_h = null;
        field_i = null;
    }

    final static String a(byte[] param0, int param1) {
        if (param1 != 1) {
          int discarded$2 = of.a(1.9411644295127344, -72);
          return ui.a(true, param0, 0, param0.length);
        } else {
          return ui.a(true, param0, 0, param0.length);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = Math.atan2(1.0, 0.0);
        field_e = new wm(11, 0, 1, 2);
    }
}
