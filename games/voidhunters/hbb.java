/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hbb extends f {
    private int[] field_A;
    private int field_q;
    private gnb field_E;
    private int[] field_G;
    private fkb[][] field_O;
    private int[] field_r;
    private q field_u;
    int[] field_j;
    private int field_p;
    private int[] field_K;
    private int[] field_M;
    static byte[] field_N;
    private int[] field_n;
    int[] field_v;
    private int[] field_y;
    private int[] field_t;
    private fkb[][] field_H;
    int[] field_l;
    static int field_z;
    private int[] field_o;
    private int[] field_D;
    private int[] field_I;
    private int[] field_B;
    private int[] field_x;
    private long field_h;
    private int field_m;
    private long field_i;
    private int field_F;
    private ht field_k;
    private boolean field_L;
    private boolean field_s;
    private int field_w;
    private kka field_C;

    private final void a(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        if (param0 != 144) {
          this.b(80, 70, -74);
        }
        fkb var3 = (fkb) (this.field_k.field_k.d(0));
        while (var3 != null) {
          if (0 > param1 ||
            var3.field_o == param1) {
            if (null != var3.field_j) {
              var3.field_j.f(vka.field_s / 100);
              if (var3.field_j.g()) {
                this.field_k.field_j.b(var3.field_j);
              }
              var3.c(25804);
            }
            if (var3.field_v < 0) {
              this.field_O[var3.field_o][var3.field_x] = null;
            }
            var3.b(param0 ^ -3990);
          }
          var3 = (fkb) (this.field_k.field_k.a((byte) 7));
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        this.c(param2, param0, param1 ^ 95);
        if (param1 != 96) {
          this.field_v = (int[]) null;
        }
    }

    private final void a(int param0, boolean param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.a(param0, true);
          }
          return;
        }
        this.field_x[param0] = 12800;
        this.field_o[param0] = 8192;
        this.field_I[param0] = 16383;
        this.field_t[param0] = 8192;
        this.field_r[param0] = 0;
        this.field_D[param0] = 8192;
        if (!param1) {
          return;
        }
        this.a(param0, (byte) -123);
        this.b(param0, false);
        this.field_v[param0] = 0;
        this.field_n[param0] = 32767;
        this.field_B[param0] = 256;
        this.field_j[param0] = 0;
        this.d(param0, 8192, 2);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          this.a(-128, false);
        }
    }

    private final int a(int param0, fkb param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        cja var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_d + (param1.field_h * param1.field_l >> 12);
          var3_int = var3_int + (this.field_B[param1.field_o] * (-8192 + this.field_t[param1.field_o]) >> 12);
          if (param0 < 7) {
            this.field_r = (int[]) null;
          }
          var4 = param1.field_g;
          if (var4.field_f > 0 && (!(var4.field_i <= 0) ||
            0 < this.field_r[param1.field_o])) {
            var5 = var4.field_i << 2;
            var6 = var4.field_e << 1;
            if (param1.field_q < var6) {
              var5 = param1.field_q * var5 / var6;
            }
            var5 = var5 + (this.field_r[param1.field_o] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_e & 511));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_y.field_f * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vka.field_s);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hbb.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, kka param1, int param2) {
        if (param2 != -1) {
          return;
        }
        try {
          this.a(param1, true, -11886, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hbb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int b(int param0, fkb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9259) {
            this.c();
          }
          var3_int = this.field_o[param1.field_o];
          if (var3_int >= 8192) {
            stackIn_6_0 = -((16384 - var3_int) * (-param1.field_u + 128) + 32 >> 6) + 16384;
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + param1.field_u * var3_int >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hbb.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        if (this.field_A[param0] != param2) {
          this.field_A[param0] = param2;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_H[param0][var4] = null;
          }
        }
        if (param1 >= -16) {
          fkb var6 = (fkb) null;
          discarded$0 = this.a(-85, (fkb) null);
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 != 6889) {
          this.a(-21, 97);
        }
        this.field_t[param0] = param1;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != 72) {
          this.a(false);
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 30) {
          fkb var4 = (fkb) null;
          this.a((fkb) null, true, false);
        }
        this.field_p = param1;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized f a() {
        return null;
    }

    final synchronized void b(boolean param0) {
        int var3 = VoidHunters.field_G;
        sd var2 = (sd) (this.field_E.c((byte) -123));
        if (param0) {
          kka var4 = (kka) null;
          this.a((kka) null, true, -105, false);
        }
        while (var2 != null) {
          var2.a(0);
          var2 = (sd) (this.field_E.b(-85));
        }
    }

    synchronized void a(kka param0, boolean param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        try {
          this.b(param1, true);
          this.field_u.a(param0.field_e);
          this.field_h = 0L;
          if (param2 != -11886) {
            fkb var8 = (fkb) null;
            discarded$0 = this.a(113, (fkb) null);
          }
          this.field_L = param3 ? true : false;
          var5_int = this.field_u.e();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_u.c(var6);
            this.field_u.e(var6);
            this.field_u.f(var6);
          }
          this.field_m = this.field_u.d();
          this.field_F = this.field_u.field_b[this.field_m];
          this.field_i = this.field_u.a(this.field_F);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hbb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized boolean a(bmb param0, int param1, asb param2, int param3, kka param4) {
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
        ghb var8 = null;
        int var9 = 0;
        sd var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          param4.a();
          var6_int = 1;
          var7 = null;
          if (param1 != -29476) {
            return false;
          }
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          var8 = (ghb) (param4.field_d.c((byte) 126));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_b;
            var10 = (sd) (this.field_E.a((long)var9, param1 ^ -29517));
            if (var10 == null) {
              var10 = waa.a(param2, (byte) 115, var9);
              if (var10 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_E.a((long)var9, var10, (byte) -122);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (!var10.a(1069, param0, (int[]) (var7), var8.field_d))) {
              var6_int = 0;
            }
            var8 = (ghb) (param4.field_d.b(param1 ^ 29545));
          }
          if (var6_int != 0) {
            param4.b();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("hbb.Q(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var3Lifetime1;
        if (param1) {
          this.a(144, -1);
        } else {
          this.c(0, -1);
        }
        this.a(-1, param0);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_A[var3] = this.field_G[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_M[var5] = dla.a(this.field_G[var5], -128);
          var5++;
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -67) {
          field_N = (byte[]) null;
        }
        return this.field_u.g();
    }

    final boolean a(int param0, int[] param1, int param2, fkb param3, byte param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        cja var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          param3.field_k = vka.field_s / 100;
          if (param3.field_v >= 0 && (param3.field_j == null ||
            param3.field_j.i())) {
            param3.c(25804);
            param3.b(-3846);
            if (0 < param3.field_s) {
              if (param3 != this.field_H[param3.field_o][param3.field_s]) {
                return true;
              }
              this.field_H[param3.field_o][param3.field_s] = null;
            }
            return true;
          }
          var6_int = param3.field_l;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_D[param3.field_o]) + 0.5);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.field_l = var6_int;
          }
          param3.field_j.g(this.a(93, param3));
          var7 = param3.field_g;
          param3.field_q = param3.field_q + 1;
          param3.field_e = param3.field_e + var7.field_f;
          var8 = 0;
          var9 = (double)((param3.field_x - 60 << 8) + (param3.field_l * param3.field_h >> 12)) * 0.000005086263020833333;
          if (0 < var7.field_b) {
            if (0 >= var7.field_c) {
              param3.field_i = param3.field_i + 128;
            } else {
              param3.field_i = param3.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
            }
            if (var7.field_b * param3.field_i >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_h != null) {
            if (var7.field_d <= 0) {
              param3.field_r = param3.field_r + 128;
            } else {
              param3.field_r = param3.field_r + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
            }
            while (param3.field_f < var7.field_h.length - 2) {
              if ((var7.field_h[param3.field_f + 2] << 8 & 65280) < param3.field_r) {
                param3.field_f = param3.field_f + 2;
                continue;
              }
              break;
            }
            if (param3.field_f == -2 + var7.field_h.length &&
              var7.field_h[1 + param3.field_f] == 0) {
              var8 = 1;
            }
          }
          if (0 <= param3.field_v &&
            null != var7.field_a &&
            0 == (1 & this.field_v[param3.field_o]) && (!(param3.field_s >= 0) ||
            param3 != this.field_H[param3.field_o][param3.field_s])) {
            if (var7.field_g > 0) {
              param3.field_v = param3.field_v + (int)(Math.pow(2.0, (double)var7.field_g * var9) * 128.0 + 0.5);
            } else {
              param3.field_v = param3.field_v + 128;
            }
            while (param3.field_w < var7.field_a.length - 2) {
              if (param3.field_v > ((255 & var7.field_a[2 + param3.field_w]) << 8)) {
                param3.field_w = param3.field_w + 2;
                continue;
              }
              break;
            }
            if (param3.field_w == var7.field_a.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            if (param4 >= -3) {
              this.field_u = (q) null;
            }
            param3.field_j.a(param3.field_k, this.b(param3, 0), this.b(9259, param3));
            return false;
          }
          param3.field_j.f(param3.field_k);
          if (param1 == null) {
            param3.field_j.a(param2);
          } else {
            param3.field_j.a(param1, param0, param2);
          }
          if (param3.field_j.g()) {
            this.field_k.field_j.b(param3.field_j);
          }
          param3.c(25804);
          if (param3.field_v >= 0) {
            param3.b(-3846);
            if (param3.field_s > 0 &&
              this.field_H[param3.field_o][param3.field_s] == param3) {
              this.field_H[param3.field_o][param3.field_s] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("hbb.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(')').toString());
        }
    }

    private final synchronized void b(boolean param0, boolean param1) {
        this.field_u.a();
        this.field_C = null;
        this.a(param1, param0);
        if (!param1) {
          this.field_I = (int[]) null;
        }
    }

    public static void c(boolean param0) {
        field_N = null;
        if (!param0) {
          hbb.c(false);
        }
    }

    synchronized void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_y[var4] = param0;
          }
        } else {
          this.field_y[param2] = param0;
        }
        if (param1 != 18) {
          field_z = 71;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = VoidHunters.field_G;
        if (this.field_u.g()) {
          var2 = this.field_u.field_c * this.field_p / vka.field_s;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_h;
            if (0L <= this.field_i - var3) {
              this.field_h = var3;
            } else {
              var5 = (int)((-1L + (long)var2 + (this.field_i - this.field_h)) / (long)var2);
              this.field_h = this.field_h + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_k.a(var5);
              this.d(-1);
              if (this.field_u.g()) {
                continue;
              }
            }
            break;
          }
          this.field_k.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_k.a(param0);
        }

    }

    final synchronized f c() {
        return (f) ((Object) this.field_k);
    }

    private final int b(fkb param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cja var9 = null;
        cja var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_y[param0.field_o] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_g;
          var10 = var9;
          var4 = this.field_x[param0.field_o] * this.field_I[param0.field_o] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param0.field_t >> 15;
          var4 = this.field_q * var4 + 128 >> 8;
          var4 = var4 * this.field_y[param0.field_o] + 128 >> 8;
          if (param1 < var10.field_b) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_i * 0.00001953125 * (double)var10.field_b) + 0.5);
          }
          if (null != var10.field_h) {
            var5 = param0.field_r;
            var6 = var10.field_h[1 + param0.field_f];
            if (var10.field_h.length - 2 > param0.field_f) {
              var7 = (var9.field_h[param0.field_f] & 255) << 8;
              var8 = (255 & var10.field_h[2 + param0.field_f]) << 8;
              var6 = var6 + (-var6 + var10.field_h[param0.field_f + 3]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (0 < param0.field_v &&
            var10.field_a != null) {
            var5Lifetime1 = param0.field_v;
            var6Lifetime1 = var10.field_a[1 + param0.field_w];
            if (param0.field_w < var10.field_a.length - 2) {
              var7Lifetime1 = var9.field_a[param0.field_w] << 8 & 65280;
              var8Lifetime1 = (255 & var10.field_a[2 + param0.field_w]) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.field_a[3 + param0.field_w] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("hbb.U(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != 127) {
          this.a(31, (byte) -113);
        }
        return this.field_q;
    }

    final synchronized void a(boolean param0) {
        this.b(true, param0);
    }

    synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (this.field_u.g()) {
            var4_int = this.field_p * this.field_u.field_c / vka.field_s;
            while (true) {
              var5 = this.field_h + (long)param2 * (long)var4_int;
              if (-var5 + this.field_i >= 0L) {
                this.field_h = var5;
                break;
              }
              var7 = (int)((-1L + this.field_i - this.field_h + (long)var4_int) / (long)var4_int);
              this.field_h = this.field_h + (long)var7 * (long)var4_int;
              this.field_k.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.d(-1);
              if (!this.field_u.g()) {
                break;
              }
            }
          }
          this.field_k.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("hbb.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(fkb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_j != null) {
            if (param1 != 0) {
              this.field_v = (int[]) null;
            }
            return false;
          }
          if (param0.field_v >= 0) {
            param0.b(-3846);
            if (param0.field_s > 0 &&
              param0 == this.field_H[param0.field_o][param0.field_s]) {
              this.field_H[param0.field_o][param0.field_s] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hbb.AB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_K[param0] = param1;
        this.field_l[param0] = (int)(0.5 + Math.pow((double)param2, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    private final void b(int param0, boolean param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if (param1) {
          this.field_L = true;
        }
        if ((4 & this.field_v[param0]) != 0) {
          var3 = (fkb) (this.field_k.field_k.d(0));
          while (var3 != null) {
            if (param0 == var3.field_o) {
              var3.field_p = 0;
            }
            var3 = (fkb) (this.field_k.field_k.a((byte) 117));
          }
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
        var8 = VoidHunters.field_G;
        var3 = param0 & 240;
        if (128 == var3) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (param0 & 8342805) >> 16;
          this.a(var6, var5, var4, (byte) 127);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (param0 & 32621) >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 <= 0) {
            this.a(64, var5Lifetime1, var4Lifetime1, (byte) 84);
          } else {
            this.b(var6Lifetime1, -21459, var5Lifetime1, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = param0 >> 8 & 127;
          var6Lifetime2 = (8343323 & param0) >> 16;
          this.a(var6Lifetime2, var5Lifetime2, true, var4Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (param1 != -19172) {
            return;
          }
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.a(var4Lifetime3, -105, this.field_M[var4Lifetime3] + var5Lifetime3);
            return;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (32717 & param0) >> 8;
            this.a(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, (byte) 72);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (16256 & param0 >> 9) + (127 & param0 >> 8);
            this.b(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 6889);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.a(true, true);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = (param0 & 32715) >> 8;
        var6Lifetime3 = (param0 & 8340936) >> 16;
        if (0 == var5Lifetime4) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 14) + dla.a(this.field_M[var4Lifetime4], -2080769);
        }
        if (var5Lifetime4 == 32) {
          this.field_M[var4Lifetime4] = dla.a(-16257, this.field_M[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (1 == var5Lifetime4) {
          this.field_r[var4Lifetime4] = dla.a(-16257, this.field_r[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_r[var4Lifetime4] = dla.a(-128, this.field_r[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_D[var4Lifetime4] = dla.a(this.field_D[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_D[var4Lifetime4] = dla.a(this.field_D[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_x[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(this.field_x[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.field_x[var4Lifetime4] = dla.a(-128, this.field_x[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_o[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(this.field_o[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_o[var4Lifetime4] = dla.a(this.field_o[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_I[var4Lifetime4] = dla.a(-16257, this.field_I[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_I[var4Lifetime4] = dla.a(this.field_I[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_v[var4Lifetime4] = knb.a(this.field_v[var4Lifetime4], 1);
          } else {
            this.field_v[var4Lifetime4] = dla.a(this.field_v[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, (byte) -89);
            this.field_v[var4Lifetime4] = dla.a(this.field_v[var4Lifetime4], -3);
          } else {
            this.field_v[var4Lifetime4] = knb.a(this.field_v[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.field_n[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(127, this.field_n[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.field_n[var4Lifetime4] = var6Lifetime3 + dla.a(this.field_n[var4Lifetime4], 16256);
        }
        if (var5Lifetime4 == 101) {
          this.field_n[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + dla.a(this.field_n[var4Lifetime4], 127);
        }
        if (100 == var5Lifetime4) {
          this.field_n[var4Lifetime4] = var6Lifetime3 + dla.a(this.field_n[var4Lifetime4], 16256) + 16384;
        }
        if (var5Lifetime4 == 120) {
          this.a(144, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a(var4Lifetime4, true);
        }
        if (123 == var5Lifetime4) {
          this.c(0, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_n[var4Lifetime4];
          if (var7 == 16384) {
            this.field_B[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(-16257, this.field_B[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_n[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_B[var4Lifetime4] = var6Lifetime3 + dla.a(-128, this.field_B[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_j[var4Lifetime4] = (var6Lifetime3 << 7) + dla.a(-16257, this.field_j[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.field_j[var4Lifetime4] = dla.a(this.field_j[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.field_v[var4Lifetime4] = knb.a(this.field_v[var4Lifetime4], 4);
          } else {
            this.b(var4Lifetime4, false);
            this.field_v[var4Lifetime4] = dla.a(this.field_v[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.d(var4Lifetime4, (var6Lifetime3 << 7) + (this.field_K[var4Lifetime4] & -16257), param1 + 19174);
        }
        if (49 == var5Lifetime4) {
          this.d(var4Lifetime4, (this.field_K[var4Lifetime4] & -128) + var6Lifetime3, param1 ^ -19170);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        fkb var6 = null;
        int var7 = VoidHunters.field_G;
        if (param3 <= 73) {
          this.field_p = -82;
        }
        fkb var8 = this.field_O[param2][param1];
        if (var8 == null) {
          return;
        }
        this.field_O[param2][param1] = null;
        if ((2 & this.field_v[param2]) == 0) {
          var8.field_v = 0;
        } else {
          var6 = (fkb) (this.field_k.field_k.d(0));
          while (var6 != null) {
            if (var8.field_o == var6.field_o &&
              var6.field_v < 0 &&
              var8 != var6) {
              var8.field_v = 0;
              break;
            }
            var6 = (fkb) (this.field_k.field_k.a((byte) 96));
          }
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
        var7 = VoidHunters.field_G;
        var2 = this.field_m;
        var3 = this.field_F;
        var4 = this.field_i;
        if (null != this.field_C &&
          this.field_w == var3) {
          this.a(this.field_C, this.field_s, -11886, this.field_L);
          this.d(param0 + 0);
          return;
        }
        if (param0 != -1) {
          this.a();
        }
        while (true) {
          if (var3 != this.field_F) {
            this.field_m = var2;
            this.field_F = var3;
            this.field_i = var4;
            if (null != this.field_C) {
              stackIn_23_0 = ~var3;
              stackIn_23_1 = ~this.field_w;
              if (stackIn_23_0 < stackIn_23_1) {
                this.field_F = this.field_w;
                this.field_m = -1;
                this.field_i = this.field_u.a(this.field_F);
              }
            }
            return;
          }
          while (~this.field_u.field_b[var2] == ~var3) {
            this.field_u.c(var2);
            var6 = this.field_u.d(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.b(var6, param0 - 19171);
              }
              this.field_u.e(var2);
              this.field_u.f(var2);
              continue;
            }
            this.field_u.c();
            this.field_u.f(var2);
            if (this.field_u.f()) {
              if (null != this.field_C) {
                this.a(this.field_L, this.field_C, param0 ^ 0);
                this.d(-1);
                return;
              }
              if (this.field_L &&
                var3 != 0) {
                this.field_u.a(var4);
              } else {
                this.a(true, true);
                this.field_u.a();
                return;
              }
            }
            break;
          }
          var2 = this.field_u.d();
          var3 = this.field_u.field_b[var2];
          var4 = this.field_u.a(var3);
        }
    }

    final void a(fkb param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (!param2) {
            this.field_O = (fkb[][]) null;
          }
          var4_int = param0.field_y.field_i.length;
          if (param1 &&
            param0.field_y.field_e) {
            var6 = -param0.field_y.field_g + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_j[param0.field_o] * (long)var6 >> 6);
            if (var4_int <= var5) {
              var5 = -var5 + var4_int + var4_int - 1;
              param0.field_j.a(true);
            }
          } else {
            var5 = (int)((long)this.field_j[param0.field_o] * (long)var4_int >> 6);
          }
          param0.field_j.c(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("hbb.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if ((this.field_v[param0] & 2) != 0) {
          var3 = (fkb) (this.field_k.field_k.d(0));
          while (var3 != null) {
            if (~var3.field_o == ~param0 &&
              null == this.field_O[param0][var3.field_x] &&
              var3.field_v < 0) {
              var3.field_v = 0;
            }
            var3 = (fkb) (this.field_k.field_k.a((byte) 78));
          }
        }
        if (param1 > -60) {
          this.b(121, (byte) 19, -123);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        fkb stackIn_17_1 = null;
        boolean stackIn_18_2 = false;
        fkb var5;
        int var6_int;
        gd var6;
        fkb var7;
        fkb var8;
        int var9;
        sd var10;
        sd var11;
        var9 = VoidHunters.field_G;
        this.a(64, param2, param3, (byte) 110);
        if (0 != (this.field_v[param3] & 2)) {
          var5 = (fkb) (this.field_k.field_k.b((byte) 122));
          while (var5 != null) {
            if (var5.field_o == param3 &&
              var5.field_v < 0) {
              this.field_O[param3][var5.field_x] = null;
              this.field_O[param3][param2] = var5;
              var6_int = (var5.field_h * var5.field_l >> 12) + var5.field_d;
              var5.field_d = var5.field_d + (-var5.field_x + param2 << 8);
              var5.field_x = param2;
              var5.field_l = 4096;
              var5.field_h = var6_int - var5.field_d;
              return;
            }
            var5 = (fkb) (this.field_k.field_k.a(param1 - 1155545385));
          }
        }
        var10 = (sd) (this.field_E.a((long)this.field_A[param3], 103));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_d[param2];
        if (var6 == null) {
          return;
        }
        var7 = new fkb();
        var7.field_n = var11;
        var7.field_y = var6;
        var7.field_o = param3;
        var7.field_g = var10.field_h[param2];
        var7.field_s = var10.field_j[param2];
        var7.field_x = param2;
        var7.field_t = var10.field_f[param2] * (var11.field_i * (param0 * param0)) + 1024 >> 11;
        var7.field_u = var10.field_g[param2] & 255;
        var7.field_d = (param2 << 8) - (32767 & var10.field_e[param2]);
        var7.field_v = -1;
        var7.field_i = 0;
        var7.field_f = 0;
        var7.field_w = 0;
        var7.field_r = 0;
        if (this.field_j[param3] != 0) {
          var7.field_j = fga.b(var6, this.a(92, var7), 0, this.b(9259, var7));
          stackIn_17_1 = var7;
          stackIn_18_2 = !(var11.field_e[param2] >= 0);
          this.a(stackIn_17_1, stackIn_18_2, true);
        } else {
          var7.field_j = fga.b(var6, this.a(param1 ^ -21404, var7), this.b(var7, 0), this.b(9259, var7));
        }
        if (var11.field_e[param2] < 0) {
          var7.field_j.d(-1);
        }
        if (var7.field_s >= 0) {
          var8 = this.field_H[param3][var7.field_s];
          if (var8 != null &&
            var8.field_v < 0) {
            this.field_O[param3][var8.field_x] = null;
            var8.field_v = 0;
          }
          this.field_H[param3][var7.field_s] = var7;
        }
        if (param1 != -21459) {
          this.b(84, -87, 32);
        }
        this.field_k.field_k.b(-10258, var7);
        this.field_O[param3][param2] = var7;
        return;
    }

    private final void c(int param0, int param1, int param2) {
        this.field_G[param0] = param1;
        this.field_M[param0] = dla.a(-128, param1);
        this.a(param0, -81, param1);
        if (param2 <= 0) {
          this.e(26);
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_q = param0;
        if (param1 != 14) {
          this.field_o = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        int var4 = VoidHunters.field_G;
        fkb var3 = (fkb) (this.field_k.field_k.d(param0));
        while (var3 != null) {
          if ((param1 < 0 || var3.field_o == param1) &&
            0 > var3.field_v) {
            this.field_O[var3.field_o][var3.field_x] = null;
            var3.field_v = 0;
          }
          var3 = (fkb) (this.field_k.field_k.a((byte) 10));
        }
    }

    public hbb() {
        this.field_r = new int[16];
        this.field_q = 256;
        this.field_O = new fkb[16][128];
        this.field_K = new int[16];
        this.field_j = new int[16];
        this.field_p = 1000000;
        this.field_M = new int[16];
        this.field_H = new fkb[16][128];
        this.field_t = new int[16];
        this.field_l = new int[16];
        this.field_y = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_n = new int[16];
        this.field_A = new int[16];
        this.field_I = new int[16];
        this.field_D = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_x = new int[16];
        this.field_u = new q();
        this.field_k = new ht(this);
        this.field_E = new gnb(128);
        this.b(256, (byte) 18, -1);
        this.a(true, true);
    }

    hbb(hbb param0) {
        this.field_r = new int[16];
        this.field_q = 256;
        this.field_O = new fkb[16][128];
        this.field_K = new int[16];
        this.field_j = new int[16];
        this.field_p = 1000000;
        this.field_M = new int[16];
        this.field_H = new fkb[16][128];
        this.field_t = new int[16];
        this.field_l = new int[16];
        this.field_y = new int[16];
        this.field_o = new int[16];
        this.field_v = new int[16];
        this.field_n = new int[16];
        this.field_A = new int[16];
        this.field_I = new int[16];
        this.field_D = new int[16];
        this.field_B = new int[16];
        this.field_G = new int[16];
        this.field_x = new int[16];
        this.field_u = new q();
        this.field_k = new ht(this);
        try {
          this.field_E = param0.field_E;
          this.b(256, (byte) 18, -1);
          this.a(true, true);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hbb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new byte[520];
        field_z = 0;
    }
}
