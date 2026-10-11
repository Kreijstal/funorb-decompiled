/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends ae {
    private int field_u;
    private int field_C;
    boolean field_D;
    private int field_y;
    private int field_G;
    static String field_F;
    private int field_x;
    private iu field_z;
    int field_B;
    private iu field_E;
    private iu field_A;
    private iu[] field_w;
    private int field_v;

    final void a(boolean param0, int param1, int param2) {
        this.field_G = 8355711 & param1 >> 1;
        this.field_v = (param2 & 16711422) >> 1;
        this.field_C = param2;
        this.field_x = param1;
        if (!param0) {
          return;
        }
        this.g((byte) 12);
    }

    public static void a(int param0) {
        if (param0 != 30548) {
          rk.a(-86);
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        iu discarded$1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 2097152) {
            discarded$1 = this.a((byte) 6);
          }
          if (this.field_D) {
            this.field_y = this.field_y + 1;
            if (2 * this.field_u >= this.field_y) {
              return;
            }
            this.field_y = this.field_y - 2 * this.field_u;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    private final iu a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = this.field_p >> 1;
        iu var3 = new iu(var2, this.field_p);
        nm.a(var3, (byte) 93);
        if (param0 <= 66) {
          this.field_z = (iu) null;
        }
        for (var4 = 0; var4 < this.field_p; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_p) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
            }
            bea.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        pfa.a(1);
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g((byte) 12);
    }

    private final void g(byte param0) {
        this.field_w = new iu[]{this.c(-69, this.field_C, this.field_x), this.c(91, this.field_v, this.field_G)};
        if (param0 != 12) {
          this.field_y = 10;
        }
        this.field_A = this.a((byte) 78);
        this.field_z = this.field_A.d();
        this.field_E = new iu(this.field_p >> 1, this.field_p);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        int var5 = param0 + this.field_i;
        int var6 = param1 + this.field_n;
        this.a(var6, this.field_w[param2], var5, 93);
        if (this.field_B < 65536) {
          tga.a(-21953, (this.field_B * this.field_m >> 16) + var5, this.field_m + var5, var6, var6 + this.field_p);
          this.a(var6, this.field_w[1], var5, 115);
          pfa.a(param2 + 1);
        }
    }

    rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3, int param4, int param5, int param6) {
        if (wqa.r((byte) -118)) {
          iqa.a(-109, param3, param5, param1);
          if (hka.field_b != null &&
            hka.field_b.a(param1, param6, param0, param2 ^ -107, param3)) {
            wp.a(-1);
            param1 = false;
          }
          fu.a(-83, param3, param1);
          kma.a(param1, 104, param4);
          param1 = false;
        }
        if (param2 != 107) {
          rk.a(-24, false, (byte) 37, -109, 107, 111, -35);
        }
        return param1;
    }

    private final iu c(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = TombRacer.field_G ? 1 : 0;
        int var4 = 29 % ((28 - param0) / 61);
        iu var5 = new iu(2 * this.field_u, this.field_p);
        int var9Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        nm.a(var5, (byte) 110);
        int var6 = this.field_p >> 1;
        for (var7 = 0; this.field_p > var7; var7++) {
          var8 = (var7 >> 1) * (this.field_u * 2 - 1) % (2 * this.field_u);
          var9 = 16711935 & param1;
          var10 = 65280 & param1;
          var11 = var7 - var6;
          var12 = (int)(128.0 * (Math.sqrt((double)(var6 * var6 - var11 * var11)) / (double)var6)) + 128;
          var13 = var12 < 256 ? (-16711936 & var9 * var12 | var12 * var10 & 16711680) >>> 8 : var9 | var10;
          bea.c(var8, var7, this.field_u, var13);
          bea.c(-(2 * this.field_u) + var8, var7, this.field_u, var13);
          var9Lifetime1 = 16711935 & param2;
          var10Lifetime1 = 65280 & param2;
          var13Lifetime1 = var12 >= 256 ? var10Lifetime1 | var9Lifetime1 : (16711680 & var12 * var10Lifetime1 | var12 * var9Lifetime1 & -16711936) >>> 8;
          bea.c(this.field_u + var8, var7, this.field_u, var13Lifetime1);
          bea.c(var8 - this.field_u, var7, this.field_u, var13Lifetime1);
        }
        pfa.a(1);
        return var5;
    }

    private final void a(int param0, iu param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param2 + this.field_m;
          tga.a(-21953, this.field_A.field_m + param2, var5_int - this.field_A.field_m, param0, this.field_p + param0);
          if (param3 <= 86) {
            this.a(true, -45, -128);
          }
          for (var6 = param2 - this.field_y; var5_int > var6; var6 = var6 + param1.field_m) {
            param1.b(var6, param0);
          }
          pfa.a(1);
          if (bea.field_b <= this.field_A.field_m + param2) {
            nm.a(this.field_E, (byte) 116);
            param1.b(-this.field_y, 0);
            param1.b(2 * this.field_u - this.field_y, 0);
            this.field_z.a(0, 0);
            pfa.a(1);
            this.field_E.b(param2, param0);
          }
          if (bea.field_d >= -this.field_A.field_m + var5_int) {
            nm.a(this.field_E, (byte) 91);
            for (var7 = this.field_y + this.field_m - this.field_A.field_m; 2 * this.field_u < var7; var7 = var7 - 2 * this.field_u) {
            }
            param1.b(-var7, 0);
            param1.b(-var7 + this.field_u * 2, 0);
            this.field_A.a(0, 0);
            pfa.a(1);
            this.field_E.b(-this.field_A.field_m + var5_int, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0, boolean param1, int param2, int param3) {
        if (param0 <= 83) {
          return;
        }
        wj.a(param3, di.field_a, wg.field_i, 2, mna.field_d, param2, param1);
    }

    private rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_x = param6;
        this.field_u = param4;
        this.field_v = param7;
        this.field_C = param5;
        this.field_G = param8;
        this.a((byte) -31, param2, param3, param0, param1);
    }

    static {
        field_F = "You must be a member to play with the current options.";
    }
}
