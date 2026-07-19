/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_g;
    static hb field_e;
    static String field_f;
    static int field_a;
    static int field_c;
    static int field_h;
    static int field_d;
    static int field_b;

    public static void a(byte param0) {
        if (param0 > -42) {
          field_g = (String) null;
          field_f = null;
          field_g = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        java.awt.Component var2 = null;
        hc.field_Q = false;
        lh.field_s = -1;
        if (param0 > 120) {
          if (null != ki.field_d) {
            je.a((byte) 15, ki.field_d);
            ub.field_n = -1;
            ki.field_d = null;
            nj.field_g = -1;
            return;
          } else {
            ub.field_n = -1;
            ki.field_d = null;
            nj.field_g = -1;
            return;
          }
        } else {
          var2 = (java.awt.Component) null;
          sd.a((byte) -66, (java.awt.Component) null);
          if (null == ki.field_d) {
            ub.field_n = -1;
            ki.field_d = null;
            nj.field_g = -1;
            return;
          } else {
            je.a((byte) 15, ki.field_d);
            ub.field_n = -1;
            ki.field_d = null;
            nj.field_g = -1;
            return;
          }
        }
    }

    final static void b(int param0) {
        if (!(null == pg.field_p)) {
            je.a((byte) 15, pg.field_p);
        }
        int var1 = 50 % ((param0 - 45) / 48);
        pg.field_p = null;
        ok.field_a = null;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(hl.field_d);
            if (param0 != 69) {
                java.awt.Component var3 = (java.awt.Component) null;
                sd.a((byte) 28, (java.awt.Component) null);
            }
            param1.removeFocusListener(hl.field_d);
            df.field_Q = -1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "sd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Music: ";
        field_e = new hb("email");
        field_d = 0;
        field_b = -1;
    }
}
