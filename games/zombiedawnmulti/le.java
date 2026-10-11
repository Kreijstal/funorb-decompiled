/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends cf {
    static String field_I;
    int field_B;
    private int field_N;
    private int field_D;
    private int field_J;
    private int field_H;
    private ja field_C;
    private int field_K;
    private int field_E;
    private ja field_O;
    boolean field_L;
    static String[] field_P;
    static String field_G;
    private ja field_M;
    private ja[] field_F;

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 0) {
          return 0;
        }
        var2 = 81 / ((-3 - param1) / 39);
        if (0 > param0) {
          throw new IllegalArgumentException("");
        }
        if (param0 >= 32768) {
          if (param0 < 131072) {
            return pk.field_a[param0 - 32768];
          }
          if (param0 < 33554432) {
            if (param0 >= 2097152) {
              var3 = (param0 < 8388608) ? 3 : 4;
            } else {
              var3 = (param0 >= 524288) ? 2 : 1;
            }
          } else {
            if (param0 < 536870912) {
              var3 = (param0 < 134217728) ? 5 : 6;
            } else {
              var3 = 7;
            }
          }
          param0 = param0 >> (var3 << 1);
          return pk.field_a[-32768 + param0] << var3;
        }
        if (param0 >= 128) {
          if (param0 < 2048) {
            if (param0 < 512) {
              var3Lifetime1 = 4;
            } else {
              var3Lifetime1 = 3;
            }
          } else {
            var3Lifetime1 = (8192 <= param0) ? 1 : 2;
          }
        } else {
          if (param0 < 8) {
            if (param0 < 2) {
              return 256;
            }
            var3Lifetime1 = 7;
          } else {
            var3Lifetime1 = (param0 >= 32) ? 5 : 6;
          }
        }
        param0 = param0 << (var3Lifetime1 << 1);
        return pk.field_a[-32768 + param0] >> var3Lifetime1;
    }

    final static boolean b(int param0, byte param1) {
        if (-1 == param0) {
          return true;
        }
        if (param1 != -70) {
          field_I = (String) null;
        }
        return (1 << param0 & pb.field_d) != 0 ? true : false;
    }

    private final ja b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = ZombieDawnMulti.field_E ? 1 : 0;
        ja var14 = new ja(2 * this.field_D, this.field_w);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param0 != -16711936) {
          return (ja) null;
        }
        r.a(0, var14);
        int var5 = this.field_w >> 1;
        for (var6 = 0; var6 < this.field_w; var6++) {
          var7 = (var6 >> 1) * (2 * this.field_D - 1) % (2 * this.field_D);
          var8 = 16711935 & param2;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
          var12 = 256 > var11 ? (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
          oo.b(var7, var6, this.field_D, var12);
          var8Lifetime1 = param1 & 16711935;
          var9Lifetime1 = 65280 & param1;
          oo.b(var7 - this.field_D * 2, var6, this.field_D, var12);
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (var11 * var8Lifetime1 & -16711936 | var9Lifetime1 * var11 & 16711680) >>> 8;
          oo.b(var7 + this.field_D, var6, this.field_D, var12Lifetime1);
          oo.b(var7 - this.field_D, var6, this.field_D, var12Lifetime1);
        }
        ql.a(true);
        return var14;
    }

    private final ja g(int param0) {
        int var4 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var5 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = this.field_w >> 1;
        ja var3 = new ja(var2, this.field_w);
        int var5Lifetime1;
        r.a(0, var3);
        for (var4 = 0; var4 < this.field_w; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_w - var4));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = !(var6 >= 1.0) ? (int)(255.0 * var6) : 255;
            }
            oo.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        var5Lifetime1 = 121 % ((45 - param0) / 54);
        ql.a(true);
        return var3;
    }

    public static void a(int param0) {
        field_G = null;
        field_I = null;
        if (param0 != 0) {
          le.$cfr$intArgs$b$c86821474a52(67, 68);
        }
        field_P = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(-506198655);
    }

    final void a(int param0, cf param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_L) {
            this.field_J = this.field_J + 1;
            if (this.field_D * 2 < this.field_J) {
              this.field_J = this.field_J - this.field_D * 2;
            }
          }
          if (param0 != -5407) {
            this.b(-97, -4, 31, 91, 52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("le.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        int var5 = this.field_y + param3;
        if (param0 != -2) {
          return;
        }
        int var6 = this.field_i + param1;
        this.a((byte) 116, this.field_F[0], var5, var6);
        if (this.field_B < 65536) {
          nm.a(var5 + (this.field_n * this.field_B >> 16), this.field_w + var6, (byte) 105, this.field_n + var5, var6);
          this.a((byte) 116, this.field_F[1], var5, var6);
          ql.a(true);
        }
    }

    le(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 17 / ((55 - param2) / 61);
        this.field_H = (param1 & 16711422) >> 1;
        this.field_E = param1;
        this.field_N = param0;
        this.field_K = param0 >> 1 & 8355711;
        this.f(-506198655);
    }

    private final void a(byte param0, ja param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = param2 + this.field_n;
          if (param0 != 116) {
            this.field_N = -99;
          }
          nm.a(param2 + this.field_M.field_x, this.field_w + param3, (byte) 105, -this.field_M.field_x + var5_int, param3);
          for (var6 = param2 - this.field_J; var6 < var5_int; var6 = var6 + param1.field_x) {
            param1.g(var6, param3);
          }
          ql.a(true);
          if (oo.field_f <= this.field_M.field_x + param2) {
            r.a(0, this.field_C);
            param1.g(-this.field_J, 0);
            param1.g(this.field_D * 2 - this.field_J, 0);
            this.field_O.e(0, 0);
            ql.a(true);
            this.field_C.g(param2, param3);
          }
          if (oo.field_g >= -this.field_M.field_x + var5_int) {
            r.a(0, this.field_C);
            for (var7 = -this.field_M.field_x + this.field_n + this.field_J; this.field_D * 2 < var7; var7 = var7 - 2 * this.field_D) {
            }
            param1.g(-var7, 0);
            param1.g(2 * this.field_D - var7, 0);
            this.field_M.e(0, 0);
            ql.a(true);
            this.field_C.g(var5_int - this.field_M.field_x, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("le.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private le(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_E = param5;
        this.field_N = param6;
        this.field_H = param7;
        this.field_D = param4;
        this.field_K = param8;
        this.b(param0, param1, 28972, param2, param3);
    }

    private final void f(int param0) {
        this.field_F = new ja[]{this.b(param0 + 489486719, this.field_N, this.field_E), this.b(-16711936, this.field_K, this.field_H)};
        this.field_M = this.g(param0 ^ -506198544);
        this.field_O = this.field_M.f();
        this.field_C = new ja(this.field_w >> 1, this.field_w);
        if (param0 != -506198655) {
          this.b(-93, 112, 105, 48, -63);
        }
    }

    static {
        field_I = "Quick Chat Help";
        field_G = "Unable to add friend - system busy";
        field_P = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$b$c86821474a52(int param0, int param1) {
        if (-1 == param0) {
          return true;
        }
        if (param1 != -70) {
          field_I = (String) null;
        }
        return (1 << param0 & pb.field_d) != 0 ? true : false;
    }
}
