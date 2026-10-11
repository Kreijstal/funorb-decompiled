/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp extends tda {
    private int[] field_I;
    private int[] field_D;
    private js field_m;
    private int[] field_F;
    private int field_L;
    private int[] field_v;
    private int[] field_N;
    private int[] field_n;
    private int[] field_A;
    int[] field_y;
    int[] field_M;
    private int[] field_r;
    private fh[][] field_B;
    private int[] field_x;
    private int[] field_J;
    int[] field_u;
    private int[] field_C;
    private int[] field_w;
    private vga field_z;
    private int[] field_s;
    private fh[][] field_H;
    private int field_t;
    private long field_K;
    private long field_q;
    private int field_o;
    private boolean field_j;
    private int field_l;
    private jja field_k;
    private int field_G;
    private kia field_E;
    private boolean field_p;

    private final void d(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        fh var3 = (fh) (this.field_k.field_k.b((byte) 90));
        while (var3 != null) {
          if ((0 > param1 || param1 == var3.field_n) &&
            !(var3.field_p >= 0)) {
            this.field_H[var3.field_n][var3.field_h] = null;
            var3.field_p = 0;
          }
          var3 = (fh) (this.field_k.field_k.c(0));
        }
        if (param0 != 1) {
          this.a(-84, -53);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_19_1 = 0;
        fh stackIn_19_2 = null;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        fh var5;
        int var6_int;
        be var6;
        fh var7;
        fh var8;
        int var9;
        kia var10;
        eka var11;
        eka var12;
        var9 = BachelorFridge.field_y;
        this.a(param3, 64, param2, (byte) -51);
        if ((this.field_u[param2] & 2) != 0) {
          var5 = (fh) (this.field_k.field_k.a(6));
          while (var5 != null) {
            if (param2 == var5.field_n &&
              var5.field_p < 0) {
              this.field_H[param2][var5.field_h] = null;
              this.field_H[param2][param3] = var5;
              var6_int = var5.field_x + (var5.field_y * var5.field_C >> 12);
              var5.field_x = var5.field_x + (param3 - var5.field_h << 8);
              var5.field_h = param3;
              var5.field_C = -var5.field_x + var6_int;
              var5.field_y = 4096;
              return;
            }
            var5 = (fh) (this.field_k.field_k.c((byte) 116));
          }
        }
        var11 = (eka) (this.field_m.a(true, (long)this.field_n[param2]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_m[param3];
        if (var6 == null) {
          return;
        }
        var7 = new fh();
        var7.field_n = param2;
        var7.field_j = var12;
        var7.field_f = var6;
        var7.field_B = var11.field_l[param3];
        var7.field_k = var11.field_j[param3];
        var7.field_h = param3;
        var7.field_u = var11.field_i[param3] * (var12.field_h * param0) * param0 + 1024 >> 11;
        var7.field_g = var11.field_f[param3] & 255;
        var7.field_x = (param3 << 8) - (var11.field_n[param3] & 32767);
        var7.field_q = 0;
        var7.field_w = 0;
        var7.field_l = 0;
        var7.field_A = 0;
        if (param1 != -20446) {
          var10 = (kia) null;
          this.a(true, false, (kia) null, 33);
        }
        var7.field_p = -1;
        if (this.field_y[param2] == 0) {
          var7.field_z = je.a(var6, this.a((byte) -78, var7), this.a(false, var7), this.a(806727846, var7));
        } else {
          var7.field_z = je.a(var6, this.a((byte) -105, var7), 0, this.a(806727846, var7));
          stackIn_19_1 = 809594182;
          stackIn_19_2 = var7;
          if (var11.field_n[param3] >= 0) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.a(stackIn_19_1, stackIn_19_2, stackIn_20_3);
        }
        if (var11.field_n[param3] < 0) {
          var7.field_z.d(-1);
        }
        if (var7.field_k >= 0) {
          var8 = this.field_B[param2][var7.field_k];
          if (var8 != null &&
            var8.field_p < 0) {
            this.field_H[param2][var8.field_h] = null;
            var8.field_p = 0;
          }
          this.field_B[param2][var7.field_k] = var7;
        }
        this.field_k.field_k.a(var7, true);
        this.field_H[param2][param3] = var7;
        return;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = BachelorFridge.field_y;
        if (this.field_z.f()) {
          var2 = this.field_z.field_a * this.field_L / pb.field_j;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_q;
            if (this.field_K - var3 >= 0L) {
              this.field_q = var3;
              break;
            }
            var5 = (int)(((long)var2 + (-this.field_q + this.field_K - 1L)) / (long)var2);
            this.field_q = this.field_q + (long)var5 * (long)var2;
            this.field_k.a(var5);
            param0 = param0 - var5;
            this.d(-3305);
            if (this.field_z.f()) {
              continue;
            }
            this.field_k.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_k.a(param0);
        }

    }

    private final void a(byte param0, int param1) {
        int var4 = BachelorFridge.field_y;
        if (param0 <= 17) {
          return;
        }
        fh var3 = (fh) (this.field_k.field_k.b((byte) 90));
        while (var3 != null) {
          if (0 > param1 ||
            param1 == var3.field_n) {
            if (var3.field_z != null) {
              var3.field_z.c(pb.field_j / 100);
              if (var3.field_z.e()) {
                this.field_k.field_j.a(var3.field_z);
              }
              var3.a(-91);
            }
            if (!(var3.field_p >= 0)) {
              this.field_H[var3.field_n][var3.field_h] = null;
            }
            var3.a(false);
          }
          var3 = (fh) (this.field_k.field_k.c(0));
        }
    }

    final boolean a(fh param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_z) {
            if (param1 != 95) {
              this.a(-108, true, 57);
            }
            return false;
          }
          if (param0.field_p >= 0) {
            param0.a(false);
            if (0 < param0.field_k &&
              this.field_B[param0.field_n][param0.field_k] == param0) {
              this.field_B[param0.field_n][param0.field_k] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jp.JA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
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
        var8 = BachelorFridge.field_y;
        try {
          if (this.field_z.f()) {
            var4_int = this.field_L * this.field_z.field_a / pb.field_j;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_q;
              if (-var5 + this.field_K >= 0L) {
                this.field_q = var5;
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (this.field_K - this.field_q)) / (long)var4_int);
              this.field_q = this.field_q + (long)var4_int * (long)var7;
              this.field_k.a(param0, param1, var7);
              param1 = param1 + var7;
              param2 = param2 - var7;
              this.d(-3305);
              if (this.field_z.f()) {
                continue;
              }
              this.field_k.a(param0, param1, param2);
              return;
            }
          }
          this.field_k.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("jp.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        this.field_t = param1;
        if (param0 != 23679) {
          this.field_M = (int[]) null;
        }
    }

    private final void d(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = BachelorFridge.field_y;
        var2 = this.field_l;
        var3 = this.field_o;
        if (param0 != -3305) {
          return;
        }
        var4 = this.field_K;
        if (this.field_E != null &&
          this.field_G == var3) {
          this.a(this.field_j, this.field_p, this.field_E, param0 ^ -20546);
          this.d(-3305);
          return;
        }
        while (true) {
          if (var3 != this.field_o) {
            this.field_o = var3;
            this.field_K = var4;
            this.field_l = var2;
            if (null != this.field_E) {
              stackIn_23_0 = var3;
              stackIn_23_1 = this.field_G;
              if (stackIn_23_0 > stackIn_23_1) {
                this.field_o = this.field_G;
                this.field_l = -1;
                this.field_K = this.field_z.b(this.field_o);
              }
            }
            return;
          }
          while (var3 == this.field_z.field_i[var2]) {
            this.field_z.c(var2);
            var6 = this.field_z.a(var2);
            if (1 != var6) {
              if ((128 & var6) != 0) {
                this.b(var6, 15);
              }
              this.field_z.e(var2);
              this.field_z.f(var2);
              continue;
            }
            this.field_z.d();
            this.field_z.f(var2);
            if (this.field_z.e()) {
              if (this.field_E != null) {
                this.a(this.field_E, (byte) -110, this.field_j);
                this.d(-3305);
                return;
              }
              if (this.field_j &&
                var3 != 0) {
                this.field_z.a(var4);
              } else {
                this.a(true, 122);
                this.field_z.a();
                return;
              }
            }
            break;
          }
          var2 = this.field_z.g();
          var3 = this.field_z.field_i[var2];
          var4 = this.field_z.b(var3);
        }
    }

    private final int a(int param0, fh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_D[param1.field_n];
          if (param0 != 806727846) {
            this.field_v = (int[]) null;
          }
          if (8192 > var3_int) {
            stackIn_6_0 = param1.field_g * var3_int + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - ((-var3_int + 16384) * (-param1.field_g + 128) + 32 >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jp.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void d(int param0, byte param1, int param2) {
        if (param1 <= 60) {
          this.field_J = (int[]) null;
        }
        this.field_C[param2] = param0;
        this.field_M[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var5 = BachelorFridge.field_y;
        int var3Lifetime1;
        if (!param0) {
          this.d(1, -1);
        } else {
          this.a((byte) 112, -1);
        }
        this.a(-1, (byte) -22);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_n[var3] = this.field_I[var3];
        }
        int var4 = -117 % ((param1 - 54) / 36);
        int var6 = 0;
        var3Lifetime1 = var6;
        while (16 > var6) {
          this.field_F[var6] = dda.a(-128, this.field_I[var6]);
          var6++;
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4;
        var4 = 112 % ((19 - param2) / 49);
        if (param1 >= 0 &&
          param1 <= 11) {
          if (param3 < 1) {
            return false;
          }
          if (param3 <= vj.a(param1, param0, (byte) 126)) {
            return true;
          }
          return false;
        }
        return false;
    }

    private final void c(int param0, byte param1, int param2) {
        if (param1 != -56) {
          this.a(6, true, -45);
        }
    }

    private final void e(int param0, int param1) {
        fh var3 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 <= 5) {
          return;
        }
        if (0 != (2 & this.field_u[param1])) {
          var3 = (fh) (this.field_k.field_k.b((byte) 90));
          while (var3 != null) {
            if (var3.field_n == param1 &&
              this.field_H[param1][var3.field_h] == null &&
              var3.field_p < 0) {
              var3.field_p = 0;
            }
            var3 = (fh) (this.field_k.field_k.c(0));
          }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 != -50) {
          return;
        }
        this.field_I[param0] = param2;
        this.field_F[param0] = dda.a(param2, -128);
        this.a((byte) -76, param2, param0);
    }

    final boolean a(int param0, fh param1, int[] param2, int param3, boolean param4) {
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          param1.field_r = pb.field_j / 100;
          if (0 <= param1.field_p && (param1.field_z == null ||
            param1.field_z.h())) {
            param1.a(123);
            param1.a(false);
            if (0 < param1.field_k &&
              this.field_B[param1.field_n][param1.field_k] == param1) {
              this.field_B[param1.field_n][param1.field_k] = null;
              return true;
            }
            return true;
          }
          var6_int = param1.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)this.field_s[param1.field_n]) * 16.0);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param1.field_y = var6_int;
          }
          param1.field_z.e(this.a((byte) -78, param1));
          var7 = param1.field_B;
          var8 = param4 ? 1 : 0;
          param1.field_o = param1.field_o + 1;
          param1.field_m = param1.field_m + var7.field_c;
          var9 = (double)((param1.field_y * param1.field_C >> 12) + (-60 + param1.field_h << 8)) * 0.000005086263020833333;
          if (var7.field_e > 0) {
            if (var7.field_h <= 0) {
              param1.field_w = param1.field_w + 128;
            } else {
              param1.field_w = param1.field_w + (int)(0.5 + Math.pow(2.0, (double)var7.field_h * var9) * 128.0);
            }
            if (var7.field_e * param1.field_w >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_j) {
            if (0 >= var7.field_d) {
              param1.field_l = param1.field_l + 128;
            } else {
              param1.field_l = param1.field_l + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
            }
            while (var7.field_j.length - 2 > param1.field_A) {
              if ((65280 & var7.field_j[2 + param1.field_A] << 8) < param1.field_l) {
                param1.field_A = param1.field_A + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_j.length == param1.field_A &&
              var7.field_j[1 + param1.field_A] == 0) {
              var8 = 1;
            }
          }
          if (param1.field_p >= 0 &&
            null != var7.field_b &&
            0 == (1 & this.field_u[param1.field_n]) && (!(0 <= param1.field_k) ||
            param1 != this.field_B[param1.field_n][param1.field_k])) {
            if (var7.field_k > 0) {
              param1.field_p = param1.field_p + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
            } else {
              param1.field_p = param1.field_p + 128;
            }
            while (param1.field_q < -2 + var7.field_b.length) {
              if ((var7.field_b[param1.field_q + 2] << 8 & 65280) < param1.field_p) {
                param1.field_q = param1.field_q + 2;
                continue;
              }
              break;
            }
            if (var7.field_b.length - 2 == param1.field_q) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_z.a(param1.field_r, this.a(false, param1), this.a(806727846, param1));
            return false;
          }
          param1.field_z.c(param1.field_r);
          if (param2 == null) {
            param1.field_z.a(param3);
          } else {
            param1.field_z.a(param2, param0, param3);
          }
          if (param1.field_z.e()) {
            this.field_k.field_j.a(param1.field_z);
          }
          param1.a(117);
          if (0 <= param1.field_p) {
            param1.a(false);
            if (param1.field_k > 0 &&
              param1 == this.field_B[param1.field_n][param1.field_k]) {
              this.field_B[param1.field_n][param1.field_k] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_66_0 = var6;
          stackIn_66_1 = new StringBuilder().append("jp.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized void a(kia param0, byte param1, boolean param2) {
        if (param1 > -108) {
          return;
        }
        try {
          this.a(param2, true, param0, 23721);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jp.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, fh param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        un var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_C * param1.field_y >> 12) + param1.field_x;
          var3_int = var3_int + ((this.field_x[param1.field_n] - 8192) * this.field_A[param1.field_n] >> 12);
          var4 = param1.field_B;
          if (0 < var4.field_c && (!(0 >= var4.field_l) ||
            0 < this.field_r[param1.field_n])) {
            var5 = var4.field_l << 2;
            var6 = var4.field_g << 1;
            if (var6 > param1.field_o) {
              var5 = param1.field_o * var5 / var6;
            }
            var5 = var5 + (this.field_r[param1.field_n] >> 7);
            var7 = Math.sin((double)(511 & param1.field_m) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          if (param0 > -58) {
            this.b();
          }
          var5Lifetime1 = (int)((double)(param1.field_f.field_h * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)pb.field_j + 0.5);
          stackIn_13_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("jp.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5;
        fh var6;
        var5 = BachelorFridge.field_y;
        if (param2 != -107) {
          var6 = (fh) null;
          this.a((fh) null, (byte) -27);
        }
        if (param0 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_v[var4] = param1;
          }
        } else {
          this.field_v[param0] = param1;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 55 / ((param0 - 4) / 50);
          if (hh.field_d != param1) {
            jq.field_k = new int[param1];
            for (var4 = 0; param1 > var4; var4++) {
              jq.field_k[var4] = (var4 << 12) / param1;
            }
            wp.field_r = param1 - 1;
            qna.field_k = 32 * param1;
            hh.field_d = param1;
          }
          if (param2 != bi.field_g) {
            if (param2 != hh.field_d) {
              tj.field_f = new int[param2];
              for (var4Lifetime1 = 0; param2 > var4Lifetime1; var4Lifetime1++) {
                tj.field_f[var4Lifetime1] = (var4Lifetime1 << 12) / param2;
              }
            } else {
              tj.field_f = jq.field_k;
            }
            it.field_r = param2 - 1;
            bi.field_g = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "jp.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, fh param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          var4_int = param1.field_f.field_i.length;
          if (param2 &&
            param1.field_f.field_k) {
            var6 = var4_int + (var4_int - param1.field_f.field_g);
            var5 = (int)((long)this.field_y[param1.field_n] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              var5 = -1 + (var4_int + (var4_int - var5));
              param1.field_z.b(true);
            }
          } else {
            var5 = (int)((long)this.field_y[param1.field_n] * (long)var4_int >> 6);
          }
          if (param0 != 809594182) {
            this.field_E = (kia) null;
          }
          param1.field_z.b(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("jp.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
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
        var8 = BachelorFridge.field_y;
        if (param1 != 15) {
          return;
        }
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = param0 & 15;
          var5 = (param0 & 32675) >> 8;
          var6 = 127 & param0 >> 16;
          this.a(var5, var6, var4, (byte) -51);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = 127 & param0 >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 <= 0) {
            this.a(var5Lifetime1, 64, var4Lifetime1, (byte) -51);
          } else {
            this.b(var6Lifetime1, -20446, var4Lifetime1, var5Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (32666 & param0) >> 8;
          var6Lifetime2 = param0 >> 16 & 127;
          this.a(-18793, var5Lifetime2, var4Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param0;
            var5Lifetime3 = param0 >> 8 & 127;
            this.a((byte) -81, this.field_F[var4Lifetime3] + var5Lifetime3, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (32514 & param0) >> 8;
            this.c(var5Lifetime3Lifetime1, (byte) -56, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = (param0 >> 8 & 127) + (16256 & param0 >> 9);
            this.a(var5Lifetime3Lifetime2, false, var4Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.a(true, -27);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (32608 & param0) >> 8;
        var6Lifetime3 = param0 >> 16 & 127;
        if (var5Lifetime4 == 0) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 14) + dda.a(-2080769, this.field_F[var4Lifetime4]);
        }
        if (32 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(this.field_F[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.field_r[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(this.field_r[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 33) {
          this.field_r[var4Lifetime4] = var6Lifetime3 + dda.a(-128, this.field_r[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.field_s[var4Lifetime4] = dda.a(this.field_s[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_s[var4Lifetime4] = var6Lifetime3 + dda.a(this.field_s[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 7) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(this.field_J[var4Lifetime4], -16257);
        }
        if (39 == var5Lifetime4) {
          this.field_J[var4Lifetime4] = dda.a(-128, this.field_J[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_D[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(-16257, this.field_D[var4Lifetime4]);
        }
        if (42 == var5Lifetime4) {
          this.field_D[var4Lifetime4] = var6Lifetime3 + dda.a(this.field_D[var4Lifetime4], -128);
        }
        if (11 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(-16257, this.field_N[var4Lifetime4]);
        }
        if (43 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = var6Lifetime3 + dda.a(this.field_N[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 64) {
          if (64 > var6Lifetime3) {
            this.field_u[var4Lifetime4] = dda.a(this.field_u[var4Lifetime4], -2);
          } else {
            this.field_u[var4Lifetime4] = mp.a(this.field_u[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.field_u[var4Lifetime4] = mp.a(this.field_u[var4Lifetime4], 2);
          } else {
            this.e(49, var4Lifetime4);
            this.field_u[var4Lifetime4] = dda.a(this.field_u[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_w[var4Lifetime4] = dda.a(127, this.field_w[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_w[var4Lifetime4] = dda.a(this.field_w[var4Lifetime4], 16256) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_w[var4Lifetime4] = dda.a(this.field_w[var4Lifetime4], 127) + (16384 + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_w[var4Lifetime4] = dda.a(16256, this.field_w[var4Lifetime4]) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.a((byte) 98, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a(var4Lifetime4, (byte) -22);
        }
        if (var5Lifetime4 == 123) {
          this.d(1, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_w[var4Lifetime4];
          if (16384 == var7) {
            this.field_A[var4Lifetime4] = dda.a(this.field_A[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_w[var4Lifetime4];
          if (16384 == var7Lifetime1) {
            this.field_A[var4Lifetime4] = dda.a(-128, this.field_A[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_y[var4Lifetime4] = (var6Lifetime3 << 7) + dda.a(-16257, this.field_y[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.field_y[var4Lifetime4] = dda.a(-128, this.field_y[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 < 64) {
            this.f(-28068, var4Lifetime4);
            this.field_u[var4Lifetime4] = dda.a(this.field_u[var4Lifetime4], -5);
          } else {
            this.field_u[var4Lifetime4] = mp.a(this.field_u[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.d((var6Lifetime3 << 7) + (-16257 & this.field_C[var4Lifetime4]), (byte) 113, var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.d(var6Lifetime3 + (-128 & this.field_C[var4Lifetime4]), (byte) 99, var4Lifetime4);
          return;
        }
        return;
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (param0 >= -27) {
          this.field_w = (int[]) null;
        }
        if (param1 != this.field_n[param2]) {
          this.field_n[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_B[param2][var4] = null;
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_z.a();
        if (!param1) {
          this.a(-48, 13, 7, 105);
        }
        this.field_E = null;
        this.a(param0, -127);
    }

    final synchronized void b(int param0) {
        int var3 = BachelorFridge.field_y;
        if (param0 != -5359) {
          this.d();
        }
        eka var4 = (eka) (this.field_m.b(param0 ^ 9776));
        while (var4 != null) {
          var4.b(false);
          var4 = (eka) (this.field_m.c(-21446));
        }
    }

    private final synchronized void a(boolean param0, boolean param1, kia param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        try {
          this.a(param1, true);
          this.field_z.a(param2.field_g);
          this.field_q = 0L;
          this.field_j = param0 ? true : false;
          var5_int = this.field_z.c();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_z.c(var6);
            this.field_z.e(var6);
            this.field_z.f(var6);
          }
          if (param3 != 23721) {
            this.c(-121, (byte) -69, 4);
          }
          this.field_l = this.field_z.g();
          this.field_o = this.field_z.field_i[this.field_l];
          this.field_K = this.field_z.b(this.field_o);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jp.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 < 0) {
          for (param0 = 0; 16 > param0; param0++) {
            this.a(param0, (byte) -22);
          }
        } else {
          this.field_J[param0] = 12800;
          this.field_D[param0] = 8192;
          this.field_N[param0] = 16383;
          this.field_x[param0] = 8192;
          if (param1 != -22) {
            this.field_L = 28;
          }
          this.field_r[param0] = 0;
          this.field_s[param0] = 8192;
          this.e(param1 + 34, param0);
          this.f(-28068, param0);
          this.field_u[param0] = 0;
          this.field_w[param0] = 32767;
          this.field_A[param0] = 256;
          this.field_y[param0] = 0;
          this.d(8192, (byte) 93, param0);
        }
    }

    final synchronized tda a() {
        return null;
    }

    final synchronized void c(int param0, int param1) {
        this.field_L = param1;
        if (param0 != 224) {
          this.field_o = -86;
        }
    }

    private final int a(boolean param0, fh param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        un var9 = null;
        un var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
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
          if (this.field_v[param1.field_n] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param1.field_B;
          var10 = var9;
          var4 = 4096 + this.field_N[param1.field_n] * this.field_J[param1.field_n] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = var4 * param1.field_u + 16384 >> 15;
          var4 = 128 + this.field_t * var4 >> 8;
          var4 = 128 + this.field_v[param1.field_n] * var4 >> 8;
          if (var10.field_e > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param1.field_w * 0.00001953125 * (double)var10.field_e) + 0.5);
          }
          if (param0) {
            stackIn_7_0 = -64;
            return stackIn_7_0;
          }
          if (null != var10.field_j) {
            var5 = param1.field_l;
            var6 = var10.field_j[1 + param1.field_A];
            if (param1.field_A < -2 + var10.field_j.length) {
              var7 = var9.field_j[param1.field_A] << 8 & 65280;
              var8 = (255 & var10.field_j[2 + param1.field_A]) << 8;
              var6 = var6 + (-var6 + var10.field_j[param1.field_A + 3]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param1.field_p > 0 &&
            var10.field_b != null) {
            var5Lifetime1 = param1.field_p;
            var6Lifetime1 = var10.field_b[param1.field_q + 1];
            if (var10.field_b.length - 2 > param1.field_q) {
              var7Lifetime1 = var9.field_b[param1.field_q] << 8 & 65280;
              var8Lifetime1 = var10.field_b[2 + param1.field_q] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (var10.field_b[3 + param1.field_q] - var6Lifetime1) * (var5Lifetime1 - var7Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("jp.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final synchronized tda b() {
        return (tda) ((Object) this.field_k);
    }

    final synchronized void b(boolean param0) {
        this.a(param0, true);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        fh var6 = null;
        int var7 = BachelorFridge.field_y;
        if (param3 != -51) {
          this.b(107);
        }
        fh var8 = this.field_H[param2][param0];
        if (var8 == null) {
          return;
        }
        this.field_H[param2][param0] = null;
        if ((this.field_u[param2] & 2) == 0) {
          var8.field_p = 0;
        } else {
          var6 = (fh) (this.field_k.field_k.b((byte) 90));
          while (var6 != null) {
            if (var6.field_n == var8.field_n && var6.field_p < 0 &&
              var6 != var8) {
              var8.field_p = 0;
              break;
            }
            var6 = (fh) (this.field_k.field_k.c(param3 + 51));
          }
        }
    }

    private final void f(int param0, int param1) {
        fh var3 = null;
        int var4 = BachelorFridge.field_y;
        if ((4 & this.field_u[param1]) != 0) {
          var3 = (fh) (this.field_k.field_k.b((byte) 90));
          while (var3 != null) {
            if (param1 == var3.field_n) {
              var3.field_t = 0;
            }
            var3 = (fh) (this.field_k.field_k.c(param0 + 28068));
          }
        }
        if (param0 != -28068) {
          this.field_l = 78;
        }
    }

    final synchronized boolean a(vr param0, kia param1, i param2, byte param3, int param4) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        g var8 = null;
        int var9 = 0;
        int var10 = 0;
        eka var11 = null;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          param1.a();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (g) (param1.field_f.b(-13023));
          var9 = 47 / ((57 - param3) / 37);
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var10 = (int)var8.field_c;
            var11 = (eka) (this.field_m.a(true, (long)var10));
            if (var11 == null) {
              var11 = wj.a(param0, false, var10);
              if (var11 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_m.a((long)var10, (byte) -89, var11);
                decompiledFrameRemainder0 = !(var11.a(var8.field_h, 1436234146, param2, (int[]) (var7)));
              }
            } else {
              decompiledFrameRemainder0 = !(var11.a(var8.field_h, 1436234146, param2, (int[]) (var7)));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (g) (param1.field_f.c(-21446));
          }
          if (var6_int != 0) {
            param1.b();
          }
          stackIn_17_0 = var6_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("jp.N(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        if (param1 != 39) {
          return;
        }
        this.b(param2, (byte) -50, param0);
    }

    final synchronized boolean c(int param0) {
        if (param0 != 28607) {
          return false;
        }
        return this.field_z.f();
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param1) {
          return;
        }
        this.field_x[param2] = param0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -18793) {
          this.field_A = (int[]) null;
        }
    }

    public jp() {
        this.field_I = new int[16];
        this.field_F = new int[16];
        this.field_v = new int[16];
        this.field_A = new int[16];
        this.field_D = new int[16];
        this.field_L = 1000000;
        this.field_y = new int[16];
        this.field_J = new int[16];
        this.field_C = new int[16];
        this.field_r = new int[16];
        this.field_w = new int[16];
        this.field_u = new int[16];
        this.field_x = new int[16];
        this.field_N = new int[16];
        this.field_s = new int[16];
        this.field_H = new fh[16][128];
        this.field_n = new int[16];
        this.field_t = 256;
        this.field_M = new int[16];
        this.field_B = new fh[16][128];
        this.field_z = new vga();
        this.field_k = new jja(this);
        this.field_m = new js(128);
        this.a(-1, 256, (byte) -107);
        this.a(true, 106);
    }

    static {
    }
}
