/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends tj {
    private int[] field_L;
    static int field_r;
    private int[] field_F;
    static fa field_S;
    private gh field_G;
    private int[] field_u;
    int[] field_H;
    private tm[][] field_P;
    int[] field_l;
    private int[] field_w;
    private int[] field_T;
    private int[] field_n;
    private jm field_I;
    int[] field_C;
    private int[] field_o;
    private int[] field_E;
    static String field_A;
    private int[] field_t;
    private int[] field_O;
    private int[] field_M;
    private int[] field_v;
    private int field_p;
    private int[] field_y;
    private tm[][] field_q;
    private int field_m;
    private dl field_B;
    private long field_N;
    private long field_x;
    private int field_D;
    private boolean field_R;
    private int field_K;
    private int field_s;
    private ji field_z;
    private boolean field_J;

    private final void c(int param0, byte param1) {
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.c(param0, (byte) 90);
          }
        } else {
          this.field_O[param0] = 12800;
          this.field_v[param0] = 8192;
          this.field_T[param0] = 16383;
          this.field_E[param0] = 8192;
          this.field_y[param0] = 0;
          this.field_L[param0] = 8192;
          this.a(param0, false);
          this.a(param0, 4);
          this.field_C[param0] = 0;
          this.field_u[param0] = 32767;
          this.field_t[param0] = 256;
          this.field_H[param0] = 0;
          if (param1 < 6) {
            this.d(16);
          }
          this.b(-112, 8192, param0);
        }
    }

    private final void b(int param0, byte param1) {
        tm var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != 116) {
          w.a(true);
        }
        var3 = (tm) (this.field_B.field_t.g(-4));
        while (var3 != null) {
          if ((param0 < 0 ||
            var3.field_E == param0) &&
            var3.field_h < 0) {
            this.field_q[var3.field_E][var3.field_z] = null;
            var3.field_h = 0;
          }
          var3 = (tm) (this.field_B.field_t.a(12684));
        }
    }

    final synchronized boolean a(int param0, ji param1, gb param2, rd param3, boolean param4) {
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
        bc var8 = null;
        int var9 = 0;
        int var11 = 0;
        nf var12 = null;
        nf var13 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          param1.b();
          if (param4) {
            this.field_K = -87;
          }
          var6_int = 1;
          var7 = null;
          if (param0 > 0) {
            var7 = new int[]{param0};
          }
          var8 = (bc) (param1.field_i.a(-104));
          while (var8 != null) {
            var9 = (int)var8.field_c;
            var12 = (nf) (this.field_I.a(false, (long)var9));
            if (var12 == null) {
              var13 = ne.a(param2, -19, var9);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_I.a(-116, (long)var9, var13);
                if (!var13.a((int[]) (var7), var8.field_h, param3, -20752)) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a((int[]) (var7), var8.field_h, param3, -20752)) {
                var6_int = 0;
                var8 = (bc) (param1.field_i.b(-1));
                continue;
              }
            }
            var8 = (bc) (param1.field_i.b(-1));
          }
          if (var6_int != 0) {
            param1.a();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("w.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 <= 16) {
          int[] var5 = (int[]) null;
          this.b((int[]) null, -11, 107);
        }
        tm var3 = (tm) (this.field_B.field_t.g(-95));
        while (var3 != null) {
          if (param1 < 0 ||
            param1 == var3.field_E) {
            if (var3.field_A != null) {
              var3.field_A.h(ug.field_g / 100);
              if (var3.field_A.m()) {
                this.field_B.field_q.b(var3.field_A);
              }
              var3.b(true);
            }
            if (var3.field_h < 0) {
              this.field_q[var3.field_E][var3.field_z] = null;
            }
            var3.b(123);
          }
          var3 = (tm) (this.field_B.field_t.a(12684));
        }
    }

    final boolean a(byte param0, tm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_A) {
            if (param0 > 10) {
              return false;
            }
            return false;
          }
          if (0 <= param1.field_h) {
            param1.b(-108);
            if (param1.field_m > 0) {
              if (param1 != this.field_P[param1.field_E][param1.field_m]) {
                return true;
              }
              this.field_P[param1.field_E][param1.field_m] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("w.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized tj b() {
        return null;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 != 93) {
          this.field_P = (tm[][]) null;
        }
    }

    final synchronized void c(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameRemainder0 = true;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_G.c()) {
          var2 = this.field_p * this.field_G.field_f / ug.field_g;
          while (true) {
            var3 = this.field_N + (long)var2 * (long)param0;
            if (this.field_x - var3 < 0L) {
              var5 = (int)((-1L + ((long)var2 - this.field_N) + this.field_x) / (long)var2);
              this.field_N = this.field_N + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_B.c(var5);
              this.d(0);
              if (this.field_G.c()) {
                continue;
              }
            } else {
              this.field_N = var3;
            }
            break;
          }
          this.field_B.c(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_B.c(param0);
        }

    }

    synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          this.a((byte) 61, param2);
          this.field_G.a(param3.field_h);
          this.field_N = 0L;
          if (param1 <= 123) {
            this.field_E = (int[]) null;
          }
          this.field_R = param0 ? true : false;
          var5_int = this.field_G.g();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_G.e(var6);
            this.field_G.d(var6);
            this.field_G.a(var6);
          }
          this.field_D = this.field_G.d();
          this.field_K = this.field_G.field_a[this.field_D];
          this.field_x = this.field_G.b(this.field_K);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "w.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_F[param2] = param1;
        if (param0 != 22) {
          tm var5 = (tm) null;
          discarded$0 = this.a((tm) null, true);
        }
        this.field_o[param2] = ua.a(param1, -128);
        this.d(-14089, param1, param2);
    }

    private final int a(tm param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_v[param0.field_E];
          if (!param1) {
            this.field_R = true;
          }
          if (8192 > var3_int) {
            stackIn_6_0 = 32 + param0.field_n * var3_int >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (128 - param0.field_n) * (16384 - var3_int) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("w.BB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 > -42) {
          this.field_u = (int[]) null;
        }
        this.field_w[param2] = param1;
        this.field_l[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        tm var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (param3 != 63) {
          this.field_R = true;
        }
        tm var8 = this.field_q[param1][param2];
        if (var8 == null) {
          return;
        }
        this.field_q[param1][param2] = null;
        if ((2 & this.field_C[param1]) == 0) {
          var8.field_h = 0;
        } else {
          var6 = (tm) (this.field_B.field_t.g(-23));
          while (var6 != null) {
            if (var6.field_E == var8.field_E && 0 > var6.field_h &&
              var6 != var8) {
              var8.field_h = 0;
              break;
            }
            var6 = (tm) (this.field_B.field_t.a(param3 ^ 12723));
          }
        }
    }

    private final int a(tm param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pl var9 = null;
        pl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_M[param0.field_E] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_x;
          var10 = var9;
          var4 = 4096 + this.field_T[param0.field_E] * this.field_O[param0.field_E] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = var4 * param0.field_D + 16384 >> 15;
          var4 = 128 + var4 * this.field_m >> 8;
          var4 = this.field_M[param0.field_E] * var4 + 128 >> 8;
          if (0 < var10.field_b) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_k * (double)var10.field_b) * (double)var4);
          }
          if (null != var10.field_n) {
            var5 = param0.field_C;
            var6 = var10.field_n[1 + param0.field_w];
            if (param0.field_w < var10.field_n.length - 2) {
              var7 = (var9.field_n[param0.field_w] & 255) << 8;
              var8 = 65280 & var10.field_n[param0.field_w + 2] << 8;
              var6 = var6 + (-var7 + var5) * (var10.field_n[3 + param0.field_w] - var6) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param0.field_h > 0 &&
            var10.field_m != null) {
            var5Lifetime1 = param0.field_h;
            var6Lifetime1 = var10.field_m[1 + param0.field_l];
            if (var10.field_m.length - 2 > param0.field_l) {
              var7Lifetime1 = var9.field_m[param0.field_l] << 8 & 65280;
              var8Lifetime1 = (255 & var10.field_m[2 + param0.field_l]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_m[param0.field_l + 3]) * (var5Lifetime1 - var7Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          var5Lifetime2 = -109 % ((-7 - param1) / 40);
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("w.R(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(tm param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        pl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          param0.field_u = ug.field_g / 100;
          if (param3 != 31458) {
            this.a(50, -29, 123, -115);
          }
          if (0 <= param0.field_h && (param0.field_A == null ||
            param0.field_A.j())) {
            param0.b(true);
            param0.b(119);
            if (param0.field_m > 0) {
              if (this.field_P[param0.field_E][param0.field_m] != param0) {
                return true;
              }
              this.field_P[param0.field_E][param0.field_m] = null;
            }
            return true;
          }
          var6_int = param0.field_t;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_L[param0.field_E] * 0.0004921259842519685) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param0.field_t = var6_int;
          }
          param0.field_A.i(this.a(1, param0));
          var7 = param0.field_x;
          var8 = 0;
          param0.field_j = param0.field_j + var7.field_e;
          param0.field_B = param0.field_B + 1;
          var9 = (double)((param0.field_z - 60 << 8) + (param0.field_t * param0.field_F >> 12)) * 0.000005086263020833333;
          if (var7.field_b > 0) {
            if (var7.field_h <= 0) {
              param0.field_k = param0.field_k + 128;
            } else {
              param0.field_k = param0.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_h));
            }
            if (var7.field_b * param0.field_k >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_n) {
            if (var7.field_o > 0) {
              param0.field_C = param0.field_C + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_o) * 128.0);
            } else {
              param0.field_C = param0.field_C + 128;
            }
            while (-2 + var7.field_n.length > param0.field_w) {
              if (param0.field_C > ((255 & var7.field_n[2 + param0.field_w]) << 8)) {
                param0.field_w = param0.field_w + 2;
                continue;
              }
              break;
            }
            if (var7.field_n.length - 2 == param0.field_w &&
              var7.field_n[param0.field_w + 1] == 0) {
              var8 = 1;
            }
          }
          if (param0.field_h >= 0 &&
            var7.field_m != null &&
            0 == (1 & this.field_C[param0.field_E]) && (!(0 <= param0.field_m) ||
            param0 != this.field_P[param0.field_E][param0.field_m])) {
            if (var7.field_c > 0) {
              param0.field_h = param0.field_h + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
            } else {
              param0.field_h = param0.field_h + 128;
            }
            while (param0.field_l < var7.field_m.length - 2) {
              if (param0.field_h > (var7.field_m[2 + param0.field_l] & 255) << 8) {
                param0.field_l = param0.field_l + 2;
                continue;
              }
              break;
            }
            if (param0.field_l == var7.field_m.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param0.field_A.a(param0.field_u, this.a(param0, (byte) 68), this.a(param0, true));
            return false;
          }
          param0.field_A.h(param0.field_u);
          if (param4 == null) {
            param0.field_A.c(param1);
          } else {
            param0.field_A.b(param4, param2, param1);
          }
          if (param0.field_A.m()) {
            this.field_B.field_q.b(param0.field_A);
          }
          param0.b(true);
          if (param0.field_h >= 0) {
            param0.b(-29);
            if (param0.field_m > 0 &&
              param0 == this.field_P[param0.field_E][param0.field_m]) {
              this.field_P[param0.field_E][param0.field_m] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("w.N(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        tm var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (0 != (this.field_C[param0] & 2)) {
          var3 = (tm) (this.field_B.field_t.g(-64));
          while (var3 != null) {
            if (var3.field_E == param0) {
              if (this.field_q[param0][var3.field_z] != null) {
                var3 = (tm) (this.field_B.field_t.a(12684));
                continue;
              }
              if (0 > var3.field_h) {
                var3.field_h = 0;
              }
            }
            var3 = (tm) (this.field_B.field_t.a(12684));
          }
        }
        if (param1) {
          this.field_E = (int[]) null;
        }
    }

    final int g(int param0) {
        int var2 = 118 / ((param0 - 0) / 42);
        return this.field_m;
    }

    private final void a(int param0, int param1) {
        tm var3 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if ((param1 & this.field_C[param0]) != 0) {
          var3 = (tm) (this.field_B.field_t.g(-53));
          while (var3 != null) {
            if (var3.field_E == param0) {
              var3.field_i = 0;
            }
            var3 = (tm) (this.field_B.field_t.a(12684));
          }
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
          this.field_M = (int[]) null;
        }
        this.b((byte) 22, param1, param2);
    }

    final synchronized void c(int param0, int param1) {
        this.field_p = param0;
        if (param1 < 93) {
          this.field_J = false;
        }
    }

    final synchronized void b(byte param0, int param1) {
        this.field_m = param1;
        int var3 = -10 / ((-1 - param0) / 40);
    }

    public static void a(boolean param0) {
        field_A = null;
        if (param0) {
          w.b(false, -68);
        }
        field_S = null;
    }

    final synchronized boolean f(int param0) {
        if (param0 != 323697071) {
          this.field_y = (int[]) null;
        }
        return this.field_G.c();
    }

    private final int a(int param0, tm param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_t * param1.field_F >> 12) + param1.field_y;
          var3_int = var3_int + ((-8192 + this.field_E[param1.field_E]) * this.field_t[param1.field_E] >> 12);
          var4 = param1.field_x;
          if (param0 != 1) {
            this.field_B = (dl) null;
          }
          if (var4.field_e > 0 && (!(var4.field_g <= 0) ||
            this.field_y[param1.field_E] > 0)) {
            var5 = var4.field_g << 2;
            var6 = var4.field_d << 1;
            if (var6 > param1.field_B) {
              var5 = var5 * param1.field_B / var6;
            }
            var5 = var5 + (this.field_y[param1.field_E] >> 7);
            var7 = Math.sin((double)(param1.field_j & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(256 * param1.field_r.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)ug.field_g);
          stackIn_12_0 = (1 <= var5Lifetime1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("w.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -14089) {
          this.field_J = false;
        }
        if (param1 != this.field_n[param2]) {
          this.field_n[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_P[param2][var4] = null;
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        boolean stackIn_20_1 = false;
        tm var5;
        int var6_int;
        jb var6;
        tm var7;
        tm var8;
        int var9;
        nf var10;
        nf var11;
        var9 = HostileSpawn.field_I ? 1 : 0;
        this.a(64, param2, param3, (byte) 63);
        if ((2 & this.field_C[param2]) != 0) {
          var5 = (tm) (this.field_B.field_t.b((byte) 117));
          while (var5 != null) {
            if (var5.field_E == param2 &&
              var5.field_h < 0) {
              this.field_q[param2][var5.field_z] = null;
              this.field_q[param2][param3] = var5;
              var6_int = var5.field_y + (var5.field_t * var5.field_F >> 12);
              var5.field_y = var5.field_y + (-var5.field_z + param3 << 8);
              var5.field_z = param3;
              var5.field_t = 4096;
              var5.field_F = -var5.field_y + var6_int;
              return;
            }
            var5 = (tm) (this.field_B.field_t.a((byte) 124));
          }
        }
        var10 = (nf) (this.field_I.a(false, (long)this.field_n[param2]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_q[param3];
        if (var6 == null) {
          return;
        }
        var7 = new tm();
        var7.field_r = var6;
        var7.field_E = param2;
        var7.field_p = var10;
        var7.field_x = var10.field_o[param3];
        var7.field_m = var10.field_s[param3];
        var7.field_z = param3;
        var7.field_D = 1024 + var11.field_j * param1 * param1 * var10.field_i[param3] >> 11;
        var7.field_n = 255 & var10.field_l[param3];
        var7.field_y = (param3 << 8) - (var10.field_r[param3] & 32767);
        var7.field_l = 0;
        var7.field_k = 0;
        if (param0 != 35) {
          return;
        }
        var7.field_h = -1;
        var7.field_w = 0;
        var7.field_C = 0;
        if (this.field_H[param2] != 0) {
          var7.field_A = b.a(var6, this.a(1, var7), 0, this.a(var7, true));
          stackIn_20_1 = !(var11.field_r[param3] >= 0);
          this.a(stackIn_20_1, var7, -128);
        } else {
          var7.field_A = b.a(var6, this.a(param0 ^ 34, var7), this.a(var7, (byte) -75), this.a(var7, true));
        }
        if (var11.field_r[param3] < 0) {
          var7.field_A.d(-1);
        }
        if (0 <= var7.field_m) {
          var8 = this.field_P[param2][var7.field_m];
          if (var8 != null &&
            var8.field_h < 0) {
            this.field_q[param2][var8.field_z] = null;
            var8.field_h = 0;
          }
          this.field_P[param2][var7.field_m] = var7;
        }
        this.field_B.field_t.a(var7, param0 ^ 74);
        this.field_q[param2][param3] = var7;
        return;
    }

    final synchronized void a(boolean param0, byte param1, ji param2) {
        try {
          if (param1 < 8) {
            tm var5 = (tm) null;
            this.a((byte) -14, (tm) null);
          }
          this.a(param0, (byte) 124, true, param2);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "w.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -16257) {
          this.field_v = (int[]) null;
        }
    }

    final void a(boolean param0, tm param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_r.field_k.length;
          if (param0 &&
            param1.field_r.field_m) {
            var6 = var4_int + var4_int - param1.field_r.field_l;
            var5 = (int)((long)this.field_H[param1.field_E] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              var5 = -var5 - 1 + var4_int + var4_int;
              param1.field_A.a(true);
            }
          } else {
            var5 = (int)((long)this.field_H[param1.field_E] * (long)var4_int >> 6);
          }
          param1.field_A.e(var5);
          if (param2 > -104) {
            this.field_O = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("w.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(boolean param0, int param1) {
        pc.a(param0, false, false);
        if (param1 != -23960) {
          field_r = -96;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > -65) {
          return;
        }
        this.field_E[param0] = param2;
    }

    private final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var4 = 73 / ((param0 + 9) / 51);
        var3 = param1 & 240;
        if (var3 == 128) {
          var5 = 15 & param1;
          var6 = (32556 & param1) >> 8;
          var7 = (8342895 & param1) >> 16;
          this.a(var7, var5, var6, (byte) 63);
          return;
        }
        if (144 == var3) {
          var5Lifetime1 = param1 & 15;
          var6Lifetime1 = 127 & param1 >> 8;
          var7Lifetime1 = (8326969 & param1) >> 16;
          if (var7Lifetime1 > 0) {
            this.a((byte) 35, var7Lifetime1, var5Lifetime1, var6Lifetime1);
          } else {
            this.a(64, var5Lifetime1, var6Lifetime1, (byte) 63);
          }
          return;
        }
        if (var3 == 160) {
          var5Lifetime2 = 15 & param1;
          var6Lifetime2 = (32541 & param1) >> 8;
          var7Lifetime2 = (8342347 & param1) >> 16;
          this.a(var6Lifetime2, -16257, var7Lifetime2, var5Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var5Lifetime3 = 15 & param1;
            var6Lifetime3 = param1 >> 8 & 127;
            this.d(-14089, var6Lifetime3 + this.field_o[var5Lifetime3], var5Lifetime3);
            return;
          }
          if (var3 == 208) {
            var5Lifetime3Lifetime1 = param1 & 15;
            var6Lifetime3Lifetime1 = (param1 & 32765) >> 8;
            this.a((byte) 93, var6Lifetime3Lifetime1, var5Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var5Lifetime3Lifetime2 = param1 & 15;
            var6Lifetime3Lifetime2 = ((8323466 & param1) >> 9) + (param1 >> 8 & 127);
            this.a(var5Lifetime3Lifetime2, -120, var6Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param1;
          if (var3 != 255) {
            return;
          }
          this.a(true, 2065687494);
          return;
        }
        var5Lifetime4 = 15 & param1;
        var6Lifetime4 = param1 >> 8 & 127;
        var7Lifetime3 = 127 & param1 >> 16;
        if (0 == var6Lifetime4) {
          this.field_o[var5Lifetime4] = ua.a(this.field_o[var5Lifetime4], -2080769) + (var7Lifetime3 << 14);
        }
        if (var6Lifetime4 == 32) {
          this.field_o[var5Lifetime4] = (var7Lifetime3 << 7) + ua.a(-16257, this.field_o[var5Lifetime4]);
        }
        if (1 == var6Lifetime4) {
          this.field_y[var5Lifetime4] = (var7Lifetime3 << 7) + ua.a(-16257, this.field_y[var5Lifetime4]);
        }
        if (var6Lifetime4 == 33) {
          this.field_y[var5Lifetime4] = var7Lifetime3 + ua.a(this.field_y[var5Lifetime4], -128);
        }
        if (var6Lifetime4 == 5) {
          this.field_L[var5Lifetime4] = ua.a(this.field_L[var5Lifetime4], -16257) + (var7Lifetime3 << 7);
        }
        if (37 == var6Lifetime4) {
          this.field_L[var5Lifetime4] = ua.a(-128, this.field_L[var5Lifetime4]) + var7Lifetime3;
        }
        if (var6Lifetime4 == 7) {
          this.field_O[var5Lifetime4] = ua.a(this.field_O[var5Lifetime4], -16257) + (var7Lifetime3 << 7);
        }
        if (var6Lifetime4 == 39) {
          this.field_O[var5Lifetime4] = var7Lifetime3 + ua.a(this.field_O[var5Lifetime4], -128);
        }
        if (10 == var6Lifetime4) {
          this.field_v[var5Lifetime4] = (var7Lifetime3 << 7) + ua.a(this.field_v[var5Lifetime4], -16257);
        }
        if (var6Lifetime4 == 42) {
          this.field_v[var5Lifetime4] = var7Lifetime3 + ua.a(-128, this.field_v[var5Lifetime4]);
        }
        if (var6Lifetime4 == 11) {
          this.field_T[var5Lifetime4] = ua.a(-16257, this.field_T[var5Lifetime4]) + (var7Lifetime3 << 7);
        }
        if (var6Lifetime4 == 43) {
          this.field_T[var5Lifetime4] = ua.a(this.field_T[var5Lifetime4], -128) + var7Lifetime3;
        }
        if (var6Lifetime4 == 64) {
          if (var7Lifetime3 >= 64) {
            this.field_C[var5Lifetime4] = ll.a(this.field_C[var5Lifetime4], 1);
          } else {
            this.field_C[var5Lifetime4] = ua.a(this.field_C[var5Lifetime4], -2);
          }
        }
        if (65 == var6Lifetime4) {
          if (var7Lifetime3 >= 64) {
            this.field_C[var5Lifetime4] = ll.a(this.field_C[var5Lifetime4], 2);
          } else {
            this.a(var5Lifetime4, false);
            this.field_C[var5Lifetime4] = ua.a(this.field_C[var5Lifetime4], -3);
          }
        }
        if (var6Lifetime4 == 99) {
          this.field_u[var5Lifetime4] = ua.a(127, this.field_u[var5Lifetime4]) + (var7Lifetime3 << 7);
        }
        if (var6Lifetime4 == 98) {
          this.field_u[var5Lifetime4] = ua.a(this.field_u[var5Lifetime4], 16256) + var7Lifetime3;
        }
        if (101 == var6Lifetime4) {
          this.field_u[var5Lifetime4] = ua.a(127, this.field_u[var5Lifetime4]) + (16384 + (var7Lifetime3 << 7));
        }
        if (var6Lifetime4 == 100) {
          this.field_u[var5Lifetime4] = var7Lifetime3 + 16384 + ua.a(this.field_u[var5Lifetime4], 16256);
        }
        if (var6Lifetime4 == 120) {
          this.b(106, var5Lifetime4);
        }
        if (121 == var6Lifetime4) {
          this.c(var5Lifetime4, (byte) 15);
        }
        if (123 == var6Lifetime4) {
          this.b(var5Lifetime4, (byte) 116);
        }
        if (var6Lifetime4 == 6) {
          var8 = this.field_u[var5Lifetime4];
          if (var8 == 16384) {
            this.field_t[var5Lifetime4] = (var7Lifetime3 << 7) + ua.a(-16257, this.field_t[var5Lifetime4]);
          }
        }
        if (var6Lifetime4 == 38) {
          var8Lifetime1 = this.field_u[var5Lifetime4];
          if (var8Lifetime1 == 16384) {
            this.field_t[var5Lifetime4] = ua.a(this.field_t[var5Lifetime4], -128) + var7Lifetime3;
          }
        }
        if (var6Lifetime4 == 16) {
          this.field_H[var5Lifetime4] = (var7Lifetime3 << 7) + ua.a(this.field_H[var5Lifetime4], -16257);
        }
        if (var6Lifetime4 == 48) {
          this.field_H[var5Lifetime4] = var7Lifetime3 + ua.a(-128, this.field_H[var5Lifetime4]);
        }
        if (var6Lifetime4 == 81) {
          if (var7Lifetime3 < 64) {
            this.a(var5Lifetime4, 4);
            this.field_C[var5Lifetime4] = ua.a(this.field_C[var5Lifetime4], -5);
          } else {
            this.field_C[var5Lifetime4] = ll.a(this.field_C[var5Lifetime4], 4);
          }
        }
        if (17 == var6Lifetime4) {
          this.b(-91, (var7Lifetime3 << 7) + (-16257 & this.field_w[var5Lifetime4]), var5Lifetime4);
        }
        if (var6Lifetime4 != 49) {
          return;
        }
        this.b(-75, (-128 & this.field_w[var5Lifetime4]) + var7Lifetime3, var5Lifetime4);
    }

    final synchronized tj d() {
        return (tj) ((Object) this.field_B);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        int var3Lifetime1;
        if (!param0) {
          this.b(-1, (byte) 116);
        } else {
          this.b(61, -1);
        }
        this.c(-1, (byte) 106);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_n[var3] = this.field_F[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        if (param1 != 2065687494) {
          return;
        }
        while (var5 < 16) {
          this.field_o[var5] = ua.a(-128, this.field_F[var5]);
          var5++;
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        if (param0 <= 56) {
          this.field_z = (ji) null;
        }
        this.field_G.b();
        this.field_z = null;
        this.a(param1, 2065687494);
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_G.c()) {
            var4_int = this.field_G.field_f * this.field_p / ug.field_g;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_N;
              if (-var5 + this.field_x >= 0L) {
                this.field_N = var5;
                break;
              }
              var7 = (int)((-1L + ((long)var4_int - this.field_N + this.field_x)) / (long)var4_int);
              this.field_N = this.field_N + (long)var7 * (long)var4_int;
              this.field_B.b(param0, param1, var7);
              this.d(0);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (this.field_G.c()) {
                continue;
              }
              this.field_B.b(param0, param1, param2);
              return;
            }
          }
          this.field_B.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 4491) {
          this.a((byte) 108, -57, -120, 20);
        }
        this.a((byte) 109, true);
    }

    private final void d(int param0) {
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = this.field_D;
        var3 = this.field_K;
        var4 = this.field_x;
        if (this.field_z != null &&
          var3 == this.field_s) {
          this.a(this.field_R, (byte) 127, this.field_J, this.field_z);
          this.d(0);
          return;
        }
        while (true) {
          if (this.field_K != var3) {
            this.field_K = var3;
            this.field_D = var2;
            if (param0 != 0) {
              this.field_F = (int[]) null;
            }
            this.field_x = var4;
            if (null != this.field_z) {
              stackIn_26_0 = this.field_s;
              stackIn_26_1 = var3;
              if (stackIn_26_0 < stackIn_26_1) {
                this.field_D = -1;
                this.field_K = this.field_s;
                this.field_x = this.field_G.b(this.field_K);
              }
            }
            return;
          }
          while (var3 == this.field_G.field_a[var2]) {
            this.field_G.e(var2);
            var6 = this.field_G.c(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.a((byte) -103, var6);
              }
              this.field_G.d(var2);
              this.field_G.a(var2);
              continue;
            }
            this.field_G.a();
            this.field_G.a(var2);
            if (this.field_G.e()) {
              if (this.field_z != null) {
                this.a(this.field_R, (byte) 52, this.field_z);
                this.d(0);
                return;
              }
              if (this.field_R &&
                0 != var3) {
                this.field_G.a(var4);
              } else {
                this.a(true, 2065687494);
                this.field_G.b();
                return;
              }
            }
            break;
          }
          var2 = this.field_G.d();
          var3 = this.field_G.field_a[var2];
          var4 = this.field_G.b(var3);
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param2 > -47) {
          this.g(95);
        }
        if (param1 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_M[var4] = param0;
          }
        } else {
          this.field_M[param1] = param0;
        }
    }

    public w() {
        this.field_H = new int[16];
        this.field_u = new int[16];
        this.field_L = new int[16];
        this.field_w = new int[16];
        this.field_F = new int[16];
        this.field_n = new int[16];
        this.field_P = new tm[16][128];
        this.field_l = new int[16];
        this.field_E = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_t = new int[16];
        this.field_p = 1000000;
        this.field_O = new int[16];
        this.field_M = new int[16];
        this.field_q = new tm[16][128];
        this.field_T = new int[16];
        this.field_y = new int[16];
        this.field_C = new int[16];
        this.field_m = 256;
        this.field_G = new gh();
        this.field_B = new dl(this);
        this.field_I = new jm(128);
        this.a(256, -1, (byte) -76);
        this.a(true, 2065687494);
    }

    w(w param0) {
        this.field_H = new int[16];
        this.field_u = new int[16];
        this.field_L = new int[16];
        this.field_w = new int[16];
        this.field_F = new int[16];
        this.field_n = new int[16];
        this.field_P = new tm[16][128];
        this.field_l = new int[16];
        this.field_E = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_t = new int[16];
        this.field_p = 1000000;
        this.field_O = new int[16];
        this.field_M = new int[16];
        this.field_q = new tm[16][128];
        this.field_T = new int[16];
        this.field_y = new int[16];
        this.field_C = new int[16];
        this.field_m = 256;
        this.field_G = new gh();
        this.field_B = new dl(this);
        try {
          this.field_I = param0.field_I;
          this.a(256, -1, (byte) -77);
          this.a(true, 2065687494);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = 0;
        field_A = "<col=ffffff>Pistol</col><br>If one of your weapons runs out of ammo, you will revert to using your pistol. This weapon has unlimited ammo, but a slow rate of fire, so try not to rely on it. Keep ammo stocked for the better weapons.";
        field_S = new fa("");
    }
}
