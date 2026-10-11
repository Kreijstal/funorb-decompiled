/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    private int field_x;
    private int field_w;
    private tg[] field_z;
    private tg field_I;
    static String field_J;
    static String field_D;
    private int field_K;
    private tg field_M;
    boolean field_C;
    static int field_y;
    private int field_L;
    static String[] field_E;
    static String[] field_A;
    int field_F;
    private int field_H;
    private int field_G;
    private tg field_B;

    final static void a(int param0, boolean param1, int param2) {
        ck.field_c = param0;
        sj.field_d = param2;
        if (!param1) {
          ll.c(62, 103, 114);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
          return;
        }
        if (param2 <= 33) {
          field_J = (String) null;
        }
        int var5 = this.field_r + param3;
        int var6 = this.field_i + param1;
        this.a(this.field_z[0], var5, (byte) -23, var6);
        if (this.field_F < 65536) {
          ai.a(this.field_k + var5, this.field_m + var6, var6, (this.field_k * this.field_F >> 16) + var5, -19852);
          this.a(this.field_z[1], var5, (byte) -108, var6);
          ve.a(-121);
        }
    }

    private final tg b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Bounce.field_N;
        tg var14 = new tg(2 * this.field_K, this.field_m);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param1 != -30578) {
          this.field_w = -85;
        }
        kh.a(var14, 1);
        int var5 = this.field_m >> 1;
        for (var6 = 0; var6 < this.field_m; var6++) {
          var7 = (var6 >> 1) * (2 * this.field_K - 1) % (this.field_K * 2);
          var8 = param0 & 16711935;
          var9 = 65280 & param0;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
          var12 = 256 <= var11 ? var9 | var8 : (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 8;
          na.a(var7, var6, this.field_K, var12);
          var9Lifetime1 = 65280 & param2;
          var8Lifetime1 = 16711935 & param2;
          na.a(var7 - this.field_K * 2, var6, this.field_K, var12);
          var12Lifetime1 = var11 < 256 ? (var11 * var8Lifetime1 & -16711936 | 16711680 & var9Lifetime1 * var11) >>> 8 : var8Lifetime1 | var9Lifetime1;
          na.a(this.field_K + var7, var6, this.field_K, var12Lifetime1);
          na.a(var7 - this.field_K, var6, this.field_K, var12Lifetime1);
        }
        ve.a(-124);
        return var14;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        tg discarded$1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -1) {
            discarded$1 = this.d((byte) -57);
          }
          if (this.field_C) {
            this.field_w = this.field_w + 1;
            if (this.field_w > 2 * this.field_K) {
              this.field_w = this.field_w - 2 * this.field_K;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ll.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (param0 != -15083) {
            stackIn_3_0 = 28;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param1 > 1) {
            if ((1 & param1) != 0) {
              var3_int = var3_int * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
          }
          if (1 != param1) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = param2 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "ll.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        this.field_z = new tg[]{this.b(this.field_G, -30578, this.field_H), this.b(this.field_L, -30578, this.field_x)};
        if (!param0) {
          this.field_C = true;
        }
        this.field_M = this.d((byte) -21);
        this.field_I = this.field_M.a();
        this.field_B = new tg(this.field_m >> 1, this.field_m);
    }

    private final void a(tg param0, int param1, byte param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = Bounce.field_N;
        try {
          var5_int = this.field_k + param1;
          ai.a(var5_int - this.field_M.field_s, this.field_m + param3, param3, this.field_M.field_s + param1, -19852);
          for (var6 = param1 - this.field_w; var6 < var5_int; var6 = var6 + param0.field_s) {
            param0.a(var6, param3);
          }
          ve.a(-125);
          if (na.field_g <= param1 + this.field_M.field_s) {
            kh.a(this.field_B, 1);
            param0.a(-this.field_w, 0);
            param0.a(-this.field_w + 2 * this.field_K, 0);
            this.field_I.e(0, 0);
            ve.a(-119);
            this.field_B.a(param1, param3);
          }
          if (na.field_b >= var5_int - this.field_M.field_s) {
            kh.a(this.field_B, 1);
            for (var7 = this.field_k - this.field_M.field_s + this.field_w; var7 > 2 * this.field_K; var7 = var7 - this.field_K * 2) {
            }
            param0.a(-var7, 0);
            param0.a(2 * this.field_K - var7, 0);
            this.field_M.e(0, 0);
            ve.a(-120);
            this.field_B.a(var5_int - this.field_M.field_s, param3);
          }
          var7Lifetime1 = 18 % ((-66 - param2) / 41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ll.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 >= -35) {
          ll.e((byte) 2);
        }
        field_A = null;
        field_J = null;
        field_D = null;
        field_E = null;
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, param6 >> 1 & 8355711);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 <= 125) {
          return;
        }
        this.field_x = (param0 & 16711422) >> 1;
        this.field_G = param2;
        this.field_L = (param2 & 16711422) >> 1;
        this.field_H = param0;
        this.a(true);
    }

    private final tg d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Bounce.field_N;
        int var2 = this.field_m >> 1;
        tg var3 = new tg(var2, this.field_m);
        kh.a(var3, 1);
        for (var4 = 0; var4 < this.field_m; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_m) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            na.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        if (param0 != -21) {
          this.field_H = 121;
        }
        ve.a(param0 ^ 107);
        return var3;
    }

    private ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param6;
        this.field_x = param8;
        this.field_K = param4;
        this.field_G = param5;
        this.field_L = param7;
        this.b(param3, 80, param2, param0, param1);
    }

    static {
        field_D = "Please send me news and updates (I can unsubscribe at any time)";
        field_J = "This password contains your Player Name, and would be easy to guess";
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_y = 0;
    }
}
