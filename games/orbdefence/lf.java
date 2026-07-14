/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_e;
    static String field_c;
    static int field_d;
    static im field_b;
    static ki field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = -2 % ((param0 - 29) / 52);
    }

    final static qj a(String param0, boolean param1) {
        if (param1) {
          if (tg.field_c != mg.field_m) {
            if (kf.field_d == tg.field_c) {
              if (!param0.equals((Object) (Object) pg.field_a)) {
                uc.field_q = null;
                pg.field_a = param0;
                tg.field_c = mg.field_m;
                return null;
              } else {
                tg.field_c = tl.field_h;
                return uc.field_q;
              }
            } else {
              uc.field_q = null;
              pg.field_a = param0;
              tg.field_c = mg.field_m;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
