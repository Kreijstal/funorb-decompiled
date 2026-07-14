/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static int field_d;
    static String field_b;
    static le field_e;
    static int field_c;
    static pj field_a;

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        if (param0 <= 116) {
          var2 = null;
          af.a(-67, (le[]) null, -37, -110);
          field_e = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        Object var3 = null;
        mh.a(-104, (java.awt.Component) (Object) param1);
        o.a((java.awt.Component) (Object) param1, true);
        if (eb.field_A == null) {
          if (param0 != 20) {
            var3 = null;
            af.a(-123, (java.awt.Canvas) null);
            return;
          } else {
            return;
          }
        } else {
          eb.field_A.a((java.awt.Component) (Object) param1, -8206);
          if (param0 == 20) {
            return;
          } else {
            var3 = null;
            af.a(-123, (java.awt.Canvas) null);
            return;
          }
        }
    }

    final static void a(int param0, le[] param1, int param2, int param3) {
        hh.field_u = new gg(param1);
        wg.field_h = param0;
        rb.field_cb = param2;
        int var4 = 69 / ((param3 - -60) / 41);
        vj.a((byte) -123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = "Cancel";
        field_a = new pj();
    }
}
