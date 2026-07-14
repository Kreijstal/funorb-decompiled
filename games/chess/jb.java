/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb implements vb {
    static String field_c;
    static String field_d;
    static int field_b;
    static dd field_e;
    private long field_a;
    static int field_f;

    final static int a(byte param0, int param1, boolean param2, int param3) {
        if (param0 <= 51) {
            return 108;
        }
        return ve.f((byte) -76);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param0 != -89) {
          field_c = null;
          var1 = ug.field_b * ug.field_b;
          var2 = var1 - da.field_F * da.field_F;
          var3 = cb.field_a - -(var2 * (-cb.field_a + Chess.field_E) / var1);
          uh.field_m.a(fl.field_x, 640, -2147483648, 120, var3);
          ga.a(5, 640, 0, 22478, ri.field_g, -24 + Chess.field_E, qc.field_e);
          return;
        } else {
          var1 = ug.field_b * ug.field_b;
          var2 = var1 - da.field_F * da.field_F;
          var3 = cb.field_a - -(var2 * (-cb.field_a + Chess.field_E) / var1);
          uh.field_m.a(fl.field_x, 640, -2147483648, 120, var3);
          ga.a(5, 640, 0, 22478, ri.field_g, -24 + Chess.field_E, qc.field_e);
          return;
        }
    }

    public final String a(boolean param0) {
        if (!((jb) this).b(14496)) {
          if (350L + ((jb) this).field_a <= ud.a(2)) {
            if (param0) {
              jb.a(-51, false);
              return ((jb) this).d(47);
            } else {
              return ((jb) this).d(47);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String d(int param0);

    public final void b(boolean param0) {
        ((jb) this).field_a = ud.a(2);
        if (!param0) {
            field_c = null;
        }
    }

    abstract mk e(int param0);

    final static void a(int param0, boolean param1) {
        if (param0 != -7093) {
            return;
        }
        ol.a((byte) -23, param1);
        de.a(0, param1);
    }

    public static void c(int param0) {
        if (param0 != 350) {
            return;
        }
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, jk param5, int param6, int param7, int param8) {
        of.field_g = param4;
        ml.field_h = param1;
        lg.field_f = param8;
        ln.field_oc = param6;
        uj.field_n = param7;
        tg.field_t = param2;
        ue.field_e = param3;
        ol.field_N = param5;
        qh.field_c = (wm) (Object) new ob();
        if (param0 != 350) {
          field_c = null;
          ba.field_O = new on(param5);
          ge.field_fb = new hj(qh.field_c, ba.field_O);
          return;
        } else {
          ba.field_O = new on(param5);
          ge.field_fb = new hj(qh.field_c, ba.field_O);
          return;
        }
    }

    final static String f(int param0) {
        int var1 = -127 / ((param0 - -31) / 56);
        if (!(g.field_a != ci.field_ub)) {
            return oc.field_o;
        }
        if (!pi.field_c.b((byte) 107)) {
            return pi.field_c.a((byte) -98);
        }
        if (!(vl.field_A != ci.field_ub)) {
            return pi.field_c.a((byte) -83);
        }
        return pi.field_a;
    }

    public final mk a(int param0) {
        if (!((jb) this).b(14496)) {
          if ((ud.a(2) ^ -1L) > (350L + ((jb) this).field_a ^ -1L)) {
            return in.field_g;
          } else {
            if (param0 != 21314) {
              field_e = null;
              return ((jb) this).e(param0 + -21310);
            } else {
              return ((jb) this).e(param0 + -21310);
            }
          }
        } else {
          return qf.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Allow spectators?";
        field_c = "You do not have a suitable number of players for the current options.";
    }
}
