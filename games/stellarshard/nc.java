/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends rj {
    private int field_O;
    private pb[] field_C;
    private int field_N;
    private pb field_I;
    int field_K;
    private int field_M;
    static ek[] field_F;
    private pb field_P;
    private int field_L;
    private int field_D;
    static int field_G;
    boolean field_B;
    static int field_A;
    private int field_z;
    static pf field_y;
    static int field_H;
    private pb field_E;

    private final pb d(boolean param0) {
        pb discarded$0 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = stellarshard.field_B;
        int var2 = this.field_t >> 1;
        pb var3 = new pb(var2, this.field_t);
        if (param0) {
          discarded$0 = this.b(-65, -14, 113);
        }
        hj.a(var3, 1);
        for (var4 = 0; var4 < this.field_t; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_t - var4));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            ti.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        id.b((byte) -58);
        return var3;
    }

    final void c(int param0, int param1, int param2) {
        this.field_O = (param2 & 16711422) >> 1;
        this.field_D = param2;
        this.field_N = 8355711 & param1 >> 1;
        if (param0 != 65280) {
          return;
        }
        this.field_L = param1;
        this.a(15035);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        int var5 = param3 + this.field_w;
        if (param1 != -57) {
          return;
        }
        int var6 = param2 + this.field_k;
        this.a(var5, (byte) 46, var6, this.field_C[0]);
        if (this.field_K < 65536) {
          gg.a(20, this.field_p + var5, var6, var6 + this.field_t, (this.field_K * this.field_p >> 16) + var5);
          this.a(var5, (byte) 46, var6, this.field_C[1]);
          id.b((byte) -58);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 23987) {
          this.field_K = -78;
        }
        super.b(param0, param1, param2, param3, param4 + 0);
        this.a(15035);
    }

    public static void e(boolean param0) {
        field_y = null;
        field_F = null;
        if (!param0) {
          nc.e(true);
        }
    }

    private final void a(int param0) {
        this.field_C = new pb[]{this.b(this.field_L, this.field_D, 0), this.b(this.field_N, this.field_O, 0)};
        this.field_P = this.d(false);
        if (param0 != 15035) {
          return;
        }
        this.field_E = this.field_P.f();
        this.field_I = new pb(this.field_t >> 1, this.field_t);
    }

    final static void b(byte param0, int param1, int param2) {
        wg.field_c = param2;
        if (param0 != 98) {
          field_H = -55;
        }
        vk.field_b = param1;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            return;
          }
          if (this.field_B) {
            this.field_z = this.field_z + 1;
            if (this.field_z > this.field_M * 2) {
              this.field_z = this.field_z - this.field_M * 2;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("nc.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fk.a(-28092, (java.awt.Component) ((Object) param0));
          if (param1 <= 84) {
            return;
          }
          ge.a((java.awt.Component) ((Object) param0), (byte) -41);
          if (null != og.field_c) {
            og.field_c.a((byte) -93, (java.awt.Component) ((Object) param0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, pb param3) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          if (param1 != 46) {
            this.field_C = (pb[]) null;
          }
          var5_int = param0 + this.field_p;
          gg.a(42, var5_int - this.field_P.field_v, param2, this.field_t + param2, this.field_P.field_v + param0);
          for (var6 = -this.field_z + param0; var6 < var5_int; var6 = var6 + param3.field_v) {
            param3.e(var6, param2);
          }
          id.b((byte) -58);
          if (this.field_P.field_v + param0 >= ti.field_e) {
            hj.a(this.field_I, param1 ^ 47);
            param3.e(-this.field_z, 0);
            param3.e(-this.field_z + 2 * this.field_M, 0);
            this.field_E.c(0, 0);
            id.b((byte) -58);
            this.field_I.e(param0, param2);
          }
          if (ti.field_c >= var5_int - this.field_P.field_v) {
            hj.a(this.field_I, 1);
            for (var7 = this.field_z - this.field_P.field_v + this.field_p; 2 * this.field_M < var7; var7 = var7 - 2 * this.field_M) {
            }
            param3.e(-var7, 0);
            param3.e(2 * this.field_M - var7, 0);
            this.field_P.c(0, 0);
            id.b((byte) -58);
            this.field_I.e(var5_int - this.field_P.field_v, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("nc.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final pb b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = stellarshard.field_B;
        pb var14 = new pb(this.field_M * 2, this.field_t);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        hj.a(var14, param2 + 1);
        int var5 = this.field_t >> 1;
        for (var6 = param2; var6 < this.field_t; var6++) {
          var7 = (-1 + this.field_M * 2) * (var6 >> 1) % (2 * this.field_M);
          var8 = param1 & 16711935;
          var9 = param1 & 65280;
          var10 = -var5 + var6;
          var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
          var12 = 256 <= var11 ? var9 | var8 : (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> 8;
          ti.g(var7, var6, this.field_M, var12);
          ti.g(var7 - this.field_M * 2, var6, this.field_M, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = param0 & 16711935;
          var12Lifetime1 = 256 <= var11 ? var9Lifetime1 | var8Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var9Lifetime1 * var11) >>> 8;
          ti.g(var7 + this.field_M, var6, this.field_M, var12Lifetime1);
          ti.g(-this.field_M + var7, var6, this.field_M, var12Lifetime1);
        }
        id.b((byte) -58);
        return var14;
    }

    private nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_N = param8;
        this.field_O = param7;
        this.field_L = param6;
        this.field_M = param4;
        this.field_D = param5;
        this.b(param2, param0, param1, param3, 23987);
    }

    static {
    }
}
