/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends bj implements en {
    static int[] field_jb;
    static int field_bb;
    static int field_lb;
    static int field_kb;
    static String field_gb;
    static int field_cb;
    static int field_db;
    static jp field_hb;
    private d field_ib;
    static String[] field_eb;
    static String field_fb;

    final static tp a(tp param0, byte param1, int[] param2) {
        tp var3 = null;
        if (param1 >= -57) {
          return null;
        } else {
          var3 = new tp(0, 0, 0);
          var3.field_i = param0.field_i;
          var3.field_a = param0.field_a;
          var3.field_d = param0.field_d;
          var3.field_h = param0.field_h;
          var3.field_g = param0.field_g;
          var3.field_j = param2;
          var3.field_f = param0.field_f;
          var3.field_b = param0.field_b;
          return var3;
        }
    }

    ek(cp param0, tf param1) {
        super(param0, 200, 150);
        String var5 = null;
        oc var6 = null;
        String var7 = null;
        oc var8 = null;
        Object var9 = null;
        oc var10 = null;
        String var11 = null;
        oc var12 = null;
        String var13 = null;
        oc var14 = null;
        var9 = null;
        if (mh.field_ab == param1) {
          var13 = df.field_d;
          var14 = new oc(var13, (uh) null);
          var14.field_w = 50;
          var14.field_s = 80;
          var14.field_t = ((ek) this).field_t;
          var14.field_o = 0;
          var14.field_l = (ub) (Object) new um(og.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ek) this).a(var14, true);
          ((ek) this).field_ib = this.a(oi.field_a, 101, (uh) this);
        } else {
          if (ch.field_a != param1) {
            if (param1 == rg.field_i) {
              ((ek) this).field_s = ((ek) this).field_s + 30;
              var11 = eo.field_h;
              var12 = new oc(var11, (uh) null);
              var12.field_w = 50;
              var12.field_s = 80;
              var12.field_t = ((ek) this).field_t;
              var12.field_o = 0;
              var12.field_l = (ub) (Object) new um(og.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ek) this).a(var12, true);
              ((ek) this).field_ib = this.a(oi.field_a, 101, (uh) this);
            } else {
              var10 = new oc((String) var9, (uh) null);
              var10.field_w = 50;
              var10.field_s = 80;
              var10.field_t = ((ek) this).field_t;
              var10.field_o = 0;
              var10.field_l = (ub) (Object) new um(og.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ek) this).a(var10, true);
              ((ek) this).field_ib = this.a(oi.field_a, 101, (uh) this);
            }
          } else {
            ((ek) this).field_s = ((ek) this).field_s + 10;
            var5 = oo.field_s;
            if (ok.a(true)) {
              var7 = oh.field_h;
              ((ek) this).field_s = ((ek) this).field_s + 20;
              var8 = new oc(var7, (uh) null);
              var8.field_w = 50;
              var8.field_s = 80;
              var8.field_t = ((ek) this).field_t;
              var8.field_o = 0;
              var8.field_l = (ub) (Object) new um(og.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ek) this).a(var8, true);
              ((ek) this).field_ib = this.a(oi.field_a, 101, (uh) this);
            } else {
              var6 = new oc(var5, (uh) null);
              var6.field_w = 50;
              var6.field_s = 80;
              var6.field_t = ((ek) this).field_t;
              var6.field_o = 0;
              var6.field_l = (ub) (Object) new um(og.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ek) this).a(var6, true);
              ((ek) this).field_ib = this.a(oi.field_a, 101, (uh) this);
            }
          }
        }
    }

    private final void d(boolean param0) {
        if (!((ek) this).field_N) {
            return;
        }
        ((ek) this).field_N = param0 ? true : false;
    }

    private final d a(String param0, int param1, uh param2) {
        d var4 = null;
        int var5 = 0;
        var4 = new d(param0, param2);
        var4.field_l = (ub) (Object) new hi();
        var5 = -6 + ((ek) this).field_s;
        ((ek) this).field_s = ((ek) this).field_s + 38;
        var4.a(30, 15, var5, (byte) -119, -30 + ((ek) this).field_t);
        ((ek) this).a((oc) (Object) var4, true);
        ((ek) this).e(1);
        if (param1 < 23) {
          field_cb = -75;
          return var4;
        } else {
          return var4;
        }
    }

    public static void c(boolean param0) {
        field_gb = null;
        field_fb = null;
        field_jb = null;
        field_hb = null;
        field_eb = null;
        if (!param0) {
            field_gb = null;
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (param2 > -22) {
          L0: {
            ek.c(false);
            if (param4 == ((ek) this).field_ib) {
              this.d(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param4 == ((ek) this).field_ib) {
              this.d(false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int a(m param0, m param1, byte param2) {
        Object var4 = null;
        Object var5 = null;
        if (param2 > 0) {
          var4 = null;
          int discarded$2 = ek.a((m) null, (m) null, (byte) 87);
          var5 = null;
          return wl.a((String) null, false, 0, param0, 0, param1, 4);
        } else {
          var5 = null;
          return wl.a((String) null, false, 0, param0, 0, param1, 4);
        }
    }

    final static void l(int param0) {
        ih.a(true, am.field_cc, fj.field_Qb, 2);
        ln.field_l = true;
        int var1 = -31 / ((-11 - param0) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Mute this player for 48 hours";
        field_bb = 20;
        field_cb = 0;
        field_jb = new int[16384];
        field_eb = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_fb = "From <%0>: ";
    }
}
