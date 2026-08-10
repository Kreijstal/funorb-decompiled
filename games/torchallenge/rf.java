/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends dj implements uh {
    private wd field_fb;
    private int field_gb;
    static int field_ib;
    static sl field_db;
    static int[] field_hb;
    static int[][] field_eb;
    static int[] field_jb;

    public static void i(byte param0) {
        field_eb = (int[][]) null;
        field_jb = null;
        if (param0 < 6) {
          field_ib = 113;
          field_hb = null;
          field_db = null;
          return;
        } else {
          field_hb = null;
          field_db = null;
          return;
        }
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        try {
            super.a(param0, param1, (byte) -114, param3);
            if (param2 >= -97) {
                field_jb = (int[]) null;
            }
            this.field_gb = kc.field_u - this.field_m - param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rf.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void n(int param0) {
        ie.field_g = null;
        ul.field_n = -1;
        bk.field_p = 0;
        sj.field_R = false;
        bi.field_h = -1;
        if (param0 != 19630) {
            rf.m(119);
        }
    }

    final static void a(lj param0, byte param1, boolean param2, lj param3, lj param4) {
        try {
            ji.field_k = og.a("", true);
            ji.field_k.a((byte) 56, false);
            vj.a(param4, param3, param1 + 23104, param0);
            ul.c(-1247);
            if (param1 != -23) {
                lj var6 = (lj) null;
                rf.a((lj) null, (byte) 35, false, (lj) null, (lj) null);
            }
            gj.field_a = mg.field_c;
            eh.field_p = mg.field_c;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rf.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(boolean param0) {
        if (this.field_w) {
          if (this.field_r != null) {
            if (param0) {
              field_jb = (int[]) null;
              sl.a(this.field_p - (this.field_gb - kc.field_u), ph.field_d, -6665);
              return this.field_r;
            } else {
              sl.a(this.field_p - (this.field_gb - kc.field_u), ph.field_d, -6665);
              return this.field_r;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void k(int param0) {
        L0: {
          super.k(-95);
          if (this.field_fb != null) {
            this.field_fb.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -79) {
          field_db = (sl) null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, wd param1) {
        try {
            this.field_fb = param1;
            if (param0 != -27997) {
                this.k(-38);
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rf.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final wd a(int param0) {
        if (param0 > -101) {
            return (wd) null;
        }
        return this.field_fb;
    }

    rf(String param0, gg param1, int param2) {
        super(param0, param1, param2);
    }

    final static void m(int param0) {
        int var1;
        int var2;
        if (param0 != 62) {
          return;
        } else {
          var1 = fl.f(param0 + -62);
          var2 = o.a(18);
          gb.field_f.a(var2 - -(mg.field_d << -326978687), jl.field_e + -mg.field_d, -1, -i.field_m + qe.field_R, var1 - -(i.field_m << -1913119871));
          m.a((byte) 118);
          return;
        }
    }

    static {
        field_ib = 0;
        field_db = new sl();
        field_hb = new int[]{0, 0, 1, 0, 0, 1, 2, 3, 4};
        field_eb = new int[][]{new int[]{384, 413, 244, 56}, new int[]{384, 413, 247, 62}, new int[]{411, 413, 184, 55}};
        field_jb = new int[]{2048, 8388608, 8};
    }
}
