/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends sn {
    private int[] field_v;
    int[] field_B;
    private int field_z;
    private int[] field_W;
    private pe[][] field_u;
    private int[] field_E;
    private int[] field_O;
    private int[] field_C;
    private int[] field_w;
    static boolean field_S;
    private jl field_G;
    private int[] field_F;
    private int[] field_y;
    private int[] field_Q;
    static cr field_t;
    private int[] field_R;
    private int[] field_T;
    private qd field_I;
    private pe[][] field_L;
    private int[] field_U;
    int[] field_N;
    private int field_A;
    int[] field_H;
    private int[] field_X;
    private long field_r;
    private rq field_P;
    private int field_J;
    private int field_s;
    private long field_D;
    private boolean field_V;
    private si field_x;
    private boolean field_K;
    private int field_M;

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 4294) {
          this.b(69, -54);
        }
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var3Lifetime1;
        if (param1 != -128) {
          this.a(81, -81, (byte) 98);
        }
        if (param0) {
          this.c(false, -1);
        } else {
          this.b((byte) 5, -1);
        }
        this.e((byte) 19, -1);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_O[var3] = this.field_R[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (16 > var5) {
          this.field_C[var5] = b.a(-128, this.field_R[var5]);
          var5++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != -12) {
          this.field_y = (int[]) null;
        }
    }

    private final synchronized void a(boolean param0, si param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
          this.b(param0, 8192);
          this.field_I.a(param1.field_n);
          this.field_V = param2 ? true : false;
          this.field_r = 0L;
          var5_int = this.field_I.c();
          if (param3 > -54) {
            this.field_A = -73;
          }
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_I.a(var6);
            this.field_I.e(var6);
            this.field_I.d(var6);
          }
          this.field_s = this.field_I.a();
          this.field_J = this.field_I.field_b[this.field_s];
          this.field_D = this.field_I.b(this.field_J);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "db.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        int var4Lifetime1;
        if (this.field_O[param2] != param1) {
          this.field_O[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_L[param2][var4] = null;
          }
        }
        var4Lifetime1 = 38 / ((param0 - 39) / 58);
    }

    private final int a(pe param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gl var9 = null;
        gl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_T[param0.field_q] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_p;
          var10 = var9;
          var4 = this.field_v[param0.field_q] * this.field_F[param0.field_q] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + var4 * param0.field_F >> 15;
          var4 = this.field_z * var4 + 128 >> 8;
          var4 = this.field_T[param0.field_q] * var4 + 128 >> 8;
          if (0 < var10.field_n) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var10.field_n * ((double)param0.field_v * 0.00001953125)));
          }
          if (var10.field_e != null) {
            var5 = param0.field_G;
            var6 = var10.field_e[param0.field_x + 1];
            if (-2 + var10.field_e.length > param0.field_x) {
              var7 = (255 & var9.field_e[param0.field_x]) << 8;
              var8 = var10.field_e[param0.field_x + 2] << 8 & 65280;
              var6 = var6 + (var10.field_e[3 + param0.field_x] - var6) * (-var7 + var5) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param0.field_E > 0 &&
            var10.field_g != null) {
            var5Lifetime1 = param0.field_E;
            var6Lifetime1 = var10.field_g[1 + param0.field_D];
            if (param0.field_D < var10.field_g.length - 2) {
              var7Lifetime1 = (var9.field_g[param0.field_D] & 255) << 8;
              var8Lifetime1 = (255 & var10.field_g[param0.field_D + 2]) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.field_g[3 + param0.field_D] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          if (param1 != 93) {
            this.b(-26, 26, 17, 93);
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("db.S(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(boolean param0, int param1) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          return;
        }
        pe var3 = (pe) (this.field_P.field_w.a((byte) 100));
        while (var3 != null) {
          if (param1 < 0 ||
            var3.field_q == param1) {
            if (var3.field_J != null) {
              var3.field_J.h(dd.field_u / 100);
              if (var3.field_J.l()) {
                this.field_P.field_z.a(var3.field_J);
              }
              var3.a(-117);
            }
            if (var3.field_E < 0) {
              this.field_u[var3.field_q][var3.field_B] = null;
            }
            var3.c(2);
          }
          var3 = (pe) (this.field_P.field_w.b(29));
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        er var5 = new er(param2, param1);
        int[] var6 = bi.field_l;
        int var7 = bi.field_e;
        int var8 = bi.field_j;
        var5.d();
        bi.f(param3, 0, param2, param1, 12, 5921370);
        bi.f(4, 4, param2 - 8, -8 + param1, 8, 0);
        bi.a(var6, var7, var8);
        var5.e(param0, param4);
    }

    final static void a(boolean param0, int param1, byte param2, si param3, boolean param4, int param5) {
        Object var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          var6 = ri.field_r;
          synchronized (var6) {
            var7 = 50 / ((param2 + 61) / 62);
            if (fo.field_e == param3) {
              return;
            }
            fo.field_e = param3;
            if (fo.field_e != null) {
              qc.field_v.a(param5, param1, true, param4, param0, fo.field_e);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var6_ref;
          stackIn_15_1 = new StringBuilder().append("db.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void e(byte param0, int param1) {
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.e((byte) 40, param1);
          }
        } else {
          this.field_F[param1] = 12800;
          this.field_Q[param1] = 8192;
          this.field_v[param1] = 16383;
          this.field_W[param1] = 8192;
          this.field_X[param1] = 0;
          this.field_U[param1] = 8192;
          this.b(param1, 2);
          this.d((byte) 70, param1);
          this.field_N[param1] = 0;
          if (param0 < 4) {
            this.field_C = (int[]) null;
          }
          this.field_y[param1] = 32767;
          this.field_w[param1] = 256;
          this.field_H[param1] = 0;
          this.b(param1, 8192, 2097152);
        }
    }

    final synchronized void a(int param0, si param1, boolean param2) {
        try {
          this.a(true, param1, param2, -90);
          if (param0 > -13) {
            this.field_P = (rq) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "db.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        int var1 = 79 / ((-81 - param0) / 38);
    }

    final boolean a(int param0, pe param1, int param2, int[] param3, byte param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          param1.field_H = dd.field_u / 100;
          if (0 <= param1.field_E && (null == param1.field_J ||
            param1.field_J.j())) {
            param1.a(-110);
            param1.c(2);
            if (param1.field_I > 0) {
              if (param1 != this.field_L[param1.field_q][param1.field_I]) {
                return true;
              }
              this.field_L[param1.field_q][param1.field_I] = null;
            }
            return true;
          }
          var6_int = param1.field_w;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_U[param1.field_q]) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param1.field_w = var6_int;
          }
          param1.field_J.e(this.a((byte) -84, param1));
          var7 = param1.field_p;
          param1.field_s = param1.field_s + 1;
          param1.field_n = param1.field_n + var7.field_b;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param1.field_B << 8) + (param1.field_y * param1.field_w >> 12));
          if (var7.field_n > 0) {
            if (var7.field_f <= 0) {
              param1.field_v = param1.field_v + 128;
            } else {
              param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_f));
            }
            if (param1.field_v * var7.field_n >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_e != null) {
            if (var7.field_h <= 0) {
              param1.field_G = param1.field_G + 128;
            } else {
              param1.field_G = param1.field_G + (int)(Math.pow(2.0, (double)var7.field_h * var9) * 128.0 + 0.5);
            }
            while (var7.field_e.length - 2 > param1.field_x) {
              if ((65280 & var7.field_e[2 + param1.field_x] << 8) < param1.field_G) {
                param1.field_x = param1.field_x + 2;
                continue;
              }
              break;
            }
            if (var7.field_e.length - 2 == param1.field_x &&
              0 == var7.field_e[1 + param1.field_x]) {
              var8 = 1;
            }
          }
          if (param1.field_E >= 0 &&
            var7.field_g != null &&
            (1 & this.field_N[param1.field_q]) == 0 && (!(0 <= param1.field_I) ||
            param1 != this.field_L[param1.field_q][param1.field_I])) {
            if (0 >= var7.field_j) {
              param1.field_E = param1.field_E + 128;
            } else {
              param1.field_E = param1.field_E + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
            }
            while (param1.field_D < var7.field_g.length - 2) {
              if (param1.field_E > (255 & var7.field_g[2 + param1.field_D]) << 8) {
                param1.field_D = param1.field_D + 2;
                continue;
              }
              break;
            }
            if (var7.field_g.length - 2 == param1.field_D) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_J.a(param1.field_H, this.a(param1, (byte) 93), this.a(param1, 32));
            if (param4 < 104) {
              this.c((byte) 78, -39);
            }
            return false;
          }
          param1.field_J.h(param1.field_H);
          if (param3 == null) {
            param1.field_J.a(param2);
          } else {
            param1.field_J.b(param3, param0, param2);
          }
          if (param1.field_J.l()) {
            this.field_P.field_z.a(param1.field_J);
          }
          param1.a(-117);
          if (0 <= param1.field_E) {
            param1.c(2);
            if (param1.field_I > 0 &&
              param1 == this.field_L[param1.field_q][param1.field_I]) {
              this.field_L[param1.field_q][param1.field_I] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("db.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        this.c(-128, param2, param0);
        if (!param1) {
          db.f(-103);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5;
        pe var6;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param2 != -61) {
          var6 = (pe) null;
          this.a((pe) null, (byte) -35, true);
        }
        if (param1 < 0) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_T[var4] = param0;
          }
        } else {
          this.field_T[param1] = param0;
        }
    }

    final static String h(int param0) {
        if (!(qc.field_A >= param0)) {
          return ap.field_g;
        }
        if (null != qc.field_B) {
          if (!qc.field_B.b(0)) {
            return eb.field_a;
          }
          return bq.field_A;
        }
        if (!ke.field_b.b(0)) {
          return ib.field_b;
        }
        if (!ke.field_b.c("commonui", 0)) {
          return me.field_b + " - " + ke.field_b.a("commonui", 0) + "%";
        }
        if (!la.field_e.b(0)) {
          return vc.field_a;
        }
        if (!la.field_e.c("commonui", param0 - 2)) {
          return vd.field_c + " - " + la.field_e.a("commonui", 0) + "%";
        }
        if (!kb.field_b.b(0)) {
          return vj.field_a;
        }
        if (!kb.field_b.a((byte) -112)) {
          return dk.field_n + " - " + kb.field_b.d(-1) + "%";
        }
        return b.field_f;
    }

    private final void b(int param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if ((param1 & this.field_N[param0]) != 0) {
          var3 = (pe) (this.field_P.field_w.a((byte) 100));
          while (var3 != null) {
            if (param0 == var3.field_q &&
              this.field_u[param0][var3.field_B] == null &&
              var3.field_E < 0) {
              var3.field_E = 0;
            }
            var3 = (pe) (this.field_P.field_w.b(77));
          }
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_I.f()) {
          var2 = this.field_I.field_c * this.field_A / dd.field_u;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_r;
            if (0L <= -var3 + this.field_D) {
              this.field_r = var3;
              break;
            }
            var5 = (int)(((long)var2 + (this.field_D + (-this.field_r - 1L))) / (long)var2);
            this.field_r = this.field_r + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_P.a(var5);
            this.e(-29482);
            if (!this.field_I.f()) {
              break;
            }
          }
        }
        this.field_P.a(param0);
    }

    final boolean a(int param0, pe param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_R = (int[]) null;
          }
          if (null != param1.field_J) {
            return false;
          }
          if (param1.field_E < 0) {
            return true;
          }
          param1.c(2);
          if (param1.field_I > 0 &&
            this.field_L[param1.field_q][param1.field_I] == param1) {
            this.field_L[param1.field_q][param1.field_I] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("db.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pe var9;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = (32626 & param1) >> 8;
          var6 = param1 >> 16 & 127;
          this.a(var5, false, var6, var4);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = (param1 & 8379569) >> 16;
          if (0 >= var6Lifetime1) {
            this.a(var5Lifetime1, false, 64, var4Lifetime1);
            return;
          }
          this.b(var4Lifetime1, 31423, var6Lifetime1, var5Lifetime1);
        } else {
          if (param0 > -98) {
            var9 = (pe) null;
            this.a((pe) null, (byte) 100, true);
          }
          if (160 == var3) {
            var4Lifetime1 = 15 & param1;
            var5Lifetime1 = param1 >> 8 & 127;
            var6Lifetime1 = (8382070 & param1) >> 16;
            this.a(var5Lifetime1, 4294, var6Lifetime1, var4Lifetime1);
            return;
          }
          if (176 != var3) {
            if (192 == var3) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = param1 >> 8 & 127;
              this.a((byte) -29, this.field_C[var4Lifetime1] + var5Lifetime1, var4Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = param1 >> 8 & 127;
              this.a(-12, var5Lifetime1, var4Lifetime1);
              return;
            }
            if (224 == var3) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = (127 & param1 >> 8) + ((param1 & 8323400) >> 9);
              this.d(var5Lifetime1, -127, var4Lifetime1);
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.d(true, -128);
            return;
          }
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (var5Lifetime1 == 0) {
            this.field_C[var4Lifetime1] = (var6Lifetime1 << 14) + b.a(-2080769, this.field_C[var4Lifetime1]);
          }
          if (32 == var5Lifetime1) {
            this.field_C[var4Lifetime1] = (var6Lifetime1 << 7) + b.a(this.field_C[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 1) {
            this.field_X[var4Lifetime1] = (var6Lifetime1 << 7) + b.a(this.field_X[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 33) {
            this.field_X[var4Lifetime1] = b.a(this.field_X[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 5) {
            this.field_U[var4Lifetime1] = b.a(this.field_U[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (37 == var5Lifetime1) {
            this.field_U[var4Lifetime1] = var6Lifetime1 + b.a(-128, this.field_U[var4Lifetime1]);
          }
          if (var5Lifetime1 == 7) {
            this.field_F[var4Lifetime1] = b.a(this.field_F[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (39 == var5Lifetime1) {
            this.field_F[var4Lifetime1] = var6Lifetime1 + b.a(this.field_F[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 10) {
            this.field_Q[var4Lifetime1] = (var6Lifetime1 << 7) + b.a(this.field_Q[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 42) {
            this.field_Q[var4Lifetime1] = b.a(this.field_Q[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 11) {
            this.field_v[var4Lifetime1] = b.a(this.field_v[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.field_v[var4Lifetime1] = b.a(this.field_v[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 < 64) {
              this.field_N[var4Lifetime1] = b.a(this.field_N[var4Lifetime1], -2);
            } else {
              this.field_N[var4Lifetime1] = om.a(this.field_N[var4Lifetime1], 1);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.field_N[var4Lifetime1] = om.a(this.field_N[var4Lifetime1], 2);
            } else {
              this.b(var4Lifetime1, 2);
              this.field_N[var4Lifetime1] = b.a(this.field_N[var4Lifetime1], -3);
            }
          }
          if (var5Lifetime1 == 99) {
            this.field_y[var4Lifetime1] = b.a(127, this.field_y[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 98) {
            this.field_y[var4Lifetime1] = b.a(16256, this.field_y[var4Lifetime1]) + var6Lifetime1;
          }
          if (101 == var5Lifetime1) {
            this.field_y[var4Lifetime1] = (var6Lifetime1 << 7) + 16384 + b.a(127, this.field_y[var4Lifetime1]);
          }
          if (var5Lifetime1 == 100) {
            this.field_y[var4Lifetime1] = var6Lifetime1 + b.a(this.field_y[var4Lifetime1], 16256) + 16384;
          }
          if (var5Lifetime1 == 120) {
            this.c(false, var4Lifetime1);
          }
          if (var5Lifetime1 == 121) {
            this.e((byte) 58, var4Lifetime1);
          }
          if (var5Lifetime1 == 123) {
            this.b((byte) -117, var4Lifetime1);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.field_y[var4Lifetime1];
            if (var7 == 16384) {
              this.field_w[var4Lifetime1] = b.a(-16257, this.field_w[var4Lifetime1]) + (var6Lifetime1 << 7);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_y[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.field_w[var4Lifetime1] = b.a(-128, this.field_w[var4Lifetime1]) + var6Lifetime1;
            }
          }
          if (16 == var5Lifetime1) {
            this.field_H[var4Lifetime1] = (var6Lifetime1 << 7) + b.a(-16257, this.field_H[var4Lifetime1]);
          }
          if (var5Lifetime1 == 48) {
            this.field_H[var4Lifetime1] = b.a(this.field_H[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.d((byte) 70, var4Lifetime1);
              this.field_N[var4Lifetime1] = b.a(this.field_N[var4Lifetime1], -5);
            } else {
              this.field_N[var4Lifetime1] = om.a(this.field_N[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.b(var4Lifetime1, (var6Lifetime1 << 7) + (-16257 & this.field_E[var4Lifetime1]), 2097152);
          }
          if (49 == var5Lifetime1) {
            this.b(var4Lifetime1, (-128 & this.field_E[var4Lifetime1]) + var6Lifetime1, 2097152);
            return;
          }
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        this.field_I.b();
        this.field_x = null;
        this.d(param0, -128);
        if (param1 != 8192) {
          this.field_W = (int[]) null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pe stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        pe var5;
        int var6_int;
        ae var6;
        pe var7;
        pe var8;
        int var9;
        al var10;
        al var11;
        var9 = Vertigo2.field_L ? 1 : 0;
        this.a(param3, false, 64, param0);
        if ((this.field_N[param0] & 2) != 0) {
          var5 = (pe) (this.field_P.field_w.c((byte) -65));
          while (var5 != null) {
            if (param0 == var5.field_q &&
              var5.field_E < 0) {
              this.field_u[param0][var5.field_B] = null;
              this.field_u[param0][param3] = var5;
              var6_int = (var5.field_w * var5.field_y >> 12) + var5.field_A;
              var5.field_A = var5.field_A + (param3 - var5.field_B << 8);
              var5.field_y = var6_int - var5.field_A;
              var5.field_w = 4096;
              var5.field_B = param3;
              return;
            }
            var5 = (pe) (this.field_P.field_w.b(false));
          }
        }
        var10 = (al) (this.field_G.a((long)this.field_O[param0], (byte) 64));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        if (param1 != 31423) {
          this.field_y = (int[]) null;
        }
        var6 = var10.field_r[param3];
        if (var6 == null) {
          return;
        }
        var7 = new pe();
        var7.field_z = var6;
        var7.field_K = var11;
        var7.field_q = param0;
        var7.field_p = var10.field_v[param3];
        var7.field_I = var10.field_q[param3];
        var7.field_B = param3;
        var7.field_F = 1024 + var11.field_w * (param2 * param2 * var10.field_p[param3]) >> 11;
        var7.field_C = 255 & var10.field_B[param3];
        var7.field_A = -(32767 & var10.field_n[param3]) + (param3 << 8);
        var7.field_G = 0;
        var7.field_E = -1;
        var7.field_x = 0;
        var7.field_v = 0;
        var7.field_D = 0;
        if (0 != this.field_H[param0]) {
          var7.field_J = ra.a(var6, this.a((byte) -81, var7), 0, this.a(var7, 32));
          stackIn_19_1 = var7;
          stackIn_19_2 = 124;
          if (var11.field_n[param3] >= 0) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.a(stackIn_19_1, (byte) stackIn_19_2, stackIn_20_3);
        } else {
          var7.field_J = ra.a(var6, this.a((byte) -127, var7), this.a(var7, (byte) 93), this.a(var7, param1 ^ 31391));
        }
        if (0 > var11.field_n[param3]) {
          var7.field_J.i(-1);
        }
        if (var7.field_I >= 0) {
          var8 = this.field_L[param0][var7.field_I];
          if (var8 != null &&
            var8.field_E < 0) {
            this.field_u[param0][var8.field_B] = null;
            var8.field_E = 0;
          }
          this.field_L[param0][var7.field_I] = var7;
        }
        this.field_P.field_w.a(var7, false);
        this.field_u[param0][param3] = var7;
        return;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pe var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        pe var8 = this.field_u[param3][param0];
        if (var8 == null) {
          return;
        }
        this.field_u[param3][param0] = null;
        if ((2 & this.field_N[param3]) == 0) {
          var8.field_E = 0;
        } else {
          var6 = (pe) (this.field_P.field_w.a((byte) 100));
          while (var6 != null) {
            if (var8.field_q == var6.field_q &&
              var6.field_E < 0 &&
              var8 != var6) {
              var8.field_E = 0;
              break;
            }
            var6 = (pe) (this.field_P.field_w.b(76));
          }
        }
        if (param1) {
          this.field_v = (int[]) null;
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_E[param0] = param1;
        this.field_B[param0] = (int)(0.5 + (double)param2 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final int a(byte param0, pe param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        gl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_A + (param1.field_w * param1.field_y >> 12);
          var3_int = var3_int + ((this.field_W[param1.field_q] - 8192) * this.field_w[param1.field_q] >> 12);
          var4 = param1.field_p;
          if (param0 > -44) {
            field_t = (cr) null;
          }
          if (var4.field_b > 0 && (!(var4.field_c <= 0) ||
            this.field_X[param1.field_q] > 0)) {
            var5 = var4.field_c << 2;
            var6 = var4.field_d << 1;
            if (param1.field_s < var6) {
              var5 = param1.field_s * var5 / var6;
            }
            var5 = var5 + (this.field_X[param1.field_q] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_n & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_z.field_r * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)dd.field_u);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("db.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(pe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32) {
            this.b((byte) 25, -27);
          }
          var3_int = this.field_Q[param0.field_q];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((128 - param0.field_C) * (16384 - var3_int) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + var3_int * param0.field_C >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("db.OA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_I.f()) {
            var4_int = this.field_I.field_c * this.field_A / dd.field_u;
            while (true) {
              var5 = this.field_r + (long)var4_int * (long)param2;
              if (this.field_D - var5 >= 0L) {
                this.field_r = var5;
              } else {
                var7 = (int)((-1L + this.field_D - this.field_r + (long)var4_int) / (long)var4_int);
                this.field_r = this.field_r + (long)var4_int * (long)var7;
                this.field_P.b(param0, param1, var7);
                this.e(-29482);
                param1 = param1 + var7;
                param2 = param2 - var7;
                if (this.field_I.f()) {
                  continue;
                }
              }
              break;
            }
            this.field_P.b(param0, param1, param2);
            return;
          }
          this.field_P.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("db.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized sn c() {
        return (sn) ((Object) this.field_P);
    }

    private final synchronized void a(int param0, int param1, boolean param2, boolean param3, boolean param4, si param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!param2) {
          pe var9 = (pe) null;
          this.a(42, (pe) null);
        }
        if (!this.field_I.f()) {
          this.a(-124, param5, param3);
          return;
        }
        try {
          this.field_K = param4 ? true : false;
          this.field_V = param3 ? true : false;
          this.field_x = param5;
          var7_int = this.field_I.a(this.field_r) * param0;
          var8 = param1 * this.field_I.field_c;
          var7_int = var8 * ((-1 + var7_int + var8) / var8);
          this.field_M = (var7_int + (param0 >> 1)) / param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "db.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_W[param2] = param0;
        if (param1 > -125) {
          this.field_L = (pe[][]) null;
        }
    }

    final synchronized sn a() {
        return null;
    }

    private final void b(byte param0, int param1) {
        pe var3;
        int var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        var3 = (pe) (this.field_P.field_w.a((byte) 100));
        var4 = -81 % ((-66 - param0) / 48);
        while (var3 != null) {
          if ((0 > param1 ||
            var3.field_q == param1) &&
            var3.field_E < 0) {
            this.field_u[var3.field_q][var3.field_B] = null;
            var3.field_E = 0;
          }
          var3 = (pe) (this.field_P.field_w.b(92));
        }
    }

    private final void d(byte param0, int param1) {
        pe var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if ((4 & this.field_N[param1]) != 0) {
          var3 = (pe) (this.field_P.field_w.a((byte) 100));
          while (var3 != null) {
            if (~param1 == ~var3.field_q) {
              var3.field_o = 0;
            }
            var3 = (pe) (this.field_P.field_w.b(86));
          }
        }
        if (param0 != 70) {
          int[] var5 = (int[]) null;
          this.b((int[]) null, -84, -49);
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -82) {
          si var4 = (si) null;
          this.a(-7, (si) null, false);
        }
        this.field_z = param1;
    }

    final void a(pe param0, byte param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 < 55) {
            this.field_V = false;
          }
          var4_int = param0.field_z.field_s.length;
          if (param2 &&
            param0.field_z.field_p) {
            var6 = var4_int + (var4_int - param0.field_z.field_o);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_H[param0.field_q] * (long)var6 >> 6);
            if (var4_int <= var5) {
              param0.field_J.a(true);
              var5 = -var5 + (var4_int + var4_int - 1);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_H[param0.field_q] >> 6);
          }
          param0.field_J.f(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("db.MA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void c(byte param0, int param1) {
        if (param0 < 43) {
          this.b((byte) 77, -41);
        }
        this.field_A = param1;
    }

    final synchronized boolean g(int param0) {
        if (param0 != -26083) {
          this.field_w = (int[]) null;
        }
        return this.field_I.f();
    }

    private final void c(int param0, int param1, int param2) {
        this.field_R[param2] = param1;
        this.field_C[param2] = b.a(param1, param0);
        this.a((byte) -47, param1, param2);
    }

    final synchronized void a(boolean param0) {
        this.b(param0, 8192);
    }

    final synchronized boolean a(int param0, id param1, si param2, r param3, byte param4) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        ph var9 = null;
        int var10 = 0;
        int var12 = 0;
        al var13 = null;
        al var14 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          param2.b();
          var6_int = 1;
          var7 = null;
          var8 = -4 % ((-2 - param4) / 50);
          if (param0 > 0) {
            var7 = new int[]{param0};
          }
          var9 = (ph) (param2.field_o.b(0));
          while (var9 != null) {
            boolean decompiledFrameRemainder0 = true;
            var10 = (int)var9.field_k;
            var13 = (al) (this.field_G.a((long)var10, (byte) 64));
            if (var13 == null) {
              var14 = ap.a(var10, param3, -125);
              if (var14 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_G.a(var14, (long)var10, false);
                decompiledFrameRemainder0 = !(var14.a(0, var9.field_n, param1, (int[]) (var7)));
              }
            } else {
              decompiledFrameRemainder0 = !(var13.a(0, var9.field_n, param1, (int[]) (var7)));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var9 = (ph) (param2.field_o.c(-28));
          }
          if (var6_int != 0) {
            param2.a();
          }
          stackIn_18_0 = var6_int;
          return stackIn_18_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("db.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void e(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -29482) {
          return;
        }
        var2 = this.field_s;
        var3 = this.field_J;
        var4 = this.field_D;
        if (this.field_x != null &&
          this.field_M == var3) {
          this.a(this.field_K, this.field_x, this.field_V, -126);
          this.e(-29482);
          return;
        }
        while (true) {
          if (var3 != this.field_J) {
            this.field_J = var3;
            this.field_D = var4;
            this.field_s = var2;
            if (this.field_x != null) {
              stackIn_24_0 = this.field_M;
              stackIn_24_1 = var3;
              if (stackIn_24_0 < stackIn_24_1) {
                this.field_J = this.field_M;
                this.field_s = -1;
                this.field_D = this.field_I.b(this.field_J);
              }
            }
            return;
          }
          while (this.field_I.field_b[var2] == var3) {
            this.field_I.a(var2);
            var6 = this.field_I.c(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.a((byte) -101, var6);
              }
              this.field_I.e(var2);
              this.field_I.d(var2);
              continue;
            }
            this.field_I.d();
            this.field_I.d(var2);
            if (this.field_I.e()) {
              if (null != this.field_x) {
                this.a(-69, this.field_x, this.field_V);
                this.e(param0 + 0);
                return;
              }
              if (this.field_V &&
                0 != var3) {
                this.field_I.b(var4);
              } else {
                this.d(true, -128);
                this.field_I.b();
                return;
              }
            }
            break;
          }
          var2 = this.field_I.a();
          var3 = this.field_I.field_b[var2];
          var4 = this.field_I.b(var3);
        }
    }

    public db() {
        this.field_z = 256;
        this.field_u = new pe[16][128];
        this.field_O = new int[16];
        this.field_E = new int[16];
        this.field_v = new int[16];
        this.field_W = new int[16];
        this.field_F = new int[16];
        this.field_R = new int[16];
        this.field_y = new int[16];
        this.field_B = new int[16];
        this.field_C = new int[16];
        this.field_A = 1000000;
        this.field_w = new int[16];
        this.field_T = new int[16];
        this.field_U = new int[16];
        this.field_X = new int[16];
        this.field_N = new int[16];
        this.field_Q = new int[16];
        this.field_L = new pe[16][128];
        this.field_H = new int[16];
        this.field_I = new qd();
        this.field_P = new rq(this);
        this.field_G = new jl(128);
        this.a(256, -1, (byte) -61);
        this.d(true, -128);
    }

    static {
        field_S = true;
    }
}
