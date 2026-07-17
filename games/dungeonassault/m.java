/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class m implements dp {
    static md field_a;
    private long field_b;
    static String field_f;
    static ad field_d;
    static en field_e;
    static String field_g;
    static cn field_c;

    public final String a(boolean param0) {
        if (!((m) this).a(96)) {
          if (param0) {
            if (~(350L + ((m) this).field_b) < ~kd.c(-2456)) {
              return null;
            } else {
              return ((m) this).c(63);
            }
          } else {
            ((m) this).field_b = 122L;
            if (~(350L + ((m) this).field_b) < ~kd.c(-2456)) {
              return null;
            } else {
              return ((m) this).c(63);
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1) {
        bl.field_c = 0;
        if (param0 < 82) {
          field_d = null;
          me.field_f = 0;
          wf.field_x = am.field_g;
          jc.field_e = 0;
          o.field_i = new ae(2);
          o.field_i.a(false, param1, -1, f.a(hj.field_S, eh.field_h, 1));
          return;
        } else {
          me.field_f = 0;
          wf.field_x = am.field_g;
          jc.field_e = 0;
          o.field_i = new ae(2);
          o.field_i.a(false, param1, -1, f.a(hj.field_S, eh.field_h, 1));
          return;
        }
    }

    public final od a(byte param0) {
        if (!((m) this).a(-51)) {
          if (~(350L + ((m) this).field_b) < ~kd.c(-2456)) {
            return ub.field_s;
          } else {
            if (param0 > -91) {
              java.applet.Applet discarded$2 = m.c(false);
              return ((m) this).b(false);
            } else {
              return ((m) this).b(false);
            }
          }
        } else {
          return hd.field_g;
        }
    }

    public static void d(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_a = null;
          field_g = null;
          field_d = null;
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    public final void b(int param0) {
        ((m) this).field_b = kd.c(-2456);
        if (param0 != 2899) {
            m.d(6);
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (oo.field_d < 224) {
          var1 = oo.field_d % 32;
          sf.d(-105, -var1 + (32 + oo.field_d));
          return;
        } else {
          sf.d(-93, 256);
          return;
        }
    }

    abstract String c(int param0);

    final static java.applet.Applet c(boolean param0) {
        if (!param0) {
            return null;
        }
        if (null != rc.field_b) {
            return rc.field_b;
        }
        return (java.applet.Applet) (Object) ba.field_c;
    }

    abstract od b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new md();
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_g = "OK";
        field_d = new ad(4, 1, 1, 1);
    }
}
