/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends nm {
    private int[] field_F;
    int[] field_E;
    private qd[][] field_u;
    private int field_w;
    private int[] field_P;
    private int[] field_C;
    private int[] field_q;
    private int[] field_O;
    private int[] field_S;
    private int[] field_n;
    private al field_v;
    private int[] field_x;
    private int[] field_z;
    private int[] field_o;
    private kl field_s;
    private int[] field_p;
    int[] field_r;
    static char[] field_I;
    private qd[][] field_U;
    int[] field_Q;
    private int field_y;
    static lh field_M;
    private int[] field_t;
    private int[] field_R;
    static ed field_A;
    private boolean field_K;
    private long field_J;
    private int field_G;
    private long field_N;
    private mi field_B;
    private int field_T;
    private boolean field_D;
    private int field_H;
    private pf field_W;

    final synchronized void e(int param0) {
        int discarded$0 = 0;
        this.b(param0 ^ -3347, true);
        if (param0 != -3435) {
          qd var3 = (qd) null;
          discarded$0 = this.a(24, (qd) null);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = Chess.field_G;
        if (this.field_v.e()) {
          var2 = this.field_v.field_h * this.field_w / md.field_l;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_N;
            if (this.field_J - var3 >= 0L) {
              this.field_N = var3;
              break;
            }
            var5 = (int)((-1L + (long)var2 + (this.field_J - this.field_N)) / (long)var2);
            this.field_N = this.field_N + (long)var5 * (long)var2;
            this.field_B.a(var5);
            param0 = param0 - var5;
            this.d(0);
            if (!this.field_v.e()) {
              break;
            }
          }
        }
        this.field_B.a(param0);
    }

    final boolean a(byte param0, qd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25) {
            return false;
          }
          if (param1.field_j != null) {
            return false;
          }
          if (param1.field_J < 0) {
            return true;
          }
          param1.c(-2193);
          if (param1.field_A > 0 &&
            this.field_U[param1.field_n][param1.field_A] == param1) {
            this.field_U[param1.field_n][param1.field_A] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vl.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Chess.field_G;
        if (param0 != this.field_p[param2]) {
          this.field_p[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_U[param2][var4] = null;
          }
        }
        if (!param1) {
          int[] var6 = (int[]) null;
          this.a((int[]) null, 120, 45);
        }
    }

    final synchronized boolean d(byte param0) {
        if (param0 >= -123) {
          this.field_J = 63L;
        }
        return this.field_v.e();
    }

    final boolean a(int param0, int param1, int[] param2, int param3, qd param4) {
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        dl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Chess.field_G;
        try {
          param4.field_B = md.field_l / 100;
          if (0 <= param4.field_J && (null == param4.field_j ||
            param4.field_j.h())) {
            param4.c((byte) 124);
            param4.c(-2193);
            if (0 < param4.field_A) {
              if (param4 != this.field_U[param4.field_n][param4.field_A]) {
                return true;
              }
              this.field_U[param4.field_n][param4.field_A] = null;
            }
            return true;
          }
          var6_int = param4.field_D;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_S[param4.field_n]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_D = var6_int;
          }
          param4.field_j.g(this.a(39, param4));
          var7 = param4.field_K;
          if (param0 != 35) {
            return false;
          }
          var8 = 0;
          param4.field_F = param4.field_F + var7.field_e;
          param4.field_s = param4.field_s + 1;
          var9 = 0.000005086263020833333 * (double)((param4.field_k * param4.field_D >> 12) + (param4.field_C - 60 << 8));
          if (var7.field_b > 0) {
            if (0 < var7.field_i) {
              param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_i * var9));
            } else {
              param4.field_p = param4.field_p + 128;
            }
            if (819200 <= param4.field_p * var7.field_b) {
              var8 = 1;
            }
          }
          if (var7.field_a != null) {
            if (var7.field_l <= 0) {
              param4.field_y = param4.field_y + 128;
            } else {
              param4.field_y = param4.field_y + (int)(0.5 + Math.pow(2.0, (double)var7.field_l * var9) * 128.0);
            }
            while (-2 + var7.field_a.length > param4.field_E) {
              if (param4.field_y > (65280 & var7.field_a[2 + param4.field_E] << 8)) {
                param4.field_E = param4.field_E + 2;
                continue;
              }
              break;
            }
            if (param4.field_E == -2 + var7.field_a.length &&
              var7.field_a[1 + param4.field_E] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_J >= 0 &&
            var7.field_k != null &&
            (this.field_Q[param4.field_n] & 1) == 0 && (!(0 <= param4.field_A) ||
            this.field_U[param4.field_n][param4.field_A] != param4)) {
            if (var7.field_d > 0) {
              param4.field_J = param4.field_J + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
            } else {
              param4.field_J = param4.field_J + 128;
            }
            while (param4.field_o < -2 + var7.field_k.length) {
              if (param4.field_J > (65280 & var7.field_k[2 + param4.field_o] << 8)) {
                param4.field_o = param4.field_o + 2;
                continue;
              }
              break;
            }
            if (param4.field_o == var7.field_k.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_j.a(param4.field_B, this.a(param4, (byte) -127), this.b(param0 + 1276, param4));
            return false;
          }
          param4.field_j.d(param4.field_B);
          if (param2 != null) {
            param4.field_j.a(param2, param3, param1);
          } else {
            param4.field_j.a(param1);
          }
          if (param4.field_j.g()) {
            this.field_B.field_p.a(param4.field_j);
          }
          param4.c((byte) 117);
          if (param4.field_J >= 0) {
            param4.c(param0 - 2228);
            if (0 < param4.field_A &&
              param4 == this.field_U[param4.field_n][param4.field_A]) {
              this.field_U[param4.field_n][param4.field_A] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("vl.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int var4;
        var4 = Chess.field_G;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.b((byte) 80, param1);
          }
        } else {
          this.field_O[param1] = 12800;
          this.field_o[param1] = 8192;
          this.field_C[param1] = 16383;
          this.field_t[param1] = 8192;
          this.field_P[param1] = 0;
          this.field_S[param1] = 8192;
          this.c(param1, 1);
          this.a(param1, false);
          if (param0 <= 63) {
            this.field_F = (int[]) null;
          }
          this.field_Q[param1] = 0;
          this.field_x[param1] = 32767;
          this.field_F[param1] = 256;
          this.field_r[param1] = 0;
          this.b(param1, 8192, (byte) 97);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_17_1 = 0;
        qd stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        qd var5;
        int var6_int;
        lm var6;
        qd var7;
        qd var8;
        int var9;
        kf var10;
        kf var11;
        var9 = Chess.field_G;
        this.c(64, param0, param1, -62);
        if ((this.field_Q[param1] & 2) != 0) {
          var5 = (qd) (this.field_B.field_x.b(param3 + 50101));
          while (var5 != null) {
            if (var5.field_n == param1 &&
              var5.field_J < 0) {
              this.field_u[param1][var5.field_C] = null;
              this.field_u[param1][param0] = var5;
              var6_int = var5.field_z + (var5.field_D * var5.field_k >> 12);
              var5.field_z = var5.field_z + (-var5.field_C + param0 << 8);
              var5.field_C = param0;
              var5.field_k = -var5.field_z + var6_int;
              var5.field_D = 4096;
              return;
            }
            var5 = (qd) (this.field_B.field_x.a(true));
          }
        }
        var10 = (kf) (this.field_s.a(-108, (long)this.field_p[param1]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_s[param0];
        if (var6 == null) {
          return;
        }
        var7 = new qd();
        var7.field_q = var11;
        var7.field_H = var6;
        var7.field_n = param1;
        var7.field_K = var10.field_r[param0];
        var7.field_A = var10.field_l[param0];
        var7.field_C = param0;
        var7.field_t = 1024 + var11.field_n * (param2 * param2) * var10.field_k[param0] >> 11;
        var7.field_v = var10.field_q[param0] & 255;
        var7.field_z = -(var10.field_p[param0] & 32767) + (param0 << 8);
        var7.field_o = 0;
        var7.field_J = -1;
        var7.field_E = 0;
        var7.field_p = 0;
        var7.field_y = 0;
        if (this.field_r[param1] == 0) {
          var7.field_j = na.a(var6, this.a(83, var7), this.a(var7, (byte) -128), this.b(1311, var7));
        } else {
          var7.field_j = na.a(var6, this.a(90, var7), 0, this.b(1311, var7));
          stackIn_17_1 = -109;
          stackIn_17_2 = var7;
          if (0 <= var10.field_p[param0]) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
        }
        if (0 > var10.field_p[param0]) {
          var7.field_j.f(-1);
        }
        if (var7.field_A >= 0) {
          var8 = this.field_U[param1][var7.field_A];
          if (var8 != null &&
            var8.field_J < 0) {
            this.field_u[param1][var8.field_C] = null;
            var8.field_J = 0;
          }
          this.field_U[param1][var7.field_A] = var7;
        }
        this.field_B.field_x.a((o) (var7), (byte) -46);
        if (param3 != -21164) {
          return;
        }
        this.field_u[param1][param0] = var7;
        return;
    }

    final void a(byte param0, qd param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_H.field_m.length;
          if (param2 &&
            param1.field_H.field_o) {
            var6 = var4_int + (var4_int - param1.field_H.field_k);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_r[param1.field_n] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              var5 = -1 + (var4_int + var4_int - var5);
              param1.field_j.a(true);
            }
          } else {
            var5 = (int)((long)this.field_r[param1.field_n] * (long)var4_int >> 6);
          }
          param1.field_j.e(var5);
          if (param0 > -63) {
            this.field_s = (kl) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("vl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1) {
        int var4 = Chess.field_G;
        if (param1 >= -70) {
          this.field_w = -126;
        }
        qd var3 = (qd) (this.field_B.field_x.g(-18110));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_n) {
            if (var3.field_j != null) {
              var3.field_j.d(md.field_l / 100);
              if (var3.field_j.g()) {
                this.field_B.field_p.a(var3.field_j);
              }
              var3.c((byte) 105);
            }
            if (0 > var3.field_J) {
              this.field_u[var3.field_n][var3.field_C] = null;
            }
            var3.c(-2193);
          }
          var3 = (qd) (this.field_B.field_x.a((byte) -108));
        }
    }

    private final int a(qd param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        dl var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_z[param0.field_n] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.field_K;
          var10 = var9;
          var4 = this.field_O[param0.field_n] * this.field_C[param0.field_n] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_t * var4 >> 15;
          var4 = var4 * this.field_y + 128 >> 8;
          var4 = this.field_z[param0.field_n] * var4 + 128 >> 8;
          if (var10.field_b > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * (0.00001953125 * (double)param0.field_p)) * (double)var4);
          }
          if (var10.field_a != null) {
            var5 = param0.field_y;
            var6 = var10.field_a[1 + param0.field_E];
            if (param0.field_E < var10.field_a.length - 2) {
              var7 = (255 & var9.field_a[param0.field_E]) << 8;
              var8 = var10.field_a[2 + param0.field_E] << 8 & 65280;
              var6 = var6 + (var10.field_a[3 + param0.field_E] - var6) * (var5 - var7) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> 6;
          }
          if (0 < param0.field_J &&
            var10.field_k != null) {
            var5Lifetime1 = param0.field_J;
            var6Lifetime1 = var10.field_k[param0.field_o + 1];
            if (param0.field_o < var10.field_k.length - 2) {
              var7Lifetime1 = var9.field_k[param0.field_o] << 8 & 65280;
              var8Lifetime1 = 65280 & var10.field_k[param0.field_o + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.field_k[param0.field_o + 3] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          if (param1 <= -126) {
            stackIn_19_0 = var4;
            return stackIn_19_0;
          }
          stackIn_17_0 = 80;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("vl.Q(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int b(int param0, qd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1311) {
            this.field_q = (int[]) null;
          }
          var3_int = this.field_o[param1.field_n];
          if (8192 > var3_int) {
            stackIn_6_0 = var3_int * param1.field_v + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (16384 - var3_int) * (128 - param1.field_v) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vl.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        int var3Lifetime1;
        if (param0) {
          this.a(-1, -109);
        } else {
          this.a((byte) 106, -1);
        }
        this.b((byte) 118, -1);
        if (param1 != -38) {
          return;
        }
        for (var3 = 0; var3 < 16; var3++) {
          this.field_p[var3] = this.field_n[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_q[var5] = ce.a(this.field_n[var5], -128);
          var5++;
        }
    }

    final synchronized nm b() {
        return null;
    }

    private final void a(int param0, boolean param1) {
        qd var3 = null;
        int var4 = Chess.field_G;
        if ((this.field_Q[param0] & 4) != 0) {
          var3 = (qd) (this.field_B.field_x.g(-18110));
          while (var3 != null) {
            if (param0 == var3.field_n) {
              var3.field_x = 0;
            }
            var3 = (qd) (this.field_B.field_x.a((byte) -97));
          }
        }
        if (param1) {
          this.field_z = (int[]) null;
        }
    }

    final synchronized boolean a(um param0, int param1, int param2, pf param3, fe param4) {
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
        td var8 = null;
        int var9 = 0;
        int var11 = 0;
        kf var12 = null;
        kf var13 = null;
        var11 = Chess.field_G;
        try {
          param3.b();
          if (param1 >= -48) {
            return true;
          }
          var6_int = 1;
          var7 = null;
          if (param2 > 0) {
            var7 = new int[]{param2};
          }
          var8 = (td) (param3.field_k.a(true));
          while (var8 != null) {
            var9 = (int)var8.field_e;
            var12 = (kf) (this.field_s.a(71, (long)var9));
            if (var12 == null) {
              var13 = ij.a(-109, var9, param0);
              if (var13 != null) {
                this.field_s.a(-128, (long)var9, var13);
                if (!var13.a((int[]) (var7), param4, (byte) -73, var8.field_q)) {
                  var6_int = 0;
                }
              } else {
                var6_int = 0;
              }
            } else {
              if (!var12.a((int[]) (var7), param4, (byte) -73, var8.field_q)) {
                var6_int = 0;
                var8 = (td) (param3.field_k.b((byte) 83));
                continue;
              }
            }
            var8 = (td) (param3.field_k.b((byte) 83));
          }
          if (var6_int != 0) {
            param3.a();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("vl.CA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, pf param1, int param2) {
        try {
          this.a(true, 2, param1, param0);
          if (param2 <= 16) {
            this.field_w = 27;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vl.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -100) {
          return;
        }
        this.field_y = param0;
    }

    private final synchronized void a(boolean param0, int param1, pf param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Chess.field_G;
        try {
          this.b(param1 + 85, param0);
          this.field_v.a(param2.field_j);
          this.field_K = param3 ? true : false;
          this.field_N = 0L;
          var5_int = this.field_v.c();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_v.d(var6);
            this.field_v.c(var6);
            this.field_v.b(var6);
          }
          if (param1 != 2) {
            this.field_O = (int[]) null;
          }
          this.field_G = this.field_v.f();
          this.field_T = this.field_v.field_d[this.field_G];
          this.field_J = this.field_v.f(this.field_T);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_n[param2] = param1;
        if (param0 <= 12) {
          return;
        }
        this.field_q[param2] = ce.a(param1, -128);
        this.a(param1, true, param2);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        qd var6;
        int var7;
        qd var8;
        var7 = Chess.field_G;
        var8 = this.field_u[param2][param1];
        if (var8 == null) {
          return;
        }
        if (param3 >= -60) {
          this.field_B = (mi) null;
        }
        {
          this.field_u[param2][param1] = null;
          if ((2 & this.field_Q[param2]) != 0) {
            var6 = (qd) (this.field_B.field_x.g(-18110));
            while (var6 != null) {
              if (var6.field_n == var8.field_n &&
                0 > var6.field_J &&
                var8 != var6) {
                var8.field_J = 0;
                break;
              }
              var6 = (qd) (this.field_B.field_x.a((byte) -116));
            }
          } else {
            var8.field_J = 0;
          }
        }
    }

    final synchronized nm a() {
        return (nm) ((Object) this.field_B);
    }

    private final void a(byte param0, int param1) {
        qd var3;
        int var4;
        var4 = Chess.field_G;
        var3 = (qd) (this.field_B.field_x.g(-18110));
        if (param0 <= 86) {
          this.field_E = (int[]) null;
        }
        while (var3 != null) {
          if ((param1 < 0 ||
            var3.field_n == param1) &&
            var3.field_J < 0) {
            this.field_u[var3.field_n][var3.field_C] = null;
            var3.field_J = 0;
          }
          var3 = (qd) (this.field_B.field_x.a((byte) -102));
        }
    }

    private final void c(int param0, int param1) {
        qd var3;
        int var4;
        var4 = Chess.field_G;
        if ((this.field_Q[param0] & 2) != 0) {
          var3 = (qd) (this.field_B.field_x.g(param1 ^ -18109));
          while (var3 != null) {
            if (param0 == var3.field_n) {
              if (null != this.field_u[param0][var3.field_C]) {
                var3 = (qd) (this.field_B.field_x.a((byte) -102));
                continue;
              }
              if (0 > var3.field_J) {
                var3.field_J = 0;
              }
            }
            var3 = (qd) (this.field_B.field_x.a((byte) -102));
          }
        }
        if (param1 != 1) {
          this.field_x = (int[]) null;
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        this.field_v.g();
        this.field_W = null;
        this.a(param1, (byte) -38);
        if (param0 < 20) {
          this.field_S = (int[]) null;
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
          field_A = (ed) null;
        }
        field_I = null;
        field_A = null;
        field_M = null;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = Chess.field_G;
        try {
          if (this.field_v.e()) {
            var4_int = this.field_w * this.field_v.field_h / md.field_l;
            while (true) {
              var5 = this.field_N + (long)var4_int * (long)param2;
              if (this.field_J - var5 >= 0L) {
                this.field_N = var5;
              } else {
                var7 = (int)((-1L + (long)var4_int + this.field_J - this.field_N) / (long)var4_int);
                this.field_N = this.field_N + (long)var7 * (long)var4_int;
                this.field_B.a(param0, param1, var7);
                this.d(0);
                param2 = param2 - var7;
                param1 = param1 + var7;
                if (this.field_v.e()) {
                  continue;
                }
              }
              break;
            }
            this.field_B.a(param0, param1, param2);
            return;
          }
          this.field_B.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vl.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param1 ^ 16279, param0, param2);
        if (param1 != 16383) {
          this.field_t = (int[]) null;
        }
    }

    private final void d(int param0) {
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Chess.field_G;
        var2 = this.field_G;
        var3 = this.field_T;
        var4 = this.field_J;
        if (null != this.field_W &&
          this.field_H == var3) {
          this.a(this.field_D, param0 + 2, this.field_W, this.field_K);
          this.d(0);
          return;
        }
        if (param0 != 0) {
          this.b(93, false);
        }
        while (true) {
          if (var3 != this.field_T) {
            this.field_J = var4;
            this.field_G = var2;
            this.field_T = var3;
            if (this.field_W != null) {
              stackIn_27_0 = this.field_H;
              stackIn_27_1 = var3;
              if (stackIn_27_0 < stackIn_27_1) {
                this.field_G = -1;
                this.field_T = this.field_H;
                this.field_J = this.field_v.f(this.field_T);
              }
            }
            return;
          }
          while (var3 == this.field_v.field_d[var2]) {
            this.field_v.d(var2);
            var6 = this.field_v.a(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.b(var6, -112);
              }
              this.field_v.c(var2);
              this.field_v.b(var2);
              continue;
            }
            this.field_v.a();
            this.field_v.b(var2);
            if (this.field_v.b()) {
              if (null != this.field_W) {
                this.a(this.field_K, this.field_W, 91);
                this.d(0);
                return;
              }
              if (this.field_K &&
                var3 != 0) {
                this.field_v.a(var4);
              } else {
                this.a(true, (byte) -38);
                this.field_v.g();
                return;
              }
            }
            break;
          }
          var2 = this.field_v.f();
          var3 = this.field_v.field_d[var2];
          var4 = this.field_v.f(var3);
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 0) {
          this.field_p = (int[]) null;
        }
    }

    private final synchronized void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = Chess.field_G;
        if (param1 < 0) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_z[var4] = param0;
          }
        } else {
          this.field_z[param1] = param0;
        }
        var4Lifetime1 = 29 % ((param2 - 3) / 58);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -43) {
          this.field_F = (int[]) null;
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Chess.field_G;
        if (param0 != -61) {
          this.a(124, -34, -70, -107);
        }
        kf var4 = (kf) (this.field_s.a(true));
        while (var4 != null) {
          var4.e(111);
          var4 = (kf) (this.field_s.b((byte) 104));
        }
    }

    private final void b(int param0, int param1) {
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
        var8 = Chess.field_G;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (8350862 & param0) >> 16;
          this.c(var6, var5, var4, -79);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (32547 & param0) >> 8;
          var6Lifetime1 = (param0 & 8374890) >> 16;
          if (var6Lifetime1 > 0) {
            this.a(var5Lifetime1, var4Lifetime1, var6Lifetime1, -21164);
          } else {
            this.c(64, var5Lifetime1, var4Lifetime1, -97);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (param0 & 32713) >> 8;
          var6Lifetime2 = (param0 & 8328847) >> 16;
          this.b(var5Lifetime2, var6Lifetime2, -43, var4Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (param1 > -39) {
            this.field_u = (qd[][]) null;
          }
          if (var3 == 192) {
            var4Lifetime3 = 15 & param0;
            var5Lifetime3 = 127 & param0 >> 8;
            this.a(this.field_q[var4Lifetime3] + var5Lifetime3, true, var4Lifetime3);
            return;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = (32703 & param0) >> 8;
            this.c(0, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = (param0 >> 8 & 127) + ((8323141 & param0) >> 9);
            this.a(var5Lifetime3Lifetime2, (byte) 103, var4Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.a(true, (byte) -38);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = param0 >> 8 & 127;
        var6Lifetime3 = (8377749 & param0) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_q[var4Lifetime4] = ce.a(this.field_q[var4Lifetime4], -2080769) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_q[var4Lifetime4] = ce.a(-16257, this.field_q[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.field_P[var4Lifetime4] = ce.a(this.field_P[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_P[var4Lifetime4] = ce.a(-128, this.field_P[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_S[var4Lifetime4] = ce.a(-16257, this.field_S[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (37 == var5Lifetime4) {
          this.field_S[var4Lifetime4] = var6Lifetime3 + ce.a(-128, this.field_S[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.field_O[var4Lifetime4] = (var6Lifetime3 << 7) + ce.a(-16257, this.field_O[var4Lifetime4]);
        }
        if (39 == var5Lifetime4) {
          this.field_O[var4Lifetime4] = var6Lifetime3 + ce.a(-128, this.field_O[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_o[var4Lifetime4] = (var6Lifetime3 << 7) + ce.a(-16257, this.field_o[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.field_o[var4Lifetime4] = ce.a(-128, this.field_o[var4Lifetime4]) + var6Lifetime3;
        }
        if (11 == var5Lifetime4) {
          this.field_C[var4Lifetime4] = ce.a(-16257, this.field_C[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_C[var4Lifetime4] = var6Lifetime3 + ce.a(-128, this.field_C[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 < 64) {
            this.field_Q[var4Lifetime4] = ce.a(this.field_Q[var4Lifetime4], -2);
          } else {
            this.field_Q[var4Lifetime4] = s.a(this.field_Q[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.field_Q[var4Lifetime4] = s.a(this.field_Q[var4Lifetime4], 2);
          } else {
            this.c(var4Lifetime4, 1);
            this.field_Q[var4Lifetime4] = ce.a(this.field_Q[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_x[var4Lifetime4] = (var6Lifetime3 << 7) + ce.a(this.field_x[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 98) {
          this.field_x[var4Lifetime4] = var6Lifetime3 + ce.a(this.field_x[var4Lifetime4], 16256);
        }
        if (var5Lifetime4 == 101) {
          this.field_x[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + ce.a(this.field_x[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 100) {
          this.field_x[var4Lifetime4] = ce.a(16256, this.field_x[var4Lifetime4]) + 16384 + var6Lifetime3;
        }
        if (var5Lifetime4 == 120) {
          this.a(var4Lifetime4, -82);
        }
        if (var5Lifetime4 == 121) {
          this.b((byte) 91, var4Lifetime4);
        }
        if (var5Lifetime4 == 123) {
          this.a((byte) 92, var4Lifetime4);
        }
        if (6 == var5Lifetime4) {
          var7 = this.field_x[var4Lifetime4];
          if (var7 == 16384) {
            this.field_F[var4Lifetime4] = (var6Lifetime3 << 7) + ce.a(this.field_F[var4Lifetime4], -16257);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_x[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_F[var4Lifetime4] = ce.a(-128, this.field_F[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_r[var4Lifetime4] = (var6Lifetime3 << 7) + ce.a(-16257, this.field_r[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.field_r[var4Lifetime4] = ce.a(this.field_r[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, false);
            this.field_Q[var4Lifetime4] = ce.a(this.field_Q[var4Lifetime4], -5);
          } else {
            this.field_Q[var4Lifetime4] = s.a(this.field_Q[var4Lifetime4], 4);
          }
        }
        if (17 == var5Lifetime4) {
          this.b(var4Lifetime4, (this.field_R[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), (byte) 97);
        }
        if (var5Lifetime4 == 49) {
          this.b(var4Lifetime4, var6Lifetime3 + (this.field_R[var4Lifetime4] & -128), (byte) 118);
        }
    }

    private final int a(int param0, qd param1) {
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        dl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_z + (param1.field_D * param1.field_k >> 12);
          var3_int = var3_int + (this.field_F[param1.field_n] * (this.field_t[param1.field_n] - 8192) >> 12);
          var4 = param1.field_K;
          if (param0 < 33) {
            stackIn_2_0 = 98;
            return stackIn_2_0;
          }
          if (var4.field_e > 0 && (!(var4.field_g <= 0) ||
            this.field_P[param1.field_n] > 0)) {
            var5 = var4.field_g << 2;
            var6 = var4.field_f << 1;
            if (param1.field_s < var6) {
              var5 = var5 * param1.field_s / var6;
            }
            var5 = var5 + (this.field_P[param1.field_n] >> 7);
            var7 = Math.sin((double)(511 & param1.field_F) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_H.field_n) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)md.field_l + 0.5);
          stackIn_14_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("vl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 < 69) {
          this.b(127, false);
        }
        this.field_t[param2] = param0;
    }

    final static void a(p param0, ln param1, boolean param2, int param3) {
        int var8 = 0;
        ln stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        ln stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        ln stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        ln stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        ln stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        ln stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Chess.field_G;
        try {
          if (param3 < 86) {
            return;
          }
          if (param2) {
            param1.field_Xb = param0.i(-108);
          }
          param1.field_hc = param0.i(-111);
          param1.field_ic = param0.i(-99);
          var4_int = param0.i(-93);
          stackIn_8_0 = (ln) (param1);
          stackIn_9_1 = ((var4_int & 128) != 0);
          stackIn_8_0.field_Yb = stackIn_9_1;
          stackIn_11_0 = (ln) (param1);
          stackIn_12_1 = ((8 & var4_int) != 0);
          stackIn_11_0.field_ac = stackIn_12_1;
          stackIn_14_0 = (ln) (param1);
          stackIn_15_1 = ((32 & var4_int) != 0);
          stackIn_14_0.field_lc = stackIn_15_1;
          stackIn_17_0 = (ln) (param1);
          stackIn_18_1 = (0 != (64 & var4_int));
          stackIn_17_0.field_Vb = stackIn_18_1;
          stackIn_20_0 = (ln) (param1);
          if ((var4_int & 16) == 0) {
            stackIn_21_1 = 1;
          } else {
            stackIn_21_1 = 2;
          }
          stackIn_20_0.field_Mb = stackIn_21_1;
          stackIn_24_0 = (ln) (param1);
          stackIn_25_1 = (param1.field_Yb) && (param1.field_Xb < param1.field_hc);
          stackIn_24_0.field_Pb = stackIn_25_1;
          stackIn_28_0 = ((var4_int & 4) == 0) ? 0 : 1;
          var5 = stackIn_28_0;
          stackIn_31_0 = (0 == (2 & var4_int)) ? 0 : 1;
          var6 = stackIn_31_0;
          param0.a(param1.field_sc.length, (byte) 125, param1.field_sc, 0);
          param1.field_Ub = param0.f(674914976);
          param1.field_Jb = ud.a(2) - (long)param0.e((byte) -104);
          if (var5 == 0) {
            param1.field_pc = -1;
          } else {
            param1.field_pc = param0.e((byte) -110);
          }
          param1.field_Fb = param0.d((byte) -50);
          var7 = param0.field_l;
          param1.field_Gb = param0.d(0);
          if (var6 != 0) {
            param0.field_l = var7;
            param1.field_ec = new String[param1.field_Xb];
            for (var8 = 0; param1.field_Xb > var8; var8++) {
              param1.field_ec[var8] = param0.d(0);
            }
            return;
          }
          param1.field_ec = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("vl.F(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0, int param1, byte param2) {
        this.field_R[param0] = param1;
        this.field_E[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
        if (param2 < 89) {
          this.field_w = 105;
        }
    }

    public vl() {
        this.field_F = new int[16];
        this.field_u = new qd[16][128];
        this.field_q = new int[16];
        this.field_O = new int[16];
        this.field_E = new int[16];
        this.field_x = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_r = new int[16];
        this.field_w = 1000000;
        this.field_C = new int[16];
        this.field_z = new int[16];
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_S = new int[16];
        this.field_U = new qd[16][128];
        this.field_y = 256;
        this.field_Q = new int[16];
        this.field_R = new int[16];
        this.field_t = new int[16];
        this.field_v = new al();
        this.field_B = new mi(this);
        this.field_s = new kl(128);
        this.a(256, -1, (byte) -101);
        this.a(true, (byte) -38);
    }

    static {
        field_I = new char[]{(char)91, (char)93, (char)35};
    }
}
