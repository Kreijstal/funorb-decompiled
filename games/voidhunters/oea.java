/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oea extends rqa {
    static double field_q;
    static int field_o;
    static String field_p;

    oea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 != -113) {
            field_q = 0.2696625605172165;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(165, 62, param0[0].a(27));
        if (param1 >= -119) {
          field_q = -0.13999182188760953;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static int[] f(byte param0) {
        int var1 = 5 / ((18 - param0) / 54);
        return new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = Math.atan2(1.0, 0.0);
    }
}
