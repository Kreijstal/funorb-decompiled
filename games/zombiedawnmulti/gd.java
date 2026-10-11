/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends gq {
    private int[] field_C;
    static me field_Q;
    private mb[][] field_O;
    private int field_r;
    private int field_N;
    private int[] field_m;
    int[] field_n;
    private int[] field_w;
    private mb[][] field_t;
    private int[] field_k;
    private int[] field_j;
    private int[] field_x;
    private int[] field_z;
    private int[] field_E;
    private int[] field_u;
    private int[] field_D;
    static int field_B;
    private f field_G;
    int[] field_H;
    private int[] field_J;
    int[] field_y;
    private int[] field_K;
    private int[] field_v;
    private mm field_p;
    private ba field_P;
    private long field_l;
    private boolean field_L;
    private long field_A;
    private int field_q;
    private int field_I;
    private boolean field_F;
    private int field_o;
    private ug field_s;

    final synchronized void a(int param0, byte param1) {
        this.field_N = param0;
        if (param1 != 116) {
          this.a(113);
        }
    }

    final static void a(boolean param0, int param1, ja[] param2) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          dd.field_f[param1] = param2;
          dd.field_f[param1][dd.field_f[param1].length - 2].a();
          if (!he.field_a) {
            oo.b();
          }
          if (param0) {
            field_B = 38;
            dl.field_h.b((byte) 107);
          } else {
            dl.field_h.b((byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gd.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static bm a(byte[] param0, byte param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var7 = 0;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 90000;
          var3 = 10;
          var4 = 0;
          var5 = new byte[param0.length + 12];
          if (param1 != 46) {
            stackIn_3_0 = (bm) null;
            return stackIn_3_0;
          }
          br.a(0, var5, param1 - 173, re.a(param0, 0, (byte) 71));
          br.a(1, var5, -80, var4);
          br.a(2, var5, -118, var2_int);
          br.a(3, var5, -91, var3);
          for (var6 = 1; var6 < param0.length / 4; var6++) {
            br.a(3 + var6, var5, -127, re.a(param0, var6, (byte) 53));
          }
          stackIn_8_0 = ij.a(var5, 7);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gd.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -116) {
          return;
        }
        this.field_r = param1;
    }

    public static void e(int param0) {
        if (param0 != 0) {
          gd.e(70);
        }
        field_Q = null;
    }

    private final void b(int param0, byte param1) {
        mb var3_ref_mb;
        int var4;
        int var3;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((this.field_H[param0] & 2) != 0) {
          var3_ref_mb = (mb) (this.field_P.field_k.c(109));
          while (var3_ref_mb != null) {
            if (~var3_ref_mb.field_o == ~param0) {
              if (this.field_O[param0][var3_ref_mb.field_p] != null) {
                var3_ref_mb = (mb) (this.field_P.field_k.b(6));
                continue;
              }
              if (var3_ref_mb.field_l < 0) {
                var3_ref_mb.field_l = 0;
              }
            }
            var3_ref_mb = (mb) (this.field_P.field_k.b(6));
          }
        }
        var3 = -45 % ((param1 + 10) / 54);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_p.b()) {
            var4_int = this.field_r * this.field_p.field_g / gp.field_p;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_A;
              if (this.field_l - var5 >= 0L) {
                this.field_A = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int - this.field_A + this.field_l) / (long)var4_int);
              this.field_A = this.field_A + (long)var7 * (long)var4_int;
              this.field_P.b(param0, param1, var7);
              this.f(113);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (this.field_p.b()) {
                continue;
              }
              this.field_P.b(param0, param1, param2);
              return;
            }
          }
          this.field_P.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("gd.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param0 != -1) {
          this.a();
        }
    }

    final void a(boolean param0, byte param1, mb param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2.field_f.field_h.length;
          if (param0 &&
            param2.field_f.field_i) {
            var6 = -param2.field_f.field_j + var4_int + var4_int;
            var5 = (int)((long)this.field_y[param2.field_o] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              var5 = -1 + (var4_int + (var4_int - var5));
              param2.field_C.b(true);
            }
          } else {
            var5 = (int)((long)this.field_y[param2.field_o] * (long)var4_int >> 6);
          }
          if (param1 >= -64) {
            gd.a(43, (byte) -76, 101);
          }
          param2.field_C.c(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gd.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        int var4;
        long var5;
        int var7;
        int var8;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 54 % ((param0 - 41) / 56);
        var2 = this.field_q;
        var4 = this.field_I;
        var5 = this.field_l;
        if (this.field_s != null &&
          this.field_o == var4) {
          this.a(this.field_F, 8695, this.field_s, this.field_L);
          this.f(-106);
          return;
        }
        while (true) {
          if (this.field_I != var4) {
            this.field_q = var2;
            this.field_l = var5;
            this.field_I = var4;
            if (null != this.field_s) {
              stackIn_24_0 = ~this.field_o;
              stackIn_24_1 = ~var4;
              if (stackIn_24_0 > stackIn_24_1) {
                this.field_q = -1;
                this.field_I = this.field_o;
                this.field_l = this.field_p.f(this.field_I);
              }
            }
            return;
          }
          while (var4 == this.field_p.field_h[var2]) {
            this.field_p.b(var2);
            var7 = this.field_p.a(var2);
            if (var7 != 1) {
              if ((var7 & 128) != 0) {
                this.a(-5777, var7);
              }
              this.field_p.d(var2);
              this.field_p.e(var2);
              continue;
            }
            this.field_p.e();
            this.field_p.e(var2);
            if (this.field_p.c()) {
              if (null != this.field_s) {
                this.a(this.field_s, this.field_L, 8361407);
                this.f(99);
                return;
              }
              if (this.field_L &&
                0 != var4) {
                this.field_p.a(var5);
              } else {
                this.b(-1, true);
                this.field_p.f();
                return;
              }
            }
            break;
          }
          var2 = this.field_p.a();
          var4 = this.field_p.field_h[var2];
          var5 = this.field_p.f(var4);
        }
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.c(-1, 0);
        } else {
          this.a(-1, true);
        }
        this.d(86, param0);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_C[var3] = this.field_j[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_z[var5] = tq.b(this.field_j[var5], -128);
          var5++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_18_1 = false;
        mb var5;
        int var6_int;
        jd var6;
        mb var7;
        mb var8;
        int var9;
        ug var10;
        po var11;
        po var12;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        this.b(param0, param3, 64, 101);
        if (0 != (2 & this.field_H[param3])) {
          var5 = (mb) (this.field_P.field_k.a((byte) 74));
          while (var5 != null) {
            if (param3 == var5.field_o &&
              var5.field_l < 0) {
              this.field_O[param3][var5.field_p] = null;
              this.field_O[param3][param0] = var5;
              var6_int = var5.field_z + (var5.field_t * var5.field_r >> 12);
              var5.field_z = var5.field_z + (-var5.field_p + param0 << 8);
              var5.field_r = -var5.field_z + var6_int;
              var5.field_p = param0;
              var5.field_t = 4096;
              return;
            }
            var5 = (mb) (this.field_P.field_k.c((byte) 121));
          }
        }
        var11 = (po) (this.field_G.a(0, (long)this.field_C[param3]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_s[param0];
        if (var6 == null) {
          return;
        }
        var7 = new mb();
        var7.field_x = var12;
        var7.field_f = var6;
        var7.field_o = param3;
        var7.field_h = var11.field_q[param0];
        var7.field_m = var11.field_m[param0];
        var7.field_p = param0;
        var7.field_v = 1024 + var11.field_h[param0] * param2 * (param2 * var12.field_o) >> 11;
        var7.field_E = 255 & var11.field_j[param0];
        var7.field_z = (param0 << 8) - (var11.field_g[param0] & 32767);
        var7.field_A = 0;
        var7.field_i = 0;
        var7.field_y = 0;
        var7.field_l = -1;
        var7.field_q = 0;
        if (this.field_y[param3] == 0) {
          var7.field_C = uj.a(var6, this.b(var7, -916428895), this.a((byte) 92, var7), this.a(var7, 81682502));
        } else {
          var7.field_C = uj.a(var6, this.b(var7, -916428895), 0, this.a(var7, 81682502));
          stackIn_18_1 = !(var11.field_g[param0] >= 0);
          this.a(stackIn_18_1, (byte) -107, var7);
        }
        if (0 > var11.field_g[param0]) {
          var7.field_C.g(-1);
        }
        if (0 <= var7.field_m) {
          var8 = this.field_t[param3][var7.field_m];
          if (var8 != null &&
            0 > var8.field_l) {
            this.field_O[param3][var8.field_p] = null;
            var8.field_l = 0;
          }
          this.field_t[param3][var7.field_m] = var7;
        }
        if (param1 != 4445) {
          var10 = (ug) null;
          this.a(true, 70, (ug) null, true);
        }
        this.field_P.field_k.a(var7, false);
        this.field_O[param3][param0] = var7;
        return;
    }

    private final int a(byte param0, mb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nj var10 = null;
        nj var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (0 == this.field_m[param1.field_o]) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var10 = param1.field_h;
          var11 = var10;
          var4 = this.field_v[param1.field_o] * this.field_E[param1.field_o] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = param1.field_v * var4 + 16384 >> 15;
          var4 = 128 + var4 * this.field_N >> 8;
          var4 = 128 + var4 * this.field_m[param1.field_o] >> 8;
          if (var11.field_b > 0) {
            var4 = (int)(Math.pow(0.5, 0.00001953125 * (double)param1.field_i * (double)var11.field_b) * (double)var4 + 0.5);
          }
          if (null != var11.field_l) {
            var5 = param1.field_A;
            var6 = var11.field_l[1 + param1.field_q];
            if (param1.field_q < -2 + var11.field_l.length) {
              var7 = var10.field_l[param1.field_q] << 8 & 65280;
              var8 = 65280 & var11.field_l[2 + param1.field_q] << 8;
              var6 = var6 + (-var6 + var11.field_l[param1.field_q + 3]) * (var5 - var7) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          var5Lifetime1 = 91 / ((param0 - 40) / 47);
          if (0 < param1.field_l &&
            var11.field_e != null) {
            var6Lifetime1 = param1.field_l;
            var7Lifetime1 = var11.field_e[param1.field_y + 1];
            if (var11.field_e.length - 2 > param1.field_y) {
              var8Lifetime1 = 65280 & var10.field_e[param1.field_y] << 8;
              var9 = (var11.field_e[2 + param1.field_y] & 255) << 8;
              var7Lifetime1 = var7Lifetime1 + (-var8Lifetime1 + var6Lifetime1) * (var11.field_e[3 + param1.field_y] - var7Lifetime1) / (var9 - var8Lifetime1);
            }
            var4 = 32 + var7Lifetime1 * var4 >> 6;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("gd.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final int b(mb param0, int param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param0.field_r * param0.field_t >> 12) + param0.field_z;
          var3_int = var3_int + (this.field_D[param0.field_o] * (-8192 + this.field_u[param0.field_o]) >> 12);
          if (param1 != -916428895) {
            this.field_m = (int[]) null;
          }
          var4 = param0.field_h;
          if (0 < var4.field_k && (!(var4.field_g <= 0) ||
            0 < this.field_K[param0.field_o])) {
            var5 = var4.field_g << 2;
            var6 = var4.field_j << 1;
            if (param0.field_B < var6) {
              var5 = var5 * param0.field_B / var6;
            }
            var5 = var5 + (this.field_K[param0.field_o] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_s));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param0.field_f.field_g * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)gp.field_p);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gd.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        mb var3 = (mb) (this.field_P.field_k.c(124));
        while (var3 != null) {
          if ((0 > param0 || param0 == var3.field_o) &&
            0 > var3.field_l) {
            this.field_O[var3.field_o][var3.field_p] = null;
            var3.field_l = 0;
          }
          var3 = (mb) (this.field_P.field_k.b(6));
        }
        if (!param1) {
          ja[] var5 = (ja[]) null;
          gd.a(false, -23, (ja[]) null);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6;
        mb var7;
        int var8;
        mb var9;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = this.field_O[param1][param0];
        if (var9 == null) {
          return;
        }
        {
          this.field_O[param1][param0] = null;
          var6 = 70 % ((-23 - param3) / 53);
          if ((this.field_H[param1] & 2) != 0) {
            var7 = (mb) (this.field_P.field_k.c(74));
            while (var7 != null) {
              if (var9.field_o == var7.field_o &&
                var7.field_l < 0 &&
                var7 != var9) {
                var9.field_l = 0;
                break;
              }
              var7 = (mb) (this.field_P.field_k.b(6));
            }
          } else {
            var9.field_l = 0;
          }
        }
    }

    final synchronized void g(int param0) {
        this.b(true, -82);
        if (param0 != 2) {
          field_B = -55;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -13961) {
          this.a(-64, (byte) 120);
        }
        if (this.field_C[param2] != param1) {
          this.field_C[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_t[param2][var4] = null;
          }
        }
    }

    final synchronized gq b() {
        return (gq) ((Object) this.field_P);
    }

    private final synchronized void b(boolean param0, int param1) {
        if (param1 != -82) {
          ja[] var4 = (ja[]) null;
          gd.a(false, 13, (ja[]) null);
        }
        this.field_p.f();
        this.field_s = null;
        this.b(-1, param0);
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 != 15) {
          ug var5 = (ug) null;
          this.a(false, -75, (ug) null, false);
        }
        this.field_x[param1] = param2;
        this.field_n[param1] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    final synchronized void f(int param0, int param1, int param2) {
        if (param1 != 15) {
          this.field_O = (mb[][]) null;
        }
        this.c(param0, 16532, param2);
    }

    private final int a(mb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ja[] var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 81682502) {
            var4 = (ja[]) null;
            gd.a(true, -52, (ja[]) null);
          }
          var3_int = this.field_J[param0.field_o];
          if (var3_int < 8192) {
            stackIn_6_0 = 32 + var3_int * param0.field_E >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (128 - param0.field_E) * (-var3_int + 16384) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gd.GA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = -1 + param2 & param0 >> 31;
        int var4 = 21 % ((param1 + 9) / 59);
        return var3 + (param0 + (param0 >>> 31)) % param2;
    }

    final synchronized boolean a(int param0, me param1, int param2, ug param3, ul param4) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        kg var8 = null;
        int var9 = 0;
        po var10 = null;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          param3.a();
          var6_int = 1;
          var7 = null;
          if (0 < param2) {
            var7 = new int[]{param2};
          }
          if (param0 != -10783) {
            this.field_x = (int[]) null;
          }
          var8 = (kg) (param3.field_f.a(0));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_e;
            var10 = (po) (this.field_G.a(param0 ^ -10783, (long)var9));
            if (var10 == null) {
              var10 = r.a(param4, var9, (byte) 15);
              if (var10 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_G.a(true, (long)var9, var10);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (!var10.a(param1, param0 ^ -10840, var8.field_h, (int[]) (var7)))) {
              var6_int = 0;
            }
            var8 = (kg) (param3.field_f.b(-118));
          }
          if (var6_int != 0) {
            param3.b();
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("gd.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_u[param2] = param1;
        if (param0 != -1) {
          this.d(25);
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param2 != 26739) {
          this.c(11, 71);
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void c(int param0, int param1) {
        mb var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (mb) (this.field_P.field_k.c(69));
        if (param1 != 0) {
          return;
        }
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_o == param0) {
            if (var3.field_C != null) {
              var3.field_C.e(gp.field_p / 100);
              if (var3.field_C.j()) {
                this.field_P.field_o.b(var3.field_C);
              }
              var3.a((byte) 71);
            }
            if (var3.field_l < 0) {
              this.field_O[var3.field_o][var3.field_p] = null;
            }
            var3.a(true);
          }
          var3 = (mb) (this.field_P.field_k.b(6));
        }
    }

    private final synchronized void a(boolean param0, int param1, ug param2, boolean param3) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        this.b(param0, -82);
        this.field_p.a(param2.field_g);
        this.field_L = param3 ? true : false;
        this.field_A = 0L;
        int var5_int = this.field_p.g();
        for (var6 = 0; var5_int > var6; var6++) {
          this.field_p.b(var6);
          this.field_p.d(var6);
          this.field_p.e(var6);
        }
        this.field_q = this.field_p.a();
        this.field_I = this.field_p.field_h[this.field_q];
        if (param1 != 8695) {
          return;
        }
        try {
          this.field_l = this.field_p.f(this.field_I);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gd.LA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1) {
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = (32716 & param1) >> 8;
          var6 = (param1 & 8359189) >> 16;
          this.b(var5, var4, var6, param0 + 5856);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = (param1 & 8329586) >> 16;
          if (0 >= var6Lifetime1) {
            this.b(var5Lifetime1, var4Lifetime1, 64, param0 ^ 5876);
          } else {
            this.a(var5Lifetime1, 4445, var6Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (param0 != -5777) {
          this.field_E = (int[]) null;
        }
        if (var3 == 160) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = (param1 & 32734) >> 8;
          var6Lifetime2 = param1 >> 16 & 127;
          this.c(var4Lifetime2, var5Lifetime2, 26739, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param1 & 15;
            var5Lifetime3 = (32693 & param1) >> 8;
            this.e(-13961, var5Lifetime3 + this.field_z[var4Lifetime3], var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = param1 >> 8 & 127;
            this.d(-1, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = param1 & 15;
            var5Lifetime3Lifetime2 = ((param1 & 8323368) >> 9) + (127 & param1 >> 8);
            this.a(-1, var5Lifetime3Lifetime2, var4Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param1;
          if (var3 != 255) {
            return;
          }
          this.b(-1, true);
          return;
        }
        var4Lifetime4 = param1 & 15;
        var5Lifetime4 = param1 >> 8 & 127;
        var6Lifetime3 = (param1 & 8361407) >> 16;
        if (0 == var5Lifetime4) {
          this.field_z[var4Lifetime4] = tq.b(this.field_z[var4Lifetime4], -2080769) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_z[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(this.field_z[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(this.field_K[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 33) {
          this.field_K[var4Lifetime4] = var6Lifetime3 + tq.b(this.field_K[var4Lifetime4], -128);
        }
        if (5 == var5Lifetime4) {
          this.field_k[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(-16257, this.field_k[var4Lifetime4]);
        }
        if (var5Lifetime4 == 37) {
          this.field_k[var4Lifetime4] = tq.b(-128, this.field_k[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_E[var4Lifetime4] = tq.b(-16257, this.field_E[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_E[var4Lifetime4] = var6Lifetime3 + tq.b(-128, this.field_E[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(this.field_J[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_J[var4Lifetime4] = var6Lifetime3 + tq.b(-128, this.field_J[var4Lifetime4]);
        }
        if (var5Lifetime4 == 11) {
          this.field_v[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(-16257, this.field_v[var4Lifetime4]);
        }
        if (43 == var5Lifetime4) {
          this.field_v[var4Lifetime4] = var6Lifetime3 + tq.b(this.field_v[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 64) {
          if (64 > var6Lifetime3) {
            this.field_H[var4Lifetime4] = tq.b(this.field_H[var4Lifetime4], -2);
          } else {
            this.field_H[var4Lifetime4] = cr.b(this.field_H[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (64 > var6Lifetime3) {
            this.b(var4Lifetime4, (byte) -83);
            this.field_H[var4Lifetime4] = tq.b(this.field_H[var4Lifetime4], -3);
          } else {
            this.field_H[var4Lifetime4] = cr.b(this.field_H[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_w[var4Lifetime4] = (var6Lifetime3 << 7) + tq.b(this.field_w[var4Lifetime4], 127);
        }
        if (98 == var5Lifetime4) {
          this.field_w[var4Lifetime4] = tq.b(16256, this.field_w[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_w[var4Lifetime4] = (var6Lifetime3 << 7) + (tq.b(127, this.field_w[var4Lifetime4]) + 16384);
        }
        if (var5Lifetime4 == 100) {
          this.field_w[var4Lifetime4] = 16384 + (tq.b(this.field_w[var4Lifetime4], 16256) + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.c(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 121) {
          this.d(param0 + 5855, var4Lifetime4);
        }
        if (var5Lifetime4 == 123) {
          this.a(var4Lifetime4, true);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_w[var4Lifetime4];
          if (var7 == 16384) {
            this.field_D[var4Lifetime4] = tq.b(this.field_D[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_w[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_D[var4Lifetime4] = var6Lifetime3 + tq.b(this.field_D[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_y[var4Lifetime4] = tq.b(-16257, this.field_y[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_y[var4Lifetime4] = tq.b(-128, this.field_y[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.field_H[var4Lifetime4] = cr.b(this.field_H[var4Lifetime4], 4);
          } else {
            this.b(param0 - 24973, var4Lifetime4);
            this.field_H[var4Lifetime4] = tq.b(this.field_H[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.b(15, var4Lifetime4, (var6Lifetime3 << 7) + (this.field_x[var4Lifetime4] & -16257));
        }
        if (var5Lifetime4 == 49) {
          this.b(param0 + 5792, var4Lifetime4, var6Lifetime3 + (this.field_x[var4Lifetime4] & -128));
        }
    }

    final synchronized void a(ug param0, boolean param1, int param2) {
        try {
          this.a(true, 8695, param0, param1);
          if (param2 != 8361407) {
            this.c(-40, -4);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gd.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        mb var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -30750) {
          this.b(-109, (byte) -67);
        }
        if ((4 & this.field_H[param1]) != 0) {
          var3 = (mb) (this.field_P.field_k.c(69));
          while (var3 != null) {
            if (var3.field_o == param1) {
              var3.field_w = 0;
            }
            var3 = (mb) (this.field_P.field_k.b(6));
          }
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 > param1) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_m[var4] = param0;
          }
        } else {
          this.field_m[param1] = param0;
        }
        if (param2) {
          this.field_I = 3;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_p.b()) {
          var2 = this.field_p.field_g * this.field_r / gp.field_p;
          while (true) {
            var3 = this.field_A + (long)param0 * (long)var2;
            if (-var3 + this.field_l >= 0L) {
              this.field_A = var3;
              break;
            }
            var5 = (int)((-this.field_A + this.field_l + (long)var2 - 1L) / (long)var2);
            this.field_A = this.field_A + (long)var2 * (long)var5;
            this.field_P.a(var5);
            param0 = param0 - var5;
            this.f(-20);
            if (this.field_p.b()) {
              continue;
            }
            this.field_P.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_P.a(param0);
        }

    }

    final boolean a(int param0, mb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            return true;
          }
          if (null != param1.field_C) {
            return false;
          }
          if (0 <= param1.field_l) {
            param1.a(true);
            if (param1.field_m > 0 &&
              this.field_t[param1.field_o][param1.field_m] == param1) {
              this.field_t[param1.field_o][param1.field_m] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("gd.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final synchronized void d(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        po var4 = (po) (this.field_G.a(0));
        while (var4 != null) {
          var4.e(-6930);
          var4 = (po) (this.field_G.b(-110));
        }
        if (param0 < 124) {
          this.a(101, (byte) 21);
        }
    }

    final synchronized gq d() {
        return null;
    }

    final boolean a(mb param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        nj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          param0.field_D = gp.field_p / 100;
          if (param0.field_l >= 0 && (param0.field_C == null ||
            param0.field_C.k())) {
            param0.a((byte) 71);
            param0.a(true);
            if (param0.field_m > 0) {
              if (param0 != this.field_t[param0.field_o][param0.field_m]) {
                return true;
              }
              this.field_t[param0.field_o][param0.field_m] = null;
            }
            return true;
          }
          var6_int = param0.field_t;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_k[param0.field_o] * 0.0004921259842519685) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param0.field_t = var6_int;
          }
          param0.field_C.i(this.b(param0, -916428895));
          var7 = param0.field_h;
          var11 = 98 % ((param4 + 44) / 58);
          param0.field_s = param0.field_s + var7.field_k;
          var8 = 0;
          param0.field_B = param0.field_B + 1;
          var9 = 0.000005086263020833333 * (double)((-60 + param0.field_p << 8) + (param0.field_r * param0.field_t >> 12));
          if (0 < var7.field_b) {
            if (var7.field_i > 0) {
              param0.field_i = param0.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_i) * 128.0);
            } else {
              param0.field_i = param0.field_i + 128;
            }
            if (819200 <= param0.field_i * var7.field_b) {
              var8 = 1;
            }
          }
          if (null != var7.field_l) {
            if (var7.field_c <= 0) {
              param0.field_A = param0.field_A + 128;
            } else {
              param0.field_A = param0.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
            }
            while (param0.field_q < var7.field_l.length - 2) {
              if ((65280 & var7.field_l[param0.field_q + 2] << 8) < param0.field_A) {
                param0.field_q = param0.field_q + 2;
                continue;
              }
              break;
            }
            if (var7.field_l.length - 2 == param0.field_q &&
              var7.field_l[param0.field_q + 1] == 0) {
              var8 = 1;
            }
          }
          if (param0.field_l >= 0 &&
            var7.field_e != null &&
            0 == (this.field_H[param0.field_o] & 1) && (!(param0.field_m >= 0) ||
            param0 != this.field_t[param0.field_o][param0.field_m])) {
            if (var7.field_m > 0) {
              param0.field_l = param0.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_m * var9) * 128.0);
            } else {
              param0.field_l = param0.field_l + 128;
            }
            while (var7.field_e.length - 2 > param0.field_y) {
              if (param0.field_l > (var7.field_e[param0.field_y + 2] << 8 & 65280)) {
                param0.field_y = param0.field_y + 2;
                continue;
              }
              break;
            }
            if (var7.field_e.length - 2 == param0.field_y) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param0.field_C.a(param0.field_D, this.a((byte) 92, param0), this.a(param0, 81682502));
            return false;
          }
          param0.field_C.e(param0.field_D);
          if (param3 != null) {
            param0.field_C.b(param3, param2, param1);
          } else {
            param0.field_C.a(param1);
          }
          if (param0.field_C.j()) {
            this.field_P.field_o.b(param0.field_C);
          }
          param0.a((byte) 71);
          if (param0.field_l >= 0) {
            param0.a(true);
            if (param0.field_m > 0 &&
              this.field_t[param0.field_o][param0.field_m] == param0) {
              this.field_t[param0.field_o][param0.field_m] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("gd.HA(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 > -35) {
          this.c(-32, 90);
        }
        return this.field_p.b();
    }

    private final void d(int param0, int param1) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.d(67, param1);
          }
        } else {
          this.field_E[param1] = 12800;
          this.field_J[param1] = 8192;
          this.field_v[param1] = 16383;
          this.field_u[param1] = 8192;
          this.field_K[param1] = 0;
          this.field_k[param1] = 8192;
          this.b(param1, (byte) 103);
          this.b(-30750, param1);
          this.field_H[param1] = 0;
          this.field_w[param1] = 32767;
          this.field_D[param1] = 256;
          this.field_y[param1] = 0;
          this.b(15, param1, 8192);
          if (param0 <= 65) {
            this.field_P = (ba) null;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 16532) {
          this.field_C = (int[]) null;
        }
        this.field_j[param2] = param0;
        this.field_z[param2] = tq.b(-128, param0);
        this.e(-13961, param0, param2);
    }

    public gd() {
        this.field_O = new mb[16][128];
        this.field_r = 1000000;
        this.field_m = new int[16];
        this.field_N = 256;
        this.field_j = new int[16];
        this.field_t = new mb[16][128];
        this.field_H = new int[16];
        this.field_z = new int[16];
        this.field_E = new int[16];
        this.field_w = new int[16];
        this.field_k = new int[16];
        this.field_C = new int[16];
        this.field_n = new int[16];
        this.field_D = new int[16];
        this.field_v = new int[16];
        this.field_y = new int[16];
        this.field_J = new int[16];
        this.field_x = new int[16];
        this.field_u = new int[16];
        this.field_K = new int[16];
        this.field_p = new mm();
        this.field_P = new ba(this);
        this.field_G = new f(128);
        this.a(256, -1, false);
        this.b(-1, true);
    }

    static {
    }
}
