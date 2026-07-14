/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_f;
    static String field_a;
    static tq field_e;
    kl field_b;
    static cr field_c;
    static double field_g;
    static bh field_d;

    final static nh a(ed param0, byte param1) {
        if (param1 != 92) {
          return null;
        } else {
          return new nh(param0.n(2), param0.n(2), param0.n(2), param0.n(2), param0.m(0), param0.h(-11));
        }
    }

    final static void a(int param0) {
        ii.field_z = false;
        if (param0 != 11141) {
            field_g = -0.2747850976542781;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 >= -47) {
          field_f = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param1 != 14017) {
          return;
        } else {
          var6 = 24;
          var7 = 5;
          ((lb) this).field_b.a(var7, 12318, param3, param2, var6, param4, param0);
          el.field_a.a(94, wi.field_g.field_Fb, r.field_f, 0, 0);
          jg.field_q.a(114, -4 + (-re.field_k + wi.field_g.field_Fb - 80), 18, r.field_f + 2, 0);
          va.field_f.a(param1 ^ 14013, 82 + re.field_k, 18, 2 + r.field_f, -82 + (wi.field_g.field_Fb + -re.field_k));
          h.field_D.a(-r.field_f + (wi.field_g.field_db - 2 + -20), 20, wi.field_g.field_Fb, 2, 1, 0, re.field_k, 2 + r.field_f + 20);
          ao.field_O.a(re.field_k, true, 2, 20);
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 != 80) {
            return;
        }
        rp.a(param0, param1 ^ -2160, "");
        pd.a(param0, param1 + 999920);
    }

    lb(String param0, cr param1) {
        String[] var3 = new String[]{param0, uo.field_j, dm.field_Ib};
        cr[] var4 = new cr[]{param1, wi.field_g, (cr) (Object) ao.field_O};
        ((lb) this).field_b = new kl(0L, qr.field_m, var3, ab.field_d, var4, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Invalid date";
        field_f = "Try changing the following settings:  ";
        field_e = new tq(3);
        field_g = Math.atan2(1.0, 0.0);
        field_d = null;
    }
}
