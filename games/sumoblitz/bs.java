/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends hj {
    private int field_E;
    private int[] field_L;
    private int[] field_H;
    int[] field_R;
    private int[] field_F;
    private int[] field_T;
    private int[] field_y;
    private sh field_v;
    private int[] field_B;
    private int[] field_S;
    private uu[][] field_P;
    private int field_r;
    private int[] field_D;
    private te field_p;
    int[] field_x;
    private int[] field_N;
    private int[] field_w;
    private int[] field_G;
    private uu[][] field_t;
    private int[] field_z;
    private int[] field_K;
    static char[] field_o;
    int[] field_J;
    private boolean field_M;
    private long field_q;
    private rh field_s;
    private int field_C;
    private long field_O;
    private int field_Q;
    private int field_u;
    private boolean field_A;
    private tv field_I;

    final synchronized boolean c(int param0) {
        if (param0 != -8192) {
          this.a(false, (tv) null, -40);
        }
        return this.field_v.c();
    }

    final synchronized hj c() {
        return null;
    }

    private final int c(int param0, uu param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mq var9 = null;
        mq var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (param0 != 255) {
            this.field_T = (int[]) null;
          }
          if (this.field_y[param1.field_y] == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var9 = param1.field_w;
          var10 = var9;
          var4 = 4096 + this.field_T[param1.field_y] * this.field_w[param1.field_y] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param1.field_F * var4 >> 15;
          var4 = 128 + this.field_r * var4 >> 8;
          var4 = var4 * this.field_y[param1.field_y] + 128 >> 8;
          if (0 < var10.field_i) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_i));
          }
          if (null != var10.field_g) {
            var5 = param1.field_G;
            var6 = var10.field_g[param1.field_r + 1];
            if (param1.field_r < (-2 + var10.field_g.length)) {
              var7 = 65280 & var9.field_g[param1.field_r] << 8;
              var8 = var10.field_g[param1.field_r + 2] << 8 & 65280;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[3 + param1.field_r]) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (param1.field_x > 0 &&
            var10.field_h != null) {
            var5Lifetime1 = param1.field_x;
            var6Lifetime1 = var10.field_h[1 + param1.field_n];
            if ((-2 + var10.field_h.length) > param1.field_n) {
              var7Lifetime1 = (var9.field_h[param1.field_n] & 255) << 8;
              var8Lifetime1 = 65280 & var10.field_h[param1.field_n + 2] << 8;
              var6Lifetime1 = var6Lifetime1 + (var10.field_h[3 + param1.field_n] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("bs.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        uu var6 = null;
        int var7 = 0;
        uu var8 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = this.field_t[param3][param1];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_t[param3][param1] = null;
        if ((this.field_J[param3] & 2) != 0) {
          var6 = (uu) (this.field_s.field_t.b(param2 - 12866));
          while (true) {
            if (var6 != null) {
              stackIn_15_0 = var8.field_y;
              stackIn_15_1 = var6.field_y;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_15_0 == stackIn_15_1 &&
                var6.field_x < 0 &&
                var8 != var6) {
                var8.field_x = 0;
              } else {
                var6 = (uu) (this.field_s.field_t.d((byte) 18));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_x = 0;
          }
        } else {
          var8.field_x = 0;
        }
        if (decompiledFrameCompleted0) {
          stackIn_15_0 = param2;
          stackIn_15_1 = 12800;
        }
        if (stackIn_15_0 != stackIn_15_1) {
          this.field_r = 50;
        }
    }

    private final int a(boolean param0, uu param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        mq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_p * param1.field_k >> 12) + param1.field_m;
          var3_int = var3_int + (this.field_D[param1.field_y] * (-8192 + this.field_L[param1.field_y]) >> 12);
          if (!param0) {
            this.field_O = 8L;
          }
          var4 = param1.field_w;
          if (var4.field_j > 0 && (!(var4.field_b <= 0) ||
            this.field_K[param1.field_y] > 0)) {
            var5 = var4.field_b << 2;
            var6 = var4.field_e << 1;
            if (var6 > param1.field_H) {
              var5 = var5 * param1.field_H / var6;
            }
            var5 = var5 + (this.field_K[param1.field_y] >> 7);
            var7 = Math.sin((double)(511 & param1.field_C) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_B.field_n * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)du.field_k);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bs.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        int discarded$1 = 0;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (0 > param0) {
          param0 = 0;
          do {
            if (param0 >= 16) {
              return;
            }
            this.a(param0, true);
            param0++;
          } while (var4 == 0);
          return;
        }
        this.field_w[param0] = 12800;
        this.field_G[param0] = 8192;
        this.field_T[param0] = 16383;
        this.field_L[param0] = 8192;
        this.field_K[param0] = 0;
        this.field_z[param0] = 8192;
        this.b(param0, (byte) 126);
        this.a(param0, 32605);
        if (!param1) {
          discarded$1 = this.a(45, (uu) null);
        }
        this.field_J[param0] = 0;
        this.field_S[param0] = 32767;
        this.field_D[param0] = 256;
        this.field_R[param0] = 0;
        this.d(8192, param0, 41);
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          this.c(-1, -1);
        }
        if (!param0 ||
          var4 != 0) {
          this.c(-1, (byte) -30);
        }
        this.a(-1, param1);
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.field_B[var3] = this.field_H[var3];
          var3++;
        } while (var4 == 0);
        while (var3 < 16) {
          this.field_F[var3] = eb.a(this.field_H[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final synchronized boolean a(og param0, tv param1, int param2, ki param3, int param4) {
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
        tj var8 = null;
        int var9 = 0;
        td var10 = null;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          param1.b();
          var6_int = 1;
          var7 = null;
          if (~param4 < param2) {
            var7 = new int[]{param4};
          }
          var8 = (tj) (param1.field_l.a(52));
          L2: while (true) {
            if (var8 != null) {
              var9 = (int)var8.field_h;
              var10 = (td) (this.field_p.a(param2 ^ -119, (long)var9));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var10 == null) {
                  var10 = u.a(param3, var9, 0);
                  if (var10 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_p.a(var10, param2 ^ 0, (long)var9);
                    decompiledFrameRemainder0 = !(var10.a(var8.field_m, (int[]) (var7), param0, 1255750754));
                  }
                } else {
                  decompiledFrameRemainder0 = !(var10.a(var8.field_m, (int[]) (var7), param0, 1255750754));
                }
                if (decompiledFrameRemainder0) {
                  var6_int = 0;
                }
                var8 = (tj) (param1.field_l.a(true));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break L2;
              }
            }
            param1.a();
            break;
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bs.EA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized hj a() {
        return (hj) ((Object) this.field_s);
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(int param0, uu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16384) {
            this.field_K = (int[]) null;
          }
          var3_int = this.field_G[param1.field_y];
          if (8192 <= var3_int) {
            stackIn_6_0 = 16384 - ((128 - param1.field_D) * (16384 - var3_int) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * param1.field_D + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bs.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, tv param1, int param2) {
        try {
          if (param2 <= 48) {
            this.d(0, -127, 115);
          }
          this.a(param0, true, true, param1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "bs.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int[] param0, int param1, int param2, uu param3, int param4) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        mq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          param3.field_u = du.field_k / 100;
          if (param3.field_x >= 0 && (param3.field_z == null ||
            param3.field_z.h())) {
            param3.a(0);
            param3.b(false);
            if (param3.field_q > 0 &&
              this.field_P[param3.field_y][param3.field_q] == param3) {
              this.field_P[param3.field_y][param3.field_q] = null;
              return true;
            }
            return true;
          }
          var6_int = param3.field_k;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_z[param3.field_y] * 0.0004921259842519685) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_k = var6_int;
          }
          param3.field_z.e(this.a(true, param3));
          var7 = param3.field_w;
          param3.field_C = param3.field_C + var7.field_j;
          var8 = 0;
          param3.field_H = param3.field_H + 1;
          var9 = (double)((param3.field_k * param3.field_p >> 12) + (-60 + param3.field_E << 8)) * 0.000005086263020833333;
          if (var7.field_i > 0) {
            boolean decompiledSharedTail0 = !(var7.field_d <= 0);
            if (!decompiledSharedTail0) {
              param3.field_v = param3.field_v + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
            }
            if (819200 <= var7.field_i * param3.field_v) {
              var8 = 1;
            }
          }
          if (var7.field_g != null) {
            if (0 < var7.field_f) {
              param3.field_G = param3.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
              if (var11 != 0) {
                param3.field_G = param3.field_G + 128;
              }
            } else {
              param3.field_G = param3.field_G + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if ((var7.field_g.length - 2) > param3.field_r) {
                stackIn_34_0 = param3.field_G;
                stackIn_34_1 = (255 & var7.field_g[param3.field_r + 2]) << 8;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_34_0 > stackIn_34_1)) {
                  param3.field_r = param3.field_r + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_34_0 = ~(var7.field_g.length - 2);
                stackIn_34_1 = ~param3.field_r;
              }
              if (stackIn_34_0 != stackIn_34_1) {
                break;
              }
              if (0 != var7.field_g[param3.field_r + 1]) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param4 <= param3.field_x &&
            var7.field_h != null &&
            (1 & this.field_J[param3.field_y]) == 0 && (!(param3.field_q >= 0) ||
            this.field_P[param3.field_y][param3.field_q] != param3)) {
            if (var7.field_c > 0) {
              param3.field_x = param3.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
              if (var11 != 0) {
                param3.field_x = param3.field_x + 128;
              }
            } else {
              param3.field_x = param3.field_x + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (param3.field_n < var7.field_h.length - 2) {
                stackIn_55_0 = param3.field_x;
                stackIn_55_1 = (var7.field_h[2 + param3.field_n] & 255) << 8;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_55_0 > stackIn_55_1)) {
                  param3.field_n = param3.field_n + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_55_0 = param3.field_n;
                stackIn_55_1 = var7.field_h.length - 2;
              }
              if (stackIn_55_0 != stackIn_55_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param3.field_z.a(param3.field_u, this.c(255, param3), this.a(param4 ^ 16384, param3));
            return false;
          }
          param3.field_z.d(param3.field_u);
          if (param0 != null) {
            param3.field_z.b(param0, param1, param2);
            if (var11 != 0) {
              param3.field_z.a(param2);
            }
          } else {
            param3.field_z.a(param2);
          }
          if (param3.field_z.k()) {
            this.field_s.field_o.b(param3.field_z);
          }
          param3.a(0);
          if (param3.field_x >= 0) {
            param3.b(false);
            if (param3.field_q > 0 &&
              this.field_P[param3.field_y][param3.field_q] == param3) {
              this.field_P[param3.field_y][param3.field_q] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("bs.IA(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(int param0, byte param1) {
        uu var3;
        int var4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if ((2 & this.field_J[param0]) != 0) {
          var3 = (uu) (this.field_s.field_t.b(-78));
          while (var3 != null) {
            stackIn_12_0 = var3.field_y;
            stackIn_12_1 = param0;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_12_0 == stackIn_12_1 &&
              this.field_t[param0][var3.field_E] == null &&
              0 > var3.field_x) {
              var3.field_x = 0;
            }
            var3 = (uu) (this.field_s.field_t.d((byte) 18));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_12_0 = param1;
          stackIn_12_1 = 120;
        }
        if (stackIn_12_0 <= stackIn_12_1) {
          this.field_J = (int[]) null;
        }
    }

    final void a(byte param0, uu param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        try {
          var4_int = param1.field_B.field_p.length;
          boolean decompiledSharedTail0 = (!(param2) ||
            !(param1.field_B.field_m));
          if (!decompiledSharedTail0) {
            var6 = -param1.field_B.field_l + (var4_int + var4_int);
            var5 = (int)((long)var6 * (long)this.field_R[param1.field_y] >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param1.field_z.c(true);
              var5 = -var5 + (var4_int + var4_int) - 1;
            }
            decompiledSharedTail0 = (Sumoblitz.field_L);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.field_R[param1.field_y] >> 6);
          }
          var6Lifetime1 = -121 / ((22 - param0) / 59);
          param1.field_z.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("bs.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void b(int param0, boolean param1) {
        if (!param1) {
          this.field_y = (int[]) null;
        }
        this.field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        this.field_L[param0] = param2;
        if (param1 > -98) {
          this.field_D = (int[]) null;
        }
    }

    private final void d(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_Q;
        if (param0 != 18922) {
          this.field_v = (sh) null;
        }
        var3 = this.field_C;
        var4 = this.field_q;
        if (null != this.field_I &&
          ~var3 == ~this.field_u) {
          this.a(this.field_M, true, this.field_A, this.field_I);
          this.d(18922);
          return;
        }
        while (true) {
          stackIn_7_0 = ~var3;
          stackIn_7_1 = ~this.field_C;
          L5: {
            if (stackIn_7_0 == stackIn_7_1) {
              L8: while (true) {
                stackIn_29_0 = ~var3;
                stackIn_29_1 = ~this.field_v.field_c[var2];
                if (var7 != 0) {
                  break L5;
                }
                if (stackIn_29_0 == stackIn_29_1) {
                  this.field_v.b(var2);
                  var6 = this.field_v.e(var2);
                  stackIn_7_0 = ~var6;
                  stackIn_7_1 = -2;
                  if (stackIn_7_0 == stackIn_7_1) {
                    this.field_v.a();
                    this.field_v.c(var2);
                    if (!this.field_v.d() &&
                      var7 == 0) {
                      break L8;
                    }
                    if (this.field_I != null) {
                      this.a(this.field_M, this.field_I, 107);
                      this.d(18922);
                      return;
                    }
                    if (this.field_M &&
                      var3 != 0) {
                      this.field_v.b(var4);
                      break L8;
                    }
                    this.a(true, true);
                    this.field_v.e();
                    return;
                  }
                  if (0 != (var6 & 128)) {
                    this.a(var6, (byte) -82);
                  }
                  this.field_v.a(var2);
                  this.field_v.c(var2);
                  continue;
                }
                break;
              }
              var2 = this.field_v.b();
              var3 = this.field_v.field_c[var2];
              var4 = this.field_v.d(var3);
              continue;
            }
            this.field_q = var4;
            this.field_C = var3;
            this.field_Q = var2;
            if (this.field_I == null) {
              return;
            }
            stackIn_29_0 = ~this.field_u;
            stackIn_29_1 = ~var3;
          }
          if (stackIn_29_0 > stackIn_29_1) {
            this.field_C = this.field_u;
            this.field_Q = -1;
            this.field_q = this.field_v.d(this.field_C);
          }
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int stackIn_17_1 = 0;
        uu stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        uu var5;
        int var6_int;
        qp var6;
        uu var7;
        int var8;
        uu var9;
        int var10;
        td var11;
        td var12;
        var10 = Sumoblitz.field_L ? 1 : 0;
        this.a(64, param3, 12800, param2);
        if ((this.field_J[param2] & 2) != 0) {
          var5 = (uu) (this.field_s.field_t.a(9));
          while (var5 != null) {
            if (~param2 == ~var5.field_y &&
              0 > var5.field_x) {
              this.field_t[param2][var5.field_E] = null;
              this.field_t[param2][param3] = var5;
              var6_int = var5.field_m + (var5.field_p * var5.field_k >> 12);
              var5.field_m = var5.field_m + (-var5.field_E + param3 << 8);
              var5.field_p = -var5.field_m + var6_int;
              var5.field_E = param3;
              var5.field_k = 4096;
              return;
            }
            var5 = (uu) (this.field_s.field_t.d(9));
            if (var10 == 0) {
              continue;
            }
            break;
          }
        }
        var11 = (td) (this.field_p.a(115, (long)this.field_B[param2]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_o[param3];
        if (var6 == null) {
          return;
        }
        var7 = new uu();
        var7.field_A = var12;
        var7.field_y = param2;
        var7.field_B = var6;
        var7.field_w = var11.field_n[param3];
        var7.field_q = var11.field_r[param3];
        var8 = -115 % ((-80 - param1) / 43);
        var7.field_E = param3;
        var7.field_F = 1024 + var12.field_s * (param0 * (param0 * var11.field_q[param3])) >> 11;
        var7.field_D = var11.field_t[param3] & 255;
        var7.field_m = -(32767 & var11.field_k[param3]) + (param3 << 8);
        var7.field_G = 0;
        var7.field_r = 0;
        var7.field_x = -1;
        var7.field_v = 0;
        var7.field_n = 0;
        if (0 == this.field_R[param2]) {
          var7.field_z = mf.a(var6, this.a(true, var7), this.c(255, var7), this.a(16384, var7));
          if (var10 != 0) {
            var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
            stackIn_17_1 = 110;
            stackIn_17_2 = var7;
            if (var11.field_k[param3] >= 0) {
              stackIn_18_0 = this;
              stackIn_18_3 = false;
            } else {
              stackIn_18_0 = this;
              stackIn_18_3 = true;
            }
            this.a((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
          }
        } else {
          var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
          stackIn_17_1 = 110;
          stackIn_17_2 = var7;
          if (var11.field_k[param3] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a((byte) stackIn_17_1, stackIn_17_2, stackIn_18_3);
        }
        if (var11.field_k[param3] < 0) {
          var7.field_z.c(-1);
        }
        if (var7.field_q >= 0) {
          var9 = this.field_P[param2][var7.field_q];
          if (var9 != null &&
            var9.field_x < 0) {
            this.field_t[param2][var9.field_E] = null;
            var9.field_x = 0;
          }
          this.field_P[param2][var7.field_q] = var7;
        }
        this.field_s.field_t.a((ms) (var7), (byte) 39);
        this.field_t[param2][param3] = var7;
        return;
    }

    final boolean b(int param0, uu param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 30) {
            this.field_s = (rh) null;
          }
          if (param1.field_z != null) {
            return false;
          }
          if (param1.field_x < 0) {
            return true;
          }
          param1.b(false);
          if (0 < param1.field_q &&
            param1 == this.field_P[param1.field_y][param1.field_q]) {
            this.field_P[param1.field_y][param1.field_q] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bs.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = param0 >> 16 & 127;
          this.a(var6, var5, 12800, var4);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = (32657 & param0) >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 > 0) {
            this.a(var6Lifetime1, (byte) -13, var4Lifetime1, var5Lifetime1);
            if (var8 == 0) {
              return;
            }
          }
          this.a(64, var5Lifetime1, 12800, var4Lifetime1);
          return;
        }
        if (param1 >= -52) {
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = 127 & param0 >> 8;
          var6Lifetime2 = param0 >> 16 & 127;
          this.b(97, var5Lifetime2, var6Lifetime2, var4Lifetime2);
          return;
        }
        if (176 != var3) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = (param0 & 32711) >> 8;
            this.e(var4Lifetime3, this.field_F[var4Lifetime3] + var5Lifetime3, 5174);
            return;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (32605 & param0) >> 8;
            this.a(var4Lifetime3Lifetime1, (byte) -101, var5Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = ((param0 & 8323255) >> 9) + (param0 >> 8 & 127);
            this.b(var4Lifetime3Lifetime2, -105, var5Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.a(true, true);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (32654 & param0) >> 8;
        var6Lifetime3 = (8345855 & param0) >> 16;
        if (0 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 14) + eb.a(-2080769, this.field_F[var4Lifetime4]);
        }
        if (var5Lifetime4 == 32) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 7) + eb.a(this.field_F[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + eb.a(-16257, this.field_K[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.field_K[var4Lifetime4] = eb.a(-128, this.field_K[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_z[var4Lifetime4] = (var6Lifetime3 << 7) + eb.a(-16257, this.field_z[var4Lifetime4]);
        }
        if (37 == var5Lifetime4) {
          this.field_z[var4Lifetime4] = var6Lifetime3 + eb.a(-128, this.field_z[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.field_w[var4Lifetime4] = eb.a(-16257, this.field_w[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (39 == var5Lifetime4) {
          this.field_w[var4Lifetime4] = var6Lifetime3 + eb.a(this.field_w[var4Lifetime4], -128);
        }
        if (10 == var5Lifetime4) {
          this.field_G[var4Lifetime4] = eb.a(-16257, this.field_G[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (42 == var5Lifetime4) {
          this.field_G[var4Lifetime4] = var6Lifetime3 + eb.a(-128, this.field_G[var4Lifetime4]);
        }
        if (var5Lifetime4 == 11) {
          this.field_T[var4Lifetime4] = eb.a(-16257, this.field_T[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_T[var4Lifetime4] = var6Lifetime3 + eb.a(-128, this.field_T[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_J[var4Lifetime4] = ic.a(this.field_J[var4Lifetime4], 1);
            if (var8 != 0) {
              this.field_J[var4Lifetime4] = eb.a(this.field_J[var4Lifetime4], -2);
            }
          } else {
            this.field_J[var4Lifetime4] = eb.a(this.field_J[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 < 64) {
            this.b(var4Lifetime4, (byte) 122);
            this.field_J[var4Lifetime4] = eb.a(this.field_J[var4Lifetime4], -3);
            if (var8 != 0) {
              this.field_J[var4Lifetime4] = ic.a(this.field_J[var4Lifetime4], 2);
            }
          } else {
            this.field_J[var4Lifetime4] = ic.a(this.field_J[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_S[var4Lifetime4] = (var6Lifetime3 << 7) + eb.a(127, this.field_S[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.field_S[var4Lifetime4] = eb.a(16256, this.field_S[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_S[var4Lifetime4] = 16384 + (eb.a(127, this.field_S[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_S[var4Lifetime4] = 16384 - (-eb.a(this.field_S[var4Lifetime4], 16256) - var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.c(-1, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a(var4Lifetime4, true);
        }
        if (var5Lifetime4 == 123) {
          this.c(var4Lifetime4, (byte) -109);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_S[var4Lifetime4];
          if (16384 == var7) {
            this.field_D[var4Lifetime4] = eb.a(-16257, this.field_D[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_S[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_D[var4Lifetime4] = var6Lifetime3 + eb.a(this.field_D[var4Lifetime4], -128);
          }
        }
        if (16 == var5Lifetime4) {
          this.field_R[var4Lifetime4] = eb.a(this.field_R[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_R[var4Lifetime4] = var6Lifetime3 + eb.a(this.field_R[var4Lifetime4], -128);
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, 32605);
            this.field_J[var4Lifetime4] = eb.a(this.field_J[var4Lifetime4], -5);
            if (var8 != 0) {
              this.field_J[var4Lifetime4] = ic.a(this.field_J[var4Lifetime4], 4);
            }
          } else {
            this.field_J[var4Lifetime4] = ic.a(this.field_J[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.d((var6Lifetime3 << 7) + (-16257 & this.field_N[var4Lifetime4]), var4Lifetime4, 97);
        }
        if (var5Lifetime4 == 49) {
          this.d(var6Lifetime3 + (-128 & this.field_N[var4Lifetime4]), var4Lifetime4, 42);
        }
        return;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (~this.field_B[param0] != ~param1) {
          this.field_B[param0] = param1;
          var4 = 0;
          while (var4 < 128) {
            this.field_P[param0][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param2 != 5174)) {
          this.field_y = (int[]) null;
        }

    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 >= -26) {
          this.field_r = -65;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_H[param1] = param2;
        this.field_F[param1] = eb.a(-128, param2);
        if (param0 != -1823) {
          return;
        }
        this.e(param1, param2, param0 ^ -4905);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_v.c()) {
            var4_int = this.field_E * this.field_v.field_d / du.field_k;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_O;
              if (0L <= -var5 + this.field_q) {
                this.field_O = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)((this.field_q + (-this.field_O + (long)var4_int - 1L)) / (long)var4_int);
              this.field_O = this.field_O + (long)var7 * (long)var4_int;
              this.field_s.b(param0, param1, var7);
              param2 = param2 - var7;
              this.d(18922);
              param1 = param1 + var7;
              if (!this.field_v.c() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_s.b(param0, param1, param2);
              return;
            }
          }
          this.field_s.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bs.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        uu var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param1 != 32605) {
          this.field_z = (int[]) null;
        }
        if ((this.field_J[param0] & 4) != 0) {
          var3 = (uu) (this.field_s.field_t.b(param1 - 32539));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~param0 == ~var3.field_y) {
              var3.field_t = 0;
            }
            var3 = (uu) (this.field_s.field_t.d((byte) 18));
          }
        }
    }

    private final void c(int param0, int param1) {
        uu var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -1) {
          this.field_v = (sh) null;
        }
        var3 = (uu) (this.field_s.field_t.b(param0 ^ -95));
        while (var3 != null) {
          if (var4 == 0) {
            if (param1 < 0 ||
              ~var3.field_y == ~param1) {
              if (null != var3.field_z) {
                var3.field_z.d(du.field_k / 100);
                if (var3.field_z.k()) {
                  this.field_s.field_o.b(var3.field_z);
                }
                var3.a(~param0);
              }
              if (var3.field_x < 0) {
                this.field_t[var3.field_y][var3.field_E] = null;
              }
              var3.b(false);
            }
            var3 = (uu) (this.field_s.field_t.d((byte) 18));
            continue;
          }
          break;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param0 <= 7) {
          this.field_F = (int[]) null;
        }
    }

    final synchronized void a(boolean param0, int param1, int param2, int param3, tv param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.field_v.c()) {
          this.a(param5, param4, 77);
          return;
        }
        try {
          this.field_M = param5 ? true : false;
          this.field_A = param0 ? true : false;
          this.field_I = param4;
          var7_int = this.field_v.a(this.field_O) * param3;
          if (param2 != 7094) {
            this.c(-41, (byte) 86);
          }
          var8 = param1 * this.field_v.field_d;
          var7_int = var8 * ((-1 + var8 + var7_int) / var8);
          this.field_u = ((param3 >> 1) + var7_int) / param3;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "bs.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 0) {
          this.b(-55, (byte) 105);
        }
        this.a(true, (byte) 104);
    }

    final synchronized void a(byte param0) {
        int var3 = 0;
        td var4 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var4 = (td) (this.field_p.a(79));
        while (var4 != null) {
          var4.d((byte) -36);
          var4 = (td) (this.field_p.a(true));
          if (var3 != 0) {
            return;
          }
        }
        if (param0 != 28) {
          this.field_y = (int[]) null;
        }
        return;
    }

    final synchronized void b(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 0) {
          discarded$0 = this.a(true, (uu) null);
        }
        this.field_E = param0;
    }

    private final void d(int param0, int param1, int param2) {
        this.field_N[param1] = param0;
        if (param2 <= 9) {
          this.a(-89, (byte) -88, -127);
        }
        this.field_x[param1] = (int)(0.5 + Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0 ^ -1968, param2, param1);
        if (param0 != 177) {
          this.field_z = (int[]) null;
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        this.field_v.e();
        this.field_I = null;
        if (param1 < 0) {
          this.field_q = 79L;
        }
        this.a(param0, true);
    }

    private final void c(int param0, byte param1) {
        uu var3;
        int var4;
        int stackIn_11_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = (uu) (this.field_s.field_t.b(-96));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_11_0 = param0;
          if (var4 == 0) {
            if ((stackIn_11_0 < 0 ||
              ~var3.field_y == ~param0) &&
              var3.field_x < 0) {
              this.field_t[var3.field_y][var3.field_E] = null;
              var3.field_x = 0;
            }
            var3 = (uu) (this.field_s.field_t.d((byte) 18));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = param1;
        }
        if (stackIn_11_0 >= -15) {
          this.c(126, 58);
        }
        return;
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param1 < 0) {
          var4 = 0;
          while (16 > var4) {
            this.field_y[var4] = param2;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5 != 0)) {
            this.field_y[param1] = param2;
          }
        } else {
          this.field_y[param1] = param2;
        }
        if (param0 >= -42) {
          this.c();
        }
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, tv param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.a(param2, (byte) 69);
          this.field_v.a(param3.field_k);
          this.field_O = 0L;
          stackIn_4_1 = (param0);
          this.field_M = stackIn_4_1;
          var5_int = this.field_v.f();
          var6 = 0;
          if (!param1) {
            this.field_B = (int[]) null;
          }
          while (var5_int > var6) {
            this.field_v.b(var6);
            this.field_v.a(var6);
            this.field_v.c(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_Q = this.field_v.b();
          this.field_C = this.field_v.field_c[this.field_Q];
          this.field_q = this.field_v.d(this.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("bs.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 >= -38) {
          bs.f(-53);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_v.c()) {
          var2 = this.field_E * this.field_v.field_d / du.field_k;
          while (true) {
            var3 = this.field_O + (long)param0 * (long)var2;
            if (-var3 + this.field_q >= 0L) {
              this.field_O = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((this.field_q - this.field_O + ((long)var2 - 1L)) / (long)var2);
            this.field_O = this.field_O + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_s.a(var5);
            this.d(18922);
            if (!this.field_v.c() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_s.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_s.a(param0);
        }

    }

    public bs() {
        this.field_R = new int[16];
        this.field_T = new int[16];
        this.field_B = new int[16];
        this.field_F = new int[16];
        this.field_H = new int[16];
        this.field_y = new int[16];
        this.field_P = new uu[16][128];
        this.field_r = 256;
        this.field_w = new int[16];
        this.field_E = 1000000;
        this.field_L = new int[16];
        this.field_N = new int[16];
        this.field_t = new uu[16][128];
        this.field_S = new int[16];
        this.field_x = new int[16];
        this.field_G = new int[16];
        this.field_K = new int[16];
        this.field_D = new int[16];
        this.field_J = new int[16];
        this.field_z = new int[16];
        this.field_v = new sh();
        this.field_s = new rh(this);
        this.field_p = new te(128);
        this.a((byte) -127, -1, 256);
        this.a(true, true);
    }

    static {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
