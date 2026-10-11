/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends tt {
    boolean field_m;
    int field_r;
    private short[] field_u;
    static hv field_w;
    private byte[] field_x;
    private int field_v;
    int field_s;
    static String[] field_o;
    int field_p;
    int field_q;
    static int[] field_t;
    private short[] field_y;
    static float[] field_n;

    final void a(int param0, int param1, int[] param2) {
        int var7 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var4_intLifetime3;
        int var6Lifetime3;
        int var10Lifetime3;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = this.field_q * uv.field_o[param1];
          if (param0 != -28696) {
            return;
          }
          if (1 == this.field_s) {
            var9 = this.field_u[0];
            var8 = this.field_y[0] << 12;
            var13 = var8 * this.field_q >> 12;
            var11 = var5 * var8 >> 12;
            var12 = var8 * this.field_r >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            if (var16 >= var13) {
              var16 = 0;
            }
            var11 = var11 & 4095;
            var17 = this.field_x[255 & var15] & 255;
            var18 = this.field_x[var16 & 255] & 255;
            var14 = mu.field_y[var11];
            if (!this.field_m) {
              for (var10 = 0; ws.field_b > var10; var10++) {
                var4_int = gs.field_b[var10] * this.field_r;
                var6 = this.a(var18, var14, 3, var12, var11, var4_int * var8 >> 12, var17);
                param2[var10] = var6 * var9 >> 12;
              }
              return;
            }
            for (var10Lifetime3 = 0; var10Lifetime3 < ws.field_b; var10Lifetime3++) {
              var4_intLifetime3 = this.field_r * gs.field_b[var10Lifetime3];
              var6Lifetime3 = this.a(var18, var14, 3, var12, var11, var8 * var4_intLifetime3 >> 12, var17);
              var6Lifetime3 = var6Lifetime3 * var9 >> 12;
              param2[var10Lifetime3] = (var6Lifetime3 >> 1) + 2048;
            }
            return;
          }
          var9Lifetime1 = this.field_u[0];
          if (8 < var9Lifetime1 ||
            -8 > var9Lifetime1) {
            var8Lifetime1 = this.field_y[0] << 12;
            var12Lifetime1 = var8Lifetime1 * this.field_r >> 12;
            var13Lifetime1 = this.field_q * var8Lifetime1 >> 12;
            var11Lifetime1 = var5 * var8Lifetime1 >> 12;
            var15Lifetime1 = var11Lifetime1 >> 12;
            var16Lifetime1 = var15Lifetime1 + 1;
            if (var13Lifetime1 <= var16Lifetime1) {
              var16Lifetime1 = 0;
            }
            var11Lifetime1 = var11Lifetime1 & 4095;
            var18Lifetime1 = 255 & this.field_x[255 & var16Lifetime1];
            var17Lifetime1 = 255 & this.field_x[255 & var15Lifetime1];
            var14Lifetime1 = mu.field_y[var11Lifetime1];
            for (var10Lifetime1 = 0; ws.field_b > var10Lifetime1; var10Lifetime1++) {
              var4_intLifetime1 = gs.field_b[var10Lifetime1] * this.field_r;
              var6Lifetime1 = this.a(var18Lifetime1, var14Lifetime1, param0 + 28699, var12Lifetime1, var11Lifetime1, var8Lifetime1 * var4_intLifetime1 >> 12, var17Lifetime1);
              param2[var10Lifetime1] = var9Lifetime1 * var6Lifetime1 >> 12;
            }
          }
          for (var7 = 1; var7 < this.field_s; var7++) {
            var9Lifetime2 = this.field_u[var7];
            if (var9Lifetime2 > 8 ||
              var9Lifetime2 < -8) {
              var8Lifetime2 = this.field_y[var7] << 12;
              var12Lifetime2 = this.field_r * var8Lifetime2 >> 12;
              var13Lifetime2 = var8Lifetime2 * this.field_q >> 12;
              var11Lifetime2 = var5 * var8Lifetime2 >> 12;
              var15Lifetime2 = var11Lifetime2 >> 12;
              var16Lifetime2 = 1 + var15Lifetime2;
              if (var16Lifetime2 >= var13Lifetime2) {
                var16Lifetime2 = 0;
              }
              var11Lifetime2 = var11Lifetime2 & 4095;
              var17Lifetime2 = 255 & this.field_x[var15Lifetime2 & 255];
              var14Lifetime2 = mu.field_y[var11Lifetime2];
              var18Lifetime2 = 255 & this.field_x[255 & var16Lifetime2];
              if (this.field_m &&
                this.field_s - 1 == var7) {
                for (var10Lifetime2 = 0; ws.field_b > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = gs.field_b[var10Lifetime2] * this.field_r;
                  var6Lifetime2 = this.a(var18Lifetime2, var14Lifetime2, 3, var12Lifetime2, var11Lifetime2, var4_intLifetime2 * var8Lifetime2 >> 12, var17Lifetime2);
                  var6Lifetime2 = param2[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                  param2[var10Lifetime2] = 2048 + (var6Lifetime2 >> 1);
                }
              } else {
                for (var10Lifetime2 = 0; var10Lifetime2 < ws.field_b; var10Lifetime2++) {
                  var4_intLifetime2 = this.field_r * gs.field_b[var10Lifetime2];
                  var6Lifetime2 = this.a(var18Lifetime2, var14Lifetime2, 3, var12Lifetime2, var11Lifetime2, var8Lifetime2 * var4_intLifetime2 >> 12, var17Lifetime2);
                  param2[var10Lifetime2] = param2[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("mo.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        lr.a(nt.field_m[param1], (byte) 56);
        int var2 = 29 % ((param0 + 73) / 48);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int[] var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_x = td.a(this.field_v, -50);
        this.d(param0 + 126);
        for (var2 = this.field_s - 1; var2 >= 1; var2--) {
          var3 = this.field_u[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.field_s = this.field_s - 1;
            continue;
          }
          break;
        }
        if (param0 != -8) {
          var5 = (int[]) null;
          this.a(14, 34, (int[]) null);
        }
    }

    mo() {
        super(0, true);
        this.field_x = new byte[512];
        this.field_r = 4;
        this.field_p = 1638;
        this.field_v = 0;
        this.field_m = true;
        this.field_q = 4;
        this.field_s = 4;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 30643) {
          return false;
        }
        return bj.a(param1, (byte) -113, param0) & (((8192 & param1) != 0 ? true : false) | lg.a(param1, param2 ^ -30697, param0) | mb.a(true, param0, param1));
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var8Lifetime1;
        int var9Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var18 = Sumoblitz.field_L ? 1 : 0;
        var13 = param5 >> 12;
        var12 = var13 + 1;
        param5 = param5 & 4095;
        var13 = var13 & 255;
        if (param3 <= var12) {
          var12 = 0;
        }
        var12 = var12 & 255;
        var10 = -4096 + param4;
        var11 = -4096 + param5;
        var15 = mu.field_y[param5];
        var14 = 3 & this.field_x[param6 + var13];
        if (var14 > 1) {
          if (var14 == 2) {
            stackIn_10_0 = param5 - param4;
          } else {
            stackIn_10_0 = -param5 - param4;
          }
          var8 = stackIn_10_0;
        } else {
          if (var14 == 0) {
            stackIn_6_0 = param4 + param5;
          } else {
            stackIn_6_0 = -param5 + param4;
          }
          var8 = stackIn_6_0;
        }
        var14Lifetime1 = this.field_x[param6 + var12] & 3;
        if (var14Lifetime1 <= 1) {
          if (var14Lifetime1 == 0) {
            stackIn_19_0 = param4 + var11;
          } else {
            stackIn_19_0 = param4 - var11;
          }
          var9 = stackIn_19_0;
        } else {
          if (2 != var14Lifetime1) {
            stackIn_15_0 = -var11 - param4;
          } else {
            stackIn_15_0 = -param4 + var11;
          }
          var9 = stackIn_15_0;
        }
        var16 = var8 + ((-var8 + var9) * var15 >> 12);
        var14Lifetime2 = param2 & this.field_x[var13 + param0];
        if (var14Lifetime2 > 1) {
          if (var14Lifetime2 != 2) {
            stackIn_28_0 = -param5 - var10;
          } else {
            stackIn_28_0 = -var10 + param5;
          }
          var8Lifetime1 = stackIn_28_0;
        } else {
          if (var14Lifetime2 != 0) {
            stackIn_24_0 = var10 - param5;
          } else {
            stackIn_24_0 = var10 + param5;
          }
          var8Lifetime1 = stackIn_24_0;
        }
        var14Lifetime3 = this.field_x[param0 + var12] & 3;
        if (var14Lifetime3 <= 1) {
          if (0 != var14Lifetime3) {
            stackIn_37_0 = -var11 + var10;
          } else {
            stackIn_37_0 = var10 + var11;
          }
          var9Lifetime1 = stackIn_37_0;
        } else {
          if (var14Lifetime3 == 2) {
            stackIn_33_0 = var11 - var10;
          } else {
            stackIn_33_0 = -var11 - var10;
          }
          var9Lifetime1 = stackIn_33_0;
        }
        var17 = var8Lifetime1 + ((var9Lifetime1 - var8Lifetime1) * var15 >> 12);
        return (param1 * (-var16 + var17) >> 12) + var16;
    }

    public static void e(int param0) {
        field_w = null;
        field_t = null;
        field_n = null;
        if (param0 != 2) {
          field_o = (String[]) null;
        }
        field_o = null;
    }

    private final void d(int param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_p > 0) {
          this.field_y = new short[this.field_s];
          this.field_u = new short[this.field_s];
          for (var2 = 0; var2 < this.field_s; var2++) {
            this.field_u[var2] = (short)(int)(Math.pow((double)((float)this.field_p / 4096.0f), (double)var2) * 4096.0);
            this.field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (this.field_u != null &&
            this.field_u.length == this.field_s) {
            this.field_y = new short[this.field_s];
            for (var2 = 0; this.field_s > var2; var2++) {
              this.field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
        if (param0 <= 81) {
          mo.a(57, -58);
        }
    }

    static {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_w = new hv();
        field_t = new int[4];
        field_n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
