/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends kf {
    static int field_T;
    boolean field_S;
    private ka field_ab;
    static String field_W;
    static fd field_U;
    static w field_Y;
    private int field_V;
    static char[] field_Z;
    static String field_X;

    private final int a(int param0) {
        if (param0 != -10604) {
          return -74;
        }
        return !this.field_S ? 0 : this.field_ab.g((byte) -83) == this ? 256 : 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 <= 92) {
          this.h((byte) -10);
        }
        this.b(param2, param1, cf.field_f - param1 >> 1, -param2 + vd.field_n >> 1, -16555);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_V == 0) {
          return;
        }
        if (256 <= this.field_V) {
          if (param2 != 0) {
            return;
          }
          this.b(-128, param3 + this.field_D, param0 + this.field_u);
          super.a(param0, -122, param2, param3);
          return;
        }
        if (null == si.field_n ||
          !(this.field_t <= si.field_n.field_I) ||
          !(this.field_y <= si.field_n.field_H)) {
          si.field_n = new ck(this.field_t, this.field_y);
        }
        tb.a(true, si.field_n);
        hk.b();
        this.b(-128, 0, 0);
        super.a(-this.field_u - param0, -116, param2, -param3 - this.field_D);
        mk.a((byte) -5);
        si.field_n.c(this.field_u + param0, this.field_D + param3, this.field_V);
        if (param1 >= -103) {
          this.field_V = -41;
        }
    }

    bl(ka param0, int param1, int param2) {
        super(-param1 + cf.field_f >> 1, vd.field_n - param2 >> 1, param1, param2, (gl) null);
        try {
          this.field_S = false;
          this.field_V = 0;
          this.field_ab = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ce e(byte param0) {
        ce var2 = super.e(param0);
        if (var2 != null) {
          return var2;
        }
        return (ce) (this);
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        String stackIn_32_2 = null;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_2 = null;
        boolean stackIn_88_0 = false;
        String stackIn_88_1 = null;
        boolean stackIn_89_2 = false;
        int stackIn_111_0 = 0;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = client.field_A ? 1 : 0;
        try {
          fj.field_e = true;
          bc.field_B = param1;
          if (bc.field_B == 0) {
            var3_int = te.a(df.field_X, 124, om.field_a, vg.field_I, rk.field_R);
            var4 = 3 + var3_int;
            rk.field_P = new String[var4];
            k.field_g = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              k.field_g[var5] = -1;
            }
            qf.field_i = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              rk.field_P[var5] = vg.field_I[var5];
            }
            rk.field_P[var4 - 3] = "";
            rk.field_P[-2 + var4] = me.field_C;
            k.field_g[var4 - 2] = 0;
            qf.field_i[0] = 4;
            rk.field_P[-1 + var4] = og.field_gb;
            k.field_g[-1 + var4] = 1;
            qf.field_i[1] = 5;
          } else if (bc.field_B == 1) {
            var3_int = te.a(df.field_X, 96, om.field_a, vg.field_I, rk.field_R);
            var4 = var3_int + 2;
            k.field_g = new int[var4];
            rk.field_P = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              k.field_g[var5] = -1;
            }
            qf.field_i = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              rk.field_P[var5] = vg.field_I[var5];
            }
            rk.field_P[-2 + var4] = "";
            rk.field_P[-1 + var4] = og.field_gb;
            k.field_g[-1 + var4] = 0;
            qf.field_i[0] = 5;
          } else if (bc.field_B != 2) {
            if (bc.field_B == 3) {
              if (!lf.field_e.field_a) {
                var3_int = te.a(si.field_c, 81, om.field_a, vg.field_I, rk.field_R);
              } else {
                var3_int = te.a(rb.field_a, 99, om.field_a, vg.field_I, rk.field_R);
              }
              var4 = 2 + var3_int;
              rk.field_P = new String[var4];
              k.field_g = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                k.field_g[var5] = -1;
              }
              qf.field_i = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                rk.field_P[var5] = vg.field_I[var5];
              }
              rk.field_P[var4 - 2] = "";
              rk.field_P[var4 - 1] = og.field_gb;
              k.field_g[-1 + var4] = 0;
              qf.field_i[0] = 5;
            } else if (bc.field_B == 4) {
              var3_int = te.a(dc.field_g, 117, om.field_a, vg.field_I, rk.field_R);
              var4 = 2 + var3_int;
              k.field_g = new int[var4];
              rk.field_P = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                k.field_g[var5] = -1;
              }
              qf.field_i = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                rk.field_P[var5] = vg.field_I[var5];
              }
              rk.field_P[-2 + var4] = "";
              rk.field_P[var4 - 1] = og.field_gb;
              k.field_g[-1 + var4] = 0;
              qf.field_i[0] = 5;
            } else {
              if (bc.field_B != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = te.a(gd.field_i, 76, om.field_a, vg.field_I, rk.field_R);
              var4 = 3 + var3_int;
              rk.field_P = new String[var4];
              k.field_g = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                k.field_g[var5] = -1;
              }
              qf.field_i = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                rk.field_P[var5] = vg.field_I[var5];
              }
              rk.field_P[-3 + var4] = "";
              rk.field_P[var4 - 2] = fj.field_c;
              k.field_g[-2 + var4] = 0;
              qf.field_i[0] = 3;
              rk.field_P[var4 - 1] = og.field_gb;
              k.field_g[-1 + var4] = 1;
              qf.field_i[1] = 5;
            }
          } else {
            var3_int = te.a(cm.$cfr$intArgs$a$53ce4ab4c593(91, de.field_ab, new String[]{"<br><%0><br>"}), 86, om.field_a, vg.field_I, rk.field_R);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(vg.field_I[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            tg.field_g = new String[var4];
            an.a(vg.field_I, 0, tg.field_g, 0, var4);
            dh.field_b = new String[-1 + (var3_int - var4)];
            an.a(vg.field_I, 1 + var4, dh.field_b, 0, -var4 + var3_int - 1);
            var4 = -1;
            var3_int = te.a(cm.$cfr$intArgs$a$53ce4ab4c593(86, ga.field_d, new String[]{"<br><%0><br>"}), 112, om.field_a, vg.field_I, rk.field_R);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(vg.field_I[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            vb.field_U = new String[var4];
            an.a(vg.field_I, 0, vb.field_U, 0, var4);
            wb.field_Qb = new String[var3_int - (var4 + 1)];
            an.a(vg.field_I, var4 + 1, wb.field_Qb, 0, -1 + (-var4 + var3_int));
            if (tg.field_g.length >= vb.field_U.length) {
              stackIn_21_0 = tg.field_g.length;
            } else {
              stackIn_21_0 = vb.field_U.length;
            }
            var5 = stackIn_21_0;
            if (dh.field_b.length < wb.field_Qb.length) {
              stackIn_24_0 = wb.field_Qb.length;
            } else {
              stackIn_24_0 = dh.field_b.length;
            }
            var6 = stackIn_24_0;
            var7 = var5 + (7 + var6);
            rk.field_P = new String[var7];
            k.field_g = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              k.field_g[var8] = -1;
            }
            qf.field_i = new int[2];
            rk.field_P[1] = i.field_g;
            k.field_g[1] = 0;
            rk.field_P[0] = tf.field_Z;
            qf.field_i[0] = 5;
            rk.field_P[2] = wi.field_a;
            k.field_g[3] = 1;
            rk.field_P[3] = sc.field_p;
            rk.field_P[4] = uj.field_c;
            qf.field_i[1] = 2;
            rk.field_P[5] = "";
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_31_0 = rk.field_P;
              stackIn_31_1 = var8Lifetime2 + 6;
              if (-var5 + (var8Lifetime2 + vb.field_U.length) >= 0) {
                stackIn_32_2 = vb.field_U[-var5 + (vb.field_U.length + var8Lifetime2)];
              } else {
                stackIn_32_2 = "";
              }
              stackIn_31_0[stackIn_31_1] = stackIn_32_2;
            }
            rk.field_P[var5 + 6] = null;
            k.field_g[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_37_0 = rk.field_P;
              stackIn_37_1 = 7 - (-var5 - var8Lifetime3);
              if (wb.field_Qb.length <= var8Lifetime3) {
                stackIn_38_2 = "";
              } else {
                stackIn_38_2 = wb.field_Qb[var8Lifetime3];
              }
              stackIn_37_0[stackIn_37_1] = stackIn_38_2;
            }
            di.field_F = ik.a(4);
          }
          if (param0 > -8) {
            field_U = (fd) null;
          }
          k.field_f.field_l = qf.field_i.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < rk.field_P.length; var4Lifetime1++) {
            stackIn_88_0 = false;
            stackIn_88_1 = rk.field_P[var4Lifetime1];
            stackIn_89_2 = !(k.field_g[var4Lifetime1] < 0);
            var5Lifetime1 = si.a(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (bc.field_B == 2) {
            var10 = tg.field_g;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = si.a(false, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = dh.field_b;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = si.a(false, var12, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ig.field_dc = (qk.field_m + pa.field_Y << 1) * k.field_f.field_l;
          ri.field_i = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + qk.field_d);
          ge.field_e = qk.field_d - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; rk.field_P.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_111_0 = ig.field_dc;
            if (k.field_g[var4Lifetime2] < 0) {
              stackIn_112_1 = ke.field_d;
            } else {
              stackIn_112_1 = cc.field_a;
            }
            ig.field_dc = stackIn_111_0 + stackIn_112_1;
          }
          fc.field_a = ul.field_d - (ig.field_dc >> 1);
          tj.field_jc = new int[rk.field_P.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = fc.field_a;
          while (rk.field_P.length > var4Lifetime3) {
            var6Lifetime1 = k.field_g[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = si.a(false, rk.field_P[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + qk.field_m;
              var8Lifetime1 = qk.field_d - (var7Lifetime2 >> 1);
              tj.field_jc[var4Lifetime3] = new int[4];
              tj.field_jc[var4Lifetime3][0] = var8Lifetime1 - mb.field_c;
              tj.field_jc[var4Lifetime3][1] = var5Lifetime3;
              tj.field_jc[var4Lifetime3][2] = var7Lifetime2 + (mb.field_c << 1);
              var5Lifetime3 = var5Lifetime3 + ((pa.field_Y << 1) + qk.field_m + cc.field_a);
              tj.field_jc[var4Lifetime3][3] = cc.field_a + (pa.field_Y << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + ke.field_d;
            }
            var4Lifetime3++;
          }
          if (bc.field_B != 2) {
            k.field_f.a(0, 0, ub.a(bh.field_g, (byte) -81, pm.field_f), param2);
          } else {
            k.field_f.a(-1, 0, -1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "bl.IC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2Lifetime1;
        fl.a(130, param1 ^ 12362, 16694016, mb.field_e, 80 + param0, w.field_kb);
        int var2 = 145;
        kd.field_t.c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 + ga.a(188, 0, var2, nk.field_c, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16);
        tg.a(true, 2).c(82 + param0, var2, 18, 18);
        var2 = var2 + ((kd.field_p == 0 ? 16 : 0) + ga.a(188, 0, var2, kb.field_e, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16);
        vk.a(nf.field_e, param0 + 190, 3, gi.field_c, kk.field_n, var2, -22981);
        hk.g(309 + param0, 117, 242, 263172);
        hk.g(310 + param0, 117, 242, 6316128);
        fl.a(130, param1 ^ 12362, 16694016, hg.field_d, 320 + param0, w.field_kb);
        var2Lifetime1 = 145;
        tg.a(true, 0).c(320 + param0, var2Lifetime1, 18, 18);
        var2Lifetime1 = var2Lifetime1 + (16 * ga.a(212, 0, var2Lifetime1, dk.field_f, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 + param0) + 16);
        if (param1 != 12618) {
          bl.a(105, 85, false);
        }
        fl.a(var2Lifetime1 + 14, 256, 16694016, kc.field_q, param0 + 320, w.field_kb);
        var2Lifetime1 += 29;
        tg.a(true, 3).c(param0 + 320, var2Lifetime1, 18, 18);
        var2Lifetime1 = var2Lifetime1 + (16 + ga.a(212, 0, var2Lifetime1, ki.field_u, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 + param0) * 16);
    }

    boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        this.field_V = this.a(-10604);
        if (param0 < 77) {
          this.field_S = false;
        }
        stackIn_6_0 = (0 == this.field_V) && (!this.field_S);
        return stackIn_6_0;
    }

    boolean h(byte param0) {
        int var2;
        int var3;
        boolean stackIn_13_0 = false;
        var2 = this.a(-10604);
        var3 = var2 - this.field_V;
        if (param0 <= 15) {
          this.a(-126, -71, 58, -27);
        }
        if (0 < var3) {
          this.field_V = this.field_V + (-1 + var3 + 8) / 8;
        }
        if (var3 < 0) {
          this.field_V = this.field_V + (1 + (-16 + var3)) / 16;
        }
        stackIn_13_0 = (this.field_V == 0) && (var2 == 0) && (!this.field_S);
        return stackIn_13_0;
    }

    abstract void b(int param0, int param1, int param2);

    final static void g(byte param0) {
        bf.field_x = bg.a(true);
        if (param0 > -12) {
          field_Z = (char[]) null;
        }
        ah.field_c = new ka();
        dd.a(true, true, (byte) 66);
    }

    public static void i(int param0) {
        field_Y = null;
        if (param0 != 2) {
          field_X = (String) null;
        }
        field_U = null;
        field_W = null;
        field_X = null;
        field_Z = null;
    }

    static {
        field_W = "Chat view has been scrolled up. Scroll down to chat.";
        field_Z = new char[128];
        field_X = "Back";
    }
}
