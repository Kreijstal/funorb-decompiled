/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends me {
    static qf field_l;
    static String field_o;
    static int field_m;
    static String field_p;
    static boolean field_n;
    static int field_k;

    final void a(byte param0, dc param1, kq param2) {
        if (param0 > -9) {
            return;
        }
    }

    public static void c(int param0) {
        if (param0 < 36) {
            return;
        }
        field_p = null;
        field_l = null;
        field_o = null;
    }

    final static qf a(byte param0, int param1, String param2) {
        if (param0 > -92) {
          field_l = null;
          return new qf(mj.field_Sb.a("", param2, -22888), param1);
        } else {
          return new qf(mj.field_Sb.a("", param2, -22888), param1);
        }
    }

    final void a(int param0, ob param1) {
        int var3 = -114 / ((-72 - param0) / 45);
    }

    final int b(boolean param0) {
        if (param0) {
            return 8;
        }
        return -1;
    }

    final static nk[] c(boolean param0) {
        nk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = new nk[en.field_c];
        var2 = 0;
        L0: while (true) {
          if (en.field_c <= var2) {
            if (!param0) {
              var4 = null;
              qf discarded$2 = jj.a((byte) 73, 51, (String) null);
              pd.a(0);
              return var1;
            } else {
              pd.a(0);
              return var1;
            }
          } else {
            var1[var2] = new nk(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], hd.field_q[var2], eo.field_fb);
            var2++;
            continue L0;
          }
        }
    }

    jj(fs[] param0) {
        super(param0);
    }

    final fs[] b(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((jj) this).a((ob) null, (byte) -82);
            return new fs[]{};
        }
        return new fs[]{};
    }

    final void a(ob param0, byte param1) {
        if (param1 != -109) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_n = false;
        field_p = "Offline";
    }
}
