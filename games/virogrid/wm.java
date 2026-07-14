/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    short[] field_A;
    short[] field_J;
    byte[] field_z;
    int[] field_M;
    short[] field_d;
    short[] field_D;
    short[] field_s;
    static wl field_v;
    int field_U;
    static int field_u;
    int[] field_R;
    int[] field_n;
    short[] field_t;
    int[] field_c;
    static km field_m;
    int field_T;
    short[] field_j;
    short[] field_e;
    short[] field_O;
    int field_p;
    short[] field_l;
    static um field_r;
    short field_h;
    short[] field_S;
    short[] field_y;
    short field_k;
    short[] field_b;
    short[] field_K;
    static int field_F;
    static int[][] field_B;
    int field_C;
    static String field_Q;
    short field_i;
    short[] field_x;
    short[] field_G;
    int field_L;
    int[] field_E;
    int field_g;
    short[] field_I;
    int[] field_P;
    private boolean field_N;
    byte field_a;
    short[] field_H;
    int[] field_f;
    int[] field_o;
    int[] field_q;
    static eh field_w;

    final static void a(wg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, wg param12, e param13, e param14, int param15, int param16, int param17, int param18, wg param19) {
        jf.field_n = param14;
        pm.field_j = param13;
        vb.b(param7, (byte) -127, param9, param18, param4);
        gg.a(param1, param19, true, param3);
        kf.a(param16 + param16, param6, param11, param5, param12, param0);
        jd.a(param10, 11, param2);
        od.a(param17, param8, false, param15);
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
        field_v = null;
        field_Q = null;
        field_m = null;
        field_r = null;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        var2 = -93 % ((56 - param0) / 45);
        if (!((wm) this).field_N) {
          ((wm) this).field_N = true;
          var3 = 32767;
          var4 = 32767;
          var5 = 32767;
          var6 = -32768;
          var7 = -32768;
          var8 = -32768;
          var9 = 0;
          L0: while (true) {
            if (((wm) this).field_h <= var9) {
              ((wm) this).field_g = var4;
              ((wm) this).field_T = var7;
              ((wm) this).field_U = var3;
              ((wm) this).field_L = var8;
              ((wm) this).field_C = var6;
              ((wm) this).field_p = var5;
              return;
            } else {
              L1: {
                var10 = ((wm) this).field_l[var9];
                var11 = ((wm) this).field_b[var9];
                var12 = ((wm) this).field_H[var9];
                if (var7 < var11) {
                  var7 = var11;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10 > var6) {
                  var6 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var4 > var11) {
                  var4 = var11;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var8 >= var12) {
                  break L5;
                } else {
                  var8 = var12;
                  break L5;
                }
              }
              if (var12 < var5) {
                var5 = var12;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static h a(int param0, int param1, int param2, int param3, int param4, pd param5) {
        if (param4 != 5416) {
            Object var8 = null;
            wm.a((wg) null, 78, 38, 112, -3, -72, -53, -93, -107, -23, -105, 2, (wg) null, (e) null, (e) null, 46, 115, -81, -51, (wg) null);
        }
        java.awt.Frame var9 = ql.a(param3, param2, param5, param0, param1, false);
        java.awt.Frame var6 = var9;
        if (var9 == null) {
            return null;
        }
        h var7 = new h();
        var7.field_e = var9;
        java.awt.Component discarded$0 = var7.field_e.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param0, param2);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    final static void c(byte param0) {
        nf.field_g = pg.field_g;
        if (param0 != -86) {
            wm.c(-123);
        }
        we.field_l = 0;
        if (hm.field_c == i.field_y) {
            return;
        }
        if (!(!mf.a(param0 ^ -40, i.field_y))) {
            al.field_j[i.field_y].d(-11308);
        }
        if (!(!th.field_q)) {
            vg.field_I = null;
            th.field_q = false;
            ei.field_b = null;
        }
        i.field_y = hm.field_c;
        ok.field_J = vm.field_e;
        if (!(!mn.field_e)) {
            wm.b(2);
            fn.a(-64);
            dc.f((byte) 109);
            mn.field_e = false;
        }
    }

    final static String a(byte param0) {
        if (!(2 <= dj.field_n)) {
            return fe.field_Lb;
        }
        if (sj.field_l != null) {
            if (!sj.field_l.c(0)) {
                return aa.field_d;
            }
            return jd.field_b;
        }
        if (!td.field_a.c(0)) {
            return aa.field_c;
        }
        if (!(td.field_a.a((byte) -102, "commonui"))) {
            return sb.field_a + " - " + td.field_a.a("commonui", 85) + "%";
        }
        if (!(jf.field_j.c(0))) {
            return mm.field_d;
        }
        if (!(jf.field_j.a((byte) -102, "commonui"))) {
            return we.field_j + " - " + jf.field_j.a("commonui", 103) + "%";
        }
        if (!(qn.field_I.c(0))) {
            return gl.field_a;
        }
        if (param0 < 63) {
            return null;
        }
        if (!qn.field_I.b(25867)) {
            return sk.field_b + " - " + qn.field_I.a(-2677) + "%";
        }
        return wc.field_b;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var6 = Virogrid.field_F ? 1 : 0;
        int var5 = 0;
        if (param3 < 39) {
            ((wm) this).field_c = null;
        }
        while (((wm) this).field_h > var5) {
            ((wm) this).field_l[var5] = (short)(((wm) this).field_l[var5] + param1);
            ((wm) this).field_b[var5] = (short)(((wm) this).field_b[var5] + param0);
            ((wm) this).field_H[var5] = (short)(((wm) this).field_H[var5] + param2);
            var5++;
        }
        this.a(40);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        for (var6 = 0; var6 < ((wm) this).field_h; var6++) {
            ((wm) this).field_l[var6] = (short)(param1 * ((wm) this).field_l[var6] / param2);
            ((wm) this).field_b[var6] = (short)(((wm) this).field_b[var6] * param3 / param2);
            ((wm) this).field_H[var6] = (short)(param4 * ((wm) this).field_H[var6] / param2);
        }
        if (param0) {
            ((wm) this).b((byte) -85);
        }
        this.a(113);
    }

    final static void b(int param0) {
        if (param0 != 2) {
            return;
        }
        ch.a(true);
        vb.a((byte) -124);
        km.field_yb = null;
        f.a((byte) -42);
    }

    private final void a(int param0) {
        ((wm) this).field_N = false;
        if (param0 <= 33) {
            ((wm) this).field_T = 84;
        }
    }

    wm() {
        ((wm) this).field_a = (byte) 0;
        ((wm) this).field_N = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Disruptive behaviour";
        field_F = 0;
        field_v = new wl();
    }
}
