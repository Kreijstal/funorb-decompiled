/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends iq {
    private int field_K;
    static String field_N;
    private er[] field_D;
    private int field_C;
    private er field_I;
    private int field_S;
    private int field_R;
    private int field_P;
    boolean field_F;
    int field_G;
    static String field_H;
    private er field_E;
    static int field_M;
    private er field_Q;
    static String field_J;
    static String field_L;
    private int field_O;

    private final void a(int param0, er param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var5 = ((we) this).field_n + param0;
        jb.a(param3, var5 - ((we) this).field_I.field_y, param0 - -((we) this).field_I.field_y, -30486, param3 - -((we) this).field_s);
        var6 = -((we) this).field_P + param0;
        if (!param2) {
          L0: while (true) {
            if (var5 <= var6) {
              L1: {
                ln.d(-28558);
                if (bi.field_d <= param0 - -((we) this).field_I.field_y) {
                  lq.a(((we) this).field_Q, (byte) -94);
                  param1.e(-((we) this).field_P, 0);
                  param1.e(-((we) this).field_P + 2 * ((we) this).field_O, 0);
                  ((we) this).field_E.f(0, 0);
                  ln.d(-28558);
                  ((we) this).field_Q.e(param0, param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5 + -((we) this).field_I.field_y > bi.field_i) {
                  break L2;
                } else {
                  lq.a(((we) this).field_Q, (byte) -94);
                  var7 = ((we) this).field_P + (((we) this).field_n - ((we) this).field_I.field_y);
                  L3: while (true) {
                    if (2 * ((we) this).field_O >= var7) {
                      param1.e(-var7, 0);
                      param1.e(-var7 + ((we) this).field_O * 2, 0);
                      ((we) this).field_I.f(0, 0);
                      ln.d(-28558);
                      ((we) this).field_Q.e(-((we) this).field_I.field_y + var5, param3);
                      break L2;
                    } else {
                      var7 = var7 - 2 * ((we) this).field_O;
                      continue L3;
                    }
                  }
                }
              }
              return;
            } else {
              param1.e(var6, param3);
              var6 = var6 + param1.field_y;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void i(int param0) {
        cp.a((byte) 126);
        if (!(null == ne.field_F)) {
            Vertigo2.a(ne.field_F, (byte) -35);
        }
        wj.b(76);
        ea.b((byte) 111);
        vb.d(65);
        if (cd.b(-27440)) {
            uh.field_Wb.j(1, param0 ^ -1733144137);
            lf.d(61, 0);
        }
        rm.b((byte) 86);
        if (param0 != -1733144127) {
            we.i(-65);
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_J = null;
        field_N = null;
        field_L = null;
        field_H = null;
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (param1) {
          var3 = 0;
          var4 = ui.field_d;
          L0: while (true) {
            if (var3 >= al.field_y.length) {
              return -1;
            } else {
              var5 = dg.field_f[var3];
              if (var5 >= 0) {
                var6 = ao.a(120, al.field_y[var3], true);
                var7 = -(var6 >> 1193220705) + ni.field_a;
                var4 = var4 + vo.field_y;
                if (!pe.a(ml.field_v + (eb.field_h << -1502281663), var4, param0, param2, (byte) 45, -hc.field_a + var7, (hc.field_a << -1436256415) + var6)) {
                  var4 = var4 + ((eb.field_h << -1312742463) + vo.field_y + ml.field_v);
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              } else {
                var4 = var4 + cd.field_a;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return -5;
        }
    }

    final static void a(r param0, boolean param1, byte param2, r param3, r param4) {
        cl.field_c = qc.a(param2 + 7, "");
        cl.field_c.a(0, false);
        if (param2 != -7) {
            return;
        }
        we.a(param4, param3, param0, (byte) -57);
        tq.b((byte) 44);
        un.field_Hb = l.field_a;
        um.field_F = l.field_a;
    }

    private final er a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        er var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        var14 = new er(((we) this).field_O * 2, ((we) this).field_s);
        lq.a(var14, (byte) -94);
        var5 = ((we) this).field_s >> 958730401;
        var6 = 0;
        if (param2 > 27) {
          L0: while (true) {
            if (((we) this).field_s <= var6) {
              ln.d(-28558);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> -1733144127) * (-1 + ((we) this).field_O * 2) % (2 * ((we) this).field_O);
                var8 = param0 & 16711935;
                var9 = param0 & 65280;
                var10 = -var5 + var6;
                var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
                if ((var11 ^ -1) > -257) {
                  stackOut_5_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> -1436793720;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = var8 | var9;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_6_0;
                bi.b(var7, var6, ((we) this).field_O, var12);
                bi.b(-(((we) this).field_O * 2) + var7, var6, ((we) this).field_O, var12);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                if (-257 < (var11 ^ -1)) {
                  stackOut_8_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 1854599368;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = var8 | var9;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var12 = stackIn_9_0;
              bi.b(var7 - -((we) this).field_O, var6, ((we) this).field_O, var12);
              bi.b(-((we) this).field_O + var7, var6, ((we) this).field_O, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -1115753503 & 8355711, (16711422 & param6) >> 272747585);
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        if (param0 <= 6) {
            er discarded$0 = this.h(-93);
        }
        if (!(!((we) this).field_F)) {
            ((we) this).field_P = ((we) this).field_P + 1;
            if (!(((we) this).field_O * 2 >= ((we) this).field_P)) {
                ((we) this).field_P = ((we) this).field_P - 2 * ((we) this).field_O;
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(85);
    }

    private final er h(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 2) {
            field_H = null;
        }
        int var2 = ((we) this).field_s >> 1454190305;
        er var3 = new er(var2, ((we) this).field_s);
        lq.a(var3, (byte) -94);
        for (var4 = 0; var4 < ((we) this).field_s; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((we) this).field_s - var4));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                bi.a(var5, var4, var8 << -16732216 | var8 | var8 << -2008044784);
            }
        }
        ln.d(-28558);
        return var3;
    }

    final void b(int param0, int param1, int param2) {
        ((we) this).field_R = param2 >> 1608712289 & 8355711;
        ((we) this).field_C = param2;
        ((we) this).field_S = 8355711 & param0 >> 189554081;
        if (param1 >= -43) {
            ((we) this).field_F = false;
        }
        ((we) this).field_K = param0;
        this.a(-58);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = ((we) this).field_o + param2;
        int var6 = ((we) this).field_t + param3;
        this.a(var5, ((we) this).field_D[0], param0, var6);
        if ((((we) this).field_G ^ -1) > -65537) {
            jb.a(var6, var5 - -((we) this).field_n, var5 - -(((we) this).field_G * ((we) this).field_n >> 1164898928), -30486, var6 + ((we) this).field_s);
            this.a(var5, ((we) this).field_D[1], false, var6);
            ln.d(-28558);
        }
    }

    private final void a(int param0) {
        ((we) this).field_D = new er[]{this.a(((we) this).field_K, ((we) this).field_C, (byte) 100), this.a(((we) this).field_S, ((we) this).field_R, (byte) 48)};
        ((we) this).field_I = this.h(2);
        ((we) this).field_E = ((we) this).field_I.a();
        ((we) this).field_Q = new er(((we) this).field_s >> -1443222975, ((we) this).field_s);
        int var2 = 6 % ((-7 - param0) / 48);
    }

    private final static void a(r param0, r param1, r param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        u[] var14 = null;
        int var11_int = 0;
        int var13 = Vertigo2.field_L ? 1 : 0;
        bh.field_a = gk.a(param1, "commonui", "frame_top", true);
        ki.field_b = gk.a(param1, "commonui", "frame_bottom", true);
        qo.field_y = tn.a("jagex_logo_grey", param1, param3 + -38, "commonui");
        q.field_z = gk.a(param1, "commonui", "button", true);
        jn.field_b = mi.a("validation", param1, (byte) 34, "commonui");
        if (param3 != -57) {
            field_L = null;
        }
        bl.field_N = (cc) (Object) rl.a(param1, 12, param0, "commonui", "arezzo12");
        qc.field_x = (cc) (Object) rl.a(param1, param3 ^ -53, param0, "commonui", "arezzo14");
        sg.field_a = (cc) (Object) rl.a(param1, param3 ^ -53, param0, "commonui", "arezzo14bold");
        er var17 = new er(param2.a("button.gif", "", 0), (java.awt.Component) (Object) ne.field_F);
        u discarded$0 = vl.a(0, "commonui", param1, "dropdown");
        u[] var5 = oh.a((byte) -39, "screen_options", "commonui", param1);
        rg.field_e = new u[4];
        wh.field_F = new u[4];
        r.field_k = new u[4];
        u[][] var6 = new u[][]{wh.field_F, r.field_k, rg.field_e};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_n[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            u[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = pc.a(var5[var9], var21[var11_int], param3 + 22);
            }
        }
        var9 = var17.field_t;
        tg.a((byte) -123);
        var17.d();
        bi.a(0, 0, bi.field_e, bi.field_j);
        er var15 = new er(var9, var9);
        er var18 = var15;
        var18.d();
        var17.c(0, 0);
        er var11 = new er(var9, var9);
        var11.d();
        var17.c(-var17.field_y + var9, 0);
        er var12 = new er(var17.field_y + -(var9 * 2), var9);
        var12.d();
        var17.c(-var9, 0);
        ln.d(-28558);
        q.field_z = new er[]{var15, var12, var11};
    }

    private we(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((we) this).field_C = param6;
        ((we) this).field_S = param7;
        ((we) this).field_O = param4;
        ((we) this).field_K = param5;
        ((we) this).field_R = param8;
        ((we) this).a(false, param0, param1, param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "<%0> wants to join";
        field_J = "Add friend";
        field_H = "End level:";
        field_L = "Withdraw request to join <%0>'s game";
    }
}
