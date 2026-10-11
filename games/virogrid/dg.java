/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends fi {
    static int field_x;
    private mg[] field_D;
    private int field_K;
    private int field_H;
    boolean field_z;
    private int field_y;
    private mg field_I;
    static km field_E;
    static String field_G;
    private mg field_B;
    private int field_J;
    private int field_F;
    private mg field_A;
    int field_C;
    private int field_L;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final static bk a(String param0, int param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        bk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16711935) {
            dg.a((byte) 84);
          }
          var4_long = 0L;
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = jc.a(var7, (byte) -105);
          } else {
            var6 = param0;
          }
          stackIn_6_0 = pl.a(var4_long, (String) (var6), 127, param2, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dg.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private final mg e(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var2 = this.field_m >> 1;
        mg var3 = new mg(var2, this.field_m);
        kb.a(var3, 16865);
        if (param0 < 63) {
          return (mg) null;
        }
        for (var4 = 0; this.field_m > var4; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_m - var4) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            df.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        ai.a(true);
        return var3;
    }

    private final void a(int param0, mg param1, int param2, boolean param3) {
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = param2 + this.field_g;
          uk.a(param0 + this.field_m, 6, param2 + this.field_A.field_w, -this.field_A.field_w + var5_int, param0);
          for (var6 = -this.field_L + param2; var6 < var5_int; var6 = var6 + param1.field_w) {
            param1.d(var6, param0);
          }
          ai.a(!param3);
          if (param3) {
            return;
          }
          if (df.field_i <= this.field_A.field_w + param2) {
            kb.a(this.field_I, 16865);
            param1.d(-this.field_L, 0);
            param1.d(2 * this.field_J - this.field_L, 0);
            this.field_B.c(0, 0);
            ai.a(true);
            this.field_I.d(param2, param0);
          }
          if (-this.field_A.field_w + var5_int <= df.field_k) {
            kb.a(this.field_I, 16865);
            for (var7 = this.field_L + (-this.field_A.field_w + this.field_g); this.field_J * 2 < var7; var7 = var7 - this.field_J * 2) {
            }
            param1.d(-var7, 0);
            param1.d(-var7 + 2 * this.field_J, 0);
            this.field_A.c(0, 0);
            ai.a(true);
            this.field_I.d(-this.field_A.field_w + var5_int, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        mg discarded$0 = null;
        if (param3 != 0) {
          return;
        }
        int var5 = this.field_l + param1;
        int var6 = param2 + this.field_u;
        this.a(var6, this.field_D[0], var5, false);
        if (this.field_C < 65536) {
          uk.a(var6 + this.field_m, 6, (this.field_C * this.field_g >> 16) + var5, var5 + this.field_g, var6);
          this.a(var6, this.field_D[1], var5, false);
          ai.a(true);
        }
        if (param0 != 37) {
          discarded$0 = this.c(-103, -91, 31);
        }
    }

    private final void a(int param0) {
        this.field_D = new mg[]{this.c(this.field_F, this.field_H, -17), this.c(this.field_K, this.field_y, param0 ^ -46)};
        this.field_A = this.e(127);
        this.field_B = this.field_A.c();
        this.field_I = new mg(this.field_m >> 1, this.field_m);
        if (param0 != 10) {
          field_G = (String) null;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(10);
    }

    public static void a(byte param0) {
        field_G = null;
        if (param0 <= 13) {
          return;
        }
        field_E = null;
    }

    private final mg c(int param0, int param1, int param2) {
        mg discarded$0 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Virogrid.field_F ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param2 > -15) {
          discarded$0 = this.e(93);
        }
        mg var14 = new mg(this.field_J * 2, this.field_m);
        kb.a(var14, 16865);
        int var5 = this.field_m >> 1;
        for (var6 = 0; var6 < this.field_m; var6++) {
          var7 = (var6 >> 1) * (-1 + 2 * this.field_J) % (2 * this.field_J);
          var8 = 16711935 & param1;
          var9 = param1 & 65280;
          var10 = var6 - var5;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
          var12 = var11 >= 256 ? var8 | var9 : (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8;
          df.b(var7, var6, this.field_J, var12);
          var8Lifetime1 = param0 & 16711935;
          df.b(var7 - 2 * this.field_J, var6, this.field_J, var12);
          var9Lifetime1 = 65280 & param0;
          var12Lifetime1 = var11 < 256 ? (var9Lifetime1 * var11 & 16711680 | -16711936 & var8Lifetime1 * var11) >>> 8 : var9Lifetime1 | var8Lifetime1;
          df.b(var7 + this.field_J, var6, this.field_J, var12Lifetime1);
          df.b(var7 - this.field_J, var6, this.field_J, var12Lifetime1);
        }
        ai.a(true);
        return var14;
    }

    final void d(int param0, int param1, int param2) {
        this.field_H = param1;
        this.field_y = 8355711 & param1 >> 1;
        this.field_K = (16711422 & param0) >> 1;
        if (param2 < 101) {
          this.field_L = 41;
        }
        this.field_F = param0;
        this.a(10);
    }

    final static void a(byte param0, int param1) {
        fe.field_Lb = jg.field_g[param1];
        if (param0 != -53) {
          field_x = -72;
        }
        aa.field_d = ve.field_r[param1];
        jd.field_b = o.field_b[param1];
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_K = param8;
        this.field_J = param4;
        this.field_H = param5;
        this.field_y = param7;
        this.field_F = param6;
        this.a(param3, true, param1, param0, param2);
    }

    final static void b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 320;
          var4 = 240;
          param0 = param0 / 2;
          param2 = param2 / 2;
          var5 = 2 + (int)((Math.cos((double)((float)id.field_r / 20.0f)) + 1.0) * 8.0);
          if (param1 > -123) {
            field_G = (String) null;
          }
          for (var6 = 0; 9 > var6; var6++) {
            var7 = (-var6 + 9) * var5 >>> 3;
            df.a(var3_int + (-param2 - var7), var4 - param0 - var7, param2 + var7 << 1, var7 + param0 << 1, 10, 1141646, 26);
          }
          df.a(-param2 + var3_int, -param0 + var4, param2 << 1, param0 << 1, 10, 0, 180);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "dg.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 < 113) {
            return;
          }
          if (this.field_z) {
            this.field_L = this.field_L + 1;
            if (this.field_J * 2 >= this.field_L) {
              return;
            }
            this.field_L = this.field_L - this.field_J * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_G = "Achievements can only be obtained by playing Rated games";
    }
}
