/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends mf {
    static dd field_H;
    static tk field_J;
    static int field_S;
    static lb field_M;
    boolean field_W;
    private int field_G;
    private km field_P;
    private int field_K;
    private int field_T;
    static int field_U;
    private km field_N;
    private km field_I;
    static String field_D;
    private int field_F;
    private int field_X;
    static int field_Q;
    int field_L;
    private km[] field_O;
    private int field_V;
    static a field_R;

    final static void a(byte param0, String param1) {
        try {
          lf.field_N = param1;
          if (param0 >= -41) {
            field_U = 107;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "rm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        this.field_O = new km[]{this.c(-72, this.field_K, this.field_F), this.c(-43, this.field_X, this.field_V)};
        int var2 = -46 / ((-5 - param0) / 54);
        this.field_P = this.f((byte) 8);
        this.field_N = this.field_P.b();
        this.field_I = new km(this.field_C >> 1, this.field_C);
    }

    rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.e((byte) 53);
    }

    private final void a(int param0, km param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        try {
          var5_int = param3 + this.field_y;
          cf.b(param0 + this.field_C, -this.field_P.field_w + var5_int, param0, 80, param3 + this.field_P.field_w);
          for (var6 = param3 - this.field_G; var5_int > var6; var6 = var6 + param1.field_w) {
            param1.b(var6, param0);
          }
          fd.a(param2 + 28773);
          if (wb.field_i <= param3 + this.field_P.field_w) {
            tl.a((byte) -67, this.field_I);
            param1.b(-this.field_G, 0);
            param1.b(this.field_T * 2 - this.field_G, 0);
            this.field_N.e(0, 0);
            fd.a(28773);
            this.field_I.b(param3, param0);
          }
          if (-this.field_P.field_w + var5_int <= wb.field_j) {
            tl.a((byte) -67, this.field_I);
            for (var7 = this.field_G - this.field_P.field_w + this.field_y; var7 > this.field_T * 2; var7 = var7 - this.field_T * 2) {
            }
            param1.b(-var7, 0);
            param1.b(2 * this.field_T - var7, 0);
            this.field_P.e(0, 0);
            fd.a(28773);
            this.field_I.b(var5_int - this.field_P.field_w, param0);
          }
          if (param2 != 0) {
            field_D = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("rm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (param2 > -80) {
          return;
        }
        int var5 = this.field_u + param3;
        int var6 = this.field_r + param0;
        this.a(var6, this.field_O[0], 0, var5);
        if (this.field_L < 65536) {
          cf.b(this.field_C + var6, this.field_y + var5, var6, 80, var5 + (this.field_y * this.field_L >> 16));
          this.a(var6, this.field_O[1], 0, var5);
          fd.a(28773);
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_J = null;
        field_H = null;
        field_M = null;
        field_R = null;
        if (param0 != 850101921) {
          String var2 = (String) null;
          rm.a((byte) 93, (String) null);
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 >= -6) {
            return;
          }
          if (this.field_W) {
            this.field_G = this.field_G + 1;
            if (this.field_G > 2 * this.field_T) {
              this.field_G = this.field_G - 2 * this.field_T;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rm.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final km f(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Chess.field_G;
        if (param0 != 8) {
          rm.a(-18);
        }
        int var2 = this.field_C >> 1;
        km var3 = new km(var2, this.field_C);
        tl.a((byte) -67, var3);
        for (var4 = 0; var4 < this.field_C; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_C - var4) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
            }
            wb.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        fd.a(param0 + 28765);
        return var3;
    }

    final static int a(p param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_l;
          var5 = (CharSequence) ((Object) param1);
          var4 = dj.a(var5, 0);
          param0.b((byte) -127, var4.length);
          param0.field_l = param0.field_l + cg.field_c.a(true, var4.length, 0, var4, param0.field_o, param0.field_l);
          if (param2 != 16711422) {
            rm.a(-114);
          }
          stackIn_3_0 = -var3_int + param0.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rm.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final km c(int param0, int param1, int param2) {
        int var6 = 0;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        km var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        var13 = Chess.field_G;
        var14 = new km(this.field_T * 2, this.field_C);
        tl.a((byte) -67, var14);
        var5 = this.field_C >> 1;
        for (var6 = 0; this.field_C > var6; var6++) {
          var7 = (this.field_T * 2 - 1) * (var6 >> 1) % (this.field_T * 2);
          var8 = param2 & 16711935;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
          if (var11 >= 256) {
            stackIn_7_0 = var9 | var8;
          } else {
            stackIn_7_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8;
          }
          var12 = stackIn_7_0;
          wb.a(var7, var6, this.field_T, var12);
          wb.a(-(this.field_T * 2) + var7, var6, this.field_T, var12);
          var8Lifetime1 = param1 & 16711935;
          var9Lifetime1 = param1 & 65280;
          if (var11 < 256) {
            stackIn_10_0 = (16711680 & var11 * var9Lifetime1 | -16711936 & var11 * var8Lifetime1) >>> 8;
          } else {
            stackIn_10_0 = var9Lifetime1 | var8Lifetime1;
          }
          var12Lifetime1 = stackIn_10_0;
          wb.a(var7 + this.field_T, var6, this.field_T, var12Lifetime1);
          wb.a(var7 - this.field_T, var6, this.field_T, var12Lifetime1);
        }
        if (param0 > -14) {
          field_Q = -78;
        }
        fd.a(28773);
        return var14;
    }

    final void b(int param0, int param1, int param2) {
        this.field_K = param2;
        this.field_X = (16711422 & param2) >> 1;
        this.field_F = param0;
        this.field_V = (16711422 & param0) >> 1;
        if (param1 != 15016) {
          this.b(-91, -5, 76);
        }
        this.e((byte) -73);
    }

    private rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_F = param5;
        this.field_V = param7;
        this.field_X = param8;
        this.field_K = param6;
        this.field_T = param4;
        this.a(param1, 34, param3, param2, param0);
    }

    static {
        field_D = "Please enter your age in years";
        field_J = new tk();
    }
}
