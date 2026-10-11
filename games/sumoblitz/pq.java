/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends pk {
    static String field_N;
    private int field_H;
    private wb field_M;
    boolean field_J;
    private wb[] field_z;
    private int field_K;
    int field_I;
    static float[] field_y;
    private int field_x;
    private int field_A;
    private wb field_G;
    private int field_B;
    private int field_D;
    private wb field_E;
    static ri[] field_F;

    public static void a(int param0) {
        field_y = null;
        field_N = null;
        if (param0 != -1346554936) {
          pq.a(-63);
        }
        field_F = null;
    }

    private final void g(int param0) {
        this.field_z = new wb[]{this.a(this.field_K, (byte) -110, this.field_x), this.a(this.field_D, (byte) -5, this.field_B)};
        this.field_M = this.f(-53);
        if (param0 != 880072001) {
          this.field_K = -125;
        }
        this.field_G = this.field_M.a();
        this.field_E = new wb(this.field_p >> 1, this.field_p);
    }

    final void b(int param0, int param1, int param2) {
        this.field_K = param1;
        this.field_B = 8355711 & param0 >> 1;
        this.field_D = (param1 & 16711422) >> 1;
        if (param2 <= 16) {
          return;
        }
        this.field_x = param0;
        this.g(880072001);
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = 94 / ((param1 + 25) / 45);
          if (this.field_J) {
            this.field_A = this.field_A + 1;
            if (this.field_A <= this.field_H * 2) {
              return;
            }
            this.field_A = this.field_A - this.field_H * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pq.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    private final wb f(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        int var2 = this.field_p >> 1;
        wb var3 = new wb(var2, this.field_p);
        jq.a(7161, var3);
        if (param0 > -23) {
          this.field_M = (wb) null;
        }
        for (var4 = 0; this.field_p > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_p) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            lk.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        su.a((byte) -94);
        return var3;
    }

    private final wb a(int param0, byte param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        wb var14 = new wb(2 * this.field_H, this.field_p);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var6Lifetime1;
        jq.a(7161, var14);
        int var5 = this.field_p >> 1;
        for (var6 = 0; this.field_p > var6; var6++) {
          var7 = (var6 >> 1) * (-1 + this.field_H * 2) % (2 * this.field_H);
          var8 = param2 & 16711935;
          var9 = 65280 & param2;
          var10 = var6 - var5;
          var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
          var12 = var11 < 256 ? (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
          lk.f(var7, var6, this.field_H, var12);
          var9Lifetime1 = param0 & 65280;
          var8Lifetime1 = 16711935 & param0;
          lk.f(-(2 * this.field_H) + var7, var6, this.field_H, var12);
          var12Lifetime1 = 256 > var11 ? (16711680 & var11 * var9Lifetime1 | var8Lifetime1 * var11 & -16711936) >>> 8 : var8Lifetime1 | var9Lifetime1;
          lk.f(this.field_H + var7, var6, this.field_H, var12Lifetime1);
          lk.f(-this.field_H + var7, var6, this.field_H, var12Lifetime1);
        }
        var6Lifetime1 = 21 % ((param1 + 50) / 32);
        su.a((byte) 44);
        return var14;
    }

    private final void a(wb param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param3 + this.field_q;
          kw.a(this.field_p + param1, param1, 1, param3 + this.field_M.field_x, -this.field_M.field_x + var5_int);
          for (var6 = param3 - this.field_A; var6 < var5_int; var6 = var6 + param0.field_x) {
            param0.a(var6, param1);
          }
          if (param2 != 256) {
            this.field_J = true;
          }
          su.a((byte) -51);
          if (param3 + this.field_M.field_x >= lk.field_k) {
            jq.a(param2 + 6905, this.field_E);
            param0.a(-this.field_A, 0);
            param0.a(this.field_H * 2 - this.field_A, 0);
            this.field_G.d(0, 0);
            su.a((byte) -105);
            this.field_E.a(param3, param1);
          }
          if (lk.field_j >= -this.field_M.field_x + var5_int) {
            jq.a(7161, this.field_E);
            for (var7 = this.field_A + this.field_q - this.field_M.field_x; this.field_H * 2 < var7; var7 = var7 - this.field_H * 2) {
            }
            param0.a(-var7, 0);
            param0.a(2 * this.field_H - var7, 0);
            this.field_M.d(0, 0);
            su.a((byte) 106);
            this.field_E.a(var5_int - this.field_M.field_x, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("pq.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (16711422 & param6) >> 1);
    }

    final static int a(int param0, int param1) {
        if (param0 != 1) {
          return -1;
        }
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-57, param1, param2, param3, param4);
        this.g(880072001);
        int var6 = 85 % ((28 - param0) / 63);
    }

    private pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_B = param7;
        this.field_D = param8;
        this.field_K = param6;
        this.field_x = param5;
        this.field_H = param4;
        this.a(-79, param0, param1, param3, param2);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param3 != 0) {
          return;
        }
        int var5 = param0 + this.field_r;
        if (param2 >= -35) {
          this.field_z = (wb[]) null;
        }
        int var6 = this.field_v + param1;
        this.a(this.field_z[0], var6, 256, var5);
        if (this.field_I < 65536) {
          kw.a(var6 + this.field_p, var6, 1, var5 + (this.field_I * this.field_q >> 16), this.field_q + var5);
          this.a(this.field_z[1], var6, 256, var5);
          su.a((byte) -110);
        }
    }

    static {
        field_N = "Confirm Email:";
        field_y = new float[16];
    }
}
