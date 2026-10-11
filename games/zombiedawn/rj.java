/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends sp {
    int[] field_O;
    private int[] field_M;
    static int field_E;
    int[] field_r;
    private int field_o;
    int[] field_l;
    private int[] field_L;
    private int[] field_B;
    private int[] field_D;
    private int[] field_z;
    private int[] field_q;
    private lf[][] field_x;
    private int[] field_u;
    private int field_m;
    private jg field_w;
    private int[] field_H;
    private dl field_A;
    private int[] field_I;
    private int[] field_Q;
    private int[] field_p;
    private int[] field_n;
    private int[] field_F;
    private lf[][] field_G;
    private long field_K;
    private ip field_J;
    private long field_t;
    private int field_v;
    private int field_N;
    private boolean field_s;
    private wj field_y;
    private int field_P;
    private boolean field_C;

    final synchronized sp c() {
        return (sp) ((Object) this.field_J);
    }

    final synchronized void a(int param0, byte param1) {
        this.field_o = param0;
        if (param1 >= -21) {
          this.field_N = 53;
        }
    }

    private final int a(lf param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        nf var10 = null;
        int stackIn_5_0 = 0;
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
          if (param1 != -111) {
            this.b(10, (byte) 5, 56);
          }
          if (this.field_z[param0.field_z] == 0) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var9 = param0.field_t;
          var10 = var9;
          var4 = 4096 + this.field_I[param0.field_z] * this.field_B[param0.field_z] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_v * var4 >> 15;
          var4 = var4 * this.field_o + 128 >> 8;
          var4 = this.field_z[param0.field_z] * var4 + 128 >> 8;
          if (0 < var10.field_j) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param0.field_p * 0.00001953125 * (double)var10.field_j) * (double)var4);
          }
          if (var10.field_h != null) {
            var5 = param0.field_l;
            var6 = var10.field_h[1 + param0.field_y];
            if (-2 + var10.field_h.length > param0.field_y) {
              var7 = 65280 & var9.field_h[param0.field_y] << 8;
              var8 = (255 & var10.field_h[2 + param0.field_y]) << 8;
              var6 = var6 + (var10.field_h[param0.field_y + 3] - var6) * (-var7 + var5) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param0.field_k > 0 &&
            null != var10.field_b) {
            var5Lifetime1 = param0.field_k;
            var6Lifetime1 = var10.field_b[param0.field_q + 1];
            if (-2 + var10.field_b.length > param0.field_q) {
              var7Lifetime1 = (var9.field_b[param0.field_q] & 255) << 8;
              var8Lifetime1 = 65280 & var10.field_b[param0.field_q + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (-var7Lifetime1 + var5Lifetime1) * (var10.field_b[3 + param0.field_q] - var6Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("rj.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 24) {
          this.field_x = (lf[][]) null;
        }
        this.field_p[param0] = param1;
        this.field_r[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final void a(int param0, int param1, int param2, int param3) {
        lf stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0;
        boolean stackIn_19_3;
        lf var5;
        int var6_int;
        gi var6;
        lf var7;
        lf var8;
        int var9;
        ma var10;
        ma var11;
        var9 = ZombieDawn.field_J;
        this.b(param3, 116, param2, 64);
        if ((this.field_l[param3] & 2) != 0) {
          var5 = (lf) (this.field_J.field_s.e(0));
          while (var5 != null) {
            if (param3 == var5.field_z &&
              var5.field_k < 0) {
              this.field_G[param3][var5.field_i] = null;
              this.field_G[param3][param2] = var5;
              var6_int = var5.field_C + (var5.field_A * var5.field_j >> 12);
              var5.field_C = var5.field_C + (-var5.field_i + param2 << 8);
              var5.field_j = 4096;
              var5.field_A = -var5.field_C + var6_int;
              var5.field_i = param2;
              return;
            }
            var5 = (lf) (this.field_J.field_s.c(26853));
          }
        }
        var10 = (ma) (this.field_A.a((long)this.field_D[param3], param1 + 50));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_o[param2];
        if (var6 == null) {
          return;
        }
        var7 = new lf();
        var7.field_u = var11;
        var7.field_s = var6;
        var7.field_z = param3;
        var7.field_t = var10.field_s[param2];
        var7.field_B = var10.field_t[param2];
        var7.field_i = param2;
        var7.field_v = var10.field_m[param2] * param0 * (param0 * var11.field_u) + 1024 >> 11;
        var7.field_x = var10.field_h[param2] & 255;
        var7.field_C = (param2 << 8) - (32767 & var10.field_j[param2]);
        var7.field_y = 0;
        var7.field_q = 0;
        var7.field_k = -1;
        var7.field_l = 0;
        var7.field_p = 0;
        if (0 != this.field_O[param3]) {
          var7.field_E = fn.a(var6, this.a(-20165, var7), 0, this.a(var7, true));
          stackIn_18_1 = var7;
          stackIn_18_2 = -124;
          if (var11.field_j[param2] >= 0) {
            stackIn_19_0 = this;
            stackIn_19_3 = false;
          } else {
            stackIn_19_0 = this;
            stackIn_19_3 = true;
          }
          this.a(stackIn_18_1, stackIn_18_2, stackIn_19_3);
        } else {
          var7.field_E = fn.a(var6, this.a(-20165, var7), this.a(var7, (byte) -111), this.a(var7, true));
        }
        if (var11.field_j[param2] < 0) {
          var7.field_E.e(-1);
        }
        if (0 <= var7.field_B) {
          var8 = this.field_x[param3][var7.field_B];
          if (var8 != null &&
            var8.field_k < 0) {
            this.field_G[param3][var8.field_i] = null;
            var8.field_k = 0;
          }
          this.field_x[param3][var7.field_B] = var7;
        }
        this.field_J.field_s.a(param1 ^ param1, var7);
        this.field_G[param3][param2] = var7;
        return;
    }

    final synchronized void a(int param0, byte param1, int param2) {
        this.b(param2, false, param0);
        if (param1 >= -115) {
          this.c((byte) 118);
        }
    }

    private final void b(byte param0, int param1) {
        lf var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 != -128) {
          return;
        }
        var3 = (lf) (this.field_J.field_s.b((byte) 26));
        while (var3 != null) {
          if (0 > param1 ||
            param1 == var3.field_z) {
            if (null != var3.field_E) {
              var3.field_E.c(qf.field_p / 100);
              if (var3.field_E.f()) {
                this.field_J.field_m.b(var3.field_E);
              }
              var3.c((byte) 125);
            }
            if (0 > var3.field_k) {
              this.field_G[var3.field_z][var3.field_i] = null;
            }
            var3.b(-27598);
          }
          var3 = (lf) (this.field_J.field_s.a(false));
        }
    }

    private final void c(int param0, int param1) {
        lf var3 = null;
        int var4 = ZombieDawn.field_J;
        if (0 != (this.field_l[param1] & 4)) {
          var3 = (lf) (this.field_J.field_s.b((byte) 26));
          while (var3 != null) {
            if (~var3.field_z == ~param1) {
              var3.field_D = 0;
            }
            var3 = (lf) (this.field_J.field_s.a(false));
          }
        }
        if (param0 < 45) {
          this.field_o = 124;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 > -126) {
          this.field_P = 31;
        }
        this.field_L[param0] = param2;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        int var3Lifetime1;
        if (!param0) {
          this.d(0, -1);
        } else {
          this.b((byte) -128, -1);
        }
        this.b(-1, 8192);
        if (param1 != 256) {
          wj var5 = (wj) null;
          this.a((wj) null, (byte) 109, true, false);
        }
        for (var3 = 0; 16 > var3; var3++) {
          this.field_D[var3] = this.field_F[var3];
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 16) {
          this.field_M[var6] = eg.a(-128, this.field_F[var6]);
          var6++;
        }
    }

    final synchronized int a() {
        return 0;
    }

    final void a(lf param0, int param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        int var6Lifetime1;
        try {
          var4_int = param0.field_s.field_l.length;
          if (param2 &&
            param0.field_s.field_j) {
            var6 = -param0.field_s.field_i + (var4_int + var4_int);
            var5 = (int)((long)this.field_O[param0.field_z] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              var5 = -1 + var4_int - (-var4_int + var5);
              param0.field_E.a(true);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_O[param0.field_z] >> 6);
          }
          param0.field_E.d(var5);
          var6Lifetime1 = -124 % ((param1 + 79) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("rj.KA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0, lf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_E) {
            if (param0 == 30296) {
              return false;
            }
            return false;
          }
          if (param1.field_k < 0) {
            return true;
          }
          param1.b(param0 - 57894);
          if (param1.field_B > 0 &&
            param1 == this.field_x[param1.field_z][param1.field_B]) {
            this.field_x[param1.field_z][param1.field_B] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("rj.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param0 != 11664) {
          lf var6 = (lf) null;
          this.a((lf) null, -31, true);
        }
    }

    final synchronized void c(int param0) {
        this.a(true, (byte) -71);
        if (param0 != 28013) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, 52, -103);
        }
    }

    final synchronized boolean c(byte param0) {
        if (param0 != -34) {
          this.field_t = 28L;
        }
        return this.field_w.a();
    }

    final synchronized sp d() {
        return null;
    }

    private final synchronized void a(wj param0, byte param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var5_int = 0;
        int var7 = 0;
        ka var8 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ZombieDawn.field_J;
        try {
          this.a(param2, (byte) -71);
          this.field_w.a(param0.field_i);
          stackIn_4_1 = (param3);
          this.field_s = stackIn_4_1;
          this.field_K = 0L;
          var5_int = this.field_w.d();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_w.f(var6);
            this.field_w.c(var6);
            this.field_w.b(var6);
          }
          this.field_N = this.field_w.b();
          this.field_v = this.field_w.field_f[this.field_N];
          this.field_t = this.field_w.a(this.field_v);
          if (param1 >= -122) {
            var8 = (ka) null;
            this.a((wj) null, (byte) -81, (dj) null, -58, (ka) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rj.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(wj param0, byte param1, dj param2, int param3, ka param4) {
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
        int var8 = 0;
        bh var9 = null;
        int var10 = 0;
        ma var11 = null;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        try {
          param0.b();
          var8 = 121 / ((param1 + 78) / 32);
          var6_int = 1;
          var7 = null;
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          var9 = (bh) (param0.field_h.a((byte) -113));
          while (var9 != null) {
            var10 = (int)var9.field_f;
            var11 = (ma) (this.field_A.a((long)var10, 101));
            if (var11 == null) {
              var11 = vk.a(param2, var10, 0);
              if (var11 != null) {
                this.field_A.a(-106, (long)var10, var11);
              } else {
                var6_int = 0;
              }
            }
            if (var11 != null &&
              !var11.a(true, (int[]) (var7), param4, var9.field_k)) {
              var6_int = 0;
            }
            var9 = (bh) (param0.field_h.b((byte) 99));
          }
          if (var6_int != 0) {
            param0.a();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("rj.FA(");
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
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = ZombieDawn.field_J;
        var2 = this.field_N;
        if (param0) {
          this.field_H = (int[]) null;
        }
        var3 = this.field_v;
        var4 = this.field_t;
        if (this.field_y != null &&
          var3 == this.field_P) {
          this.a(this.field_y, (byte) -125, this.field_C, this.field_s);
          this.a(false);
          return;
        }
        while (true) {
          if (var3 != this.field_v) {
            this.field_t = var4;
            this.field_N = var2;
            this.field_v = var3;
            if (this.field_y != null) {
              stackIn_24_0 = ~this.field_P;
              stackIn_24_1 = ~var3;
              if (stackIn_24_0 > stackIn_24_1) {
                this.field_N = -1;
                this.field_v = this.field_P;
                this.field_t = this.field_w.a(this.field_v);
              }
            }
            return;
          }
          while (~var3 == ~this.field_w.field_f[var2]) {
            this.field_w.f(var2);
            var6 = this.field_w.d(var2);
            if (var6 != 1) {
              if (0 != (var6 & 128)) {
                this.a((byte) -80, var6);
              }
              this.field_w.c(var2);
              this.field_w.b(var2);
              continue;
            }
            this.field_w.c();
            this.field_w.b(var2);
            if (this.field_w.f()) {
              if (this.field_y != null) {
                this.a((byte) -22, this.field_y, this.field_s);
                this.a(false);
                return;
              }
              if (this.field_s &&
                0 != var3) {
                this.field_w.a(var4);
              } else {
                this.a(true, 256);
                this.field_w.e();
                return;
              }
            }
            break;
          }
          var2 = this.field_w.b();
          var3 = this.field_w.field_f[var2];
          var4 = this.field_w.a(var3);
        }
    }

    final static void d(int param0) {
        if (!dl.a(false)) {
          return;
        }
        if (param0 > -101) {
          return;
        }
        ti.a(4, 90, false);
    }

    private final void d(int param0, int param1) {
        int var4 = ZombieDawn.field_J;
        lf var3 = (lf) (this.field_J.field_s.b((byte) 26));
        while (var3 != null) {
          if ((param1 < 0 || param1 == var3.field_z) &&
            !(var3.field_k >= 0)) {
            this.field_G[var3.field_z][var3.field_i] = null;
            var3.field_k = 0;
          }
          var3 = (lf) (this.field_J.field_s.a(false));
        }
        if (param0 != 0) {
          this.a(7, true);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        lf var6 = null;
        int var7 = ZombieDawn.field_J;
        if (param1 < 108) {
          return;
        }
        lf var8 = this.field_G[param0][param2];
        if (var8 == null) {
          return;
        }
        this.field_G[param0][param2] = null;
        if ((2 & this.field_l[param0]) == 0) {
          var8.field_k = 0;
        } else {
          var6 = (lf) (this.field_J.field_s.b((byte) 26));
          while (var6 != null) {
            if (var8.field_z == var6.field_z &&
              0 > var6.field_k &&
              var6 != var8) {
              var8.field_k = 0;
              break;
            }
            var6 = (lf) (this.field_J.field_s.a(false));
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (this.field_w.a()) {
            var4_int = this.field_w.field_b * this.field_m / qf.field_p;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_K;
              if (this.field_t - var5 >= 0L) {
                this.field_K = var5;
                break;
              }
              var7 = (int)((-1L + ((long)var4_int + (-this.field_K + this.field_t))) / (long)var4_int);
              this.field_K = this.field_K + (long)var4_int * (long)var7;
              this.field_J.a(param0, param1, var7);
              param1 = param1 + var7;
              this.a(false);
              param2 = param2 - var7;
              if (this.field_w.a()) {
                continue;
              }
              this.field_J.a(param0, param1, param2);
              return;
            }
          }
          this.field_J.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("rj.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 >= -51) {
          this.a(38, (byte) 112, 58);
        }
    }

    private final void b(int param0, boolean param1, int param2) {
        this.field_F[param0] = param2;
        this.field_M[param0] = eg.a(-128, param2);
        this.a(0, param0, param2);
        if (param1) {
          this.field_F = (int[]) null;
        }
    }

    private final int a(lf param0, boolean param1) {
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
          if (!param1) {
            stackIn_2_0 = 28;
            return stackIn_2_0;
          }
          var3_int = this.field_q[param0.field_z];
          if (8192 > var3_int) {
            stackIn_7_0 = var3_int * param0.field_x + 32 >> 6;
            return stackIn_7_0;
          }
          stackIn_5_0 = 16384 - ((-param0.field_x + 128) * (16384 - var3_int) + 32 >> 6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rj.GA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = ZombieDawn.field_J;
        if (!param1) {
          this.field_n = (int[]) null;
        }
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_z[var4] = param0;
          }
        } else {
          this.field_z[param2] = param0;
        }
    }

    private final void a(int param0, int param1) {
        lf var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 != 0) {
          this.b(122, 44, 94, 110);
        }
        if ((2 & this.field_l[param1]) != 0) {
          var3 = (lf) (this.field_J.field_s.b((byte) 26));
          while (var3 != null) {
            if (var3.field_z == param1) {
              if (null != this.field_G[param1][var3.field_i]) {
                var3 = (lf) (this.field_J.field_s.a(false));
                continue;
              }
              if (var3.field_k < 0) {
                var3.field_k = 0;
              }
            }
            var3 = (lf) (this.field_J.field_s.a(false));
          }
        }
    }

    final synchronized void a(byte param0, wj param1, boolean param2) {
        try {
          this.a(param1, (byte) -126, true, param2);
          if (param0 != -22) {
            this.a((byte) -8, 95);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rj.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        var8 = ZombieDawn.field_J;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = (32713 & param1) >> 8;
          var6 = (8352632 & param1) >> 16;
          this.b(var4, 125, var5, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = (param1 & 32553) >> 8;
          var6Lifetime1 = param1 >> 16 & 127;
          if (var6Lifetime1 > 0) {
            this.a(var6Lifetime1, 0, var5Lifetime1, var4Lifetime1);
          } else {
            this.b(var4Lifetime1, 110, var5Lifetime1, 64);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param1;
          var5Lifetime2 = (32580 & param1) >> 8;
          var6Lifetime2 = (param1 & 8354293) >> 16;
          this.c(11664, var4Lifetime2, var5Lifetime2, var6Lifetime2);
        } else {
          if (var3 != 176) {
            if (192 == var3) {
              var4Lifetime2 = param1 & 15;
              var5Lifetime2 = (32557 & param1) >> 8;
              this.a(0, var4Lifetime2, var5Lifetime2 + this.field_M[var4Lifetime2]);
            } else {
              if (208 == var3) {
                var4Lifetime2 = param1 & 15;
                var5Lifetime2 = 127 & param1 >> 8;
                this.b(var4Lifetime2, var5Lifetime2, -124);
              } else {
                if (224 == var3) {
                  var4Lifetime2 = param1 & 15;
                  var5Lifetime2 = ((8323514 & param1) >> 9) + (127 & param1 >> 8);
                  this.b(var4Lifetime2, (byte) -128, var5Lifetime2);
                } else {
                  var3 = param1 & 255;
                  if (var3 != 255) {
                    var4Lifetime2 = 28 / ((58 - param0) / 50);
                  } else {
                    this.a(true, 256);
                  }
                }
              }
            }
          } else {
            var4Lifetime2 = 15 & param1;
            var5Lifetime2 = 127 & param1 >> 8;
            var6Lifetime2 = 127 & param1 >> 16;
            if (0 == var5Lifetime2) {
              this.field_M[var4Lifetime2] = eg.a(this.field_M[var4Lifetime2], -2080769) + (var6Lifetime2 << 14);
            }
            if (var5Lifetime2 == 32) {
              this.field_M[var4Lifetime2] = (var6Lifetime2 << 7) + eg.a(this.field_M[var4Lifetime2], -16257);
            }
            if (var5Lifetime2 == 1) {
              this.field_n[var4Lifetime2] = eg.a(-16257, this.field_n[var4Lifetime2]) + (var6Lifetime2 << 7);
            }
            if (var5Lifetime2 == 33) {
              this.field_n[var4Lifetime2] = eg.a(-128, this.field_n[var4Lifetime2]) + var6Lifetime2;
            }
            if (var5Lifetime2 == 5) {
              this.field_H[var4Lifetime2] = (var6Lifetime2 << 7) + eg.a(-16257, this.field_H[var4Lifetime2]);
            }
            if (var5Lifetime2 == 37) {
              this.field_H[var4Lifetime2] = eg.a(this.field_H[var4Lifetime2], -128) + var6Lifetime2;
            }
            if (var5Lifetime2 == 7) {
              this.field_I[var4Lifetime2] = (var6Lifetime2 << 7) + eg.a(-16257, this.field_I[var4Lifetime2]);
            }
            if (var5Lifetime2 == 39) {
              this.field_I[var4Lifetime2] = eg.a(-128, this.field_I[var4Lifetime2]) + var6Lifetime2;
            }
            if (var5Lifetime2 == 10) {
              this.field_q[var4Lifetime2] = (var6Lifetime2 << 7) + eg.a(this.field_q[var4Lifetime2], -16257);
            }
            if (var5Lifetime2 == 42) {
              this.field_q[var4Lifetime2] = eg.a(this.field_q[var4Lifetime2], -128) + var6Lifetime2;
            }
            if (var5Lifetime2 == 11) {
              this.field_B[var4Lifetime2] = eg.a(this.field_B[var4Lifetime2], -16257) + (var6Lifetime2 << 7);
            }
            if (var5Lifetime2 == 43) {
              this.field_B[var4Lifetime2] = var6Lifetime2 + eg.a(-128, this.field_B[var4Lifetime2]);
            }
            if (var5Lifetime2 == 64) {
              if (var6Lifetime2 < 64) {
                this.field_l[var4Lifetime2] = eg.a(this.field_l[var4Lifetime2], -2);
              } else {
                this.field_l[var4Lifetime2] = hi.a(this.field_l[var4Lifetime2], 1);
              }
            }
            if (var5Lifetime2 == 65) {
              if (var6Lifetime2 < 64) {
                this.a(0, var4Lifetime2);
                this.field_l[var4Lifetime2] = eg.a(this.field_l[var4Lifetime2], -3);
              } else {
                this.field_l[var4Lifetime2] = hi.a(this.field_l[var4Lifetime2], 2);
              }
            }
            if (var5Lifetime2 == 99) {
              this.field_u[var4Lifetime2] = eg.a(127, this.field_u[var4Lifetime2]) + (var6Lifetime2 << 7);
            }
            if (98 == var5Lifetime2) {
              this.field_u[var4Lifetime2] = eg.a(16256, this.field_u[var4Lifetime2]) + var6Lifetime2;
            }
            if (var5Lifetime2 == 101) {
              this.field_u[var4Lifetime2] = 16384 - (-eg.a(this.field_u[var4Lifetime2], 127) - (var6Lifetime2 << 7));
            }
            if (var5Lifetime2 == 100) {
              this.field_u[var4Lifetime2] = var6Lifetime2 + eg.a(this.field_u[var4Lifetime2], 16256) + 16384;
            }
            if (var5Lifetime2 == 120) {
              this.b((byte) -128, var4Lifetime2);
            }
            if (121 == var5Lifetime2) {
              this.b(var4Lifetime2, 8192);
            }
            if (var5Lifetime2 == 123) {
              this.d(0, var4Lifetime2);
            }
            if (var5Lifetime2 == 6) {
              var7 = this.field_u[var4Lifetime2];
              if (var7 == 16384) {
                this.field_Q[var4Lifetime2] = eg.a(-16257, this.field_Q[var4Lifetime2]) + (var6Lifetime2 << 7);
              }
            }
            if (var5Lifetime2 == 38) {
              var7Lifetime1 = this.field_u[var4Lifetime2];
              if (var7Lifetime1 == 16384) {
                this.field_Q[var4Lifetime2] = var6Lifetime2 + eg.a(this.field_Q[var4Lifetime2], -128);
              }
            }
            if (var5Lifetime2 == 16) {
              this.field_O[var4Lifetime2] = (var6Lifetime2 << 7) + eg.a(-16257, this.field_O[var4Lifetime2]);
            }
            if (48 == var5Lifetime2) {
              this.field_O[var4Lifetime2] = eg.a(this.field_O[var4Lifetime2], -128) + var6Lifetime2;
            }
            if (var5Lifetime2 == 81) {
              if (var6Lifetime2 < 64) {
                this.c(95, var4Lifetime2);
                this.field_l[var4Lifetime2] = eg.a(this.field_l[var4Lifetime2], -5);
              } else {
                this.field_l[var4Lifetime2] = hi.a(this.field_l[var4Lifetime2], 4);
              }
            }
            if (var5Lifetime2 == 17) {
              this.a(var4Lifetime2, (this.field_p[var4Lifetime2] & -16257) + (var6Lifetime2 << 7), (byte) 119);
            }
            if (var5Lifetime2 == 49) {
              this.a(var4Lifetime2, var6Lifetime2 + (-128 & this.field_p[var4Lifetime2]), (byte) 88);
            }
          }
        }
    }

    final boolean a(int param0, int param1, lf param2, int[] param3, int param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        nf var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          param2.field_r = qf.field_p / 100;
          if (param0 != -32464) {
            this.field_G = (lf[][]) null;
          }
          if (param2.field_k >= 0 && (param2.field_E == null ||
            param2.field_E.l())) {
            param2.c((byte) 125);
            param2.b(-27598);
            if (param2.field_B > 0) {
              if (this.field_x[param2.field_z][param2.field_B] != param2) {
                return true;
              }
              this.field_x[param2.field_z][param2.field_B] = null;
            }
            return true;
          }
          var6_int = param2.field_j;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_H[param2.field_z]) * 16.0 + 0.5);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param2.field_j = var6_int;
          }
          param2.field_E.f(this.a(param0 + 12299, param2));
          var7 = param2.field_t;
          param2.field_o = param2.field_o + 1;
          var8 = 0;
          param2.field_w = param2.field_w + var7.field_a;
          var9 = 0.000005086263020833333 * (double)((param2.field_i - 60 << 8) + (param2.field_A * param2.field_j >> 12));
          if (var7.field_j > 0) {
            if (0 < var7.field_c) {
              param2.field_p = param2.field_p + (int)(Math.pow(2.0, (double)var7.field_c * var9) * 128.0 + 0.5);
            } else {
              param2.field_p = param2.field_p + 128;
            }
            if (var7.field_j * param2.field_p >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_h) {
            if (0 < var7.field_i) {
              param2.field_l = param2.field_l + (int)(Math.pow(2.0, var9 * (double)var7.field_i) * 128.0 + 0.5);
            } else {
              param2.field_l = param2.field_l + 128;
            }
            while (var7.field_h.length - 2 > param2.field_y) {
              if ((var7.field_h[param2.field_y + 2] & 255) << 8 < param2.field_l) {
                param2.field_y = param2.field_y + 2;
                continue;
              }
              break;
            }
            if (param2.field_y == var7.field_h.length - 2 &&
              var7.field_h[1 + param2.field_y] == 0) {
              var8 = 1;
            }
          }
          if (param2.field_k >= 0 &&
            null != var7.field_b &&
            (this.field_l[param2.field_z] & 1) == 0 && (!(param2.field_B >= 0) ||
            this.field_x[param2.field_z][param2.field_B] != param2)) {
            if (var7.field_e > 0) {
              param2.field_k = param2.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_e * var9));
            } else {
              param2.field_k = param2.field_k + 128;
            }
            while (param2.field_q < var7.field_b.length - 2) {
              if (param2.field_k > (var7.field_b[param2.field_q + 2] << 8 & 65280)) {
                param2.field_q = param2.field_q + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_b.length == param2.field_q) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param2.field_E.a(param2.field_r, this.a(param2, (byte) -111), this.a(param2, true));
            return false;
          }
          param2.field_E.c(param2.field_r);
          if (param3 != null) {
            param2.field_E.a(param3, param1, param4);
          } else {
            param2.field_E.a(param4);
          }
          if (param2.field_E.f()) {
            this.field_J.field_m.b(param2.field_E);
          }
          param2.c((byte) 123);
          if (param2.field_k >= 0) {
            param2.b(-27598);
            if (param2.field_B > 0 &&
              this.field_x[param2.field_z][param2.field_B] == param2) {
              this.field_x[param2.field_z][param2.field_B] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("rj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, lf param1) {
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nf var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_j * param1.field_A >> 12) + param1.field_C;
          if (param0 != -20165) {
            stackIn_2_0 = 76;
            return stackIn_2_0;
          }
          var3_int = var3_int + ((this.field_L[param1.field_z] - 8192) * this.field_Q[param1.field_z] >> 12);
          var4 = param1.field_t;
          if (var4.field_a > 0 && (!(var4.field_f <= 0) ||
            this.field_n[param1.field_z] > 0)) {
            var5 = var4.field_f << 2;
            var6 = var4.field_g << 1;
            if (var6 > param1.field_o) {
              var5 = param1.field_o * var5 / var6;
            }
            var5 = var5 + (this.field_n[param1.field_z] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_w & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(256 * param1.field_s.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)qf.field_p);
          stackIn_14_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("rj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1) {
        this.field_m = param0;
        if (param1) {
          this.a(27, -63, 10);
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        this.field_w.e();
        this.field_y = null;
        if (param1 != -71) {
          this.c(64);
        }
        this.a(param0, 256);
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        var6 = ZombieDawn.field_J;
        if (this.field_w.a()) {
          var2 = this.field_m * this.field_w.field_b / qf.field_p;
          while (true) {
            var3 = this.field_K + (long)param0 * (long)var2;
            if (this.field_t - var3 >= 0L) {
              this.field_K = var3;
              break;
            }
            var5 = (int)((-this.field_K + (this.field_t + ((long)var2 - 1L))) / (long)var2);
            this.field_K = this.field_K + (long)var2 * (long)var5;
            this.field_J.a(var5);
            param0 = param0 - var5;
            this.a(false);
            if (!this.field_w.a()) {
              break;
            }
          }
        }
        this.field_J.a(param0);
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.b(param0, param1 ^ 0);
          }
        } else {
          this.field_I[param0] = 12800;
          this.field_q[param0] = 8192;
          this.field_B[param0] = 16383;
          this.field_L[param0] = 8192;
          this.field_n[param0] = 0;
          this.field_H[param0] = param1;
          this.a(0, param0);
          this.c(param1 - 8116, param0);
          this.field_l[param0] = 0;
          this.field_u[param0] = 32767;
          this.field_Q[param0] = 256;
          this.field_O[param0] = 0;
          this.a(param0, 8192, (byte) 117);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        if (param0 != 0) {
          this.d(59, 36);
        }
        if (this.field_D[param1] != param2) {
          this.field_D[param1] = param2;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_x[param1][var4] = null;
          }
        }
    }

    public rj() {
        this.field_B = new int[16];
        this.field_L = new int[16];
        this.field_O = new int[16];
        this.field_x = new lf[16][128];
        this.field_r = new int[16];
        this.field_q = new int[16];
        this.field_D = new int[16];
        this.field_m = 1000000;
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_l = new int[16];
        this.field_Q = new int[16];
        this.field_p = new int[16];
        this.field_H = new int[16];
        this.field_F = new int[16];
        this.field_o = 256;
        this.field_I = new int[16];
        this.field_n = new int[16];
        this.field_G = new lf[16][128];
        this.field_M = new int[16];
        this.field_w = new jg();
        this.field_J = new ip(this);
        this.field_A = new dl(128);
        this.a(256, true, -1);
        this.a(true, 256);
    }

    static {
    }
}
