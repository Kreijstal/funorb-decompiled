/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends ta {
    private bp field_J;
    private hd field_Q;
    private hd field_U;
    static String field_H;
    private int field_N;
    static String field_V;
    private tf field_I;
    static int[] field_P;
    static java.applet.Applet field_M;
    private hd field_G;
    private int field_O;
    static int[] field_S;
    private sp[] field_F;
    static int field_K;
    private mf field_T;
    private hd field_L;
    static ut field_R;

    final void a(boolean param0, int param1) {
        ig.b(this.field_j, -12452);
        if (param1 < 99) {
          this.field_I = (tf) null;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -22667) {
          this.a((byte) -46, true);
        }
        return param0 != 1 ? 320 : 600;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_J.h((byte) -48);
        sr var6 = this.field_J.field_zb[this.field_J.field_Db];
        this.field_I.a(new oi(param0 | param3 << 16), 3);
        this.c(true);
        this.field_J.a(var6, 94);
        this.field_J.a(true, var5);
        this.field_T.field_Fb = param1;
        if (param2 <= 20) {
          this.a(false, -54);
        }
        this.field_T.j((byte) 21).field_Hb = true;
        this.b(false);
    }

    public static void h(byte param0) {
        field_H = null;
        field_P = null;
        if (param0 > -105) {
          qs.h((byte) -97);
        }
        field_M = null;
        field_V = null;
        field_R = null;
        field_S = null;
    }

    final void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        kq var6 = null;
        int var7 = Kickabout.field_G;
        super.a(0, param1, param2);
        this.field_I = new tf();
        this.field_Q.field_jb = new tf();
        this.field_T = new mf(ic.field_h);
        kq[] var8 = this.field_T.field_Eb;
        kq[] var4 = var8;
        for (var5 = param0; var8.length > var5; var5++) {
          var6 = var8[var5];
          var6.field_Lb = true;
        }
        this.field_Q.a((byte) -126, (hd) (this.field_T));
        this.field_Q.a(true, 12 + this.field_T.field_q, 3, 54, 30 + this.field_T.field_mb + 12);
        this.field_T.field_J = 36;
        this.field_T.field_s = 6;
        this.field_G.a(true, this.field_Q.field_q, this.field_Q.field_s, 5 + (this.field_Q.field_mb + this.field_Q.field_J), 97);
        this.c(true);
        this.field_J.field_Db = -1;
        this.field_J.b(2, 104);
        this.field_T.field_Fb = -1;
        this.b(false);
    }

    final void a(byte param0, boolean param1) {
        hd stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        super.a((byte) 113, param1);
        if (0 < this.field_O) {
          this.field_O = this.field_O - 1;
        }
        var3 = this.field_J.h((byte) -38);
        tc.a(ic.field_h.field_x, 5464);
        this.field_J.a(param1, false);
        this.field_L.field_s = this.field_j;
        this.field_L.b(0, param1);
        this.field_T.a(48);
        if (this.field_T.field_Fb != -1 &&
          this.field_T.j((byte) 21).field_Eb.c(-2)) {
          this.field_T.field_Fb = -1;
        }
        if (this.field_T.field_Fb != this.field_N) {
          this.field_N = this.field_T.field_Fb;
          this.b(false);
        }
        if (this.field_T.field_Fb != -1 &&
          this.field_U.field_sb == 1) {
          var4 = ic.field_h.field_q[this.field_T.field_Fb];
          jf.a(64, ic.field_h.field_i[var4], var4);
        }
        var5 = 63 % ((param0 - 38) / 60);
        var7 = 0;
        var4Lifetime1 = var7;
        while (var7 < this.field_F.length) {
          stackIn_15_0 = this.field_F[var7].field_Mb;
          stackIn_16_1 = !(ic.field_h.field_x < this.field_F[var7].field_Gb);
          stackIn_15_0.field_lb = stackIn_16_1;
          if (this.field_F[var7].field_Mb.field_sb != 0) {
            if (ic.field_h.c((byte) -86)) {
              pi.a(6022, this.field_F[var7]);
            } else {
              tb.a((byte) 126, 0);
            }
          }
          var7++;
        }
        if (this.field_J.h((byte) -73) > var3 &&
          this.field_O == 0) {
          sp.c(59, -112);
          this.field_O = 10;
        }
        if (this.field_J.h((byte) -86) < var3 &&
          this.field_O == 0) {
          sp.c(60, -127);
          this.field_O = 10;
        }
    }

    private final void b(boolean param0) {
        this.field_U.c((byte) -109);
        kq var2 = this.field_T.j((byte) 21);
        if (var2 != null &&
          !var2.field_Gb) {
          this.field_G.a((byte) -127, this.field_U);
        }
        if (param0) {
          this.c(true);
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        nl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Kickabout.field_G;
        try {
          var1_int = 0;
          if (param0) {
            return;
          }
          while (var1_int < 4) {
            var2 = sh.field_a.field_P[ae.field_G][1 + var1_int];
            if (0 < var2.field_C &&
              var2.field_u != 4) {
              mn.field_b[var1_int] = 16;
            } else {
              if (0 < mn.field_b[var1_int]) {
                mn.field_b[var1_int] = mn.field_b[var1_int] - 1;
              }
            }
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qs.I(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        int var4_int = 0;
        int stackIn_16_0 = 0;
        int var3;
        sp var4;
        up var5;
        int var6;
        oi var7;
        int var8;
        int var9;
        tf var10;
        int var3Lifetime1;
        var9 = Kickabout.field_G;
        if (!param0) {
          return;
        }
        var10 = new tf();
        var3 = -1;
        L1: while (true) {
          if (6 >= var3) {
            if (cq.e(15137) ||
              var3 != -1) {
              if (ic.field_h.field_t < var3) {
                break L1;
              }
              for (var4_int = 0; var4_int < 8; var4_int++) {
                var5 = ha.a(ic.field_h.field_e, var4_int, ic.field_h.field_N[var4_int + 8 * var3 + 8], -84, var3);
                stackIn_16_0 = (~bh.field_k != ~var3) ? 0 : 1;
                var6 = stackIn_16_0;
                var7 = (oi) (this.field_I.g(24009));
                while (var7 != null) {
                  var8 = var7.field_j;
                  if (~(var8 >> 16) == ~var3 &&
                    (var8 & 65535) == var4_int) {
                    var6 = 1;
                  }
                  var7 = (oi) (this.field_I.c(33));
                }
                var10.a(new sp(var5, da.field_x, var3, var4_int, var6 != 0), 3);
              }
            }
            var3++;
            continue;
          }
          break;
        }
        this.field_F = new sp[var10.a(false)];
        var3Lifetime1 = 0;
        var4 = (sp) (var10.g(24009));
        while (var4 != null) {
          this.field_F[var3Lifetime1] = var4;
          var3Lifetime1++;
          var4 = (sp) (var10.c(33));
        }
        this.field_J.a(this.field_F, 0);
        return;
    }

    qs() {
        this.field_N = -1;
    }

    final void b(int param0) {
        sr[] var3 = new sr[sf.field_D.length];
        sr[] var4 = var3;
        var3[1] = vs.field_k;
        var3[2] = bs.field_a;
        var3[0] = ra.field_H;
        var3[4] = sr.field_k;
        var3[3] = ri.field_u;
        this.field_J = new bp(da.field_x, sf.field_D, var4, 50);
        this.field_J.a(369, (byte) -111, 54, 175);
        if (param0 != -38) {
          field_K = 109;
        }
        this.field_Q = new hd();
        this.field_G = new hd();
        this.field_L = new hd();
        this.field_L.a(true, 640, 640, 0, 480);
        this.field_L.a((byte) -110, (hd) (this.field_J));
        this.field_L.a((byte) -111, this.field_Q);
        this.field_L.a((byte) -111, this.field_G);
        this.field_U = eo.a(ja.field_M, 15147554);
        this.field_U.field_J = 56;
        this.field_U.field_s = 66 - (this.field_U.field_q >> 1);
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        on.a(this.field_Q.field_F, this.field_Q.field_T, this.field_Q.field_q, this.field_Q.field_mb, 65793, 96);
        un.field_d.a(oc.field_b, 14 + this.field_Q.field_F, this.field_Q.field_T + 25, 16777215, -1);
        this.field_T.k((byte) 55);
        on.a(this.field_G.field_F, this.field_G.field_T, this.field_G.field_q, this.field_G.field_mb, 65793, 96);
        un.field_d.a(da.field_i, 14 + this.field_G.field_F, 21 + this.field_G.field_T, 16777215, -1);
        gm.a(param0 - 5181, this.field_U.e((byte) -113), this.field_G, this.field_T.j((byte) 21));
        this.field_J.a(-120);
        this.field_L.a(75, false);
    }

    static {
        field_V = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_H = "Box";
        field_P = new int[]{320, 158, 482};
    }
}
