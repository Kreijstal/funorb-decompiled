/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static String field_b;
    static String field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 8450) {
            field_a = null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) sj.field_d);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) sj.field_d);
        bg.field_rb = -1;
        if (param0 > -87) {
            field_a = null;
        }
    }

    final static ad a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        ad var9 = null;
        var9 = new ad(param0, param3, param6, param4, param5, param2, param1);
        if (param7 <= 50) {
          return null;
        } else {
          od.field_b.a((qb) (Object) var9, 27362);
          aa.a(var9, 3298, param8);
          return var9;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achieved";
        field_c = "Player names can be up to 12 letters, numbers and underscores";
        field_a = null;
    }
}
