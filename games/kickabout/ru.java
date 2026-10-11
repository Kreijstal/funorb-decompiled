/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ru extends lq {
    private int field_u;
    int[] field_i;
    private int[] field_z;
    private int[] field_E;
    private da[][] field_Q;
    private int[] field_A;
    private int[] field_I;
    private int[] field_q;
    int[] field_o;
    int[] field_s;
    private int[] field_G;
    private int[] field_v;
    private int[] field_n;
    private int field_p;
    private kc field_w;
    private rs field_k;
    private int[] field_y;
    private da[][] field_O;
    private int[] field_L;
    private int[] field_J;
    private int[] field_B;
    private int[] field_j;
    static Random field_l;
    static tf field_M;
    static int field_C;
    private int field_H;
    private pp field_m;
    private long field_D;
    private int field_K;
    static String field_t;
    private boolean field_r;
    private long field_P;
    private boolean field_F;
    private int field_N;
    private qm field_x;

    final synchronized void a(boolean param0, int param1, qm param2) {
        if (param1 != 19134) {
          return;
        }
        try {
          this.a(param2, true, (byte) 101, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ru.HA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized lq b() {
        return null;
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != 16) {
          this.field_k = (rs) null;
        }
    }

    private final int a(da param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        gl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param0.field_n * param0.field_p >> 12) + param0.field_D;
          if (param1 != -5) {
            stackIn_2_0 = -5;
            return stackIn_2_0;
          }
          var3_int = var3_int + ((-8192 + this.field_v[param0.field_q]) * this.field_j[param0.field_q] >> 12);
          var4 = param0.field_j;
          if (var4.field_h > 0 && (!(var4.field_j <= 0) ||
            this.field_G[param0.field_q] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_k << 1;
            if (param0.field_w < var6) {
              var5 = var5 * param0.field_w / var6;
            }
            var5 = var5 + (this.field_G[param0.field_q] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_z));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(256 * param0.field_y.field_f) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)uh.field_i + 0.5);
          stackIn_14_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ru.V(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized void c(int param0, int param1) {
        this.field_p = param0;
        if (param1 != 107342216) {
          this.d(9, 30);
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int discarded$0 = 0;
        if (param2 != -71) {
          discarded$0 = this.a(false, (da) null);
        }
    }

    final synchronized void b(int param0, int param1, byte param2) {
        if (param2 > -48) {
          this.field_A = (int[]) null;
        }
        this.a(param0, param1, (byte) 36);
    }

    private final void d(int param0, int param1) {
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
        var8 = Kickabout.field_G;
        if (param0 != 5) {
          return;
        }
        var3 = 240 & param1;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = 127 & param1 >> 8;
          var6 = param1 >> 16 & 127;
          this.a((byte) -119, var5, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (param1 & 32618) >> 8;
          var6Lifetime1 = param1 >> 16 & 127;
          if (var6Lifetime1 <= 0) {
            this.a((byte) -44, var5Lifetime1, var4Lifetime1, 64);
          } else {
            this.a(32, var6Lifetime1, var5Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = param1 >> 8 & 127;
          var6Lifetime2 = (param1 & 8376783) >> 16;
          this.a(var4Lifetime2, var5Lifetime2, (byte) -71, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (192 == var3) {
            var4Lifetime3 = 15 & param1;
            var5Lifetime3 = 127 & param1 >> 8;
            this.a(this.field_q[var4Lifetime3] + var5Lifetime3, param0 ^ 133, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = (param1 & 32603) >> 8;
            this.e(param0 + 11, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param1 & 15;
            var5Lifetime3Lifetime2 = (127 & param1 >> 8) + (16256 & param1 >> 9);
            this.b(param0 + 37, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
            return;
          }
          var3 = param1 & 255;
          if (255 != var3) {
            return;
          }
          this.a(true, false);
          return;
        }
        var4Lifetime4 = param1 & 15;
        var5Lifetime4 = 127 & param1 >> 8;
        var6Lifetime3 = (8349360 & param1) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_q[var4Lifetime4] = qj.b(this.field_q[var4Lifetime4], -2080769) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_q[var4Lifetime4] = qj.b(-16257, this.field_q[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.field_G[var4Lifetime4] = qj.b(this.field_G[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (33 == var5Lifetime4) {
          this.field_G[var4Lifetime4] = var6Lifetime3 + qj.b(-128, this.field_G[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.field_B[var4Lifetime4] = (var6Lifetime3 << 7) + qj.b(this.field_B[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 37) {
          this.field_B[var4Lifetime4] = var6Lifetime3 + qj.b(this.field_B[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 7) {
          this.field_y[var4Lifetime4] = (var6Lifetime3 << 7) + qj.b(this.field_y[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.field_y[var4Lifetime4] = var6Lifetime3 + qj.b(-128, this.field_y[var4Lifetime4]);
        }
        if (10 == var5Lifetime4) {
          this.field_E[var4Lifetime4] = (var6Lifetime3 << 7) + qj.b(this.field_E[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_E[var4Lifetime4] = qj.b(this.field_E[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_A[var4Lifetime4] = qj.b(this.field_A[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_A[var4Lifetime4] = var6Lifetime3 + qj.b(-128, this.field_A[var4Lifetime4]);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_i[var4Lifetime4] = hf.a(this.field_i[var4Lifetime4], 1);
          } else {
            this.field_i[var4Lifetime4] = qj.b(this.field_i[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a(-1, var4Lifetime4);
            this.field_i[var4Lifetime4] = qj.b(this.field_i[var4Lifetime4], -3);
          } else {
            this.field_i[var4Lifetime4] = hf.a(this.field_i[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_z[var4Lifetime4] = qj.b(this.field_z[var4Lifetime4], 127) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_z[var4Lifetime4] = qj.b(16256, this.field_z[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_z[var4Lifetime4] = 16384 - (-qj.b(this.field_z[var4Lifetime4], 127) - (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_z[var4Lifetime4] = var6Lifetime3 + (16384 + qj.b(16256, this.field_z[var4Lifetime4]));
        }
        if (120 == var5Lifetime4) {
          this.f(var4Lifetime4, 100);
        }
        if (121 == var5Lifetime4) {
          this.b(var4Lifetime4, param0 ^ 87);
        }
        if (var5Lifetime4 == 123) {
          this.g(-9, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_z[var4Lifetime4];
          if (var7 == 16384) {
            this.field_j[var4Lifetime4] = (var6Lifetime3 << 7) + qj.b(-16257, this.field_j[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_z[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_j[var4Lifetime4] = qj.b(-128, this.field_j[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_s[var4Lifetime4] = (var6Lifetime3 << 7) + qj.b(-16257, this.field_s[var4Lifetime4]);
        }
        if (48 == var5Lifetime4) {
          this.field_s[var4Lifetime4] = var6Lifetime3 + qj.b(-128, this.field_s[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.e(-28723, var4Lifetime4);
            this.field_i[var4Lifetime4] = qj.b(this.field_i[var4Lifetime4], -5);
          } else {
            this.field_i[var4Lifetime4] = hf.a(this.field_i[var4Lifetime4], 4);
          }
        }
        if (17 == var5Lifetime4) {
          this.c(var4Lifetime4, (var6Lifetime3 << 7) + (this.field_L[var4Lifetime4] & -16257), 103);
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.c(var4Lifetime4, (-128 & this.field_L[var4Lifetime4]) + var6Lifetime3, 110);
        return;
    }

    private final synchronized void a(qm param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        try {
          this.a((byte) -123, param1);
          this.field_k.a(param0.field_e);
          this.field_D = 0L;
          this.field_r = param3 ? true : false;
          if (param2 != 101) {
            this.field_N = 27;
          }
          var5_int = this.field_k.e();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_k.c(var6);
            this.field_k.d(var6);
            this.field_k.b(var6);
          }
          this.field_K = this.field_k.g();
          this.field_H = this.field_k.field_e[this.field_K];
          this.field_P = this.field_k.e(this.field_H);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ru.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_19_1 = false;
        da stackIn_19_2 = null;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        da var5;
        int var6_int;
        to var6;
        da var7;
        da var8;
        int var9;
        jk var10;
        jk var11;
        var9 = Kickabout.field_G;
        this.a((byte) -50, param2, param3, 64);
        if ((this.field_i[param3] & 2) != 0) {
          var5 = (da) (this.field_m.field_j.d(param0 ^ -9065));
          while (var5 != null) {
            if (~var5.field_q == ~param3 &&
              0 > var5.field_s) {
              this.field_O[param3][var5.field_e] = null;
              this.field_O[param3][param2] = var5;
              var6_int = var5.field_D + (var5.field_p * var5.field_n >> 12);
              var5.field_D = var5.field_D + (param2 - var5.field_e << 8);
              var5.field_e = param2;
              var5.field_n = -var5.field_D + var6_int;
              var5.field_p = 4096;
              return;
            }
            var5 = (da) (this.field_m.field_j.e(33));
          }
        }
        var10 = (jk) (this.field_w.a(true, (long)this.field_n[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_l[param2];
        if (var6 == null) {
          return;
        }
        var7 = new da();
        var7.field_y = var6;
        if (param0 != 32) {
          return;
        }
        var7.field_q = param3;
        var7.field_g = var10;
        var7.field_j = var10.field_e[param2];
        var7.field_E = var10.field_p[param2];
        var7.field_e = param2;
        var7.field_C = var10.field_n[param2] * (param1 * param1) * var11.field_j + 1024 >> 11;
        var7.field_A = var10.field_k[param2] & 255;
        var7.field_D = (param2 << 8) - (32767 & var10.field_r[param2]);
        var7.field_f = 0;
        var7.field_l = 0;
        var7.field_t = 0;
        var7.field_s = -1;
        var7.field_v = 0;
        if (0 != this.field_s[param3]) {
          var7.field_F = vm.b(var6, this.a(var7, -5), 0, this.a(true, var7));
          stackIn_19_1 = false;
          stackIn_19_2 = var7;
          if (var11.field_r[param2] >= 0) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.a(stackIn_19_1, stackIn_19_2, stackIn_20_3);
        } else {
          var7.field_F = vm.b(var6, this.a(var7, -5), this.b(-101, var7), this.a(true, var7));
        }
        if (var11.field_r[param2] < 0) {
          var7.field_F.g(-1);
        }
        if (var7.field_E >= 0) {
          var8 = this.field_Q[param3][var7.field_E];
          if (var8 != null &&
            0 > var8.field_s) {
            this.field_O[param3][var8.field_e] = null;
            var8.field_s = 0;
          }
          this.field_Q[param3][var7.field_E] = var7;
        }
        this.field_m.field_j.a(var7, 3);
        this.field_O[param3][param2] = var7;
        return;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Kickabout.field_G;
        try {
          if (this.field_k.f()) {
            var4_int = this.field_p * this.field_k.field_h / uh.field_i;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_D;
              if (this.field_P - var5 >= 0L) {
                this.field_D = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (this.field_P - this.field_D)) / (long)var4_int);
              this.field_D = this.field_D + (long)var7 * (long)var4_int;
              this.field_m.a(param0, param1, var7);
              param1 = param1 + var7;
              this.e(4204);
              param2 = param2 - var7;
              if (!this.field_k.f()) {
                break;
              }
            }
          }
          this.field_m.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ru.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, da param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_y.field_i.length;
          if (param0) {
            return;
          }
          if (param2 &&
            param1.field_y.field_g) {
            var6 = -param1.field_y.field_h + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_s[param1.field_q] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              var5 = var4_int + var4_int - (1 + var5);
              param1.field_F.a(true);
            }
          } else {
            var5 = (int)((long)this.field_s[param1.field_q] * (long)var4_int >> 6);
          }
          param1.field_F.i(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ru.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, sj param2, rj param3, qm param4) {
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
        hw var8 = null;
        int var9 = 0;
        jk var10 = null;
        int var11 = 0;
        var11 = Kickabout.field_G;
        try {
          param4.b();
          var6_int = 1;
          var7 = null;
          if (param1 > 0) {
            var7 = new int[]{param1};
          }
          if (param0 != 1) {
            this.field_m = (pp) null;
          }
          var8 = (hw) (param4.field_f.b(param0 - 1));
          while (var8 != null) {
            var9 = (int)var8.field_a;
            var10 = (jk) (this.field_w.a(true, (long)var9));
            if (var10 == null) {
              var10 = jr.a(param2, var9, 116);
              if (var10 != null) {
                this.field_w.a(var10, param0 ^ 124, (long)var9);
              } else {
                var6_int = 0;
              }
            }
            if (var10 != null &&
              !var10.a(param3, (int[]) (var7), (byte) 123, var8.field_g)) {
              var6_int = 0;
            }
            var8 = (hw) (param4.field_f.a(param0 ^ -2));
          }
          if (var6_int != 0) {
            param4.a();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ru.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final int a(boolean param0, da param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_m = (pp) null;
          }
          var3_int = this.field_E[param1.field_q];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((-var3_int + 16384) * (128 - param1.field_A) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + var3_int * param1.field_A >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ru.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void f(int param0, int param1) {
        da var3;
        int var4;
        var4 = Kickabout.field_G;
        if (param1 != 100) {
          this.a(15, 115, (byte) 81);
        }
        var3 = (da) (this.field_m.field_j.g(24009));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_q == param0) {
            if (var3.field_F != null) {
              var3.field_F.e(uh.field_i / 100);
              if (var3.field_F.n()) {
                this.field_m.field_i.a(var3.field_F);
              }
              var3.a(true);
            }
            if (0 > var3.field_s) {
              this.field_O[var3.field_q][var3.field_e] = null;
            }
            var3.c((byte) -109);
          }
          var3 = (da) (this.field_m.field_j.c(33));
        }
    }

    private final void b(int param0, int param1) {
        int var4;
        var4 = Kickabout.field_G;
        if (param0 < 0) {
          for (param0 = 0; 16 > param0; param0++) {
            this.b(param0, 73);
          }
        } else {
          this.field_y[param0] = 12800;
          if (param1 <= 66) {
            this.e(-112, 41, 103);
          }
          this.field_E[param0] = 8192;
          this.field_A[param0] = 16383;
          this.field_v[param0] = 8192;
          this.field_G[param0] = 0;
          this.field_B[param0] = 8192;
          this.a(-1, param0);
          this.e(-28723, param0);
          this.field_i[param0] = 0;
          this.field_z[param0] = 32767;
          this.field_j[param0] = 256;
          this.field_s[param0] = 0;
          this.c(param0, 8192, 110);
        }
    }

    final boolean a(int param0, int param1, int param2, da param3, int[] param4) {
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int stackIn_50_0Lifetime1;
        int stackIn_50_1Lifetime1;
        var11 = Kickabout.field_G;
        try {
          param3.field_B = uh.field_i / 100;
          if (param3.field_s >= 0 && (param3.field_F == null ||
            param3.field_F.f())) {
            param3.a(true);
            param3.c((byte) -109);
            if (0 < param3.field_E) {
              if (this.field_Q[param3.field_q][param3.field_E] != param3) {
                return true;
              }
              this.field_Q[param3.field_q][param3.field_E] = null;
            }
            return true;
          }
          var6_int = param3.field_p;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_B[param3.field_q]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_p = var6_int;
          }
          param3.field_F.h(this.a(param3, -5));
          var7 = param3.field_j;
          var8 = 0;
          param3.field_w = param3.field_w + 1;
          param3.field_z = param3.field_z + var7.field_h;
          var9 = 0.000005086263020833333 * (double)((param3.field_p * param3.field_n >> 12) + (param3.field_e - 60 << 8));
          if (var7.field_n > 0) {
            if (var7.field_g <= 0) {
              param3.field_f = param3.field_f + 128;
            } else {
              param3.field_f = param3.field_f + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_g) + 0.5);
            }
            if (819200 <= param3.field_f * var7.field_n) {
              var8 = 1;
            }
          }
          if (var7.field_m != null) {
            if (0 >= var7.field_e) {
              param3.field_v = param3.field_v + 128;
            } else {
              param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_e) + 0.5);
            }
            while (true) {
              if ((var7.field_m.length - 2) > param3.field_t) {
                stackIn_32_0 = param3.field_v;
                stackIn_32_1 = var7.field_m[param3.field_t + 2] << 8 & 65280;
                if (stackIn_32_0 > stackIn_32_1) {
                  param3.field_t = param3.field_t + 2;
                  continue;
                }
              }
              stackIn_32_0Lifetime1 = var7.field_m.length - 2;
              stackIn_32_1Lifetime1 = param3.field_t;
              if (stackIn_32_0Lifetime1 != stackIn_32_1Lifetime1) {
                break;
              }
              if (var7.field_m[1 + param3.field_t] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param3.field_s >= 0 &&
            null != var7.field_b &&
            (this.field_i[param3.field_q] & 1) == 0 && (!(param3.field_E >= 0) ||
            param3 != this.field_Q[param3.field_q][param3.field_E])) {
            if (var7.field_l > 0) {
              param3.field_s = param3.field_s + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
            } else {
              param3.field_s = param3.field_s + 128;
            }
            while (true) {
              if ((-2 + var7.field_b.length) > param3.field_l) {
                stackIn_50_0 = ~(var7.field_b[param3.field_l + 2] << 8 & 65280);
                stackIn_50_1 = ~param3.field_s;
                if (stackIn_50_0 > stackIn_50_1) {
                  param3.field_l = param3.field_l + 2;
                  continue;
                }
              }
              stackIn_50_0Lifetime1 = param3.field_l;
              stackIn_50_1Lifetime1 = -2 + var7.field_b.length;
              if (stackIn_50_0Lifetime1 != stackIn_50_1Lifetime1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param0 >= -26) {
            return true;
          }
          if (var8 == 0) {
            param3.field_F.a(param3.field_B, this.b(55, param3), this.a(true, param3));
            return false;
          }
          param3.field_F.e(param3.field_B);
          if (param4 == null) {
            param3.field_F.a(param1);
          } else {
            param3.field_F.a(param4, param2, param1);
          }
          if (param3.field_F.n()) {
            this.field_m.field_i.a(param3.field_F);
          }
          param3.a(true);
          if (0 <= param3.field_s) {
            param3.c((byte) -109);
            if (param3.field_E > 0 &&
              param3 == this.field_Q[param3.field_q][param3.field_E]) {
              this.field_Q[param3.field_q][param3.field_E] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("ru.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param4 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.field_k.c();
        if (param0 > -109) {
          field_C = 94;
        }
        this.field_x = null;
        this.a(param1, false);
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var3Lifetime1;
        if (param0) {
          this.f(-1, 100);
        } else {
          this.g(-60, -1);
        }
        this.b(-1, 124);
        if (param1) {
          this.a(86, -61);
        }
        for (var3 = 0; var3 < 16; var3++) {
          this.field_n[var3] = this.field_I[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_q[var5] = qj.b(-128, this.field_I[var5]);
          var5++;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_L[param0] = param1;
        this.field_o[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
        if (param2 < 48) {
          this.b(-2);
        }
    }

    private final void g(int param0, int param1) {
        da var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_0Lifetime1;
        int stackIn_10_1Lifetime1;
        var4 = Kickabout.field_G;
        var3 = (da) (this.field_m.field_j.g(24009));
        while (var3 != null) {
          stackIn_10_0 = 0;
          stackIn_10_1 = param1;
          if ((stackIn_10_0 > stackIn_10_1 ||
            ~param1 == ~var3.field_q) &&
            0 > var3.field_s) {
            this.field_O[var3.field_q][var3.field_e] = null;
            var3.field_s = 0;
          }
          var3 = (da) (this.field_m.field_j.c(33));
        }
        stackIn_10_0Lifetime1 = param0;
        stackIn_10_1Lifetime1 = -8;
        if (stackIn_10_0Lifetime1 > stackIn_10_1Lifetime1) {
          this.d(4, -110);
        }
        return;
    }

    final synchronized void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Kickabout.field_G;
        if (~param0 > param1) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_J[var4] = param2;
          }
        } else {
          this.field_J[param0] = param2;
        }
    }

    final synchronized void b(int param0) {
        if (param0 != 21404) {
          return;
        }
        this.a((byte) -114, true);
    }

    private final void e(int param0, int param1) {
        da var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -28723) {
          this.field_J = (int[]) null;
        }
        if ((4 & this.field_i[param1]) != 0) {
          var3 = (da) (this.field_m.field_j.g(24009));
          while (var3 != null) {
            if (param1 == var3.field_q) {
              var3.field_r = 0;
            }
            var3 = (da) (this.field_m.field_j.c(33));
          }
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Kickabout.field_G;
        if (this.field_k.f()) {
          var2 = this.field_p * this.field_k.field_h / uh.field_i;
          while (true) {
            var3 = this.field_D + (long)param0 * (long)var2;
            if (-var3 + this.field_P >= 0L) {
              this.field_D = var3;
              break;
            }
            var5 = (int)((-1L + this.field_P - this.field_D + (long)var2) / (long)var2);
            this.field_D = this.field_D + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.field_m.a(var5);
            this.e(4204);
            if (this.field_k.f()) {
              continue;
            }
            this.field_m.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_m.a(param0);
        }

    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param1 != 128) {
          return;
        }
        if (param0 != this.field_n[param2]) {
          this.field_n[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_Q[param2][var4] = null;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var10 = Kickabout.field_G;
        try {
          if (wh.field_q) {
            return;
          }
          var2 = null;
          var3 = b.c(-93, 359);
          if (param0) {
            stackIn_7_0 = go.a(0, (byte) -56);
          } else {
            stackIn_7_0 = go.a(1344, (byte) -56);
          }
          var4 = stackIn_7_0;
          if (rm.field_C != 0) {
            if (rm.field_C != 1) {
              if (rm.field_C > 2) {
                if (rm.field_C == 3) {
                  if (!param0) {
                    var2 = kc.field_g[0];
                    var4 = var4 - (hw.field_i * 58 >> 8);
                  } else {
                    var2 = kc.field_g[1];
                    var4 = var4 - (hw.field_i * 97 >> 8);
                  }
                }
              } else {
                var4 = var4 - (55 * hw.field_i >> 8);
                var2 = kc.field_g[2];
                if (!param0) {
                  var4 = var4 - (hw.field_i * 5 >> 8);
                }
              }
            } else {
              var4 = var4 - (hw.field_i * 62 >> 8);
              var2 = kc.field_g[3];
              if (!param0) {
                var4 = var4 - (5 * hw.field_i >> 8);
              }
            }
          } else {
            if (ih.field_c == 0) {
              stackIn_12_0 = var4;
              if (param0) {
                stackIn_13_1 = 53;
              } else {
                stackIn_13_1 = 64;
              }
              var4 = stackIn_12_0 - (stackIn_13_1 * hw.field_i >> 8);
              var2 = kc.field_g[6];
            }
            if (ih.field_c == 1) {
              var2 = kc.field_g[5];
              stackIn_18_0 = var4;
              stackIn_18_1 = hw.field_i;
              if (param0) {
                stackIn_19_2 = 62;
              } else {
                stackIn_19_2 = 72;
              }
              var4 = stackIn_18_0 - (stackIn_18_1 * stackIn_19_2 >> 8);
            }
            if (ih.field_c == 2) {
              var2 = kc.field_g[4];
              stackIn_24_0 = var4;
              if (param0) {
                stackIn_25_1 = 68;
              } else {
                stackIn_25_1 = 72;
              }
              var4 = stackIn_24_0 - (stackIn_25_1 * hw.field_i >> 8);
            }
          }
          if (param0 &&
            3 == rm.field_C) {
            var5 = go.a(-87, (byte) -56);
            for (var6 = 0; var6 < 5; var6++) {
              im.a(-12376, b.c(-121, (-5 + ge.field_k.field_o) * var6 - 32), var5, ge.field_k);
            }
          }
          if (ih.field_c == 2) {
            var5Lifetime1 = b.c(-105, -47);
            var6Lifetime1 = b.c(param1 + 94, 892);
            stackIn_48_0 = (!param0) ? 0 : 3;
            var7 = stackIn_48_0;
            for (var8 = 0; 5 > var8; var8++) {
              var9 = go.a(var8 * 290 - 40, (byte) -56);
              im.a(-12376, var5Lifetime1, var9, so.field_d[0 + var7]);
              im.a(-12376, var6Lifetime1, var9, so.field_d[1 + var7]);
            }
          }
          im.a(-12376, var3, var4, (ut) (var2));
          if (param1 != -114) {
            field_M = (tf) null;
          }
          if (!param0 &&
            3 == rm.field_C) {
            var5Lifetime2 = go.a(1384, (byte) -56);
            for (var6Lifetime2 = 0; var6Lifetime2 < 5; var6Lifetime2++) {
              im.a(param1 - 12262, b.c(-126, var6Lifetime2 * (-5 + ge.field_k.field_o) - 32), var5Lifetime2, ge.field_k);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (var2), "ru.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        da var6;
        int var7;
        da var8;
        var7 = Kickabout.field_G;
        if (param0 > -16) {
          field_t = (String) null;
        }
        var8 = this.field_O[param2][param1];
        if (var8 == null) {
          return;
        }
        {
          this.field_O[param2][param1] = null;
          if ((this.field_i[param2] & 2) != 0) {
            var6 = (da) (this.field_m.field_j.g(24009));
            while (var6 != null) {
              if (var6.field_q == var8.field_q &&
                0 > var6.field_s &&
                var6 != var8) {
                var8.field_s = 0;
                break;
              }
              var6 = (da) (this.field_m.field_j.c(33));
            }
          } else {
            var8.field_s = 0;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        this.field_I[param0] = param1;
        this.field_q[param0] = qj.b(param1, -128);
        this.a(param1, param2 ^ 164, param0);
        if (param2 != 36) {
          this.c();
        }
    }

    final synchronized lq c() {
        return (lq) ((Object) this.field_m);
    }

    private final void a(int param0, int param1) {
        da var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -1) {
          return;
        }
        if (0 != (2 & this.field_i[param1])) {
          var3 = (da) (this.field_m.field_j.g(24009));
          while (var3 != null) {
            if (param1 == var3.field_q &&
              this.field_O[param1][var3.field_e] == null &&
              var3.field_s < 0) {
              var3.field_s = 0;
            }
            var3 = (da) (this.field_m.field_j.c(33));
          }
        }
    }

    private final void e(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0Lifetime1;
        int stackIn_28_1Lifetime1;
        var7 = Kickabout.field_G;
        if (param0 != 4204) {
          this.f(-128, -34);
        }
        var2 = this.field_K;
        var3 = this.field_H;
        var4 = this.field_P;
        if (this.field_x != null &&
          this.field_N == var3) {
          this.a(this.field_x, this.field_F, (byte) 101, this.field_r);
          this.e(4204);
          return;
        }
        L2: while (true) {
          stackIn_7_0 = this.field_H;
          stackIn_7_1 = var3;
          if (stackIn_7_0 == stackIn_7_1) {
            while (true) {
              stackIn_28_0 = this.field_k.field_e[var2];
              stackIn_28_1 = var3;
              if (stackIn_28_0 == stackIn_28_1) {
                this.field_k.c(var2);
                var6 = this.field_k.f(var2);
                stackIn_7_0 = 1;
                stackIn_7_1 = var6;
                if (stackIn_7_0 != stackIn_7_1) {
                  if ((var6 & 128) != 0) {
                    this.d(5, var6);
                  }
                  this.field_k.d(var2);
                  this.field_k.b(var2);
                  continue;
                }
                this.field_k.d();
                this.field_k.b(var2);
                if (this.field_k.a()) {
                  if (this.field_x != null) {
                    this.a(this.field_r, 19134, this.field_x);
                    this.e(param0 ^ 0);
                    return;
                  }
                  if (this.field_r &&
                    var3 != 0) {
                    this.field_k.a(var4);
                  } else {
                    this.a(true, false);
                    this.field_k.c();
                    return;
                  }
                }
              }
              break;
            }
            var2 = this.field_k.g();
            var3 = this.field_k.field_e[var2];
            var4 = this.field_k.e(var3);
            continue L2;
          }
          break;
        }
        this.field_H = var3;
        this.field_K = var2;
        this.field_P = var4;
        if (null == this.field_x) {
          return;
        }
        stackIn_28_0Lifetime1 = ~this.field_N;
        stackIn_28_1Lifetime1 = ~var3;
        if (stackIn_28_0Lifetime1 > stackIn_28_1Lifetime1) {
          this.field_K = -1;
          this.field_H = this.field_N;
          this.field_P = this.field_k.e(this.field_H);
        }
        return;
    }

    final boolean a(int param0, da param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25102) {
            this.field_m = (pp) null;
          }
          if (param1.field_F != null) {
            return false;
          }
          if (param1.field_s >= 0) {
            param1.c((byte) -109);
            if (param1.field_E > 0 &&
              this.field_Q[param1.field_q][param1.field_E] == param1) {
              this.field_Q[param1.field_q][param1.field_E] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ru.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int b(int param0, da param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gl var10 = null;
        gl var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (this.field_J[param1.field_q] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var10 = param1.field_j;
          var11 = var10;
          var4 = this.field_A[param1.field_q] * this.field_y[param1.field_q] + 4096 >> 13;
          var5 = 60 % ((param0 + 15) / 38);
          var4 = 16384 + var4 * var4 >> 15;
          var4 = param1.field_C * var4 + 16384 >> 15;
          var4 = this.field_u * var4 + 128 >> 8;
          var4 = var4 * this.field_J[param1.field_q] + 128 >> 8;
          if (var11.field_n > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var11.field_n * (0.00001953125 * (double)param1.field_f)));
          }
          if (var11.field_m != null) {
            var6 = param1.field_v;
            var7 = var11.field_m[1 + param1.field_t];
            if (param1.field_t < (-2 + var11.field_m.length)) {
              var8 = var10.field_m[param1.field_t] << 8 & 65280;
              var9 = var11.field_m[param1.field_t + 2] << 8 & 65280;
              var7 = var7 + (var6 - var8) * (var11.field_m[param1.field_t + 3] - var7) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if (param1.field_s > 0 &&
            var11.field_b != null) {
            var6Lifetime1 = param1.field_s;
            var7Lifetime1 = var11.field_b[param1.field_l + 1];
            if (param1.field_l < var11.field_b.length - 2) {
              var8Lifetime1 = (var10.field_b[param1.field_l] & 255) << 8;
              var9Lifetime1 = (255 & var11.field_b[2 + param1.field_l]) << 8;
              var7Lifetime1 = var7Lifetime1 + (-var7Lifetime1 + var11.field_b[3 + param1.field_l]) * (var6Lifetime1 - var8Lifetime1) / (var9Lifetime1 - var8Lifetime1);
            }
            var4 = var4 * var7Lifetime1 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ru.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_v[param1] = param2;
        if (param0 < 20) {
          this.d();
        }
    }

    public static void a(byte param0) {
        int var1 = -114 / ((34 - param0) / 59);
        field_t = null;
        field_l = null;
        field_M = null;
    }

    public ru() {
        this.field_E = new int[16];
        this.field_i = new int[16];
        this.field_Q = new da[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.field_s = new int[16];
        this.field_q = new int[16];
        this.field_I = new int[16];
        this.field_y = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_p = 1000000;
        this.field_G = new int[16];
        this.field_O = new da[16][128];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_B = new int[16];
        this.field_j = new int[16];
        this.field_o = new int[16];
        this.field_k = new rs();
        this.field_m = new pp(this);
        this.field_w = new kc(128);
        this.d(-1, -1, 256);
        this.a(true, false);
    }

    ru(ru param0) {
        this.field_E = new int[16];
        this.field_i = new int[16];
        this.field_Q = new da[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.field_s = new int[16];
        this.field_q = new int[16];
        this.field_I = new int[16];
        this.field_y = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_p = 1000000;
        this.field_G = new int[16];
        this.field_O = new da[16][128];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_B = new int[16];
        this.field_j = new int[16];
        this.field_o = new int[16];
        this.field_k = new rs();
        this.field_m = new pp(this);
        try {
          this.field_w = param0.field_w;
          this.d(-1, -1, 256);
          this.a(true, false);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ru.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new Random();
        field_M = new tf();
        field_t = "Click or press F10 to open Quick Chat";
    }
}
