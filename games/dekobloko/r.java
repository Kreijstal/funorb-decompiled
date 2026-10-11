/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ce {
    private int field_N;
    boolean field_L;
    private ck field_O;
    private int field_J;
    private int field_M;
    private ck[] field_P;
    private int field_S;
    private ck field_K;
    private int field_H;
    private ck field_G;
    private int field_R;
    int field_Q;

    r(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (param6 & 16711422) >> 1);
    }

    final static void a(boolean param0, int param1) {
        if (vh.field_h != null) {
          vh.field_h.a(1141039778, param0);
        }
        if (param1 != 4028) {
          r.a(false, 20);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.b(true);
    }

    private final void b(boolean param0) {
        ck discarded$0 = null;
        if (!param0) {
          discarded$0 = this.e((byte) 116);
        }
        this.field_P = new ck[]{this.b(-81, this.field_M, this.field_H), this.b(-107, this.field_S, this.field_N)};
        this.field_O = this.e((byte) -125);
        this.field_K = this.field_O.e();
        this.field_G = new ck(this.field_y >> 1, this.field_y);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        int var5 = this.field_u + param0;
        if (param1 > -103) {
          this.a(-17, 35, 5);
        }
        int var6 = param3 + this.field_D;
        this.a(-2044, var6, var5, this.field_P[0]);
        if (65536 > this.field_Q) {
          gg.a(var6, 20763, var5 + this.field_t, var5 + (this.field_Q * this.field_t >> 16), this.field_y + var6);
          this.a(-2044, var6, var5, this.field_P[1]);
          mk.a((byte) -5);
        }
    }

    private final ck e(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        int var2 = this.field_y >> 1;
        ck var3 = new ck(var2, this.field_y);
        tb.a(true, var3);
        for (var4 = 0; var4 < this.field_y; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_y));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
            }
            hk.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        mk.a((byte) -5);
        if (param0 > -73) {
          this.field_M = -48;
        }
        return var3;
    }

    private final ck b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = client.field_A ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        if (param0 >= -78) {
          this.field_K = (ck) null;
        }
        ck var14 = new ck(2 * this.field_J, this.field_y);
        tb.a(true, var14);
        int var5 = this.field_y >> 1;
        for (var6 = 0; var6 < this.field_y; var6++) {
          var7 = (-1 + this.field_J * 2) * (var6 >> 1) % (this.field_J * 2);
          var8 = param2 & 16711935;
          var9 = 65280 & param2;
          var10 = -var5 + var6;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
          var12 = var11 >= 256 ? var8 | var9 : (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> 8;
          hk.a(var7, var6, this.field_J, var12);
          var9Lifetime1 = param1 & 65280;
          hk.a(-(this.field_J * 2) + var7, var6, this.field_J, var12);
          var8Lifetime1 = 16711935 & param1;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (16711680 & var9Lifetime1 * var11 | -16711936 & var8Lifetime1 * var11) >>> 8;
          hk.a(var7 + this.field_J, var6, this.field_J, var12Lifetime1);
          hk.a(-this.field_J + var7, var6, this.field_J, var12Lifetime1);
        }
        mk.a((byte) -5);
        return var14;
    }

    final void a(int param0, int param1, int param2) {
        ck discarded$0 = null;
        if (param1 != 4088) {
          discarded$0 = this.e((byte) 42);
        }
        this.field_N = 8355711 & param2 >> 1;
        this.field_H = param2;
        this.field_M = param0;
        this.field_S = (param0 & 16711422) >> 1;
        this.b(true);
    }

    final void a(ce param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 <= 38) {
            this.field_Q = -76;
          }
          if (this.field_L) {
            this.field_R = this.field_R + 1;
            if (2 * this.field_J < this.field_R) {
              this.field_R = this.field_R - 2 * this.field_J;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("r.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, ck param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          var5_int = param2 + this.field_t;
          if (param0 != -2044) {
            r.a(true, 38);
          }
          gg.a(param1, 20763, var5_int - this.field_O.field_I, this.field_O.field_I + param2, this.field_y + param1);
          for (var6 = param2 - this.field_R; var5_int > var6; var6 = var6 + param3.field_I) {
            param3.c(var6, param1);
          }
          mk.a((byte) -5);
          if (param2 + this.field_O.field_I >= hk.field_c) {
            tb.a(true, this.field_G);
            param3.c(-this.field_R, 0);
            param3.c(-this.field_R + this.field_J * 2, 0);
            this.field_K.f(0, 0);
            mk.a((byte) -5);
            this.field_G.c(param2, param1);
          }
          if (-this.field_O.field_I + var5_int <= hk.field_g) {
            tb.a(true, this.field_G);
            for (var7 = -this.field_O.field_I + (this.field_t + this.field_R); this.field_J * 2 < var7; var7 = var7 - 2 * this.field_J) {
            }
            param3.c(-var7, 0);
            param3.c(2 * this.field_J - var7, 0);
            this.field_O.f(0, 0);
            mk.a((byte) -5);
            this.field_G.c(var5_int - this.field_O.field_I, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("r.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private r(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param5;
        this.field_S = param8;
        this.field_J = param4;
        this.field_M = param6;
        this.field_N = param7;
        this.b(param3, param2, param0, param1, -16555);
    }

    static {
    }
}
