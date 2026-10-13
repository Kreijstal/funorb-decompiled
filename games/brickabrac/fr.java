/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr {
    byte[] field_p;
    short[] field_n;
    int[] field_s;
    int field_d;
    byte field_A;
    int field_y;
    short field_C;
    int[] field_I;
    short[] field_L;
    short[] field_P;
    int[] field_i;
    short[] field_H;
    short[] field_m;
    short[] field_z;
    int[] field_O;
    short[] field_K;
    short[] field_v;
    int[] field_u;
    short field_o;
    short[] field_J;
    short[] field_Q;
    int field_x;
    int field_f;
    int[] field_D;
    int[] field_F;
    int field_q;
    int field_N;
    short[] field_h;
    int[] field_g;
    int[] field_E;
    short[] field_c;
    short[] field_j;
    short[] field_b;
    short field_w;
    private boolean field_r;
    static NodeDeque field_M;
    short[] field_a;
    short[] field_G;
    static int field_k;
    short[] field_B;
    static int[] field_l;
    static oe[] field_e;
    short[] field_t;

    final static boolean a(byte param0) {
        if (param0 <= 33) {
          fr.d(-80);
        }
        return cg.field_l;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        for (var5 = param1; this.field_w > var5; var5++) {
          this.field_B[var5] = (short)(this.field_B[var5] + param2);
          this.field_Q[var5] = (short)(this.field_Q[var5] + param3);
          this.field_P[var5] = (short)(this.field_P[var5] + param0);
        }
        this.b(-107);
    }

    final static void a(mf param0, byte param1) {
        mh var5 = null;
        mh var6 = null;
        mh var3 = null;
        try {
          ok.field_g = pl.a("basic", "display_name_changed", (byte) 109, param0);
          GameScreen.field_f = new hj(0L, rq.field_b, hk.field_J, oo.field_y);
          f.field_c = new hj(0L, rq.field_b, MatchCompleteScreen.field_z, ng.field_e);
          rg.field_c = new mh(0L, (mh) null);
          sj.field_d = new mh(0L, ad.field_l);
          sj.field_d.field_S = 1;
          MouseWheelSource.field_c = new mh(0L, MainMenuScreen.field_t, n.field_a);
          GameplayScreen.field_u = new mh(0L, ik.field_a, bc.field_c);
          mo.field_R = new mh(0L, DualLinkNode.field_t);
          rg.field_c.a(sj.field_d, 0);
          rg.field_c.a(MouseWheelSource.field_c, 0);
          rg.field_c.a(GameplayScreen.field_u, 0);
          rg.field_c.a(GameScreen.field_f, 0);
          rg.field_c.a(mo.field_R, 0);
          GameScreen.field_f.field_Qb.field_Qb.a((byte) -102, ad.field_l);
          var5 = GameScreen.field_f.field_Qb.field_Qb;
          var6 = var5;
          GameScreen.field_f.field_Qb.field_Qb.field_Q = 1;
          if (param1 <= 58) {
            field_k = 109;
          }
          var6.field_S = 1;
          f.field_c.field_Qb.field_Qb.a((byte) -115, ad.field_l);
          var3 = f.field_c.field_Qb.field_Qb;
          f.field_c.field_Qb.field_Qb.field_Q = 1;
          var3.field_S = 1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "fr.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, dh param1, dh param2, boolean param3) {
        try {
          m.field_b = param0;
          kp.field_b = param1;
          ni.field_Wb = param2;
          pp.a(Rasterizer2D.width / 2, Rasterizer2D.height / 2, (byte) 19);
          if (!param3) {
            field_k = -98;
          }
          tn.a(param1.field_B, param1.field_P + param1.field_B, 256, param2.field_B, param2.field_P + param2.field_B);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "fr.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= 124) {
          return;
        }
        for (var6 = 0; var6 < this.field_w; var6++) {
          this.field_B[var6] = (short)(param0 * this.field_B[var6] / param2);
          this.field_Q[var6] = (short)(param4 * this.field_Q[var6] / param2);
          this.field_P[var6] = (short)(param3 * this.field_P[var6] / param2);
        }
        this.b(-122);
    }

    public static void b(byte param0) {
        field_M = null;
        if (param0 != -52) {
          field_l = (int[]) null;
        }
        field_e = null;
        field_l = null;
    }

    private final void b(int param0) {
        this.field_r = false;
        if (param0 >= -84) {
          this.b(-62);
        }
    }

    final static void a(int param0) {
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (pe.gameplayScreen.c(124)) {
          return;
        }
        if (param0 != 1) {
          field_M = (NodeDeque) null;
        }
        if (pe.gameplayScreen.field_n) {
          if ((pe.gameplayScreen.match.field_j & 1 << pe.gameplayScreen.field_k) != 0) {
            ag.buttonLabels[12] = mi.field_a;
          } else {
            if (pe.gameplayScreen.match.field_j != 0) {
              ag.buttonLabels[12] = qm.field_c;
            } else {
              if ((1 << pe.gameplayScreen.field_k | pe.gameplayScreen.field_v) != (1 << pe.gameplayScreen.match.playerCount) - 1) {
                ag.buttonLabels[12] = s.field_a;
              } else {
                ag.buttonLabels[12] = oa.field_Pb;
              }
            }
          }
        } else {
          if ((1 << pe.gameplayScreen.field_k & pe.gameplayScreen.match.field_j) != 0) {
            ag.buttonLabels[12] = ff.field_g;
          } else {
            if (0 == pe.gameplayScreen.match.field_j) {
              if ((pe.gameplayScreen.field_v | 1 << pe.gameplayScreen.field_k) != -1 + (1 << pe.gameplayScreen.match.playerCount)) {
                ag.buttonLabels[12] = RectangleBody.field_t;
              } else {
                ag.buttonLabels[12] = bm.field_b;
              }
            } else {
              ag.buttonLabels[12] = pq.field_m;
            }
          }
        }
    }

    final void c(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = BrickABrac.field_J ? 1 : 0;
        if (this.field_r) {
          return;
        }
        this.field_r = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        if (param0 != 23) {
          return;
        }
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_w > var8; var8++) {
          var9 = this.field_B[var8];
          var10 = this.field_Q[var8];
          var11 = this.field_P[var8];
          if (var10 < var3) {
            var3 = var10;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var7 < var11) {
            var7 = var11;
          }
          if (var11 < var4) {
            var4 = var11;
          }
        }
        this.field_x = var7;
        this.field_f = var2;
        this.field_y = var3;
        this.field_q = var4;
        this.field_d = var6;
        this.field_N = var5;
    }

    final static void a(boolean param0, String param1, String param2) {
        try {
          if (null != ej.field_I) {
            ej.field_I.m(17);
          }
          eo.field_k = new hk(param2, param1, false, true, param0);
          rj.field_c.b((byte) 114, eo.field_k);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "fr.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        o.field_c = new dk();
        if (param0 != -1) {
          return;
        }
        rj.field_c.b((byte) 120, o.field_c);
    }

    fr() {
        this.field_A = (byte) 0;
        this.field_r = false;
    }

    static {
        field_M = new NodeDeque();
        field_e = new oe[8];
        field_l = new int[]{44, 45, 8, 23};
    }
}
