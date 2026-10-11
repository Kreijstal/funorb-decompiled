/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends sj {
    int[] field_o;
    private int[] field_H;
    private int[] field_p;
    private nl field_F;
    private int[] field_L;
    private in[][] field_P;
    private int[] field_q;
    static ak field_E;
    private int[] field_M;
    private int[] field_Q;
    private int[] field_r;
    private int[] field_K;
    int[] field_x;
    private int field_v;
    private int[] field_y;
    static int field_t;
    private int[] field_S;
    int[] field_I;
    private int[] field_R;
    private in[][] field_G;
    private sg field_T;
    private int[] field_V;
    private int[] field_u;
    private int field_C;
    private boolean field_z;
    private int field_B;
    private long field_w;
    private int field_U;
    private long field_J;
    private km field_N;
    private boolean field_s;
    private int field_O;
    private ua field_D;

    private final void b(int param0, int param1, int param2) {
        if (param2 != 1000000) {
          this.g(-41);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_T.f()) {
            var4_int = this.field_T.field_i * this.field_C / mm.field_h;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_w;
              if (0L <= this.field_J - var5) {
                this.field_w = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.field_w + this.field_J - 1L)) / (long)var4_int);
              this.field_w = this.field_w + (long)var4_int * (long)var7;
              this.field_N.b(param0, param1, var7);
              param1 = param1 + var7;
              this.f(-111);
              param2 = param2 - var7;
              if (this.field_T.f()) {
                continue;
              }
              this.field_N.b(param0, param1, param2);
              return;
            }
          }
          this.field_N.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ti.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param1) {
          this.b();
        }
        if (param2 < 0) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_S[var4] = param0;
          }
        } else {
          this.field_S[param2] = param0;
        }
    }

    final boolean c(in param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            return false;
          }
          if (null != param0.field_G) {
            return false;
          }
          if (param0.field_v < 0) {
            return true;
          }
          param0.c(param1 ^ 2704);
          if (param0.field_y > 0 &&
            param0 == this.field_P[param0.field_I][param0.field_y]) {
            this.field_P[param0.field_I][param0.field_y] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ti.RA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        in var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 66) {
          this.field_z = false;
        }
        var3 = (in) (this.field_N.field_r.c(1504642273));
        while (var3 != null) {
          if ((0 > param1 ||
            param1 == var3.field_I) &&
            0 > var3.field_v) {
            this.field_G[var3.field_I][var3.field_A] = null;
            var3.field_v = 0;
          }
          var3 = (in) (this.field_N.field_r.f(1504642273));
        }
    }

    private final void a(int param0, int param1) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param1 != 0) {
          this.b();
        }
        in var3 = (in) (this.field_N.field_r.c(1504642273));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_I == param0) {
            if (var3.field_G != null) {
              var3.field_G.e(mm.field_h / 100);
              if (var3.field_G.k()) {
                this.field_N.field_o.a(var3.field_G);
              }
              var3.a(false);
            }
            if (!(var3.field_v >= 0)) {
              this.field_G[var3.field_I][var3.field_A] = null;
            }
            var3.c(2779);
          }
          var3 = (in) (this.field_N.field_r.f(param1 + 1504642273));
        }
    }

    final synchronized boolean a(ua param0, po param1, fm param2, int param3, int param4) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        qn var8 = null;
        int var9 = 0;
        int var11 = 0;
        sn var12 = null;
        sn var13 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          param0.a();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (qn) (param0.field_l.a((byte) -109));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_e;
            var12 = (sn) (this.field_F.a(-25484, (long)var9));
            if (var12 == null) {
              var13 = od.a(param2, var9, -30805);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_F.a((long)var9, 124, var13);
                decompiledFrameRemainder0 = !(var13.a(param1, (int[]) (var7), (byte) -52, var8.field_r));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.a(param1, (int[]) (var7), (byte) -52, var8.field_r));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (qn) (param0.field_l.a(-119));
          }
          if (param3 <= 52) {
            return true;
          }
          if (var6_int != 0) {
            param0.b();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ti.O(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, in param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        un var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_r + (param1.field_k * param1.field_z >> 12);
          if (param0 != -2003551188) {
            this.field_M = (int[]) null;
          }
          var3_int = var3_int + (this.field_L[param1.field_I] * (this.field_u[param1.field_I] - 8192) >> 12);
          var4 = param1.field_q;
          if (0 < var4.field_g && (!(var4.field_a <= 0) ||
            this.field_r[param1.field_I] > 0)) {
            var5 = var4.field_a << 2;
            var6 = var4.field_m << 1;
            if (var6 > param1.field_H) {
              var5 = param1.field_H * var5 / var6;
            }
            var5 = var5 + (this.field_r[param1.field_I] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_u));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_F.field_o * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)mm.field_h);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ti.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_u[param1] = param0;
        if (param2 != -102) {
          this.field_u = (int[]) null;
        }
    }

    final static void a(int param0, String param1, String param2, byte param3, int param4, String param5) {
        aa var6 = null;
        if (param3 > -18) {
          return;
        }
        try {
          var6 = new aa(param4, param2, param0, param1, param5);
          vd.a(false, var6);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_V[param2] = param0;
        if (param1 != 4200) {
          this.field_q = (int[]) null;
        }
        this.field_K[param2] = cm.a(-128, param0);
        this.a(param0, false, param2);
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, 0);
        } else {
          this.a((byte) 110, -1);
        }
        this.b((byte) -67, -1);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_y[var3] = this.field_V[var3];
        }
        if (param0 <= 71) {
          fm var5 = (fm) null;
          this.a((ua) null, (po) null, (fm) null, -121, -8);
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 16) {
          this.field_K[var6] = cm.a(this.field_V[var6], -128);
          var6++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_16_1 = false;
        in var5;
        int var6_int;
        sp var6;
        in var7;
        in var8;
        int var9;
        fm var10;
        sn var11;
        sn var12;
        var9 = Pixelate.field_H ? 1 : 0;
        this.a(param1, 64, param0, (byte) 114);
        if ((this.field_x[param0] & 2) != 0) {
          var5 = (in) (this.field_N.field_r.g(1504642273));
          while (var5 != null) {
            if (var5.field_I == param0 &&
              0 > var5.field_v) {
              this.field_G[param0][var5.field_A] = null;
              this.field_G[param0][param1] = var5;
              var6_int = (var5.field_z * var5.field_k >> 12) + var5.field_r;
              var5.field_r = var5.field_r + (param1 - var5.field_A << 8);
              var5.field_z = 4096;
              var5.field_k = var6_int - var5.field_r;
              var5.field_A = param1;
              return;
            }
            var5 = (in) (this.field_N.field_r.j(0));
          }
        }
        var11 = (sn) (this.field_F.a(-25484, (long)this.field_y[param0]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_n[param1];
        if (var6 == null) {
          return;
        }
        var7 = new in();
        var7.field_F = var6;
        var7.field_x = var12;
        var7.field_I = param0;
        var7.field_q = var11.field_l[param1];
        var7.field_y = var11.field_p[param1];
        var7.field_A = param1;
        var7.field_D = 1024 + var11.field_t[param1] * (param3 * param3) * var12.field_v >> 11;
        var7.field_C = 255 & var11.field_o[param1];
        var7.field_r = -(var11.field_u[param1] & 32767) + (param1 << 8);
        var7.field_w = 0;
        var7.field_o = 0;
        var7.field_v = -1;
        var7.field_l = 0;
        var7.field_m = 0;
        if (this.field_o[param0] != 0) {
          var7.field_G = pp.a(var6, this.a(-2003551188, var7), 0, this.b(var7, (byte) -109));
          stackIn_16_1 = !(var12.field_u[param1] >= 0);
          this.a(stackIn_16_1, (byte) 118, var7);
        } else {
          var7.field_G = pp.a(var6, this.a(-2003551188, var7), this.a(var7, (byte) -123), this.b(var7, (byte) 96));
        }
        if (var12.field_u[param1] < 0) {
          var7.field_G.g(-1);
        }
        if (0 <= var7.field_y) {
          var8 = this.field_P[param0][var7.field_y];
          if (var8 != null &&
            0 > var8.field_v) {
            this.field_G[param0][var8.field_A] = null;
            var8.field_v = 0;
          }
          this.field_P[param0][var7.field_y] = var7;
        }
        this.field_N.field_r.a(22125, var7);
        if (param2 >= -21) {
          var10 = (fm) null;
          this.a((ua) null, (po) null, (fm) null, 79, -76);
        }
        this.field_G[param0][param1] = var7;
        return;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 < 45) {
          return false;
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    final synchronized sj b() {
        return (sj) ((Object) this.field_N);
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param0 != this.field_y[param2]) {
          this.field_y[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_P[param2][var4] = null;
          }
        }
        if (param1) {
          this.a(79, 96);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= 106) {
          this.field_G = (in[][]) null;
        }
    }

    final void a(boolean param0, byte param1, in param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param1 != 118) {
            return;
          }
          var4_int = param2.field_F.field_n.length;
          if (param0 &&
            param2.field_F.field_m) {
            var6 = var4_int + var4_int - param2.field_F.field_l;
            var5 = (int)((long)var6 * (long)this.field_o[param2.field_I] >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              param2.field_G.a(true);
              var5 = -var5 - 1 + (var4_int + var4_int);
            }
          } else {
            var5 = (int)((long)this.field_o[param2.field_I] * (long)var4_int >> 6);
          }
          param2.field_G.f(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ti.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        jd var1 = (jd) (vc.field_O.b(-88));
        if (var1 == null) {
          var1 = new jd();
        }
        if (param0) {
          ti.a(-80, 'ￆ');
        }
        var1.a(t.field_k, t.field_a, t.field_d, t.field_e, (byte) -102, t.field_h, t.field_f, t.field_j);
        oj.field_P.a(22125, var1);
    }

    final boolean a(int param0, in param1, int param2, boolean param3, int[] param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          param1.field_E = mm.field_h / 100;
          if (param1.field_v >= 0 && (null == param1.field_G ||
            param1.field_G.h())) {
            param1.a(param3);
            param1.c(2779);
            if (param1.field_y > 0 &&
              this.field_P[param1.field_I][param1.field_y] == param1) {
              this.field_P[param1.field_I][param1.field_y] = null;
              return true;
            }
            return true;
          }
          var6_int = param1.field_z;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_p[param1.field_I] * 0.0004921259842519685));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param1.field_z = var6_int;
          }
          param1.field_G.i(this.a(-2003551188, param1));
          var7 = param1.field_q;
          param1.field_u = param1.field_u + var7.field_g;
          param1.field_H = param1.field_H + 1;
          var8 = param3 ? 1 : 0;
          var9 = (double)((-60 + param1.field_A << 8) + (param1.field_z * param1.field_k >> 12)) * 0.000005086263020833333;
          if (0 < var7.field_e) {
            if (var7.field_i <= 0) {
              param1.field_l = param1.field_l + 128;
            } else {
              param1.field_l = param1.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_i * var9) * 128.0);
            }
            if (param1.field_l * var7.field_e >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_b) {
            if (0 >= var7.field_f) {
              param1.field_o = param1.field_o + 128;
            } else {
              param1.field_o = param1.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
            }
            while (var7.field_b.length - 2 > param1.field_w) {
              if (param1.field_o > (65280 & var7.field_b[param1.field_w + 2] << 8)) {
                param1.field_w = param1.field_w + 2;
                continue;
              }
              break;
            }
            if (param1.field_w == var7.field_b.length - 2 &&
              var7.field_b[1 + param1.field_w] == 0) {
              var8 = 1;
            }
          }
          if (param1.field_v >= 0 &&
            null != var7.field_h &&
            (1 & this.field_x[param1.field_I]) == 0 && (!(param1.field_y >= 0) ||
            this.field_P[param1.field_I][param1.field_y] != param1)) {
            if (var7.field_d > 0) {
              param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
            } else {
              param1.field_v = param1.field_v + 128;
            }
            while (var7.field_h.length - 2 > param1.field_m) {
              if ((255 & var7.field_h[param1.field_m + 2]) << 8 < param1.field_v) {
                param1.field_m = param1.field_m + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_h.length == param1.field_m) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_G.a(param1.field_E, this.a(param1, (byte) -113), this.b(param1, (byte) 89));
            return false;
          }
          param1.field_G.e(param1.field_E);
          if (param4 == null) {
            param1.field_G.a(param0);
          } else {
            param1.field_G.b(param4, param2, param0);
          }
          if (param1.field_G.k()) {
            this.field_N.field_o.a(param1.field_G);
          }
          param1.a(param3);
          if (param1.field_v >= 0) {
            param1.c(2779);
            if (param1.field_y > 0 &&
              this.field_P[param1.field_I][param1.field_y] == param1) {
              this.field_P[param1.field_I][param1.field_y] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("ti.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.b((byte) -112, param1);
          }
        } else {
          this.field_q[param1] = 12800;
          this.field_R[param1] = 8192;
          this.field_H[param1] = 16383;
          this.field_u[param1] = 8192;
          this.field_r[param1] = 0;
          this.field_p[param1] = 8192;
          if (param0 > -45) {
            this.d(-56, -113);
          }
          this.b(param1, 16383);
          this.a(true, param1);
          this.field_x[param1] = 0;
          this.field_M[param1] = 32767;
          this.field_L[param1] = 256;
          this.field_o[param1] = 0;
          this.c(103, 8192, param1);
        }
    }

    public static void h(int param0) {
        int var1 = -106 % ((34 - param0) / 60);
        field_E = null;
    }

    final synchronized int a() {
        return 0;
    }

    final synchronized void a(ua param0, int param1, boolean param2) {
        try {
          this.a(param2, param0, true, 0);
          if (param1 != -39) {
            this.e(54);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        this.field_C = param0;
        if (param1 != 274191016) {
          fm var4 = (fm) null;
          this.a((ua) null, (po) null, (fm) null, -68, 6);
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        in var6;
        int var7;
        in var8;
        var7 = Pixelate.field_H ? 1 : 0;
        var8 = this.field_G[param2][param0];
        if (var8 == null) {
          return;
        }
        this.field_G[param2][param0] = null;
        if (param3 <= 113) {
          return;
        }
        {
          if (0 != (2 & this.field_x[param2])) {
            var6 = (in) (this.field_N.field_r.c(1504642273));
            while (var6 != null) {
              if (var6.field_I == var8.field_I &&
                0 > var6.field_v &&
                var6 != var8) {
                var8.field_v = 0;
                break;
              }
              var6 = (in) (this.field_N.field_r.f(1504642273));
            }
          } else {
            var8.field_v = 0;
          }
        }
    }

    private final int a(in param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        un var10 = null;
        un var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (0 == this.field_S[param0.field_I]) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var10 = param0.field_q;
          var11 = var10;
          var4 = 4096 + this.field_H[param0.field_I] * this.field_q[param0.field_I] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + var4 * param0.field_D >> 15;
          var4 = 128 + this.field_v * var4 >> 8;
          var4 = 128 + var4 * this.field_S[param0.field_I] >> 8;
          var5 = 78 % ((-76 - param1) / 35);
          if (var11.field_e > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_e * ((double)param0.field_l * 0.00001953125)) + 0.5);
          }
          if (var11.field_b != null) {
            var6 = param0.field_o;
            var7 = var11.field_b[param0.field_w + 1];
            if (param0.field_w < -2 + var11.field_b.length) {
              var8 = var10.field_b[param0.field_w] << 8 & 65280;
              var9 = (var11.field_b[param0.field_w + 2] & 255) << 8;
              var7 = var7 + (var6 - var8) * (var11.field_b[param0.field_w + 3] - var7) / (var9 - var8);
            }
            var4 = 32 + var7 * var4 >> 6;
          }
          if (0 < param0.field_v &&
            null != var11.field_h) {
            var6Lifetime1 = param0.field_v;
            var7Lifetime1 = var11.field_h[1 + param0.field_m];
            if (var11.field_h.length - 2 > param0.field_m) {
              var8Lifetime1 = 65280 & var10.field_h[param0.field_m] << 8;
              var9Lifetime1 = 65280 & var11.field_h[param0.field_m + 2] << 8;
              var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 - var8Lifetime1) * (var11.field_h[3 + param0.field_m] - var7Lifetime1) / (var9Lifetime1 - var8Lifetime1);
            }
            var4 = var7Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ti.G(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = this.field_U;
        if (param0 > -105) {
          this.b(100, -34);
        }
        var3 = this.field_B;
        var4 = this.field_J;
        if (null != this.field_D &&
          this.field_O == var3) {
          this.a(this.field_z, this.field_D, this.field_s, 0);
          this.f(-113);
          return;
        }
        while (true) {
          if (this.field_B != var3) {
            this.field_B = var3;
            this.field_U = var2;
            this.field_J = var4;
            if (this.field_D != null) {
              stackIn_23_0 = ~this.field_O;
              stackIn_23_1 = ~var3;
              if (stackIn_23_0 > stackIn_23_1) {
                this.field_B = this.field_O;
                this.field_U = -1;
                this.field_J = this.field_T.f(this.field_B);
              }
            }
            return;
          }
          while (~this.field_T.field_g[var2] == ~var3) {
            this.field_T.c(var2);
            var6 = this.field_T.a(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.d(var6, -24232);
              }
              this.field_T.b(var2);
              this.field_T.d(var2);
              continue;
            }
            this.field_T.e();
            this.field_T.d(var2);
            if (this.field_T.c()) {
              if (null != this.field_D) {
                this.a(this.field_D, -39, this.field_z);
                this.f(-106);
                return;
              }
              if (this.field_z &&
                var3 != 0) {
                this.field_T.a(var4);
              } else {
                this.a((byte) 99, true);
                this.field_T.b();
                return;
              }
            }
            break;
          }
          var2 = this.field_T.a();
          var3 = this.field_T.field_g[var2];
          var4 = this.field_T.f(var3);
        }
    }

    private final int b(in param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_R[param0.field_I];
          var4 = -18 / ((param1 + 23) / 55);
          if (var3_int < 8192) {
            stackIn_4_0 = var3_int * param0.field_C + 32 >> 6;
            return stackIn_4_0;
          }
          stackIn_2_0 = 16384 - ((16384 - var3_int) * (-param0.field_C + 128) + 32 >> 6);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ti.KA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized sj d() {
        return null;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_T.f()) {
          var2 = this.field_C * this.field_T.field_i / mm.field_h;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_w;
            if (-var3 + this.field_J >= 0L) {
              this.field_w = var3;
              break;
            }
            var5 = (int)((-1L + (this.field_J - this.field_w + (long)var2)) / (long)var2);
            this.field_w = this.field_w + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_N.a(var5);
            this.f(-123);
            if (!this.field_T.f()) {
              break;
            }
          }
        }
        this.field_N.a(param0);
    }

    private final void b(int param0, int param1) {
        in var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 != 16383) {
          return;
        }
        if ((2 & this.field_x[param0]) != 0) {
          var3 = (in) (this.field_N.field_r.c(param1 + 1504625890));
          while (var3 != null) {
            if (var3.field_I == param0) {
              if (this.field_G[param0][var3.field_A] != null) {
                var3 = (in) (this.field_N.field_r.f(1504642273));
                continue;
              }
              if (0 > var3.field_v) {
                var3.field_v = 0;
              }
            }
            var3 = (in) (this.field_N.field_r.f(1504642273));
          }
        }
    }

    final synchronized void g(int param0) {
        this.a(125, true);
        int var2 = 127 / ((param0 - 78) / 45);
    }

    private final synchronized void a(boolean param0, ua param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        try {
          this.a(param3 + 66, param2);
          this.field_T.a(param1.field_k);
          this.field_w = (long)param3;
          this.field_z = param0 ? true : false;
          var5_int = this.field_T.d();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_T.c(var6);
            this.field_T.b(var6);
            this.field_T.d(var6);
          }
          this.field_U = this.field_T.a();
          this.field_B = this.field_T.field_g[this.field_U];
          this.field_J = this.field_T.f(this.field_B);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void d(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = Pixelate.field_H ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = 127 & param0 >> 16;
          this.a(var5, var6, var4, (byte) 120);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (param0 & 32584) >> 8;
          var6Lifetime1 = (param0 & 8388537) >> 16;
          if (0 >= var6Lifetime1) {
            this.a(var5Lifetime1, 64, var4Lifetime1, (byte) 115);
          } else {
            this.a(var4Lifetime1, var5Lifetime1, -83, var6Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = param0 >> 8 & 127;
          var6Lifetime2 = param0 >> 16 & 127;
          this.a((byte) 119, var5Lifetime2, var4Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param0;
            var5Lifetime3 = param0 >> 8 & 127;
            this.a(this.field_K[var4Lifetime3] + var5Lifetime3, false, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.b(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, 1000000);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (127 & param0 >> 8) + (16256 & param0 >> 9);
            this.d(var5Lifetime3Lifetime2, var4Lifetime3Lifetime2, -102);
            return;
          }
          if (param1 != -24232) {
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.a((byte) 119, true);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = (param0 & 32655) >> 8;
        var6Lifetime3 = (8347431 & param0) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_K[var4Lifetime4] = cm.a(-2080769, this.field_K[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_K[var4Lifetime4] = cm.a(this.field_K[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (1 == var5Lifetime4) {
          this.field_r[var4Lifetime4] = cm.a(this.field_r[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_r[var4Lifetime4] = var6Lifetime3 + cm.a(-128, this.field_r[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.field_p[var4Lifetime4] = cm.a(this.field_p[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_p[var4Lifetime4] = var6Lifetime3 + cm.a(-128, this.field_p[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.field_q[var4Lifetime4] = cm.a(this.field_q[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (39 == var5Lifetime4) {
          this.field_q[var4Lifetime4] = var6Lifetime3 + cm.a(-128, this.field_q[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_R[var4Lifetime4] = (var6Lifetime3 << 7) + cm.a(-16257, this.field_R[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.field_R[var4Lifetime4] = var6Lifetime3 + cm.a(this.field_R[var4Lifetime4], -128);
        }
        if (11 == var5Lifetime4) {
          this.field_H[var4Lifetime4] = cm.a(this.field_H[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (43 == var5Lifetime4) {
          this.field_H[var4Lifetime4] = var6Lifetime3 + cm.a(-128, this.field_H[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (64 > var6Lifetime3) {
            this.field_x[var4Lifetime4] = cm.a(this.field_x[var4Lifetime4], -2);
          } else {
            this.field_x[var4Lifetime4] = bq.a(this.field_x[var4Lifetime4], 1);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.b(var4Lifetime4, 16383);
            this.field_x[var4Lifetime4] = cm.a(this.field_x[var4Lifetime4], -3);
          } else {
            this.field_x[var4Lifetime4] = bq.a(this.field_x[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 7) + cm.a(127, this.field_M[var4Lifetime4]);
        }
        if (98 == var5Lifetime4) {
          this.field_M[var4Lifetime4] = cm.a(16256, this.field_M[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + cm.a(this.field_M[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 100) {
          this.field_M[var4Lifetime4] = var6Lifetime3 + cm.a(16256, this.field_M[var4Lifetime4]) + 16384;
        }
        if (var5Lifetime4 == 120) {
          this.a(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 121) {
          this.b((byte) -90, var4Lifetime4);
        }
        if (123 == var5Lifetime4) {
          this.a((byte) 87, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_M[var4Lifetime4];
          if (var7 == 16384) {
            this.field_L[var4Lifetime4] = (var6Lifetime3 << 7) + cm.a(this.field_L[var4Lifetime4], -16257);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_M[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_L[var4Lifetime4] = var6Lifetime3 + cm.a(this.field_L[var4Lifetime4], -128);
          }
        }
        if (16 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = (var6Lifetime3 << 7) + cm.a(-16257, this.field_o[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.field_o[var4Lifetime4] = var6Lifetime3 + cm.a(-128, this.field_o[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.a(true, var4Lifetime4);
            this.field_x[var4Lifetime4] = cm.a(this.field_x[var4Lifetime4], -5);
          } else {
            this.field_x[var4Lifetime4] = bq.a(this.field_x[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.c(124, (this.field_Q[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.c(72, (-128 & this.field_Q[var4Lifetime4]) + var6Lifetime3, var4Lifetime4);
        }
    }

    final synchronized void a(boolean param0, int param1, int param2) {
        this.a(param2, 4200, param1);
        if (!param0) {
          this.a((byte) 53, 52);
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = -72 % ((param0 - 20) / 61);
        return this.field_T.f();
    }

    final synchronized void e(int param0) {
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != -38) {
          this.field_x = (int[]) null;
        }
        sn var4 = (sn) (this.field_F.a((byte) -121));
        while (var4 != null) {
          var4.a(false);
          var4 = (sn) (this.field_F.a(113));
        }
    }

    private final void a(boolean param0, int param1) {
        in var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (0 != (4 & this.field_x[param1])) {
          var3 = (in) (this.field_N.field_r.c(1504642273));
          while (var3 != null) {
            if (param1 == var3.field_I) {
              var3.field_n = 0;
            }
            var3 = (in) (this.field_N.field_r.f(1504642273));
          }
        }
        if (!param0) {
          this.field_L = (int[]) null;
        }
    }

    final synchronized void c(byte param0, int param1) {
        this.field_v = param1;
        int var3 = -66 / ((-71 - param0) / 55);
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_T.b();
        this.field_D = null;
        this.a((byte) 92, param1);
        if (param0 <= 36) {
          this.b((byte) 56, 43);
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_Q[param2] = param1;
        if (param0 <= 19) {
          return;
        }
        this.field_I[param2] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
    }

    public ti() {
        this.field_H = new int[16];
        this.field_q = new int[16];
        this.field_M = new int[16];
        this.field_L = new int[16];
        this.field_Q = new int[16];
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_P = new in[16][128];
        this.field_K = new int[16];
        this.field_y = new int[16];
        this.field_x = new int[16];
        this.field_S = new int[16];
        this.field_r = new int[16];
        this.field_R = new int[16];
        this.field_v = 256;
        this.field_G = new in[16][128];
        this.field_I = new int[16];
        this.field_u = new int[16];
        this.field_C = 1000000;
        this.field_V = new int[16];
        this.field_T = new sg();
        this.field_N = new km(this);
        this.field_F = new nl(128);
        this.b(256, false, -1);
        this.a((byte) 126, true);
    }

    ti(ti param0) {
        this.field_H = new int[16];
        this.field_q = new int[16];
        this.field_M = new int[16];
        this.field_L = new int[16];
        this.field_Q = new int[16];
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_P = new in[16][128];
        this.field_K = new int[16];
        this.field_y = new int[16];
        this.field_x = new int[16];
        this.field_S = new int[16];
        this.field_r = new int[16];
        this.field_R = new int[16];
        this.field_v = 256;
        this.field_G = new in[16][128];
        this.field_I = new int[16];
        this.field_u = new int[16];
        this.field_C = 1000000;
        this.field_V = new int[16];
        this.field_T = new sg();
        this.field_N = new km(this);
        try {
          this.field_F = param0.field_F;
          this.b(256, false, -1);
          this.a((byte) 106, true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
