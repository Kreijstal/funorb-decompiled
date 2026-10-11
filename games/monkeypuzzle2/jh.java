/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends we {
    static int[] field_y;
    boolean field_G;
    private int field_x;
    private int field_H;
    private int field_E;
    static ra field_C;
    private int field_u;
    private le field_w;
    private le[] field_z;
    private le field_B;
    private int field_v;
    private int field_F;
    private le field_A;
    int field_D;

    final void a(byte param0, int param1, int param2) {
        this.field_H = (16711422 & param1) >> 1;
        this.field_x = param2;
        this.field_F = param1;
        this.field_E = 8355711 & param2 >> 1;
        this.j(param0 ^ -115);
        if (param0 != -115) {
          this.field_G = false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        int var5 = this.field_r + param3;
        if (param0 != 30) {
          field_y = (int[]) null;
        }
        int var6 = this.field_e + param2;
        this.a(-82, this.field_z[0], var5, var6);
        if (this.field_D < 65536) {
          qi.a(var5 + this.field_l, true, this.field_p + var6, var5 + (this.field_D * this.field_l >> 16), var6);
          this.a(-52, this.field_z[1], var5, var6);
          tj.b(653);
        }
    }

    private final void j(int param0) {
        this.field_z = new le[]{this.b((byte) 86, this.field_x, this.field_F), this.b((byte) 86, this.field_E, this.field_H)};
        this.field_w = this.i(param0 ^ -40982079);
        this.field_A = this.field_w.a();
        if (param0 != 0) {
          this.field_F = 23;
        }
        this.field_B = new le(this.field_p >> 1, this.field_p);
    }

    private final le b(byte param0, int param1, int param2) {
        int var6 = 0;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        le var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var14 = new le(this.field_v * 2, this.field_p);
        mc.a(param0 ^ -8551, var14);
        var5 = this.field_p >> 1;
        for (var6 = 0; this.field_p > var6; var6++) {
          var7 = (var6 >> 1) * (2 * this.field_v - 1) % (this.field_v * 2);
          var8 = param2 & 16711935;
          var9 = 65280 & param2;
          var10 = -var5 + var6;
          var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
          if (256 > var11) {
            stackIn_7_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 8;
          } else {
            stackIn_7_0 = var9 | var8;
          }
          var12 = stackIn_7_0;
          ge.a(var7, var6, this.field_v, var12);
          var9Lifetime1 = 65280 & param1;
          ge.a(-(2 * this.field_v) + var7, var6, this.field_v, var12);
          var8Lifetime1 = param1 & 16711935;
          if (256 > var11) {
            stackIn_10_0 = (var8Lifetime1 * var11 & -16711936 | var9Lifetime1 * var11 & 16711680) >>> 8;
          } else {
            stackIn_10_0 = var9Lifetime1 | var8Lifetime1;
          }
          var12Lifetime1 = stackIn_10_0;
          ge.a(var7 + this.field_v, var6, this.field_v, var12Lifetime1);
          ge.a(var7 - this.field_v, var6, this.field_v, var12Lifetime1);
        }
        if (param0 != 86) {
          this.field_x = -11;
        }
        tj.b(param0 + 567);
        return var14;
    }

    jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (16711422 & param6) >> 1);
    }

    private final void a(int param0, le param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5_int = this.field_l + param2;
          if (param0 >= -37) {
            var9 = (le) null;
            this.a(118, (le) null, -87, 86);
          }
          qi.a(var5_int - this.field_w.field_k, true, this.field_p + param3, param2 + this.field_w.field_k, param3);
          for (var6 = param2 - this.field_u; var5_int > var6; var6 = var6 + param1.field_k) {
            param1.c(var6, param3);
          }
          tj.b(653);
          if (ge.field_a <= param2 + this.field_w.field_k) {
            mc.a(-8497, this.field_B);
            param1.c(-this.field_u, 0);
            param1.c(this.field_v * 2 - this.field_u, 0);
            this.field_A.d(0, 0);
            tj.b(653);
            this.field_B.c(param2, param3);
          }
          if (-this.field_w.field_k + var5_int <= ge.field_j) {
            mc.a(-8497, this.field_B);
            for (var7 = this.field_u + (this.field_l - this.field_w.field_k); var7 > 2 * this.field_v; var7 = var7 - this.field_v * 2) {
            }
            param1.c(-var7, 0);
            param1.c(2 * this.field_v - var7, 0);
            this.field_w.d(0, 0);
            tj.b(653);
            this.field_B.c(-this.field_w.field_k + var5_int, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 >= -13) {
            return;
          }
          if (this.field_G) {
            this.field_u = this.field_u + 1;
            if (this.field_v * 2 < this.field_u) {
              this.field_u = this.field_u - 2 * this.field_v;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jh.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final le i(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -40982079) {
          this.field_B = (le) null;
        }
        int var2 = this.field_p >> 1;
        le var3 = new le(var2, this.field_p);
        mc.a(-8497, var3);
        for (var4 = 0; var4 < this.field_p; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_p - var4));
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
            }
            ge.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        tj.b(653);
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 7434) {
          jh.a(-65);
        }
        field_C = null;
        field_y = null;
    }

    private jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_F = param5;
        this.field_E = param8;
        this.field_x = param6;
        this.field_v = param4;
        this.field_H = param7;
        this.a(param3, 13361, param0, param2, param1);
    }

    static {
        field_y = new int[8192];
    }
}
