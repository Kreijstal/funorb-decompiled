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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = this.field_n + param0;
          jb.a(param3, var5_int - this.field_I.field_y, param0 + this.field_I.field_y, -30486, param3 + this.field_s);
          var6 = -this.field_P + param0;
          if (param2) {
            return;
          }
          while (var5_int > var6) {
            param1.e(var6, param3);
            var6 = var6 + param1.field_y;
          }
          ln.d(-28558);
          if (bi.field_d <= param0 + this.field_I.field_y) {
            lq.a(this.field_Q, (byte) -94);
            param1.e(-this.field_P, 0);
            param1.e(-this.field_P + 2 * this.field_O, 0);
            this.field_E.f(0, 0);
            ln.d(-28558);
            this.field_Q.e(param0, param3);
          }
          if (var5_int - this.field_I.field_y <= bi.field_i) {
            lq.a(this.field_Q, (byte) -94);
            for (var7 = this.field_P + (this.field_n - this.field_I.field_y); 2 * this.field_O < var7; var7 = var7 - 2 * this.field_O) {
            }
            param1.e(-var7, 0);
            param1.e(-var7 + this.field_O * 2, 0);
            this.field_I.f(0, 0);
            ln.d(-28558);
            this.field_Q.e(-this.field_I.field_y + var5_int, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("we.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void i(int param0) {
        cp.a((byte) 126);
        if (null != ne.field_F) {
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param1) {
            stackIn_3_0 = -5;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = ui.field_d;
          while (var3_int < al.field_y.length) {
            var5 = dg.field_f[var3_int];
            if (var5 >= 0) {
              var6 = ao.a(120, al.field_y[var3_int], true);
              var7 = -(var6 >> 1) + ni.field_a;
              var4 = var4 + vo.field_y;
              if (pe.a(ml.field_v + (eb.field_h << 1), var4, param0, param2, (byte) 45, -hc.field_a + var7, (hc.field_a << 1) + var6)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + ((eb.field_h << 1) + vo.field_y + ml.field_v);
            } else {
              var4 = var4 + cd.field_a;
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "we.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(r param0, boolean param1, byte param2, r param3, r param4) {
        cl.field_c = qc.a(param2 + 7, "");
        cl.field_c.a(0, false);
        if (param2 != -7) {
          return;
        }
        try {
          we.a(param4, param3, param0, (byte) -57);
          tq.b((byte) 44);
          un.field_Hb = l.field_a;
          um.field_F = l.field_a;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "we.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final er a(int param0, int param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Vertigo2.field_L ? 1 : 0;
        er var14 = new er(this.field_O * 2, this.field_s);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        lq.a(var14, (byte) -94);
        int var5 = this.field_s >> 1;
        int var6 = 0;
        if (param2 <= 27) {
          return (er) null;
        }
        while (this.field_s > var6) {
          var7 = (var6 >> 1) * (-1 + this.field_O * 2) % (2 * this.field_O);
          var8 = param0 & 16711935;
          var9 = param0 & 65280;
          var10 = -var5 + var6;
          var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
          var12 = var11 >= 256 ? var8 | var9 : (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
          bi.b(var7, var6, this.field_O, var12);
          bi.b(-(this.field_O * 2) + var7, var6, this.field_O, var12);
          var8Lifetime1 = 16711935 & param1;
          var9Lifetime1 = param1 & 65280;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (16711680 & var11 * var9Lifetime1 | -16711936 & var8Lifetime1 * var11) >>> 8;
          bi.b(var7 + this.field_O, var6, this.field_O, var12Lifetime1);
          bi.b(-this.field_O + var7, var6, this.field_O, var12Lifetime1);
          var6++;
        }
        ln.d(-28558);
        return var14;
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        er discarded$1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 <= 6) {
            discarded$1 = this.h(-93);
          }
          if (this.field_F) {
            this.field_P = this.field_P + 1;
            if (this.field_O * 2 < this.field_P) {
              this.field_P = this.field_P - 2 * this.field_O;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("we.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
          field_H = (String) null;
        }
        int var2 = this.field_s >> 1;
        er var3 = new er(var2, this.field_s);
        lq.a(var3, (byte) -94);
        for (var4 = 0; var4 < this.field_s; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_s - var4));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            bi.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        ln.d(-28558);
        return var3;
    }

    final void b(int param0, int param1, int param2) {
        this.field_R = param2 >> 1 & 8355711;
        this.field_C = param2;
        this.field_S = 8355711 & param0 >> 1;
        if (param1 >= -43) {
          this.field_F = false;
        }
        this.field_K = param0;
        this.a(-58);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (0 != param1) {
          return;
        }
        int var5 = this.field_o + param2;
        int var6 = this.field_t + param3;
        this.a(var5, this.field_D[0], param0, var6);
        if (this.field_G < 65536) {
          jb.a(var6, var5 + this.field_n, var5 + (this.field_G * this.field_n >> 16), -30486, var6 + this.field_s);
          this.a(var5, this.field_D[1], false, var6);
          ln.d(-28558);
        }
    }

    private final void a(int param0) {
        this.field_D = new er[]{this.a(this.field_K, this.field_C, (byte) 100), this.a(this.field_S, this.field_R, (byte) 48)};
        this.field_I = this.h(2);
        this.field_E = this.field_I.a();
        this.field_Q = new er(this.field_s >> 1, this.field_s);
        int var2 = 6 % ((-7 - param0) / 48);
    }

    private final static void a(r param0, r param1, r param2, byte param3) {
        er var17 = null;
        u[] var5 = null;
        u[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        u[] var14 = null;
        int var11_int = 0;
        er var15 = null;
        er var18 = null;
        er var11 = null;
        er var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Vertigo2.field_L ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          bh.field_a = gk.a(param1, "commonui", "frame_top", true);
          ki.field_b = gk.a(param1, "commonui", "frame_bottom", true);
          qo.field_y = tn.a("jagex_logo_grey", param1, param3 - 38, "commonui");
          q.field_z = gk.a(param1, "commonui", "button", true);
          jn.field_b = mi.a("validation", param1, (byte) 34, "commonui");
          if (param3 != -57) {
            field_L = (String) null;
          }
          bl.field_N = (cc) ((Object) rl.a(param1, 12, param0, "commonui", "arezzo12"));
          qc.field_x = (cc) ((Object) rl.a(param1, param3 ^ -53, param0, "commonui", "arezzo14"));
          sg.field_a = (cc) ((Object) rl.a(param1, param3 ^ -53, param0, "commonui", "arezzo14bold"));
          var17 = new er(param2.a("button.gif", "", 0), (java.awt.Component) ((Object) ne.field_F));
          vl.a(0, "commonui", param1, "dropdown");
          var5 = oh.a((byte) -39, "screen_options", "commonui", param1);
          rg.field_e = new u[4];
          wh.field_F = new u[4];
          r.field_k = new u[4];
          var6 = new u[][]{wh.field_F, r.field_k, rg.field_e};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_m;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_n[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            u[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = pc.a(var5[var9], var19[var11_int], param3 + 22);
            }
          }
          var9Lifetime1 = var17.field_t;
          tg.a((byte) -123);
          var17.d();
          bi.a(0, 0, bi.field_e, bi.field_j);
          var15 = new er(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.d();
          var17.c(0, 0);
          var11 = new er(var9Lifetime1, var9Lifetime1);
          var11.d();
          var17.c(-var17.field_y + var9Lifetime1, 0);
          var12 = new er(var17.field_y - var9Lifetime1 * 2, var9Lifetime1);
          var12.d();
          var17.c(-var9Lifetime1, 0);
          ln.d(-28558);
          q.field_z = new er[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "we.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private we(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_C = param6;
        this.field_S = param7;
        this.field_O = param4;
        this.field_K = param5;
        this.field_R = param8;
        this.a(false, param0, param1, param3, param2);
    }

    static {
        field_N = "<%0> wants to join";
        field_J = "Add friend";
        field_H = "End level:";
        field_L = "Withdraw request to join <%0>'s game";
    }
}
