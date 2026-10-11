/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends in {
    private int[] field_R;
    static String field_D;
    static int field_F;
    private wn[][] field_u;
    private int[] field_q;
    private int[] field_G;
    static boolean field_w;
    static boolean field_H;
    private int[] field_N;
    private int[] field_r;
    private int[] field_J;
    private int[] field_M;
    int[] field_I;
    int[] field_S;
    static String field_v;
    private ln field_o;
    private int[] field_B;
    private int[] field_P;
    private qj field_O;
    private int[] field_E;
    private int[] field_k;
    private int field_T;
    private int field_l;
    private int[] field_p;
    int[] field_U;
    private int[] field_z;
    private wn[][] field_K;
    static int field_y;
    private long field_m;
    private int field_Q;
    private int field_x;
    private long field_C;
    private pa field_L;
    private boolean field_t;
    private boolean field_n;
    private int field_s;
    private sc field_A;

    private final int a(byte param0, wn param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_p[param1.field_h];
          if (param0 < 89) {
            stackIn_2_0 = 10;
            return stackIn_2_0;
          }
          if (var3_int >= 8192) {
            stackIn_7_0 = -(32 + (-param1.field_g + 128) * (16384 - var3_int) >> 6) + 16384;
            return stackIn_7_0;
          }
          stackIn_5_0 = var3_int * param1.field_g + 32 >> 6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("i.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized in b() {
        return null;
    }

    final synchronized void e(int param0, int param1) {
        if (param0 != 2) {
          return;
        }
        this.field_T = param1;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        boolean stackIn_19_1 = false;
        wn var5;
        int var6_int;
        ml var6;
        wn var7;
        wn var8;
        int var9;
        rc var10;
        rc var11;
        var9 = Virogrid.field_F ? 1 : 0;
        this.a(param3, param0, (byte) 66, 64);
        if (0 != (this.field_U[param3] & 2)) {
          var5 = (wn) (this.field_L.field_k.b(false));
          while (var5 != null) {
            if (var5.field_h == param3 &&
              var5.field_o < 0) {
              this.field_K[param3][var5.field_l] = null;
              this.field_K[param3][param0] = var5;
              var6_int = (var5.field_w * var5.field_v >> 12) + var5.field_u;
              var5.field_u = var5.field_u + (param0 - var5.field_l << 8);
              var5.field_w = var6_int - var5.field_u;
              var5.field_v = 4096;
              var5.field_l = param0;
              return;
            }
            var5 = (wn) (this.field_L.field_k.e(9003));
          }
        }
        var10 = (rc) (this.field_o.a((long)this.field_P[param3], -14905));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_l[param0];
        if (var6 == null) {
          return;
        }
        var7 = new wn();
        var7.field_q = var6;
        var7.field_E = var11;
        var7.field_h = param3;
        var7.field_t = var10.field_g[param0];
        var7.field_G = var10.field_j[param0];
        var7.field_l = param0;
        var7.field_A = var10.field_k[param0] * (var11.field_q * (param2 * param2)) + 1024 >> 11;
        var7.field_g = var10.field_n[param0] & 255;
        var7.field_u = (param0 << 8) - (var10.field_p[param0] & 32767);
        var7.field_F = 0;
        var7.field_s = 0;
        var7.field_y = 0;
        var7.field_k = 0;
        var7.field_o = -1;
        if (this.field_S[param3] != 0) {
          var7.field_p = jh.b(var6, this.a(var7, param1 ^ 109), 0, this.a((byte) 106, var7));
          stackIn_19_1 = !(0 <= var11.field_p[param0]);
          this.a(stackIn_19_1, -16257, var7);
        } else {
          var7.field_p = jh.b(var6, this.a(var7, -123), this.a(param1 ^ 26253, var7), this.a((byte) 111, var7));
        }
        if (~var11.field_p[param0] > param1) {
          var7.field_p.e(-1);
        }
        if (var7.field_G >= 0) {
          var8 = this.field_u[param3][var7.field_G];
          if (var8 != null &&
            var8.field_o < 0) {
            this.field_K[param3][var8.field_l] = null;
            var8.field_o = 0;
          }
          this.field_u[param3][var7.field_G] = var7;
        }
        this.field_L.field_k.a(var7, (byte) -109);
        this.field_K[param3][param0] = var7;
        return;
    }

    private final void a(int param0, byte param1) {
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1 != 2) {
          this.c(46, (byte) -89);
        }
        wn var3 = (wn) (this.field_L.field_k.a((byte) -41));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_h) {
            if (null != var3.field_p) {
              var3.field_p.g(ua.field_p / 100);
              if (var3.field_p.i()) {
                this.field_L.field_n.a(var3.field_p);
              }
              var3.c(-11382);
            }
            if (!(var3.field_o >= 0)) {
              this.field_K[var3.field_h][var3.field_l] = null;
            }
            var3.a(false);
          }
          var3 = (wn) (this.field_L.field_k.a(16213));
        }
    }

    private final void b(int param0, int param1) {
        wn var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1 < 42) {
          return;
        }
        if (0 != (2 & this.field_U[param0])) {
          var3 = (wn) (this.field_L.field_k.a((byte) -96));
          while (var3 != null) {
            if (var3.field_h == param0 && this.field_K[param0][var3.field_l] == null &&
              !(var3.field_o >= 0)) {
              var3.field_o = 0;
            }
            var3 = (wn) (this.field_L.field_k.a(16213));
          }
        }
    }

    private final void a(int param0, int param1) {
        wn var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (0 != (this.field_U[param0] & 4)) {
          var3 = (wn) (this.field_L.field_k.a((byte) -78));
          while (var3 != null) {
            if (~var3.field_h == ~param0) {
              var3.field_B = 0;
            }
            var3 = (wn) (this.field_L.field_k.a(16213));
          }
        }
        if (param1 >= -101) {
          this.b(67, -128, 74);
        }
    }

    final static dh a(int param0, int param1, int param2, int param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        dh var4 = (dh) (bl.field_D.a((byte) -121));
        while (var4 != null) {
          if (var4.field_i == param0) {
            return var4;
          }
          var4 = (dh) (bl.field_D.a(16213));
        }
        if (param3 >= -11) {
          return (dh) null;
        }
        var4 = new dh();
        var4.field_i = param0;
        var4.field_g = param2;
        bl.field_D.a(var4, (byte) -108);
        gl.a(var4, (byte) 89, param1);
        return var4;
    }

    final synchronized boolean d(int param0) {
        if (param0 <= 110) {
          return false;
        }
        return this.field_O.c();
    }

    final synchronized void e(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        rc var2 = (rc) (this.field_o.a((byte) 19));
        if (param0 != -1) {
          this.b(-51, (byte) -4);
        }
        while (var2 != null) {
          var2.a((byte) -90);
          var2 = (rc) (this.field_o.a(param0 ^ -95));
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Virogrid.field_F ? 1 : 0;
        var2 = this.field_Q;
        var3 = this.field_x;
        var4 = this.field_C;
        if (this.field_A != null &&
          var3 == this.field_s) {
          this.a(this.field_A, false, this.field_t, this.field_n);
          this.c(22228);
          return;
        }
        while (true) {
          if (var3 != this.field_x) {
            if (param0 != 22228) {
              return;
            }
            this.field_Q = var2;
            this.field_x = var3;
            this.field_C = var4;
            if (this.field_A != null &&
              var3 > this.field_s) {
              this.field_Q = -1;
              this.field_x = this.field_s;
              this.field_C = this.field_O.c(this.field_x);
            }
            return;
          }
          while (~var3 == ~this.field_O.field_a[var2]) {
            this.field_O.f(var2);
            var6 = this.field_O.e(var2);
            if (var6 != 1) {
              if ((128 & var6) != 0) {
                this.b(var6, (byte) -108);
              }
              this.field_O.b(var2);
              this.field_O.d(var2);
              continue;
            }
            this.field_O.e();
            this.field_O.d(var2);
            if (this.field_O.d()) {
              if (null != this.field_A) {
                this.a(this.field_t, 37, this.field_A);
                this.c(22228);
                return;
              }
              if (this.field_t &&
                0 != var3) {
                this.field_O.a(var4);
              } else {
                this.a((byte) -22, true);
                this.field_O.g();
                return;
              }
            }
            break;
          }
          var2 = this.field_O.f();
          var3 = this.field_O.field_a[var2];
          var4 = this.field_O.c(var3);
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (!param1) {
          return;
        }
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_k[var4] = param0;
          }
        } else {
          this.field_k[param2] = param0;
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        if (param0 != -8193) {
          this.field_G = (int[]) null;
        }
        this.field_O.g();
        this.field_A = null;
        this.a((byte) -22, param1);
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameRemainder0 = true;
        var6 = Virogrid.field_F ? 1 : 0;
        if (this.field_O.c()) {
          var2 = this.field_O.field_c * this.field_l / ua.field_p;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_m;
            if (this.field_C - var3 < 0L) {
              var5 = (int)((-1L + (long)var2 + (this.field_C - this.field_m)) / (long)var2);
              this.field_m = this.field_m + (long)var5 * (long)var2;
              this.field_L.a(var5);
              param0 = param0 - var5;
              this.c(22228);
              if (this.field_O.c()) {
                continue;
              }
            } else {
              this.field_m = var3;
            }
            break;
          }
          this.field_L.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_L.a(param0);
        }

    }

    private final int a(wn param0, int param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qd var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          if (param1 > -94) {
            this.field_u = (wn[][]) null;
          }
          var3_int = (param0.field_w * param0.field_v >> 12) + param0.field_u;
          var3_int = var3_int + ((-8192 + this.field_r[param0.field_h]) * this.field_B[param0.field_h] >> 12);
          var4 = param0.field_t;
          if (var4.field_h > 0 && (!(var4.field_j <= 0) ||
            this.field_R[param0.field_h] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_b << 1;
            if (var6 > param0.field_x) {
              var5 = var5 * param0.field_x / var6;
            }
            var5 = var5 + (this.field_R[param0.field_h] >> 7);
            var7 = Math.sin((double)(511 & param0.field_r) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(256 * param0.field_q.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ua.field_p);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("i.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, byte param1) {
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.c(param0, (byte) 94);
          }
        } else {
          this.field_G[param0] = 12800;
          if (param1 != 94) {
            this.a(-89, (byte) -60, 95);
          }
          this.field_p[param0] = 8192;
          this.field_q[param0] = 16383;
          this.field_r[param0] = 8192;
          this.field_R[param0] = 0;
          this.field_J[param0] = 8192;
          this.b(param0, 45);
          this.a(param0, -113);
          this.field_U[param0] = 0;
          this.field_N[param0] = 32767;
          this.field_B[param0] = 256;
          this.field_S[param0] = 0;
          this.b(param0, 2097152, 8192);
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 18553) {
          field_D = (String) null;
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1) {
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param1 != 1123) {
          this.a(-12, (byte) -112, -115);
        }
        wn var3 = (wn) (this.field_L.field_k.a((byte) -62));
        while (var3 != null) {
          if ((param0 < 0 || var3.field_h == param0) &&
            !(var3.field_o >= 0)) {
            this.field_K[var3.field_h][var3.field_l] = null;
            var3.field_o = 0;
          }
          var3 = (wn) (this.field_L.field_k.a(16213));
        }
    }

    private final synchronized void a(sc param0, boolean param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        this.a(-8193, param3);
        this.field_O.a(param0.field_g);
        this.field_m = 0L;
        this.field_t = param2 ? true : false;
        int var5_int = this.field_O.a();
        for (var6 = 0; var5_int > var6; var6++) {
          this.field_O.f(var6);
          this.field_O.b(var6);
          this.field_O.d(var6);
        }
        if (param1) {
          return;
        }
        try {
          this.field_Q = this.field_O.f();
          this.field_x = this.field_O.field_a[this.field_Q];
          this.field_C = this.field_O.c(this.field_x);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "i.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        if (param2) {
          this.field_Q = 117;
        }
        this.c(127, param0, param1);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, wn param4) {
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        qd var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          param4.field_D = ua.field_p / 100;
          if (param4.field_o >= 0 && (param4.field_p == null ||
            param4.field_p.j())) {
            param4.c(-11382);
            param4.a(false);
            if (0 < param4.field_G &&
              this.field_u[param4.field_h][param4.field_G] == param4) {
              this.field_u[param4.field_h][param4.field_G] = null;
              return true;
            }
            return true;
          }
          var6_int = param4.field_v;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_J[param4.field_h] * 0.0004921259842519685) * 16.0);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_v = var6_int;
          }
          param4.field_p.c(this.a(param4, -119));
          var7 = param4.field_t;
          var8 = 0;
          if (param3 != 123) {
            field_F = 51;
          }
          param4.field_r = param4.field_r + var7.field_h;
          param4.field_x = param4.field_x + 1;
          var9 = 0.000005086263020833333 * (double)((param4.field_w * param4.field_v >> 12) + (param4.field_l - 60 << 8));
          if (0 < var7.field_n) {
            if (var7.field_l <= 0) {
              param4.field_y = param4.field_y + 128;
            } else {
              param4.field_y = param4.field_y + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
            }
            if (var7.field_n * param4.field_y >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_e) {
            if (var7.field_a > 0) {
              param4.field_s = param4.field_s + (int)(0.5 + Math.pow(2.0, (double)var7.field_a * var9) * 128.0);
            } else {
              param4.field_s = param4.field_s + 128;
            }
            while (var7.field_e.length - 2 > param4.field_F) {
              if (((255 & var7.field_e[param4.field_F + 2]) << 8) < param4.field_s) {
                param4.field_F = param4.field_F + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_e.length == param4.field_F &&
              0 == var7.field_e[param4.field_F + 1]) {
              var8 = 1;
            }
          }
          if (0 <= param4.field_o &&
            null != var7.field_k &&
            (this.field_U[param4.field_h] & 1) == 0 && (!(param4.field_G >= 0) ||
            this.field_u[param4.field_h][param4.field_G] != param4)) {
            if (0 < var7.field_d) {
              param4.field_o = param4.field_o + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
            } else {
              param4.field_o = param4.field_o + 128;
            }
            while (param4.field_k < var7.field_k.length - 2) {
              if ((var7.field_k[2 + param4.field_k] << 8 & 65280) < param4.field_o) {
                param4.field_k = param4.field_k + 2;
                continue;
              }
              break;
            }
            if (param4.field_k == var7.field_k.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_p.a(param4.field_D, this.a(-26254, param4), this.a((byte) 96, param4));
            return false;
          }
          param4.field_p.g(param4.field_D);
          if (param1 != null) {
            param4.field_p.b(param1, param0, param2);
          } else {
            param4.field_p.a(param2);
          }
          if (param4.field_p.i()) {
            this.field_L.field_n.a(param4.field_p);
          }
          param4.c(param3 - 11505);
          if (0 <= param4.field_o) {
            param4.a(false);
            if (param4.field_G > 0 &&
              this.field_u[param4.field_h][param4.field_G] == param4) {
              this.field_u[param4.field_h][param4.field_G] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_68_0 = var6;
          stackIn_68_1 = new StringBuilder().append("i.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final synchronized boolean a(eh param0, int param1, jg param2, sc param3, int param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        sg var8 = null;
        int var9 = 0;
        int var11 = 0;
        rc var12 = null;
        rc var13 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          param3.a();
          var6_int = 1;
          var7 = null;
          if (param4 < param1) {
            var7 = new int[]{param1};
          }
          var8 = (sg) (param3.field_h.a((byte) 19));
          while (var8 != null) {
            var9 = (int)var8.field_d;
            var12 = (rc) (this.field_o.a((long)var9, param4 ^ -14905));
            if (var12 == null) {
              var13 = vm.a(param0, (byte) 42, var9);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_o.a(var13, (byte) 16, (long)var9);
                if (!var13.a(param2, var8.field_h, (byte) 112, (int[]) (var7))) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a(param2, var8.field_h, (byte) 112, (int[]) (var7))) {
                var6_int = 0;
                var8 = (sg) (param3.field_h.a(-117));
                continue;
              }
            }
            var8 = (sg) (param3.field_h.a(-117));
          }
          if (var6_int != 0) {
            param3.b();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("i.Q(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized void c(boolean param0) {
        if (param0) {
          return;
        }
        this.a(-8193, true);
    }

    final synchronized void c(int param0, int param1) {
        if (param0 != -128) {
          this.field_x = -112;
        }
        this.field_l = param1;
    }

    public static void a(byte param0) {
        field_v = null;
        field_D = null;
        if (param0 >= -69) {
          field_y = 18;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 > -113) {
          return;
        }
        this.field_r[param1] = param2;
    }

    private final void c(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_M[param2] = param1;
        this.field_E[param2] = rb.a(param1, -128);
        if (param0 < 124) {
          wn var5 = (wn) null;
          discarded$0 = this.a(107, (wn) null);
        }
        this.a(param2, (byte) -84, param1);
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        eh var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2022) {
            var3 = (eh) null;
            i.a((byte) 27, (eh) null);
          }
          stackIn_3_0 = nf.a(param1.length, (byte) -120, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("i.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final synchronized in c() {
        return (in) ((Object) this.field_L);
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        wn var6 = null;
        int var7 = Virogrid.field_F ? 1 : 0;
        if (param2 != 66) {
          return;
        }
        wn var8 = this.field_K[param0][param1];
        if (var8 == null) {
          return;
        }
        this.field_K[param0][param1] = null;
        if (0 == (this.field_U[param0] & 2)) {
          var8.field_o = 0;
        } else {
          var6 = (wn) (this.field_L.field_k.a((byte) -64));
          while (var6 != null) {
            if (var6.field_h == var8.field_h && var6.field_o < 0 &&
              var6 != var8) {
              var8.field_o = 0;
              break;
            }
            var6 = (wn) (this.field_L.field_k.a(16213));
          }
        }
    }

    final static boolean a(byte param0, eh param1) {
        RuntimeException var2 = null;
        eh var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 99) {
            var3 = (eh) null;
            i.a((byte) -25, (eh) null);
          }
          stackIn_3_0 = param1.b(25867);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("i.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int a(int param0, wn param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qd var9 = null;
        qd var10 = null;
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
          if (this.field_k[param1.field_h] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param1.field_t;
          var10 = var9;
          var4 = 4096 + this.field_G[param1.field_h] * this.field_q[param1.field_h] >> 13;
          if (param0 != -26254) {
            this.a(-12, (byte) 48, -58);
          }
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + param1.field_A * var4 >> 15;
          var4 = 128 + var4 * this.field_T >> 8;
          var4 = 128 + var4 * this.field_k[param1.field_h] >> 8;
          if (var10.field_n > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_y * 0.00001953125 * (double)var10.field_n) * (double)var4);
          }
          if (var10.field_e != null) {
            var5 = param1.field_s;
            var6 = var10.field_e[param1.field_F + 1];
            if (var10.field_e.length - 2 > param1.field_F) {
              var7 = var9.field_e[param1.field_F] << 8 & 65280;
              var8 = var10.field_e[2 + param1.field_F] << 8 & 65280;
              var6 = var6 + (var5 - var7) * (var10.field_e[param1.field_F + 3] - var6) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param1.field_o > 0 &&
            null != var10.field_k) {
            var5Lifetime1 = param1.field_o;
            var6Lifetime1 = var10.field_k[param1.field_k + 1];
            if (var10.field_k.length - 2 > param1.field_k) {
              var7Lifetime1 = (255 & var9.field_k[param1.field_k]) << 8;
              var8Lifetime1 = var10.field_k[param1.field_k + 2] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.field_k[3 + param1.field_k] - var6Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("i.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_z[param0] = param2;
        this.field_I[param0] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * (double)param1);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param1 != 64) {
          this.field_k = (int[]) null;
        }
    }

    final void a(boolean param0, int param1, wn param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          var4_int = param2.field_q.field_k.length;
          if (param0 &&
            param2.field_q.field_i) {
            var6 = -param2.field_q.field_l + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_S[param2.field_h] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              param2.field_p.c(true);
              var5 = -1 + var4_int + (var4_int - var5);
            }
          } else {
            var5 = (int)((long)this.field_S[param2.field_h] * (long)var4_int >> 6);
          }
          param2.field_p.d(var5);
          if (param1 != -16257) {
            field_y = -49;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("i.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, (byte) 2);
        } else {
          this.d(-1, param0 + 1145);
        }
        if (param0 != -22) {
          i.a(39, -26, 106, -19);
        }
        this.c(-1, (byte) 94);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_P[var3] = this.field_M[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_E[var5] = rb.a(-128, this.field_M[var5]);
          var5++;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -84) {
          this.field_l = 17;
        }
        if (param2 != this.field_P[param0]) {
          this.field_P[param0] = param2;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_u[param0][var4] = null;
          }
        }
    }

    final synchronized void a(boolean param0, int param1, sc param2) {
        if (param1 != 37) {
          return;
        }
        try {
          this.a(param2, false, param0, true);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "i.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, byte param1) {
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
        int var4Lifetime3Lifetime3;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = Virogrid.field_F ? 1 : 0;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = param0 >> 8 & 127;
          var6 = param0 >> 16 & 127;
          this.a(var4, var5, (byte) 66, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 <= 0) {
            this.a(var4Lifetime1, var5Lifetime1, (byte) 66, 64);
          } else {
            this.b(var5Lifetime1, -1, var6Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = (param0 & 32737) >> 8;
          var6Lifetime2 = (8381047 & param0) >> 16;
          this.c(var6Lifetime2, 64, var4Lifetime2, var5Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = (32748 & param0) >> 8;
            this.a(var4Lifetime3, (byte) -84, this.field_E[var4Lifetime3] + var5Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (param0 & 32732) >> 8;
            this.a(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, 18553);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = (param0 >> 8 & 127) + ((8323307 & param0) >> 9);
            this.a((byte) -128, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
            return;
          }
          var3 = param0 & 255;
          var4Lifetime3Lifetime3 = -86 / ((-40 - param1) / 35);
          if (var3 != 255) {
            return;
          }
          this.a((byte) -22, true);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = 127 & param0 >> 8;
        var6Lifetime3 = (param0 & 8367969) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_E[var4Lifetime4] = (var6Lifetime3 << 14) + rb.a(this.field_E[var4Lifetime4], -2080769);
        }
        if (var5Lifetime4 == 32) {
          this.field_E[var4Lifetime4] = rb.a(-16257, this.field_E[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.field_R[var4Lifetime4] = rb.a(this.field_R[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_R[var4Lifetime4] = rb.a(-128, this.field_R[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + rb.a(-16257, this.field_J[var4Lifetime4]);
        }
        if (37 == var5Lifetime4) {
          this.field_J[var4Lifetime4] = rb.a(this.field_J[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_G[var4Lifetime4] = (var6Lifetime3 << 7) + rb.a(this.field_G[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.field_G[var4Lifetime4] = rb.a(this.field_G[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_p[var4Lifetime4] = (var6Lifetime3 << 7) + rb.a(-16257, this.field_p[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.field_p[var4Lifetime4] = var6Lifetime3 + rb.a(this.field_p[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 11) {
          this.field_q[var4Lifetime4] = (var6Lifetime3 << 7) + rb.a(-16257, this.field_q[var4Lifetime4]);
        }
        if (var5Lifetime4 == 43) {
          this.field_q[var4Lifetime4] = var6Lifetime3 + rb.a(-128, this.field_q[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_U[var4Lifetime4] = oh.a(this.field_U[var4Lifetime4], 1);
          } else {
            this.field_U[var4Lifetime4] = rb.a(this.field_U[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (64 > var6Lifetime3) {
            this.b(var4Lifetime4, 72);
            this.field_U[var4Lifetime4] = rb.a(this.field_U[var4Lifetime4], -3);
          } else {
            this.field_U[var4Lifetime4] = oh.a(this.field_U[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_N[var4Lifetime4] = rb.a(this.field_N[var4Lifetime4], 127) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_N[var4Lifetime4] = var6Lifetime3 + rb.a(16256, this.field_N[var4Lifetime4]);
        }
        if (101 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + rb.a(this.field_N[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 100) {
          this.field_N[var4Lifetime4] = var6Lifetime3 + 16384 + rb.a(16256, this.field_N[var4Lifetime4]);
        }
        if (var5Lifetime4 == 120) {
          this.a(var4Lifetime4, (byte) 2);
        }
        if (var5Lifetime4 == 121) {
          this.c(var4Lifetime4, (byte) 94);
        }
        if (var5Lifetime4 == 123) {
          this.d(var4Lifetime4, 1123);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_N[var4Lifetime4];
          if (16384 == var7) {
            this.field_B[var4Lifetime4] = rb.a(this.field_B[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_N[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_B[var4Lifetime4] = var6Lifetime3 + rb.a(-128, this.field_B[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_S[var4Lifetime4] = rb.a(-16257, this.field_S[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (48 == var5Lifetime4) {
          this.field_S[var4Lifetime4] = var6Lifetime3 + rb.a(this.field_S[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, -116);
            this.field_U[var4Lifetime4] = rb.a(this.field_U[var4Lifetime4], -5);
          } else {
            this.field_U[var4Lifetime4] = oh.a(this.field_U[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.b(var4Lifetime4, 2097152, (var6Lifetime3 << 7) + (this.field_z[var4Lifetime4] & -16257));
        }
        if (var5Lifetime4 == 49) {
          this.b(var4Lifetime4, 2097152, var6Lifetime3 + (this.field_z[var4Lifetime4] & -128));
        }
    }

    final boolean b(int param0, wn param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_p) {
            if (param0 < -105) {
              return false;
            }
            return true;
          }
          if (0 > param1.field_o) {
            return true;
          }
          param1.a(false);
          if (param1.field_G > 0 &&
            this.field_u[param1.field_h][param1.field_G] == param1) {
            this.field_u[param1.field_h][param1.field_G] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("i.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_O.c()) {
            var4_int = this.field_O.field_c * this.field_l / ua.field_p;
            while (true) {
              var5 = this.field_m + (long)param2 * (long)var4_int;
              if (this.field_C - var5 >= 0L) {
                this.field_m = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int + this.field_C - this.field_m) / (long)var4_int);
              this.field_m = this.field_m + (long)var7 * (long)var4_int;
              this.field_L.b(param0, param1, var7);
              this.c(22228);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (this.field_O.c()) {
                continue;
              }
              this.field_L.b(param0, param1, param2);
              return;
            }
          }
          this.field_L.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("i.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public i() {
        this.field_u = new wn[16][128];
        this.field_N = new int[16];
        this.field_P = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_r = new int[16];
        this.field_R = new int[16];
        this.field_q = new int[16];
        this.field_E = new int[16];
        this.field_k = new int[16];
        this.field_S = new int[16];
        this.field_I = new int[16];
        this.field_M = new int[16];
        this.field_T = 256;
        this.field_l = 1000000;
        this.field_p = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_K = new wn[16][128];
        this.field_z = new int[16];
        this.field_O = new qj();
        this.field_L = new pa(this);
        this.field_o = new ln(128);
        this.a(256, true, -1);
        this.a((byte) -22, true);
    }

    static {
        field_v = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_D = "Accept invitation to <%0>'s game";
    }
}
