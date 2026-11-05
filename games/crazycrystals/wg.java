/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends od {
    private int field_K;
    int[] field_G;
    int[] field_v;
    static boolean field_P;
    private int[] field_O;
    private int[] field_F;
    private int[] field_q;
    int[] field_E;
    private int[] field_n;
    private pl[][] field_z;
    private int[] field_p;
    private int[] field_C;
    private fc field_D;
    private int[] field_M;
    private ic field_u;
    private int[] field_J;
    private int[] field_I;
    private int[] field_r;
    static long field_y;
    private int[] field_Q;
    static String field_N;
    private int field_l;
    private pl[][] field_w;
    private int[] field_L;
    private int[] field_j;
    private int field_o;
    private long field_B;
    private int field_H;
    private ka field_m;
    private boolean field_k;
    private long field_A;
    private rm field_x;
    private boolean field_s;
    private int field_t;

    private final void d(int param0, int param1, int param2) {
        if (param0 != 127) {
          return;
        }
        this.field_Q[param1] = param2;
    }

    final boolean a(pl param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_v) {
            if (param1 >= 98) {
              return false;
            }
            return true;
          }
          if (0 > param0.field_l) {
            return true;
          }
          param0.a(false);
          if (param0.field_C > 0 &&
            this.field_w[param0.field_i][param0.field_C] == param0) {
            this.field_w[param0.field_i][param0.field_C] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wg.CA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 < 12) {
          wg.f(72);
        }
        field_N = null;
    }

    private final int a(pl param0, boolean param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        cp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param0.field_o + (param0.field_q * param0.field_D >> 12);
          var3_int = var3_int + (this.field_I[param0.field_i] * (-8192 + this.field_Q[param0.field_i]) >> 12);
          var4 = param0.field_E;
          if (var4.field_l > 0 && (!(var4.field_i <= 0) ||
            this.field_j[param0.field_i] > 0)) {
            var5 = var4.field_i << 2;
            var6 = var4.field_e << 1;
            if (var6 > param0.field_z) {
              var5 = param0.field_z * var5 / var6;
            }
            var5 = var5 + (this.field_j[param0.field_i] >> 7);
            var7 = Math.sin((double)(param0.field_p & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(256 * param0.field_t.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)id.field_m);
          if (param1) {
            this.field_w = (pl[][]) null;
          }
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wg.IA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
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
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = CrazyCrystals.field_B;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = param1 >> 8 & 127;
          var6 = (8353046 & param1) >> 16;
          this.a(var4, false, var6, var5);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = (32690 & param1) >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (0 >= var6Lifetime1) {
            this.a(var4Lifetime1, false, 64, var5Lifetime1);
            return;
          }
          this.a(var6Lifetime1, 0, var5Lifetime1, var4Lifetime1);
        } else {
          if (160 == var3) {
            var4Lifetime1 = 15 & param1;
            var5Lifetime1 = param1 >> 8 & 127;
            var6Lifetime1 = param1 >> 16 & 127;
            this.a((byte) 121, var5Lifetime1, var6Lifetime1, var4Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (param0 != 63) {
              return;
            }
            if (var3 == 192) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = (param1 & 32587) >> 8;
              this.a(var4Lifetime1, 22519, this.field_M[var4Lifetime1] + var5Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = 127 & param1 >> 8;
              this.c(var4Lifetime1, 2, var5Lifetime1);
              return;
            }
            if (224 == var3) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = ((32752 & param1) >> 8) + ((8323282 & param1) >> 9);
              this.d(param0 + 64, var4Lifetime1, var5Lifetime1);
              return;
            }
            var3 = 255 & param1;
            if (var3 != 255) {
              return;
            }
            this.a(true, param0 + 13333);
            return;
          }
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = (8341461 & param1) >> 16;
          if (var5Lifetime1 == 0) {
            this.field_M[var4Lifetime1] = pf.b(-2080769, this.field_M[var4Lifetime1]) + (var6Lifetime1 << 14);
          }
          if (var5Lifetime1 == 32) {
            this.field_M[var4Lifetime1] = pf.b(-16257, this.field_M[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 1) {
            this.field_j[var4Lifetime1] = (var6Lifetime1 << 7) + pf.b(-16257, this.field_j[var4Lifetime1]);
          }
          if (33 == var5Lifetime1) {
            this.field_j[var4Lifetime1] = pf.b(this.field_j[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 5) {
            this.field_F[var4Lifetime1] = (var6Lifetime1 << 7) + pf.b(-16257, this.field_F[var4Lifetime1]);
          }
          if (var5Lifetime1 == 37) {
            this.field_F[var4Lifetime1] = var6Lifetime1 + pf.b(-128, this.field_F[var4Lifetime1]);
          }
          if (var5Lifetime1 == 7) {
            this.field_r[var4Lifetime1] = (var6Lifetime1 << 7) + pf.b(this.field_r[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 39) {
            this.field_r[var4Lifetime1] = var6Lifetime1 + pf.b(this.field_r[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 10) {
            this.field_q[var4Lifetime1] = pf.b(-16257, this.field_q[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 42) {
            this.field_q[var4Lifetime1] = var6Lifetime1 + pf.b(this.field_q[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 11) {
            this.field_O[var4Lifetime1] = pf.b(this.field_O[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.field_O[var4Lifetime1] = pf.b(-128, this.field_O[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 >= 64) {
              this.field_E[var4Lifetime1] = hm.a(this.field_E[var4Lifetime1], 1);
            } else {
              this.field_E[var4Lifetime1] = pf.b(this.field_E[var4Lifetime1], -2);
            }
          }
          if (65 == var5Lifetime1) {
            if (var6Lifetime1 >= 64) {
              this.field_E[var4Lifetime1] = hm.a(this.field_E[var4Lifetime1], 2);
            } else {
              this.d(98, var4Lifetime1);
              this.field_E[var4Lifetime1] = pf.b(this.field_E[var4Lifetime1], -3);
            }
          }
          if (var5Lifetime1 == 99) {
            this.field_p[var4Lifetime1] = (var6Lifetime1 << 7) + pf.b(this.field_p[var4Lifetime1], 127);
          }
          if (var5Lifetime1 == 98) {
            this.field_p[var4Lifetime1] = pf.b(this.field_p[var4Lifetime1], 16256) + var6Lifetime1;
          }
          if (var5Lifetime1 == 101) {
            this.field_p[var4Lifetime1] = (var6Lifetime1 << 7) + (pf.b(127, this.field_p[var4Lifetime1]) + 16384);
          }
          if (var5Lifetime1 == 100) {
            this.field_p[var4Lifetime1] = 16384 + pf.b(16256, this.field_p[var4Lifetime1]) + var6Lifetime1;
          }
          if (120 == var5Lifetime1) {
            this.a(-33, var4Lifetime1);
          }
          if (var5Lifetime1 == 121) {
            this.b(var4Lifetime1, param0 + 193);
          }
          if (var5Lifetime1 == 123) {
            this.f(var4Lifetime1, -87);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.field_p[var4Lifetime1];
            if (var7 == 16384) {
              this.field_I[var4Lifetime1] = (var6Lifetime1 << 7) + pf.b(this.field_I[var4Lifetime1], -16257);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_p[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.field_I[var4Lifetime1] = var6Lifetime1 + pf.b(this.field_I[var4Lifetime1], -128);
            }
          }
          if (16 == var5Lifetime1) {
            this.field_v[var4Lifetime1] = pf.b(this.field_v[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (48 == var5Lifetime1) {
            this.field_v[var4Lifetime1] = var6Lifetime1 + pf.b(-128, this.field_v[var4Lifetime1]);
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.c(110, var4Lifetime1);
              this.field_E[var4Lifetime1] = pf.b(this.field_E[var4Lifetime1], -5);
            } else {
              this.field_E[var4Lifetime1] = hm.a(this.field_E[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.a((var6Lifetime1 << 7) + (this.field_n[var4Lifetime1] & -16257), true, var4Lifetime1);
          }
          if (var5Lifetime1 == 49) {
            this.a((-128 & this.field_n[var4Lifetime1]) + var6Lifetime1, true, var4Lifetime1);
            return;
          }
        }
    }

    final static void f(int param0) {
        if (param0 != -11142) {
          wg.e(18);
        }
        rc.a(-25537, 4);
    }

    private final void g(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = CrazyCrystals.field_B;
        var2 = this.field_H;
        var3 = this.field_o;
        var4 = this.field_A;
        if (null != this.field_x &&
          this.field_t == var3) {
          this.a(this.field_s, 8192, this.field_x, this.field_k);
          this.g(-731);
          return;
        }
        if (param0 != -731) {
          return;
        }
        while (true) {
          if (this.field_o != var3) {
            this.field_A = var4;
            this.field_o = var3;
            this.field_H = var2;
            if (this.field_x != null) {
              stackIn_23_0 = this.field_t;
              stackIn_23_1 = var3;
              if (stackIn_23_0 < stackIn_23_1) {
                this.field_o = this.field_t;
                this.field_H = -1;
                this.field_A = this.field_u.b(this.field_o);
              }
            }
            return;
          }
          while (var3 == this.field_u.field_h[var2]) {
            this.field_u.c(var2);
            var6 = this.field_u.f(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.a((byte) 63, var6);
              }
              this.field_u.d(var2);
              this.field_u.e(var2);
              continue;
            }
            this.field_u.c();
            this.field_u.e(var2);
            if (this.field_u.f()) {
              if (this.field_x != null) {
                this.a(115, this.field_x, this.field_k);
                this.g(param0 + 0);
                return;
              }
              if (this.field_k &&
                var3 != 0) {
                this.field_u.a(var4);
              } else {
                this.a(true, 13396);
                this.field_u.e();
                return;
              }
            }
            break;
          }
          var2 = this.field_u.b();
          var3 = this.field_u.field_h[var2];
          var4 = this.field_u.b(var3);
        }
    }

    private final int b(pl param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cp var9 = null;
        cp var10 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_J[param0.field_i] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param1) {
            this.field_v = (int[]) null;
          }
          var9 = param0.field_E;
          var10 = var9;
          var4 = 4096 + this.field_O[param0.field_i] * this.field_r[param0.field_i] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = var4 * param0.field_m + 16384 >> 15;
          var4 = 128 + var4 * this.field_l >> 8;
          var4 = 128 + var4 * this.field_J[param0.field_i] >> 8;
          if (var10.field_g > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_w * 0.00001953125 * (double)var10.field_g) + 0.5);
          }
          if (null != var10.field_a) {
            var5 = param0.field_x;
            var6 = var10.field_a[param0.field_r + 1];
            if (param0.field_r < var10.field_a.length - 2) {
              var7 = (var9.field_a[param0.field_r] & 255) << 8;
              var8 = var10.field_a[2 + param0.field_r] << 8 & 65280;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_a[3 + param0.field_r]) / (var8 - var7);
            }
            var4 = 32 + var4 * var6 >> 6;
          }
          if (param0.field_l > 0 &&
            var10.field_b != null) {
            var5Lifetime1 = param0.field_l;
            var6Lifetime1 = var10.field_b[param0.field_f + 1];
            if (param0.field_f < var10.field_b.length - 2) {
              var7Lifetime1 = 65280 & var9.field_b[param0.field_f] << 8;
              var8Lifetime1 = 65280 & var10.field_b[param0.field_f + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_b[3 + param0.field_f]) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("wg.M(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        this.field_n[param2] = param0;
        if (!param1) {
          this.field_z = (pl[][]) null;
        }
        this.field_G[param2] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0);
    }

    private final void c(int param0, int param1) {
        pl var3 = null;
        int var4 = CrazyCrystals.field_B;
        if (0 != (4 & this.field_E[param1])) {
          var3 = (pl) (this.field_m.field_k.g(32073));
          while (var3 != null) {
            if (~var3.field_i == ~param1) {
              var3.field_j = 0;
            }
            var3 = (pl) (this.field_m.field_k.a(false));
          }
        }
        if (param0 < 21) {
          this.field_H = 20;
        }
    }

    final synchronized od a() {
        return null;
    }

    private final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param0 >= param1) {
          this.field_J[param0] = param2;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_J[var4] = param2;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 31) {
          this.a(32, false, -33, 108);
        }
        this.field_C[param2] = param1;
        this.field_M[param2] = pf.b(param1, -128);
        this.a(param2, 22519, param1);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        int var3Lifetime1;
        if (param1 != 13396) {
          return;
        }
        if (param0) {
          this.a(-33, -1);
        } else {
          this.f(-1, -123);
        }
        this.b(-1, 256);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_L[var3] = this.field_C[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_M[var5] = pf.b(-128, this.field_C[var5]);
          var5++;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 2) {
          this.field_E = (int[]) null;
        }
    }

    final synchronized void a(int param0, rm param1, boolean param2) {
        try {
          this.a(true, 8192, param1, param2);
          int var4_int = -66 / ((param0 - 12) / 63);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wg.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, pl param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.field_t.field_k.length;
          if (param0 != 2) {
            return;
          }
          if (param2 &&
            param1.field_t.field_i) {
            var6 = var4_int + (var4_int - param1.field_t.field_g);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_v[param1.field_i] * (long)var6 >> 6);
            if (var4_int <= var5) {
              var5 = -var5 - 1 + (var4_int + var4_int);
              param1.field_v.b(true);
            }
          } else {
            var5 = (int)((long)this.field_v[param1.field_i] * (long)var4_int >> 6);
          }
          param1.field_v.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("wg.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int c() {
        return 0;
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
        var8 = CrazyCrystals.field_B;
        try {
          if (this.field_u.d()) {
            var4_int = this.field_K * this.field_u.field_c / id.field_m;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_B;
              if (-var5 + this.field_A >= 0L) {
                this.field_B = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (-this.field_B + this.field_A)) / (long)var4_int);
              this.field_B = this.field_B + (long)var4_int * (long)var7;
              this.field_m.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.g(-731);
              if (this.field_u.d()) {
                continue;
              }
              this.field_m.a(param0, param1, param2);
              return;
            }
          }
          this.field_m.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wg.N(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        this.field_u.e();
        this.field_x = null;
        this.a(param0, 13396);
        if (param1 >= -82) {
          this.field_q = (int[]) null;
        }
    }

    final synchronized od d() {
        return (od) ((Object) this.field_m);
    }

    private final synchronized void a(boolean param0, int param1, rm param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = CrazyCrystals.field_B;
        try {
          this.b(param0, param1 - 8306);
          this.field_u.a(param2.field_g);
          this.field_B = 0L;
          this.field_k = param3 ? true : false;
          var5_int = this.field_u.a();
          if (param1 != 8192) {
            this.field_m = (ka) null;
          }
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_u.c(var6);
            this.field_u.d(var6);
            this.field_u.e(var6);
          }
          this.field_H = this.field_u.b();
          this.field_o = this.field_u.field_h[this.field_H];
          this.field_A = this.field_u.b(this.field_o);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wg.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 22519) {
          return;
        }
        if (this.field_L[param0] != param2) {
          this.field_L[param0] = param2;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_w[param0][var4] = null;
          }
        }
    }

    private final void a(int param0, int param1) {
        pl var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var3 = (pl) (this.field_m.field_k.g(32073));
        if (param0 != -33) {
          this.c(12, -19);
        }
        while (var3 != null) {
          if (param1 < 0 ||
            var3.field_i == param1) {
            if (var3.field_v != null) {
              var3.field_v.d(id.field_m / 100);
              if (var3.field_v.e()) {
                this.field_m.field_l.b(var3.field_v);
              }
              var3.d(12426);
            }
            if (var3.field_l < 0) {
              this.field_z[var3.field_i][var3.field_y] = null;
            }
            var3.a(false);
          }
          var3 = (pl) (this.field_m.field_k.a(false));
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_17_1 = 0;
        pl stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        pl var5;
        int var6_int;
        ko var6;
        pl var7;
        pl var8;
        int var9;
        dk var10;
        dk var11;
        var9 = CrazyCrystals.field_B;
        this.a(param3, false, 64, param2);
        if ((2 & this.field_E[param3]) != 0) {
          var5 = (pl) (this.field_m.field_k.a((byte) -119));
          while (var5 != null) {
            if (var5.field_i == param3 &&
              0 > var5.field_l) {
              this.field_z[param3][var5.field_y] = null;
              this.field_z[param3][param2] = var5;
              var6_int = var5.field_o + (var5.field_q * var5.field_D >> 12);
              var5.field_o = var5.field_o + (-var5.field_y + param2 << 8);
              var5.field_q = 4096;
              var5.field_D = -var5.field_o + var6_int;
              var5.field_y = param2;
              return;
            }
            var5 = (pl) (this.field_m.field_k.e(0));
          }
        }
        var10 = (dk) (this.field_D.a((long)this.field_L[param3], param1 ^ 0));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_m[param2];
        if (var6 == null) {
          return;
        }
        var7 = new pl();
        var7.field_i = param3;
        var7.field_A = var11;
        var7.field_t = var6;
        var7.field_E = var10.field_j[param2];
        var7.field_C = var10.field_f[param2];
        var7.field_y = param2;
        var7.field_m = 1024 + var11.field_g * (param0 * param0) * var10.field_p[param2] >> 11;
        var7.field_u = var10.field_i[param2] & 255;
        var7.field_o = (param2 << 8) - (var10.field_n[param2] & 32767);
        var7.field_w = 0;
        var7.field_l = -1;
        var7.field_x = 0;
        var7.field_f = 0;
        var7.field_r = 0;
        if (this.field_v[param3] == param1) {
          var7.field_v = kg.b(var6, this.a(var7, false), this.b(var7, false), this.a(var7, param1 + 255));
        } else {
          var7.field_v = kg.b(var6, this.a(var7, false), 0, this.a(var7, param1 + 255));
          stackIn_17_1 = 2;
          stackIn_17_2 = var7;
          if (var10.field_n[param2] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
        }
        if (var10.field_n[param2] < 0) {
          var7.field_v.f(-1);
        }
        if (var7.field_C >= 0) {
          var8 = this.field_w[param3][var7.field_C];
          if (var8 != null &&
            var8.field_l < 0) {
            this.field_z[param3][var8.field_y] = null;
            var8.field_l = 0;
          }
          this.field_w[param3][var7.field_C] = var7;
        }
        this.field_m.field_k.b(param1 + 0, var7);
        this.field_z[param3][param2] = var7;
        return;
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5 = -102 / ((param0 - 8) / 46);
    }

    final synchronized void d(int param0) {
        if (param0 < 15) {
          this.f(-8, -80);
        }
        this.b(true, -103);
    }

    final synchronized void e(int param0, int param1) {
        this.field_l = param1;
        if (param0 != -20562) {
          this.field_n = (int[]) null;
        }
    }

    final synchronized boolean a(db param0, bn param1, rm param2, int param3, int param4) {
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
        dm var8 = null;
        int var9 = 0;
        dk var10 = null;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        try {
          param2.b();
          if (param3 != -128) {
            return false;
          }
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (dm) (param2.field_f.a((byte) -93));
          while (var8 != null) {
            var9 = (int)var8.field_e;
            var10 = (dk) (this.field_D.a((long)var9, 0));
            if (var10 == null) {
              var10 = md.a(var9, 103, param0);
              if (var10 != null) {
                this.field_D.a(-22072, (long)var9, var10);
              } else {
                var6_int = 0;
              }
            }
            if (var10 != null &&
              !var10.a(true, param1, (int[]) (var7), var8.field_g)) {
              var6_int = 0;
            }
            var8 = (dm) (param2.field_f.a(88));
          }
          if (var6_int != 0) {
            param2.a();
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("wg.U(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pl var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (param1) {
          return;
        }
        pl var8 = this.field_z[param0][param3];
        if (var8 == null) {
          return;
        }
        this.field_z[param0][param3] = null;
        if ((this.field_E[param0] & 2) == 0) {
          var8.field_l = 0;
        } else {
          var6 = (pl) (this.field_m.field_k.g(32073));
          while (var6 != null) {
            if (var8.field_i == var6.field_i && var6.field_l < 0 &&
              var8 != var6) {
              var8.field_l = 0;
              break;
            }
            var6 = (pl) (this.field_m.field_k.a(false));
          }
        }
    }

    private final void d(int param0, int param1) {
        pl var3_ref_pl = null;
        int var4 = CrazyCrystals.field_B;
        if (0 != (2 & this.field_E[param1])) {
          var3_ref_pl = (pl) (this.field_m.field_k.g(32073));
          while (var3_ref_pl != null) {
            if (var3_ref_pl.field_i == param1 && this.field_z[param1][var3_ref_pl.field_y] == null &&
              !(0 <= var3_ref_pl.field_l)) {
              var3_ref_pl.field_l = 0;
            }
            var3_ref_pl = (pl) (this.field_m.field_k.a(false));
          }
        }
        int var3 = 109 % ((23 - param0) / 57);
    }

    final boolean a(int param0, int param1, int[] param2, pl param3, byte param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cp var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          param3.field_k = id.field_m / 100;
          if (param3.field_l >= 0 && (param3.field_v == null ||
            param3.field_v.h())) {
            param3.d(12426);
            param3.a(false);
            if (param3.field_C > 0 &&
              this.field_w[param3.field_i][param3.field_C] == param3) {
              this.field_w[param3.field_i][param3.field_C] = null;
              return true;
            }
            return true;
          }
          var6_int = param3.field_q;
          var7 = -17 % ((-43 - param4) / 48);
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_F[param3.field_i] * 0.0004921259842519685));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_q = var6_int;
          }
          param3.field_v.h(this.a(param3, false));
          var8 = param3.field_E;
          var9 = 0;
          param3.field_z = param3.field_z + 1;
          param3.field_p = param3.field_p + var8.field_l;
          var10 = 0.000005086263020833333 * (double)((param3.field_D * param3.field_q >> 12) + (-60 + param3.field_y << 8));
          if (0 < var8.field_g) {
            if (var8.field_j > 0) {
              param3.field_w = param3.field_w + (int)(0.5 + Math.pow(2.0, (double)var8.field_j * var10) * 128.0);
            } else {
              param3.field_w = param3.field_w + 128;
            }
            if (var8.field_g * param3.field_w >= 819200) {
              var9 = 1;
            }
          }
          if (var8.field_a != null) {
            if (var8.field_f > 0) {
              param3.field_x = param3.field_x + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_f) * 128.0);
            } else {
              param3.field_x = param3.field_x + 128;
            }
            while (-2 + var8.field_a.length > param3.field_r) {
              if ((65280 & var8.field_a[param3.field_r + 2] << 8) < param3.field_x) {
                param3.field_r = param3.field_r + 2;
                continue;
              }
              break;
            }
            if (var8.field_a.length - 2 == param3.field_r &&
              0 == var8.field_a[1 + param3.field_r]) {
              var9 = 1;
            }
          }
          if (param3.field_l >= 0 &&
            var8.field_b != null &&
            (1 & this.field_E[param3.field_i]) == 0 && (!(0 <= param3.field_C) ||
            this.field_w[param3.field_i][param3.field_C] != param3)) {
            if (0 < var8.field_c) {
              param3.field_l = param3.field_l + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_c * var10));
            } else {
              param3.field_l = param3.field_l + 128;
            }
            while (param3.field_f < -2 + var8.field_b.length) {
              if ((255 & var8.field_b[2 + param3.field_f]) << 8 < param3.field_l) {
                param3.field_f = param3.field_f + 2;
                continue;
              }
              break;
            }
            if (param3.field_f == -2 + var8.field_b.length) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            param3.field_v.a(param3.field_k, this.b(param3, false), this.a(param3, 255));
            return false;
          }
          param3.field_v.d(param3.field_k);
          if (param2 != null) {
            param3.field_v.a(param2, param1, param0);
          } else {
            param3.field_v.a(param0);
          }
          if (param3.field_v.e()) {
            this.field_m.field_l.b(param3.field_v);
          }
          param3.d(12426);
          if (param3.field_l >= 0) {
            param3.a(false);
            if (param3.field_C > 0 &&
              param3 == this.field_w[param3.field_i][param3.field_C]) {
              this.field_w[param3.field_i][param3.field_C] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("wg.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(pl param0, int param1) {
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
          if (param1 != 255) {
            stackIn_2_0 = 95;
            return stackIn_2_0;
          }
          var3_int = this.field_q[param0.field_i];
          if (8192 > var3_int) {
            stackIn_7_0 = 32 + var3_int * param0.field_u >> 6;
            return stackIn_7_0;
          }
          stackIn_5_0 = 16384 - ((128 - param0.field_u) * (16384 - var3_int) + 32 >> 6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wg.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        this.a((byte) 44, param0, param1);
        int var4 = 50 % ((param2 - 53) / 53);
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = CrazyCrystals.field_B;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.b(param0, 256);
          }
        } else {
          this.field_r[param0] = 12800;
          this.field_q[param0] = 8192;
          this.field_O[param0] = 16383;
          this.field_Q[param0] = 8192;
          this.field_j[param0] = 0;
          this.field_F[param0] = 8192;
          this.d(param1 - 343, param0);
          this.c(param1 - 230, param0);
          this.field_E[param0] = 0;
          this.field_p[param0] = 32767;
          this.field_I[param0] = param1;
          this.field_v[param0] = 0;
          this.a(8192, true, param0);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameRemainder0 = true;
        var6 = CrazyCrystals.field_B;
        if (this.field_u.d()) {
          var2 = this.field_K * this.field_u.field_c / id.field_m;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_B;
            if (this.field_A - var3 < 0L) {
              var5 = (int)((-1L + (-this.field_B + this.field_A + (long)var2)) / (long)var2);
              this.field_B = this.field_B + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_m.a(var5);
              this.g(-731);
              if (this.field_u.d()) {
                continue;
              }
            } else {
              this.field_B = var3;
            }
            break;
          }
          this.field_m.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_m.a(param0);
        }

    }

    private final void f(int param0, int param1) {
        pl var3;
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        var4 = -22 % ((param1 - 56) / 34);
        var3 = (pl) (this.field_m.field_k.g(32073));
        while (var3 != null) {
          if ((param0 < 0 ||
            var3.field_i == param0) &&
            var3.field_l < 0) {
            this.field_z[var3.field_i][var3.field_y] = null;
            var3.field_l = 0;
          }
          var3 = (pl) (this.field_m.field_k.a(false));
        }
    }

    public wg() {
        this.field_G = new int[16];
        this.field_F = new int[16];
        this.field_O = new int[16];
        this.field_v = new int[16];
        this.field_K = 1000000;
        this.field_n = new int[16];
        this.field_C = new int[16];
        this.field_q = new int[16];
        this.field_r = new int[16];
        this.field_J = new int[16];
        this.field_I = new int[16];
        this.field_l = 256;
        this.field_w = new pl[16][128];
        this.field_E = new int[16];
        this.field_p = new int[16];
        this.field_M = new int[16];
        this.field_z = new pl[16][128];
        this.field_L = new int[16];
        this.field_Q = new int[16];
        this.field_j = new int[16];
        this.field_u = new ic();
        this.field_m = new ka(this);
        this.field_D = new fc(128);
        this.b(-1, 0, 256);
        this.a(true, 13396);
    }

    static {
        field_N = "This is a sticky ball.<br><br>Sticky balls stick to walls and other obstacles, and roll around the level. Do not stand in the way!<br><br>You can run up against a<br>sticky ball safely, as long<br>as it does not run into<br>you.<br><br>Sticky balls get disoriented if what they are stuck to moves. You can rescue a disoriented sticky ball by putting something in its path.";
    }
}
