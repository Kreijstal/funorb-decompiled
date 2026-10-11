/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ug extends ic {
    private int[] field_n;
    private rl field_R;
    private int[] field_z;
    private cc[][] field_s;
    private int[] field_q;
    int[] field_C;
    private int[] field_F;
    int[] field_E;
    private int[] field_y;
    private int[] field_u;
    private tg field_O;
    private int[] field_U;
    private int[] field_r;
    static Random field_m;
    static boolean field_x;
    private int field_S;
    static String field_T;
    static v field_I;
    private int[] field_Q;
    int[] field_B;
    private int[] field_t;
    private int[] field_D;
    private int[] field_A;
    static String field_p;
    private cc[][] field_G;
    private int[] field_o;
    private int field_M;
    private boolean field_w;
    private int field_v;
    private long field_P;
    private long field_J;
    private am field_H;
    private int field_N;
    private ok field_K;
    private int field_L;
    private boolean field_l;

    final boolean a(int param0, cc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_D != null) {
            if (param0 <= -102) {
              return false;
            }
            return true;
          }
          if (param1.field_k < 0) {
            return true;
          }
          param1.a(-16175);
          if (param1.field_z > 0 &&
            this.field_G[param1.field_u][param1.field_z] == param1) {
            this.field_G[param1.field_u][param1.field_z] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final int b(cc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16385) {
            this.field_N = -115;
          }
          var3_int = this.field_y[param0.field_u];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((-param0.field_v + 128) * (-var3_int + 16384) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = param0.field_v * var3_int + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ug.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized ic a() {
        return (ic) ((Object) this.field_H);
    }

    final boolean a(int param0, int[] param1, int param2, cc param3, int param4) {
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ri var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          param3.field_l = id.field_d / 100;
          if (param3.field_k >= 0 && (null == param3.field_D ||
            param3.field_D.m())) {
            param3.d(param2 ^ 9);
            param3.a(-16175);
            if (param3.field_z > 0) {
              if (param3 != this.field_G[param3.field_u][param3.field_z]) {
                return true;
              }
              this.field_G[param3.field_u][param3.field_z] = null;
            }
            return true;
          }
          var6_int = param3.field_x;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_D[param3.field_u]));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_x = var6_int;
          }
          param3.field_D.h(this.b(950080514, param3));
          var7 = param3.field_q;
          var8 = 0;
          param3.field_j = param3.field_j + var7.field_k;
          param3.field_A = param3.field_A + 1;
          var9 = 0.000005086263020833333 * (double)((param3.field_F - 60 << 8) + (param3.field_x * param3.field_s >> 12));
          if (var7.field_i > 0) {
            boolean decompiledSharedTail1 = !(0 >= var7.field_j);
            if (!decompiledSharedTail1) {
              param3.field_m = param3.field_m + 128;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              param3.field_m = param3.field_m + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
            }
            if (819200 <= param3.field_m * var7.field_i) {
              var8 = 1;
            }
          }
          if (null != var7.field_a) {
            if (var7.field_n > 0) {
              param3.field_E = param3.field_E + (int)(Math.pow(2.0, var9 * (double)var7.field_n) * 128.0 + 0.5);
              if (var11 != 0) {
                param3.field_E = param3.field_E + 128;
              }
            } else {
              param3.field_E = param3.field_E + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param3.field_n < -2 + var7.field_a.length) {
                stackIn_35_0 = ~(65280 & var7.field_a[param3.field_n + 2] << 8);
                stackIn_35_1 = ~param3.field_E;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_35_0 > stackIn_35_1)) {
                  param3.field_n = param3.field_n + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_35_0 = var7.field_a.length - 2;
                stackIn_35_1 = param3.field_n;
              }
              if (stackIn_35_0 != stackIn_35_1) {
                break;
              }
              if (var7.field_a[1 + param3.field_n] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param3.field_k >= 0 &&
            null != var7.field_m &&
            (1 & this.field_C[param3.field_u]) == 0 && (!(param3.field_z >= 0) ||
            param3 != this.field_G[param3.field_u][param3.field_z])) {
            boolean decompiledSharedTail0 = !(0 >= var7.field_g);
            if (!decompiledSharedTail0) {
              param3.field_k = param3.field_k + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_k = param3.field_k + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if ((-2 + var7.field_m.length) > param3.field_r) {
                stackIn_54_0 = ~((255 & var7.field_m[param3.field_r + 2]) << 8);
                stackIn_54_1 = ~param3.field_k;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_54_0 > stackIn_54_1)) {
                  param3.field_r = param3.field_r + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_54_0 = param3.field_r;
                stackIn_54_1 = var7.field_m.length - 2;
              }
              if (stackIn_54_0 != stackIn_54_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param3.field_D.a(param3.field_l, this.a(param3, 15), this.b(param3, -16385));
            if (param2 == -128) {
              return false;
            }
            return false;
          }
          param3.field_D.k(param3.field_l);
          if (param1 == null) {
            param3.field_D.d(param4);
            if (var11 != 0) {
              param3.field_D.b(param1, param0, param4);
            }
          } else {
            param3.field_D.b(param1, param0, param4);
          }
          if (param3.field_D.g()) {
            this.field_H.field_r.a(param3.field_D);
          }
          param3.d(-101);
          if (0 <= param3.field_k) {
            param3.a(-16175);
            if (param3.field_z > 0 &&
              param3 == this.field_G[param3.field_u][param3.field_z]) {
              this.field_G[param3.field_u][param3.field_z] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_79_0 = var6;
          stackIn_79_1 = new StringBuilder().append("ug.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        cc var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != -16596) {
          this.d(-16);
        }
        if ((this.field_C[param0] & 2) != 0) {
          var3 = (cc) (this.field_H.field_q.h(param1 + 5445));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~var3.field_u == ~param0 &&
              this.field_s[param0][var3.field_F] == null &&
              0 > var3.field_k) {
              var3.field_k = 0;
            }
            var3 = (cc) (this.field_H.field_q.e(0));
          }
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_R.a();
        if (param1 > -113) {
          return;
        }
        this.field_K = null;
        this.a(false, param0);
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_10_0 = false;
        if (param0 != -1) {
          field_T = (String) null;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(97 > param1) &&
          !(param1 > 122)));
        return stackIn_10_0;
    }

    private final int b(int param0, cc param1) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_h + (param1.field_x * param1.field_s >> 12);
          var3_int = var3_int + ((-8192 + this.field_A[param1.field_u]) * this.field_z[param1.field_u] >> 12);
          var4 = param1.field_q;
          if (0 < var4.field_k && (!(var4.field_l <= 0) ||
            this.field_q[param1.field_u] > 0)) {
            var5 = var4.field_l << 2;
            var6 = var4.field_p << 1;
            if (var6 > param1.field_A) {
              var5 = param1.field_A * var5 / var6;
            }
            var5 = var5 + (this.field_q[param1.field_u] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_j));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_C.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)id.field_d + 0.5);
          if (param0 == 950080514) {
            stackIn_14_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
            return stackIn_14_0;
          }
          stackIn_10_0 = -20;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ug.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(cc param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -66 % ((param2 - 41) / 36);
          var5 = param0.field_C.field_i.length;
          boolean decompiledSharedTail0 = (!(param1) ||
            !(param0.field_C.field_m));
          if (!decompiledSharedTail0) {
            var7 = var5 + var5 - param0.field_C.field_k;
            var6 = (int)((long)this.field_E[param0.field_u] * (long)var7 >> 6);
            var5 = var5 << 8;
            if (var6 >= var5) {
              var6 = -var6 - 1 + (var5 + var5);
              param0.field_D.a(true);
            }
            decompiledSharedTail0 = (DrPhlogistonSavesTheEarth.field_D);
          }
          if (decompiledSharedTail0) {
            var6 = (int)((long)this.field_E[param0.field_u] * (long)var5 >> 6);
          }
          param0.field_D.g(var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ug.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, nh[] param2, int param3) {
        try {
          if (param3 != 37) {
            ug.a((String) null, -50);
          }
          cb.field_a = new gk(param2);
          df.field_h = param0;
          di.field_d = param1;
          nl.d(-1321745375);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ug.KA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized boolean e(int param0) {
        if (param0 != 16) {
          this.field_y = (int[]) null;
        }
        return this.field_R.g();
    }

    private final void b(int param0, int param1) {
        cc var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if ((4 & this.field_C[param0]) != 0) {
          var3 = (cc) (this.field_H.field_q.h(param1 ^ -12545));
          while (var3 != null) {
            stackIn_10_0 = var3.field_u;
            stackIn_10_1 = param0;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_10_0 == stackIn_10_1) {
              var3.field_i = 0;
            }
            var3 = (cc) (this.field_H.field_q.e(0));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_10_0 = param1;
          stackIn_10_1 = 6798;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.field_w = true;
        }
    }

    private final void a(int param0, boolean param1) {
        cc var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) (this.field_H.field_q.h(-11151));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_10_0 = ~param0;
          stackIn_10_1 = -1;
          if (var4 == 0) {
            if ((stackIn_10_0 > stackIn_10_1 ||
              ~var3.field_u == ~param0) &&
              var3.field_k < 0) {
              this.field_s[var3.field_u][var3.field_F] = null;
              var3.field_k = 0;
            }
            var3 = (cc) (this.field_H.field_q.e(0));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param1 ? 1 : 0;
          stackIn_10_1 = 1;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.c(-123, 19);
        }
        return;
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param1) {
          this.field_S = 17;
        }
    }

    private final void a(int param0, int param1) {
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 > param1) {
          param1 = 0;
          do {
            if (16 <= param1) {
              return;
            }
            this.a(12800, param1);
            param1++;
          } while (var4 == 0);
          return;
        }
        this.field_u[param1] = param0;
        this.field_y[param1] = 8192;
        this.field_o[param1] = 16383;
        this.field_A[param1] = 8192;
        this.field_q[param1] = 0;
        this.field_D[param1] = 8192;
        this.c(param1, -16596);
        this.b(param1, 6798);
        this.field_C[param1] = 0;
        this.field_n[param1] = 32767;
        this.field_z[param1] = 256;
        this.field_E[param1] = 0;
        this.b(8192, -1, param1);
    }

    private final synchronized void a(boolean param0, boolean param1, ok param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          this.a(param0, -115);
          this.field_R.a(param2.field_h);
          stackIn_4_1 = (param1);
          this.field_w = stackIn_4_1;
          this.field_J = 0L;
          var5_int = this.field_R.c();
          if (param3 != -1) {
            this.b(42, 33);
          }
          var6 = 0;
          while (var6 < var5_int) {
            this.field_R.f(var6);
            this.field_R.e(var6);
            this.field_R.c(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_N = this.field_R.d();
          this.field_v = this.field_R.field_h[this.field_N];
          this.field_P = this.field_R.d(this.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ug.SA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static vc a(String param0, int param1) {
        RuntimeException var2 = null;
        vc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ug.a(14, 3, (nh[]) null, -32);
          }
          stackIn_3_0 = new vc(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ug.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = this.field_N;
        var3 = this.field_v;
        var4 = this.field_P;
        if (null != this.field_K &&
          this.field_L == var3) {
          this.a(this.field_l, this.field_w, this.field_K, -1);
          this.g(32675);
          return;
        }
        while (true) {
          stackIn_5_0 = var3;
          stackIn_5_1 = this.field_v;
          L3: {
            if (stackIn_5_0 == stackIn_5_1) {
              L6: while (true) {
                stackIn_28_0 = this.field_R.field_h[var2];
                stackIn_28_1 = var3;
                if (var7 != 0) {
                  break L3;
                }
                if (stackIn_28_0 == stackIn_28_1) {
                  this.field_R.f(var2);
                  var6 = this.field_R.b(var2);
                  stackIn_5_0 = 1;
                  stackIn_5_1 = var6;
                  if (stackIn_5_0 == stackIn_5_1) {
                    this.field_R.b();
                    this.field_R.c(var2);
                    if (!this.field_R.e() &&
                      var7 == 0) {
                      break L6;
                    }
                    if (null != this.field_K) {
                      this.a(this.field_K, this.field_w, (byte) 120);
                      this.g(32675);
                      return;
                    }
                    if (this.field_w &&
                      var3 != 0) {
                      this.field_R.a(var4);
                      break L6;
                    }
                    this.a(false, true);
                    this.field_R.a();
                    return;
                  }
                  if (0 != (128 & var6)) {
                    this.d(var6, 32696);
                  }
                  this.field_R.e(var2);
                  this.field_R.c(var2);
                  continue;
                }
                break;
              }
              var2 = this.field_R.d();
              var3 = this.field_R.field_h[var2];
              var4 = this.field_R.d(var3);
              continue;
            }
            stackIn_28_0 = param0;
            stackIn_28_1 = 32675;
          }
          if (stackIn_28_0 != stackIn_28_1) {
            this.field_C = (int[]) null;
          }
          this.field_P = var4;
          this.field_N = var2;
          this.field_v = var3;
          if (this.field_K != null &&
            this.field_L < var3) {
            this.field_N = -1;
            this.field_v = this.field_L;
            this.field_P = this.field_R.d(this.field_v);
          }
          return;
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
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var5Lifetime1Lifetime3;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var4Lifetime1Lifetime2Lifetime1;
        int var4Lifetime1Lifetime2Lifetime2;
        int var5Lifetime1Lifetime2Lifetime1;
        int var5Lifetime1Lifetime2Lifetime2;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = param0 & 240;
        if (param1 != 32696) {
          this.d();
        }
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (param0 & 32538) >> 8;
          var6 = (param0 & 8379937) >> 16;
          this.a((byte) 91, var5, var4, var6);
          return;
        }
        L1: {
          if (var3 == 144) {
            var4Lifetime1 = param0 & 15;
            var5Lifetime1 = (32547 & param0) >> 8;
            var6Lifetime1 = (8346333 & param0) >> 16;
            if (0 >= var6Lifetime1) {
              this.a((byte) 91, var5Lifetime1, var4Lifetime1, 64);
              if (var8 == 0) {
                break L1;
              }
            }
            this.b((byte) 15, var6Lifetime1, var5Lifetime1, var4Lifetime1);
            return;
          }
          if (var3 == 160) {
            var4Lifetime1Lifetime1 = 15 & param0;
            var5Lifetime1Lifetime1 = 127 & param0 >> 8;
            var6Lifetime1Lifetime1 = (8334836 & param0) >> 16;
            this.a(var6Lifetime1Lifetime1, param1 ^ 32327, var5Lifetime1Lifetime1, var4Lifetime1Lifetime1);
            return;
          }
          if (176 != var3) {
            if (var3 == 192) {
              var4Lifetime1Lifetime2 = param0 & 15;
              var5Lifetime1Lifetime2 = (param0 & 32596) >> 8;
              this.c(this.field_t[var4Lifetime1Lifetime2] + var5Lifetime1Lifetime2, 0, var4Lifetime1Lifetime2);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1Lifetime2Lifetime1 = 15 & param0;
              var5Lifetime1Lifetime2Lifetime1 = (param0 & 32689) >> 8;
              this.a(var5Lifetime1Lifetime2Lifetime1, false, var4Lifetime1Lifetime2Lifetime1);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1Lifetime2Lifetime2 = param0 & 15;
              var5Lifetime1Lifetime2Lifetime2 = (param0 >> 8 & 127) + ((8323499 & param0) >> 9);
              this.e(var4Lifetime1Lifetime2Lifetime2, var5Lifetime1Lifetime2Lifetime2, -128);
              return;
            }
            var3 = param0 & 255;
            if (255 != var3) {
              return;
            }
            this.a(false, true);
            return;
          }
          var4Lifetime1Lifetime3 = param0 & 15;
          var5Lifetime1Lifetime3 = (param0 & 32675) >> 8;
          var6Lifetime1Lifetime2 = (8325095 & param0) >> 16;
          if (var5Lifetime1Lifetime3 == 0) {
            this.field_t[var4Lifetime1Lifetime3] = rk.a(this.field_t[var4Lifetime1Lifetime3], -2080769) + (var6Lifetime1Lifetime2 << 14);
          }
          if (var5Lifetime1Lifetime3 == 32) {
            this.field_t[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + rk.a(-16257, this.field_t[var4Lifetime1Lifetime3]);
          }
          if (var5Lifetime1Lifetime3 == 1) {
            this.field_q[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + rk.a(this.field_q[var4Lifetime1Lifetime3], -16257);
          }
          if (var5Lifetime1Lifetime3 == 33) {
            this.field_q[var4Lifetime1Lifetime3] = rk.a(-128, this.field_q[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
          }
          if (var5Lifetime1Lifetime3 == 5) {
            this.field_D[var4Lifetime1Lifetime3] = rk.a(this.field_D[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 37) {
            this.field_D[var4Lifetime1Lifetime3] = rk.a(this.field_D[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
          }
          if (7 == var5Lifetime1Lifetime3) {
            this.field_u[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + rk.a(this.field_u[var4Lifetime1Lifetime3], -16257);
          }
          if (var5Lifetime1Lifetime3 == 39) {
            this.field_u[var4Lifetime1Lifetime3] = rk.a(this.field_u[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
          }
          if (var5Lifetime1Lifetime3 == 10) {
            this.field_y[var4Lifetime1Lifetime3] = rk.a(-16257, this.field_y[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 42) {
            this.field_y[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + rk.a(this.field_y[var4Lifetime1Lifetime3], -128);
          }
          if (var5Lifetime1Lifetime3 == 11) {
            this.field_o[var4Lifetime1Lifetime3] = rk.a(-16257, this.field_o[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 43) {
            this.field_o[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + rk.a(-128, this.field_o[var4Lifetime1Lifetime3]);
          }
          switch (var5Lifetime1Lifetime3) {
            case 64:
              if (var6Lifetime1Lifetime2 < 64) {
                this.field_C[var4Lifetime1Lifetime3] = rk.a(this.field_C[var4Lifetime1Lifetime3], -2);
                if (var8 != 0) {
                  this.field_C[var4Lifetime1Lifetime3] = li.a(this.field_C[var4Lifetime1Lifetime3], 1);
                }
              } else {
                this.field_C[var4Lifetime1Lifetime3] = li.a(this.field_C[var4Lifetime1Lifetime3], 1);
              }
              break;
            case 65:
              if (var6Lifetime1Lifetime2 < 64) {
                this.c(var4Lifetime1Lifetime3, -16596);
                this.field_C[var4Lifetime1Lifetime3] = rk.a(this.field_C[var4Lifetime1Lifetime3], -3);
                if (var8 != 0) {
                  this.field_C[var4Lifetime1Lifetime3] = li.a(this.field_C[var4Lifetime1Lifetime3], 2);
                }
              } else {
                this.field_C[var4Lifetime1Lifetime3] = li.a(this.field_C[var4Lifetime1Lifetime3], 2);
              }
              break;
            case 99:
              this.field_n[var4Lifetime1Lifetime3] = rk.a(127, this.field_n[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
              break;
            case 98:
              this.field_n[var4Lifetime1Lifetime3] = rk.a(16256, this.field_n[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
              break;
            case 101:
              this.field_n[var4Lifetime1Lifetime3] = rk.a(this.field_n[var4Lifetime1Lifetime3], 127) + 16384 + (var6Lifetime1Lifetime2 << 7);
              break;
            case 100:
              this.field_n[var4Lifetime1Lifetime3] = rk.a(16256, this.field_n[var4Lifetime1Lifetime3]) + (16384 + var6Lifetime1Lifetime2);
              break;
            case 120:
              this.b(var4Lifetime1Lifetime3, (byte) 6);
              break;
            case 121:
              this.a(param1 ^ 19896, var4Lifetime1Lifetime3);
              break;
            case 123:
              this.a(var4Lifetime1Lifetime3, true);
              break;
            case 6:
              var7 = this.field_n[var4Lifetime1Lifetime3];
              if (16384 == var7) {
                this.field_z[var4Lifetime1Lifetime3] = rk.a(this.field_z[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
              }
              break;
            case 38:
              var7Lifetime1 = this.field_n[var4Lifetime1Lifetime3];
              if (var7Lifetime1 == 16384) {
                this.field_z[var4Lifetime1Lifetime3] = rk.a(-128, this.field_z[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
              }
              break;
            case 16:
              this.field_E[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + rk.a(this.field_E[var4Lifetime1Lifetime3], -16257);
              break;
            case 48:
              this.field_E[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + rk.a(-128, this.field_E[var4Lifetime1Lifetime3]);
              break;
            case 81:
              if (64 <= var6Lifetime1Lifetime2) {
                this.field_C[var4Lifetime1Lifetime3] = li.a(this.field_C[var4Lifetime1Lifetime3], 4);
                if (var8 != 0) {
                  this.b(var4Lifetime1Lifetime3, 6798);
                  this.field_C[var4Lifetime1Lifetime3] = rk.a(this.field_C[var4Lifetime1Lifetime3], -5);
                }
              } else {
                this.b(var4Lifetime1Lifetime3, 6798);
                this.field_C[var4Lifetime1Lifetime3] = rk.a(this.field_C[var4Lifetime1Lifetime3], -5);
              }
              break;
            case 17:
              this.b((-16257 & this.field_U[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7), -1, var4Lifetime1Lifetime3);
              break;
            case 49:
              this.b((-128 & this.field_U[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2, param1 - 32697, var4Lifetime1Lifetime3);
              return;
            default:
              break;
          }
        }
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
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (this.field_R.g()) {
            var4_int = this.field_R.field_i * this.field_M / id.field_d;
            while (true) {
              var5 = this.field_J + (long)param2 * (long)var4_int;
              if (-var5 + this.field_P >= 0L) {
                this.field_J = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)((-1L + ((long)var4_int + (this.field_P - this.field_J))) / (long)var4_int);
              this.field_J = this.field_J + (long)var7 * (long)var4_int;
              this.field_H.b(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.g(32675);
              if (!this.field_R.g() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_H.b(param0, param1, param2);
              return;
            }
          }
          this.field_H.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ug.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized ic c() {
        return null;
    }

    private final void b(int param0, byte param1) {
        cc var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) (this.field_H.field_q.h(-11151));
        if (param1 < 3) {
          return;
        }
        while (var3 != null) {
          if (var4 == 0) {
            if (param0 < 0 ||
              ~var3.field_u == ~param0) {
              if (var3.field_D != null) {
                var3.field_D.k(id.field_d / 100);
                if (var3.field_D.g()) {
                  this.field_H.field_r.a(var3.field_D);
                }
                var3.d(-79);
              }
              if (var3.field_k < 0) {
                this.field_s[var3.field_u][var3.field_F] = null;
              }
              var3.a(-16175);
            }
            var3 = (cc) (this.field_H.field_q.e(0));
            continue;
          }
          break;
        }
    }

    final synchronized void b(byte param0) {
        int discarded$1 = 0;
        ig var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = (ig) (this.field_O.b(-1));
        while (var2 != null) {
          var2.d(param0 ^ 107);
          var2 = (ig) (this.field_O.a((byte) -114));
          if (var3 != 0) {
            return;
          }
        }
        if (param0 != 47) {
          discarded$1 = this.b(-122, (cc) null);
        }
        return;
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
          this.a(-1, true);
        }
        if (param1 ||
          var4 != 0) {
          this.b(-1, (byte) 21);
        }
        this.a(12800, -1);
        var3 = 0;
        do {
          if (var3 >= 16) {
            if (param0) {
              field_T = (String) null;
            }
            break;
          }
          this.field_r[var3] = this.field_F[var3];
          var3++;
        } while (var4 == 0);
        var5 = 0;
        var3 = var5;
        while (var5 < 16) {
          this.field_t[var5] = rk.a(this.field_F[var5], -128);
          var5++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final static int f(int param0) {
        if (param0 <= 85) {
          ug.c((byte) 77);
        }
        return rd.field_z;
    }

    final synchronized void a(byte param0) {
        this.a(true, -122);
        if (param0 >= -86) {
          this.field_G = (cc[][]) null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_F[param0] = param2;
        this.field_t[param0] = rk.a(-128, param2);
        this.c(param2, 0, param0);
        if (param1 != 26818) {
          this.field_J = 40L;
        }
    }

    private final void e(int param0, int param1, int param2) {
        this.field_A[param0] = param1;
        if (param2 > -125) {
          this.b(-86, -27, 1);
        }
    }

    private final int a(cc param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ri var9 = null;
        ri var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (param1 != 15) {
            this.field_L = -99;
          }
          if (this.field_Q[param0.field_u] == 0) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var9 = param0.field_q;
          var10 = var9;
          var4 = this.field_u[param0.field_u] * this.field_o[param0.field_u] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = param0.field_t * var4 + 16384 >> 15;
          var4 = 128 + var4 * this.field_S >> 8;
          var4 = var4 * this.field_Q[param0.field_u] + 128 >> 8;
          if (var10.field_i > 0) {
            var4 = (int)(Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_m)) * (double)var4 + 0.5);
          }
          if (var10.field_a != null) {
            var5 = param0.field_E;
            var6 = var10.field_a[param0.field_n + 1];
            if (param0.field_n < -2 + var10.field_a.length) {
              var7 = (255 & var9.field_a[param0.field_n]) << 8;
              var8 = (255 & var10.field_a[param0.field_n + 2]) << 8;
              var6 = var6 + (-var7 + var5) * (-var6 + var10.field_a[param0.field_n + 3]) / (-var7 + var8);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param0.field_k > 0 &&
            var10.field_m != null) {
            var5Lifetime1 = param0.field_k;
            var6Lifetime1 = var10.field_m[1 + param0.field_r];
            if (param0.field_r < var10.field_m.length - 2) {
              var7Lifetime1 = (var9.field_m[param0.field_r] & 255) << 8;
              var8Lifetime1 = (255 & var10.field_m[param0.field_r + 2]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var7Lifetime1 + var5Lifetime1) * (var10.field_m[param0.field_r + 3] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ug.L(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.a(param0, 26818, param1);
        int var4 = 19 / ((70 - param2) / 34);
    }

    private final void b(int param0, int param1, int param2) {
        this.field_U[param2] = param0;
        if (param1 != -1) {
          this.field_S = 32;
        }
        this.field_B[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 511) {
          this.a(89, -46, -107);
        }
    }

    final synchronized void d(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_R.g()) {
          var2 = this.field_R.field_i * this.field_M / id.field_d;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_J;
            if (-var3 + this.field_P >= 0L) {
              this.field_J = var3;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              break;
            }
            var5 = (int)((-1L + ((long)var2 + (this.field_P - this.field_J))) / (long)var2);
            this.field_J = this.field_J + (long)var2 * (long)var5;
            this.field_H.d(var5);
            param0 = param0 - var5;
            this.g(32675);
            if (!this.field_R.g() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_H.d(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          this.field_H.d(param0);
        }

    }

    final synchronized void a(ok param0, boolean param1, byte param2) {
        if (param2 <= 77) {
          return;
        }
        try {
          this.a(true, param1, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ug.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cc var6;
        int var7;
        cc var8;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 91) {
          this.b((byte) 92, 20, -113, -69);
        }
        var8 = this.field_s[param2][param1];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_s[param2][param1] = null;
        if ((2 & this.field_C[param2]) != 0) {
          var6 = (cc) (this.field_H.field_q.h(-11151));
          while (true) {
            if (var6 != null) {
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (var8.field_u == var6.field_u &&
                var6.field_k < 0 &&
                var6 != var8) {
                var8.field_k = 0;
              } else {
                var6 = (cc) (this.field_H.field_q.e(0));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_k = 0;
          }
        } else {
          var8.field_k = 0;
        }

    }

    private final void b(byte param0, int param1, int param2, int param3) {
        cc stackIn_19_1 = null;
        boolean stackIn_20_2 = false;
        cc var5;
        int var6_int;
        vk var6;
        cc var7;
        cc var8;
        int var9;
        ig var10;
        ig var11;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.a((byte) 91, param2, param3, 64);
        if ((this.field_C[param3] & 2) != 0) {
          var5 = (cc) (this.field_H.field_q.b(param0 ^ 2861));
          while (var5 != null) {
            if (param3 == var5.field_u &&
              0 > var5.field_k) {
              this.field_s[param3][var5.field_F] = null;
              this.field_s[param3][param2] = var5;
              var6_int = var5.field_h + (var5.field_s * var5.field_x >> 12);
              var5.field_h = var5.field_h + (param2 - var5.field_F << 8);
              var5.field_F = param2;
              var5.field_x = 4096;
              var5.field_s = -var5.field_h + var6_int;
              return;
            }
            var5 = (cc) (this.field_H.field_q.c(-113));
            if (var9 == 0) {
              continue;
            }
            break;
          }
        }
        var10 = (ig) (this.field_O.a(true, (long)this.field_r[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_j[param2];
        if (var6 == null) {
          return;
        }
        var7 = new cc();
        var7.field_u = param3;
        var7.field_C = var6;
        var7.field_o = var11;
        if (param0 != 15) {
          return;
        }
        var7.field_q = var10.field_q[param2];
        var7.field_z = var10.field_n[param2];
        var7.field_F = param2;
        var7.field_t = 1024 + var11.field_l * (param1 * param1 * var10.field_m[param2]) >> 11;
        var7.field_v = 255 & var10.field_s[param2];
        var7.field_h = -(var10.field_p[param2] & 32767) + (param2 << 8);
        var7.field_r = 0;
        var7.field_k = -1;
        var7.field_n = 0;
        var7.field_E = 0;
        var7.field_m = 0;
        if (this.field_E[param3] == 0) {
          var7.field_D = ag.b(var6, this.b(950080514, var7), this.a(var7, 15), this.b(var7, -16385));
          if (var9 != 0) {
            var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7, -16385));
            stackIn_19_1 = var7;
            stackIn_20_2 = !(var10.field_p[param2] >= 0);
            this.a(stackIn_19_1, stackIn_20_2, (byte) 101);
          }
        } else {
          var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7, -16385));
          stackIn_19_1 = var7;
          stackIn_20_2 = !(var10.field_p[param2] >= 0);
          this.a(stackIn_19_1, stackIn_20_2, (byte) 101);
        }
        if (var10.field_p[param2] < 0) {
          var7.field_D.f(-1);
        }
        if (var7.field_z >= 0) {
          var8 = this.field_G[param3][var7.field_z];
          if (var8 != null &&
            0 > var8.field_k) {
            this.field_s[param3][var8.field_F] = null;
            var8.field_k = 0;
          }
          this.field_G[param3][var7.field_z] = var7;
        }
        this.field_H.field_q.a(var7, 255);
        this.field_s[param3][param2] = var7;
        return;
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != this.field_r[param2]) {
          this.field_r[param2] = param0;
          var4 = 0;
          while (128 > var4) {
            this.field_G[param2][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param1 != 0)) {
          field_I = (v) null;
        }

    }

    private final synchronized void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != 70) {
          ug.a(-61, '\027');
        }
        if (param0 >= 0) {
          this.field_Q[param0] = param2;
        }
        if (param0 < 0 ||
          var5 != 0) {
          var4 = 0;
          while (16 > var4) {
            this.field_Q[var4] = param2;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    final synchronized boolean a(int param0, vj param1, int param2, ok param3, cf param4) {
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
        ga var8 = null;
        int var9 = 0;
        ig var10 = null;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          param3.a();
          var6_int = 1;
          var7 = null;
          if (param2 < param0) {
            var7 = new int[]{param0};
          }
          var8 = (ga) (param3.field_i.b(-1));
          L2: while (true) {
            if (var8 != null) {
              var9 = (int)var8.field_g;
              var10 = (ig) (this.field_O.a(true, (long)var9));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var10 == null) {
                  var10 = u.a(param1, 0, var9);
                  if (var10 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_O.a(var10, (long)var9, -1);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!var10.a((int[]) (var7), 103, param4, var8.field_h))) {
                  var6_int = 0;
                }
                var8 = (ga) (param3.field_i.a((byte) -114));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break L2;
              }
            }
            param3.b();
            break;
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ug.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -13) {
          this.a(22, -65, -100, -116);
        }
        this.field_S = param0;
    }

    final static sa[] c(byte param0) {
        if (param0 != -23) {
          field_m = (Random) null;
        }
        return new sa[]{oh.field_c, ei.field_n, cd.field_c, pi.field_N, vb.field_q, qj.field_b, db.field_d, b.field_i, wd.field_d, sc.field_d, cm.field_P, lb.field_z, bc.field_a, vj.field_d};
    }

    public static void h(int param0) {
        field_T = null;
        field_p = null;
        if (param0 != -921185753) {
          ug.h(38);
        }
        field_I = null;
        field_m = null;
    }

    public ug() {
        this.field_n = new int[16];
        this.field_z = new int[16];
        this.field_C = new int[16];
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_q = new int[16];
        this.field_U = new int[16];
        this.field_y = new int[16];
        this.field_E = new int[16];
        this.field_S = 256;
        this.field_B = new int[16];
        this.field_t = new int[16];
        this.field_r = new int[16];
        this.field_s = new cc[16][128];
        this.field_D = new int[16];
        this.field_A = new int[16];
        this.field_Q = new int[16];
        this.field_G = new cc[16][128];
        this.field_o = new int[16];
        this.field_M = 1000000;
        this.field_R = new rl();
        this.field_H = new am(this);
        this.field_O = new tg(128);
        this.a(-1, (byte) 70, 256);
        this.a(false, true);
    }

    static {
        field_m = new Random(2684L);
        field_x = false;
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_T = "Checking";
    }
}
