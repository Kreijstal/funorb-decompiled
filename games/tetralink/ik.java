/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static uf field_d;
    static double field_b;
    static int field_e;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_f;

    final static sj a(int param0) {
        if (fk.field_Q != ma.field_d) {
          if (field_d != ma.field_d) {
            if (param0 >= 126) {
              return null;
            } else {
              return null;
            }
          } else {
            ma.field_d = fk.field_Q;
            return va.field_n;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != -137) {
          var2 = null;
          Object discarded$2 = ik.a((byte[]) null, false, -83);
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        la var3 = null;
        if (param0 != null) {
          if (param2 <= (param0.length ^ -1)) {
            if (!param1) {
              return (Object) (Object) param0;
            } else {
              return (Object) (Object) ak.a(-14074, param0);
            }
          } else {
            var3 = new la();
            ((jd) (Object) var3).a(-10543, param0);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new uf();
        field_b = Math.atan2(1.0, 0.0);
    }
}
