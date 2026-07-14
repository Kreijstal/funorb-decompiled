/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends dr {
    static wm field_L;
    static wk[] field_J;
    static boolean[] field_G;
    static String field_F;
    static um field_K;
    static wk field_I;
    static int field_E;
    static long field_H;
    static kl field_M;

    public static void g(int param0) {
        field_G = null;
        field_F = null;
        field_K = null;
        field_J = null;
        field_L = null;
        field_I = null;
        if (param0 != 21336) {
          return;
        } else {
          field_M = null;
          return;
        }
    }

    final static void e(byte param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (ql.field_e == null) {
            break L0;
          } else {
            var2 = ql.field_e;
            var1 = var2;
            wr.a((byte) 68, fo.a(4800, ra.field_l, new String[1]));
            ql.field_e = null;
            break L0;
          }
        }
        if (param0 > -127) {
          oh.e((byte) 28);
          return;
        } else {
          return;
        }
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            return null;
        }
        return new nd((Object) (Object) il.b(256, param1[0].a(2)));
    }

    oh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new boolean[56];
        field_F = "Dragonhide";
    }
}
