/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static h field_b;
    static boolean field_e;
    static vn[] field_c;
    static fk field_a;
    static String field_d;

    final static void a() {
        ag.field_c = bj.field_p + " <b>" + ap.field_s + "</b> " + oo.field_S + " <b>" + ki.field_bb + "</b> " + ub.field_j + "<br>" + "<br>" + id.field_L;
    }

    final static boolean a(byte param0) {
        if (param0 == -64) {
          if (null != sn.field_c) {
            if (df.field_j != ic.field_T) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = ng.a((byte) -16);
          if (null != sn.field_c) {
            if (df.field_j != ic.field_T) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b() {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new h();
        field_e = false;
        field_d = "Email address is unavailable";
    }
}
