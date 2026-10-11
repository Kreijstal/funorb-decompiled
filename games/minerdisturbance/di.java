/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class di extends um {
    private int field_Q;
    private int[] field_P;
    static String field_cb;
    private cg[][] field_gb;
    static int[] field_V;
    private int[] field_w;
    static int field_K;
    private int field_r;
    private int[] field_db;
    private int[] field_S;
    private int[] field_H;
    private tg field_F;
    static cl field_D;
    static ea field_ab;
    private int[] field_I;
    private int[] field_R;
    private int[] field_y;
    private int[] field_B;
    static gi field_O;
    static int field_Z;
    int[] field_Y;
    private int[] field_T;
    private nl field_eb;
    int[] field_u;
    private cg[][] field_U;
    int[] field_v;
    private int[] field_J;
    private int[] field_s;
    static String field_E;
    private int[] field_N;
    static int[] field_x;
    static int field_X;
    private long field_fb;
    private int field_W;
    private int field_bb;
    private gd field_z;
    private boolean field_C;
    private long field_t;
    private wh field_L;
    private boolean field_A;
    private int field_M;

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        int var3Lifetime1;
        if (param0) {
          this.a(-1, -10911);
        } else {
          this.e(-1, param1 ^ -21498);
        }
        this.b(-1, 0);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_J[var3] = this.field_y[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_B[var5] = c.a(this.field_y[var5], -128);
          var5++;
        }
        if (param1 != -21400) {
          this.b();
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
        var8 = MinerDisturbance.field_ab;
        try {
          if (this.field_eb.e()) {
            var4_int = this.field_eb.field_g * this.field_r / fj.field_r;
            while (true) {
              var5 = this.field_fb + (long)var4_int * (long)param2;
              if (-var5 + this.field_t >= 0L) {
                this.field_fb = var5;
                break;
              }
              var7 = (int)((-1L + this.field_t - (this.field_fb - (long)var4_int)) / (long)var4_int);
              this.field_fb = this.field_fb + (long)var4_int * (long)var7;
              this.field_z.a(param0, param1, var7);
              param2 = param2 - var7;
              this.f(128);
              param1 = param1 + var7;
              if (!this.field_eb.e()) {
                break;
              }
            }
          }
          this.field_z.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("di.R(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized um c() {
        return null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param0 <= 36) {
            di.a(true);
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("di.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2) {
        this.field_s[param0] = param2;
        this.field_u[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param1 < 95) {
          this.field_I = (int[]) null;
        }
    }

    private final int a(byte param0, cg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_N[param1.field_n];
          if (param0 < 82) {
            this.field_y = (int[]) null;
          }
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((128 - param1.field_E) * (-var3_int + 16384) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * param1.field_E + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("di.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_eb.f();
        this.field_L = null;
        if (!param1) {
          return;
        }
        this.b(param0, -21400);
    }

    final boolean a(int param0, cg param1, int param2, int[] param3, int param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ng var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          param1.field_M = fj.field_r / 100;
          if (0 <= param1.field_G && (null == param1.field_w ||
            param1.field_w.k())) {
            param1.a((byte) -103);
            param1.b(34);
            if (param1.field_J > 0) {
              if (param1 != this.field_U[param1.field_n][param1.field_J]) {
                return true;
              }
              this.field_U[param1.field_n][param1.field_J] = null;
            }
            return true;
          }
          var6_int = param1.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_T[param1.field_n] * 0.0004921259842519685));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param1.field_y = var6_int;
          }
          param1.field_w.h(this.a(-87, param1));
          if (param2 != 1387831944) {
            return false;
          }
          var7 = param1.field_z;
          param1.field_A = param1.field_A + var7.field_j;
          var8 = 0;
          param1.field_q = param1.field_q + 1;
          var9 = 0.000005086263020833333 * (double)((param1.field_F - 60 << 8) + (param1.field_L * param1.field_y >> 12));
          if (var7.field_m > 0) {
            if (0 < var7.field_d) {
              param1.field_x = param1.field_x + (int)(Math.pow(2.0, (double)var7.field_d * var9) * 128.0 + 0.5);
            } else {
              param1.field_x = param1.field_x + 128;
            }
            if (param1.field_x * var7.field_m >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_b != null) {
            if (var7.field_a <= 0) {
              param1.field_v = param1.field_v + 128;
            } else {
              param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_a));
            }
            while (param1.field_s < var7.field_b.length - 2) {
              if (param1.field_v > ((var7.field_b[param1.field_s + 2] & 255) << 8)) {
                param1.field_s = param1.field_s + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_b.length == param1.field_s &&
              var7.field_b[param1.field_s + 1] == 0) {
              var8 = 1;
            }
          }
          if (0 <= param1.field_G &&
            null != var7.field_g &&
            (this.field_v[param1.field_n] & 1) == 0 && (!(param1.field_J >= 0) ||
            param1 != this.field_U[param1.field_n][param1.field_J])) {
            if (0 < var7.field_h) {
              param1.field_G = param1.field_G + (int)(Math.pow(2.0, var9 * (double)var7.field_h) * 128.0 + 0.5);
            } else {
              param1.field_G = param1.field_G + 128;
            }
            while (-2 + var7.field_g.length > param1.field_p) {
              if ((65280 & var7.field_g[2 + param1.field_p] << 8) < param1.field_G) {
                param1.field_p = param1.field_p + 2;
                continue;
              }
              break;
            }
            if (param1.field_p == var7.field_g.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_w.a(param1.field_M, this.a(param1, (byte) -68), this.a((byte) 93, param1));
            return false;
          }
          param1.field_w.g(param1.field_M);
          if (param3 == null) {
            param1.field_w.a(param0);
          } else {
            param1.field_w.a(param3, param4, param0);
          }
          if (param1.field_w.j()) {
            this.field_z.field_r.b(param1.field_w);
          }
          param1.a((byte) 80);
          if (0 <= param1.field_G) {
            param1.b(34);
            if (param1.field_J > 0 &&
              this.field_U[param1.field_n][param1.field_J] == param1) {
              this.field_U[param1.field_n][param1.field_J] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("di.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, cg param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 255) {
            this.b();
          }
          var4_int = param2.field_D.field_r.length;
          if (param1 &&
            param2.field_D.field_p) {
            var6 = var4_int + var4_int - param2.field_D.field_q;
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_Y[param2.field_n] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              param2.field_w.a(true);
              var5 = -1 + var4_int + var4_int - var5;
            }
          } else {
            var5 = (int)((long)this.field_Y[param2.field_n] * (long)var4_int >> 6);
          }
          param2.field_w.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("di.SA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.b(param0, param2, -95);
        if (param1 != -6242) {
          field_K = -87;
        }
    }

    private final void f(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = MinerDisturbance.field_ab;
        var2 = this.field_W;
        if (param0 != 128) {
          this.a(true, true);
        }
        var3 = this.field_bb;
        var4 = this.field_t;
        if (this.field_L != null &&
          var3 == this.field_M) {
          this.a(-23, this.field_L, this.field_C, this.field_A);
          this.f(128);
          return;
        }
        while (true) {
          if (this.field_bb != var3) {
            this.field_bb = var3;
            this.field_W = var2;
            this.field_t = var4;
            if (this.field_L != null) {
              stackIn_24_0 = ~var3;
              stackIn_24_1 = ~this.field_M;
              if (stackIn_24_0 < stackIn_24_1) {
                this.field_W = -1;
                this.field_bb = this.field_M;
                this.field_t = this.field_eb.f(this.field_bb);
              }
            }
            return;
          }
          while (~this.field_eb.field_b[var2] == ~var3) {
            this.field_eb.a(var2);
            var6 = this.field_eb.d(var2);
            if (var6 != 1) {
              if (0 != (var6 & 128)) {
                this.a(var6, (byte) 76);
              }
              this.field_eb.e(var2);
              this.field_eb.b(var2);
              continue;
            }
            this.field_eb.d();
            this.field_eb.b(var2);
            if (this.field_eb.a()) {
              if (this.field_L != null) {
                this.a(this.field_C, this.field_L, (byte) 2);
                this.f(128);
                return;
              }
              if (this.field_C &&
                0 != var3) {
                this.field_eb.b(var4);
              } else {
                this.b(true, -21400);
                this.field_eb.f();
                return;
              }
            }
            break;
          }
          var2 = this.field_eb.c();
          var3 = this.field_eb.field_b[var2];
          var4 = this.field_eb.f(var3);
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= -19) {
          this.a((byte) 16, -9, 96, -116);
        }
        if (param0 != this.field_J[param1]) {
          this.field_J[param1] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_U[param1][var4] = null;
          }
        }
    }

    final synchronized boolean a(boolean param0, wh param1, ri param2, int param3, bj param4) {
        tg stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        qf var8 = null;
        int var9 = 0;
        int var11 = 0;
        vc var12 = null;
        vc var13 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          param1.a();
          var6_int = 1;
          var7 = null;
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          if (param0) {
            this.field_W = 80;
          }
          var8 = (qf) (param1.field_n.a(-16545));
          while (var8 != null) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_d;
            var12 = (vc) (this.field_F.a((long)var9, -27109));
            if (var12 == null) {
              var13 = oh.a(-126, var9, param4);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_F.a(0, (long)var9, var13);
                if (!var13.a(param2, (byte) -31, var8.field_s, (int[]) (var7))) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a(param2, (byte) -31, var8.field_s, (int[]) (var7))) {
                var6_int = 0;
                stackIn_19_0 = param1.field_n;
                decompiledFrameRemainder0 = !(param0);
                if (decompiledFrameRemainder0) {
                  stackIn_20_1 = true;
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              stackIn_19_0 = param1.field_n;
              if (!param0) {
                stackIn_20_1 = true;
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              stackIn_20_1 = false;
            }
            var8 = (qf) (((tg) (Object) stackIn_19_0).a(stackIn_20_1));
          }
          if (var6_int != 0) {
            param1.b();
          }
          stackIn_24_0 = var6_int;
          return stackIn_24_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("di.LA(").append(param0).append(',');
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
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != 57) {
          this.field_S = (int[]) null;
        }
        this.field_P[param1] = param0;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= 0) {
          this.field_H[param2] = param0;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_H[var4] = param0;
          }
        }
        if (!param1) {
          field_D = (cl) null;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = MinerDisturbance.field_ab;
        cg var3 = (cg) (this.field_z.field_v.b(64));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_n) {
            if (null != var3.field_w) {
              var3.field_w.g(fj.field_r / 100);
              if (var3.field_w.j()) {
                this.field_z.field_r.b(var3.field_w);
              }
              var3.a((byte) 76);
            }
            if (var3.field_G < 0) {
              this.field_gb[var3.field_n][var3.field_F] = null;
            }
            var3.b(34);
          }
          var3 = (cg) (this.field_z.field_v.b((byte) 56));
        }
        if (param1 != -10911) {
          this.d();
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
          field_Z = -105;
        }
        return ll.field_h ^ 38054639;
    }

    private final void b(int param0, int param1, int param2) {
        this.field_y[param1] = param0;
        int var4 = 124 % ((-4 - param2) / 55);
        this.field_B[param1] = c.a(param0, -128);
        this.c(param0, param1, -73);
    }

    final synchronized um b() {
        return (um) ((Object) this.field_z);
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (param0 < 0) {
          for (param0 = 0; 16 > param0; param0++) {
            this.b(param0, 0);
          }
        } else {
          this.field_R[param0] = 12800;
          this.field_N[param0] = 8192;
          this.field_S[param0] = 16383;
          this.field_P[param0] = 8192;
          this.field_I[param0] = param1;
          this.field_T[param0] = 8192;
          this.d(param0, 27);
          this.f(param0, 20257);
          this.field_v[param0] = 0;
          this.field_w[param0] = 32767;
          this.field_db[param0] = 256;
          this.field_Y[param0] = 0;
          this.a(param0, (byte) 123, 8192);
        }
    }

    final synchronized void a(wh param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.field_eb.e()) {
          this.a(param1, param0, (byte) 2);
          return;
        }
        try {
          this.field_L = param0;
          this.field_A = param2 ? true : false;
          if (param5 != -22604) {
            this.field_L = (wh) null;
          }
          this.field_C = param1 ? true : false;
          var7_int = this.field_eb.a(this.field_fb) * param3;
          var8 = this.field_eb.field_g * param4;
          var7_int = var8 * ((var8 + (var7_int - 1)) / var8);
          this.field_M = (var7_int + (param3 >> 1)) / param3;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "di.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(cg param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ng var9 = null;
        ng var10 = null;
        int stackIn_2_0 = 0;
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
          if (0 == this.field_H[param0.field_n]) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.field_z;
          var10 = var9;
          var4 = 4096 + this.field_R[param0.field_n] * this.field_S[param0.field_n] >> 13;
          if (param1 >= -32) {
            this.c();
          }
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + param0.field_t * var4 >> 15;
          var4 = 128 + var4 * this.field_Q >> 8;
          var4 = var4 * this.field_H[param0.field_n] + 128 >> 8;
          if (0 < var10.field_m) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_x * (double)var10.field_m));
          }
          if (null != var10.field_b) {
            var5 = param0.field_v;
            var6 = var10.field_b[param0.field_s + 1];
            if (param0.field_s < -2 + var10.field_b.length) {
              var7 = var9.field_b[param0.field_s] << 8 & 65280;
              var8 = (var10.field_b[param0.field_s + 2] & 255) << 8;
              var6 = var6 + (-var7 + var5) * (-var6 + var10.field_b[3 + param0.field_s]) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param0.field_G > 0 &&
            var10.field_g != null) {
            var5Lifetime1 = param0.field_G;
            var6Lifetime1 = var10.field_g[1 + param0.field_p];
            if (-2 + var10.field_g.length > param0.field_p) {
              var7Lifetime1 = 65280 & var9.field_g[param0.field_p] << 8;
              var8Lifetime1 = var10.field_g[2 + param0.field_p] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (var10.field_g[param0.field_p + 3] - var6Lifetime1) * (var5Lifetime1 - var7Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("di.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 != -114) {
          return true;
        }
        return this.field_eb.e();
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        cg var5;
        int var6_int;
        ji var6;
        cg var7;
        int var8;
        cg var9;
        int var10;
        vc var11;
        vc var12;
        var10 = MinerDisturbance.field_ab;
        this.a((byte) -69, param3, 64, param1);
        if ((this.field_v[param1] & 2) != 0) {
          var5 = (cg) (this.field_z.field_v.d(59287));
          while (var5 != null) {
            if (param1 == var5.field_n &&
              var5.field_G < 0) {
              this.field_gb[param1][var5.field_F] = null;
              this.field_gb[param1][param3] = var5;
              var6_int = (var5.field_y * var5.field_L >> 12) + var5.field_u;
              var5.field_u = var5.field_u + (-var5.field_F + param3 << 8);
              var5.field_L = var6_int - var5.field_u;
              var5.field_F = param3;
              var5.field_y = 4096;
              return;
            }
            var5 = (cg) (this.field_z.field_v.a(21510));
          }
        }
        var11 = (vc) (this.field_F.a((long)this.field_J[param1], -27109));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_v[param3];
        if (var6 == null) {
          return;
        }
        var7 = new cg();
        var7.field_I = var12;
        var7.field_n = param1;
        var7.field_D = var6;
        var7.field_z = var11.field_y[param3];
        var7.field_J = var11.field_s[param3];
        var7.field_F = param3;
        var8 = 94 % ((-71 - param0) / 41);
        var7.field_t = var11.field_x[param3] * param2 * param2 * var12.field_q + 1024 >> 11;
        var7.field_E = var11.field_r[param3] & 255;
        var7.field_u = (param3 << 8) - (32767 & var11.field_t[param3]);
        var7.field_x = 0;
        var7.field_v = 0;
        var7.field_p = 0;
        var7.field_G = -1;
        var7.field_s = 0;
        if (0 != this.field_Y[param1]) {
          var7.field_w = rc.a(var6, this.a(-101, var7), 0, this.a((byte) 88, var7));
          stackIn_16_1 = 255;
          stackIn_17_2 = !(var12.field_t[param3] >= 0);
          this.a(stackIn_16_1, stackIn_17_2, var7);
        } else {
          var7.field_w = rc.a(var6, this.a(79, var7), this.a(var7, (byte) -78), this.a((byte) 98, var7));
        }
        if (var12.field_t[param3] < 0) {
          var7.field_w.i(-1);
        }
        if (var7.field_J >= 0) {
          var9 = this.field_U[param1][var7.field_J];
          if (var9 != null &&
            var9.field_G < 0) {
            this.field_gb[param1][var9.field_F] = null;
            var9.field_G = 0;
          }
          this.field_U[param1][var7.field_J] = var7;
        }
        this.field_z.field_v.a((byte) -104, var7);
        this.field_gb[param1][param3] = var7;
        return;
    }

    private final int a(int param0, cg param1) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var6Lifetime1;
        try {
          var3_int = (param1.field_y * param1.field_L >> 12) + param1.field_u;
          var3_int = var3_int + ((-8192 + this.field_P[param1.field_n]) * this.field_db[param1.field_n] >> 12);
          var4 = -15 % ((-38 - param0) / 47);
          var5 = param1.field_z;
          if (var5.field_j > 0 && (!(var5.field_c <= 0) ||
            0 < this.field_I[param1.field_n])) {
            var6 = var5.field_c << 2;
            var7 = var5.field_f << 1;
            if (var7 > param1.field_q) {
              var6 = var6 * param1.field_q / var7;
            }
            var6 = var6 + (this.field_I[param1.field_n] >> 7);
            var8 = Math.sin((double)(param1.field_A & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var6 * var8);
          }
          var6Lifetime1 = (int)(0.5 + (double)(256 * param1.field_D.field_s) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)fj.field_r);
          stackIn_10_0 = (var6Lifetime1 < 1) ? 1 : var6Lifetime1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("di.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(cg param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -6) {
            this.field_B = (int[]) null;
          }
          if (null != param0.field_w) {
            return false;
          }
          if (param0.field_G < 0) {
            return true;
          }
          param0.b(34);
          if (param0.field_J > 0 &&
            this.field_U[param0.field_n][param0.field_J] == param0) {
            this.field_U[param0.field_n][param0.field_J] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("di.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
          vf stackIn_12_0;
          int stackIn_12_1;
          java.net.URL stackIn_12_2;
          java.net.URL stackIn_12_3;
          java.net.URL stackIn_12_4;
          StringBuilder stackIn_12_5;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          String stackIn_13_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          ia var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = MinerDisturbance.field_ab;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = w.a(param0, (byte) 78);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            vj.a(var3, param1);
            var3 = ld.a("%3a", -1, var3, ":");
            var3 = ld.a("%40", -1, var3, "@");
            var3 = ld.a("%26", -1, var3, "&");
            var7 = ld.a("%23", param1 ^ -2, var3, "#");
            if (null == aj.field_d) {
              return;
            }
            stackIn_12_0 = hd.field_g;
            stackIn_12_1 = -83;
            stackIn_12_2 = null;
            stackIn_12_3 = null;
            stackIn_12_4 = aj.field_d.getCodeBase();
            stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(tb.field_h).append("&u=");
            if (kf.field_a == null) {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = "" + jn.field_n;
            } else {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = kf.field_a;
            }
            var4 = ((vf) (Object) stackIn_12_0).a((byte) stackIn_12_1, new java.net.URL(stackIn_12_4, ((StringBuilder) (Object) stackIn_12_5).append(stackIn_13_6).append("&v1=").append(vf.field_s).append("&v2=").append(vf.field_b).append("&e=").append(var7).toString()));
            while (var4.field_c == 0) {
              gf.a(1L, param1 - 10310);
            }
            if (var4.field_c == 1) {
              var5 = (DataInputStream) (var4.field_a);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void c(int param0, int param1) {
        this.field_r = param0;
        if (param1 != -102) {
          this.d();
        }
    }

    private final void f(int param0, int param1) {
        cg var3 = null;
        int var4 = MinerDisturbance.field_ab;
        if (0 != (this.field_v[param0] & 4)) {
          var3 = (cg) (this.field_z.field_v.b(122));
          while (var3 != null) {
            if (var3.field_n == param0) {
              var3.field_B = 0;
            }
            var3 = (cg) (this.field_z.field_v.b((byte) 56));
          }
        }
        if (param1 != 20257) {
          wh var5 = (wh) null;
          this.a((wh) null, true, true, -97, -93, -5);
        }
    }

    private final void e(int param0, int param1) {
        int var4 = MinerDisturbance.field_ab;
        cg var3 = (cg) (this.field_z.field_v.b(71));
        while (var3 != null) {
          if ((param0 < 0 || var3.field_n == param0) &&
            !(var3.field_G >= 0)) {
            this.field_gb[var3.field_n][var3.field_F] = null;
            var3.field_G = 0;
          }
          var3 = (cg) (this.field_z.field_v.b((byte) 56));
        }
        if (param1 < 1) {
          wh var5 = (wh) null;
          this.a(false, (wh) null, (byte) 83);
        }
    }

    private final synchronized void a(int param0, wh param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var8 = MinerDisturbance.field_ab;
        try {
          this.a(param3, true);
          this.field_eb.a(param1.field_o);
          this.field_C = param2 ? true : false;
          this.field_fb = 0L;
          var5_int = this.field_eb.g();
          var6 = 0;
          int var7 = -96 % ((66 - param0) / 48);
          while (var6 < var5_int) {
            this.field_eb.a(var6);
            this.field_eb.e(var6);
            this.field_eb.b(var6);
            var6++;
          }
          this.field_W = this.field_eb.c();
          this.field_bb = this.field_eb.field_b[this.field_W];
          this.field_t = this.field_eb.f(this.field_bb);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "di.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
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
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = MinerDisturbance.field_ab;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = param0 >> 8 & 127;
          var6 = (param0 & 8366393) >> 16;
          this.a((byte) -123, var5, var6, var4);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = param0 >> 16 & 127;
          if (var6Lifetime1 > 0) {
            this.b((byte) -114, var4Lifetime1, var6Lifetime1, var5Lifetime1);
            return;
          }
          this.a((byte) -60, var5Lifetime1, 64, var4Lifetime1);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = 15 & param0;
            var5Lifetime1 = 127 & param0 >> 8;
            var6Lifetime1 = (param0 & 8386190) >> 16;
            this.a(var4Lifetime1, (byte) 94, var6Lifetime1, var5Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (192 == var3) {
              var4Lifetime1 = param0 & 15;
              var5Lifetime1 = (32529 & param0) >> 8;
              this.c(var5Lifetime1 + this.field_B[var4Lifetime1], var4Lifetime1, -56);
            } else {
              if (var3 == 208) {
                var4Lifetime1 = param0 & 15;
                var5Lifetime1 = 127 & param0 >> 8;
                this.d(var4Lifetime1, var5Lifetime1, 1632);
              } else {
                if (var3 == 224) {
                  var4Lifetime1 = 15 & param0;
                  var5Lifetime1 = ((8323374 & param0) >> 9) + (127 & param0 >> 8);
                  this.a(var5Lifetime1, var4Lifetime1, (byte) 57);
                } else {
                  var3 = 255 & param0;
                  if (var3 != 255) {
                    var4Lifetime1 = -43 % ((-22 - param1) / 34);
                  } else {
                    this.b(true, -21400);
                  }
                }
              }
            }
            return;
          }
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = 127 & param0 >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var5Lifetime1 == 0) {
            this.field_B[var4Lifetime1] = (var6Lifetime1 << 14) + c.a(-2080769, this.field_B[var4Lifetime1]);
          }
          if (var5Lifetime1 == 32) {
            this.field_B[var4Lifetime1] = c.a(this.field_B[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 1) {
            this.field_I[var4Lifetime1] = (var6Lifetime1 << 7) + c.a(this.field_I[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 33) {
            this.field_I[var4Lifetime1] = c.a(-128, this.field_I[var4Lifetime1]) + var6Lifetime1;
          }
          if (5 == var5Lifetime1) {
            this.field_T[var4Lifetime1] = (var6Lifetime1 << 7) + c.a(-16257, this.field_T[var4Lifetime1]);
          }
          if (var5Lifetime1 == 37) {
            this.field_T[var4Lifetime1] = c.a(-128, this.field_T[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 7) {
            this.field_R[var4Lifetime1] = c.a(this.field_R[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (39 == var5Lifetime1) {
            this.field_R[var4Lifetime1] = c.a(-128, this.field_R[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 10) {
            this.field_N[var4Lifetime1] = (var6Lifetime1 << 7) + c.a(this.field_N[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 42) {
            this.field_N[var4Lifetime1] = var6Lifetime1 + c.a(this.field_N[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 11) {
            this.field_S[var4Lifetime1] = c.a(-16257, this.field_S[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.field_S[var4Lifetime1] = c.a(-128, this.field_S[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 >= 64) {
              this.field_v[var4Lifetime1] = hi.a(this.field_v[var4Lifetime1], 1);
            } else {
              this.field_v[var4Lifetime1] = c.a(this.field_v[var4Lifetime1], -2);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 < 64) {
              this.d(var4Lifetime1, -114);
              this.field_v[var4Lifetime1] = c.a(this.field_v[var4Lifetime1], -3);
            } else {
              this.field_v[var4Lifetime1] = hi.a(this.field_v[var4Lifetime1], 2);
            }
          }
          if (var5Lifetime1 == 99) {
            this.field_w[var4Lifetime1] = c.a(127, this.field_w[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (98 == var5Lifetime1) {
            this.field_w[var4Lifetime1] = var6Lifetime1 + c.a(16256, this.field_w[var4Lifetime1]);
          }
          if (var5Lifetime1 == 101) {
            this.field_w[var4Lifetime1] = (var6Lifetime1 << 7) + (c.a(127, this.field_w[var4Lifetime1]) + 16384);
          }
          if (var5Lifetime1 == 100) {
            this.field_w[var4Lifetime1] = 16384 + c.a(16256, this.field_w[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 120) {
            this.a(var4Lifetime1, -10911);
          }
          if (var5Lifetime1 == 121) {
            this.b(var4Lifetime1, 0);
          }
          if (123 == var5Lifetime1) {
            this.e(var4Lifetime1, 35);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.field_w[var4Lifetime1];
            if (var7 == 16384) {
              this.field_db[var4Lifetime1] = c.a(this.field_db[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_w[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.field_db[var4Lifetime1] = c.a(this.field_db[var4Lifetime1], -128) + var6Lifetime1;
            }
          }
          if (var5Lifetime1 == 16) {
            this.field_Y[var4Lifetime1] = c.a(this.field_Y[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 48) {
            this.field_Y[var4Lifetime1] = var6Lifetime1 + c.a(this.field_Y[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.f(var4Lifetime1, 20257);
              this.field_v[var4Lifetime1] = c.a(this.field_v[var4Lifetime1], -5);
            } else {
              this.field_v[var4Lifetime1] = hi.a(this.field_v[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.a(var4Lifetime1, (byte) 116, (var6Lifetime1 << 7) + (this.field_s[var4Lifetime1] & -16257));
          }
          if (var5Lifetime1 == 49) {
            this.a(var4Lifetime1, (byte) 98, (this.field_s[var4Lifetime1] & -128) + var6Lifetime1);
            return;
          }
        }
    }

    final synchronized void e(int param0) {
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 100) {
          this.field_u = (int[]) null;
        }
        vc var4 = (vc) (this.field_F.a(-16545));
        while (var4 != null) {
          var4.a(12361);
          var4 = (vc) (this.field_F.a(true));
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_x = null;
        if (param0 <= 92) {
          String var2 = (String) null;
          di.a((Throwable) null, 72, (String) null);
        }
        field_O = null;
        field_V = null;
        field_E = null;
        field_cb = null;
        field_ab = null;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        var6 = MinerDisturbance.field_ab;
        if (this.field_eb.e()) {
          var2 = this.field_r * this.field_eb.field_g / fj.field_r;
          while (true) {
            var3 = this.field_fb + (long)param0 * (long)var2;
            if (-var3 + this.field_t >= 0L) {
              this.field_fb = var3;
              break;
            }
            var5 = (int)((-1L + (long)var2 + (this.field_t - this.field_fb)) / (long)var2);
            this.field_fb = this.field_fb + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_z.a(var5);
            this.f(128);
            if (!this.field_eb.e()) {
              break;
            }
          }
        }
        this.field_z.a(param0);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cg var6;
        int var7;
        cg var8;
        var7 = MinerDisturbance.field_ab;
        var8 = this.field_gb[param3][param1];
        if (var8 == null) {
          return;
        }
        this.field_gb[param3][param1] = null;
        if (param0 > -3) {
          this.d(-81, 83);
        }
        {
          if (0 != (2 & this.field_v[param3])) {
            var6 = (cg) (this.field_z.field_v.b(72));
            while (var6 != null) {
              if (var8.field_n == var6.field_n &&
                0 > var6.field_G &&
                var6 != var8) {
                var8.field_G = 0;
                break;
              }
              var6 = (cg) (this.field_z.field_v.b((byte) 56));
            }
          } else {
            var8.field_G = 0;
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3;
        cg var4;
        int var5;
        var5 = MinerDisturbance.field_ab;
        var3 = 125 / ((-48 - param1) / 62);
        if ((2 & this.field_v[param0]) != 0) {
          var4 = (cg) (this.field_z.field_v.b(76));
          while (var4 != null) {
            if (param0 == var4.field_n) {
              if (this.field_gb[param0][var4.field_F] != null) {
                var4 = (cg) (this.field_z.field_v.b((byte) 56));
                continue;
              }
              if (0 > var4.field_G) {
                var4.field_G = 0;
              }
            }
            var4 = (cg) (this.field_z.field_v.b((byte) 56));
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 13) {
          this.field_s = (int[]) null;
        }
    }

    final synchronized void a(boolean param0, wh param1, byte param2) {
        try {
          this.a(17, param1, param0, true);
          if (param2 != 2) {
            this.field_H = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "di.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param2 != 1632) {
          this.a(false, false);
        }
    }

    final synchronized void c(byte param0) {
        this.a(true, true);
        if (param0 != 108) {
          this.field_T = (int[]) null;
        }
    }

    final synchronized void a(byte param0, int param1) {
        int discarded$0 = 0;
        this.field_Q = param1;
        if (param0 >= -64) {
          cg var4 = (cg) null;
          discarded$0 = this.a(16, (cg) null);
        }
    }

    public di() {
        this.field_Q = 256;
        this.field_w = new int[16];
        this.field_P = new int[16];
        this.field_r = 1000000;
        this.field_I = new int[16];
        this.field_H = new int[16];
        this.field_B = new int[16];
        this.field_y = new int[16];
        this.field_R = new int[16];
        this.field_S = new int[16];
        this.field_gb = new cg[16][128];
        this.field_T = new int[16];
        this.field_Y = new int[16];
        this.field_db = new int[16];
        this.field_u = new int[16];
        this.field_s = new int[16];
        this.field_v = new int[16];
        this.field_U = new cg[16][128];
        this.field_N = new int[16];
        this.field_J = new int[16];
        this.field_eb = new nl();
        this.field_z = new gd(this);
        this.field_F = new tg(128);
        this.a(256, true, -1);
        this.b(true, -21400);
    }

    static {
        field_cb = "Confirm Email:";
        field_V = new int[128];
        field_Z = 0;
        field_E = "Passwords must be between 5 and 20 letters and numbers";
        field_O = new gi();
    }
}
