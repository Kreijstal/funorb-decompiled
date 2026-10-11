/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends ji {
    private byte[] field_B;
    static uj field_G;
    private int field_C;
    private short[] field_z;
    private short[] field_K;
    private int field_A;
    private int field_F;
    private int field_E;
    private int field_H;
    private boolean field_D;
    static String field_I;
    static int field_y;

    final int[] c(int param0, int param1) {
        if (param1 < 91) {
          this.field_C = -94;
        }
        int[] var4 = this.field_x.a(param0, (byte) -74);
        int[] var3 = var4;
        if (this.field_x.field_i) {
          this.a(var4, param0, -107);
        }
        return var4;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        this.field_B = kk.a(this.field_C, (byte) 38);
        this.g(5865);
        if (param0 > -98) {
          return;
        }
        for (var2 = this.field_E - 1; 1 <= var2; var2--) {
          var3 = this.field_K[var2];
          if (8 >= var3 &&
            var3 >= -8) {
            this.field_E = this.field_E - 1;
            continue;
          }
          break;
        }
    }

    final static void c(byte param0) {
        int var1 = ld.field_b * ld.field_b;
        int var2 = -(da.field_i * da.field_i) + var1;
        int var3 = var2 * (-tc.field_b + ce.field_b) / var1 + tc.field_b;
        td.field_c.a(82, 640, 120, var3, ml.field_w);
        int var4 = 65 % ((param0 + 14) / 47);
        rg.a(640, r.field_j, 0, ce.field_b - 24, -4803, ia.field_G, 5);
    }

    private final void a(int[] param0, int param1, int param2) {
        int var7 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
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
        int var20 = 0;
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
        var20 = Vertigo2.field_L ? 1 : 0;
        try {
          var5 = this.field_A * lf.field_y[param1];
          var19 = -123 / ((param2 + 45) / 52);
          if (this.field_E == 1) {
            var9 = this.field_K[0];
            var8 = this.field_z[0] << 12;
            var11 = var5 * var8 >> 12;
            var13 = var8 * this.field_A >> 12;
            var12 = this.field_F * var8 >> 12;
            var15 = var11 >> 12;
            var16 = var15 + 1;
            if (var13 <= var16) {
              var16 = 0;
            }
            var11 = var11 & 4095;
            var14 = ue.field_G[var11];
            var17 = this.field_B[255 & var15] & 255;
            var18 = 255 & this.field_B[255 & var16];
            if (!this.field_D) {
              for (var10 = 0; var10 < we.field_M; var10++) {
                var4_int = rh.field_O[var10] * this.field_F;
                var6 = this.a(var4_int * var8 >> 12, 255, var18, var12, var14, var11, var17);
                param0[var10] = var9 * var6 >> 12;
              }
              return;
            }
            for (var10Lifetime3 = 0; we.field_M > var10Lifetime3; var10Lifetime3++) {
              var4_intLifetime3 = this.field_F * rh.field_O[var10Lifetime3];
              var6Lifetime3 = this.a(var8 * var4_intLifetime3 >> 12, 255, var18, var12, var14, var11, var17);
              var6Lifetime3 = var6Lifetime3 * var9 >> 12;
              param0[var10Lifetime3] = (var6Lifetime3 >> 1) + 2048;
            }
            return;
          }
          var9Lifetime1 = this.field_K[0];
          if (var9Lifetime1 > 8 ||
            var9Lifetime1 < -8) {
            var8Lifetime1 = this.field_z[0] << 12;
            var13Lifetime1 = var8Lifetime1 * this.field_A >> 12;
            var11Lifetime1 = var8Lifetime1 * var5 >> 12;
            var12Lifetime1 = this.field_F * var8Lifetime1 >> 12;
            var15Lifetime1 = var11Lifetime1 >> 12;
            var16Lifetime1 = var15Lifetime1 + 1;
            var11Lifetime1 = var11Lifetime1 & 4095;
            if (var13Lifetime1 <= var16Lifetime1) {
              var16Lifetime1 = 0;
            }
            var18Lifetime1 = this.field_B[255 & var16Lifetime1] & 255;
            var14Lifetime1 = ue.field_G[var11Lifetime1];
            var17Lifetime1 = this.field_B[255 & var15Lifetime1] & 255;
            for (var10Lifetime1 = 0; we.field_M > var10Lifetime1; var10Lifetime1++) {
              var4_intLifetime1 = this.field_F * rh.field_O[var10Lifetime1];
              var6Lifetime1 = this.a(var8Lifetime1 * var4_intLifetime1 >> 12, 255, var18Lifetime1, var12Lifetime1, var14Lifetime1, var11Lifetime1, var17Lifetime1);
              param0[var10Lifetime1] = var6Lifetime1 * var9Lifetime1 >> 12;
            }
          }
          for (var7 = 1; var7 < this.field_E; var7++) {
            var9Lifetime2 = this.field_K[var7];
            if (8 < var9Lifetime2 ||
              -8 > var9Lifetime2) {
              var8Lifetime2 = this.field_z[var7] << 12;
              var13Lifetime2 = var8Lifetime2 * this.field_A >> 12;
              var11Lifetime2 = var5 * var8Lifetime2 >> 12;
              var12Lifetime2 = this.field_F * var8Lifetime2 >> 12;
              var15Lifetime2 = var11Lifetime2 >> 12;
              var16Lifetime2 = var15Lifetime2 + 1;
              var11Lifetime2 = var11Lifetime2 & 4095;
              if (var13Lifetime2 <= var16Lifetime2) {
                var16Lifetime2 = 0;
              }
              var17Lifetime2 = this.field_B[255 & var15Lifetime2] & 255;
              var14Lifetime2 = ue.field_G[var11Lifetime2];
              var18Lifetime2 = this.field_B[255 & var16Lifetime2] & 255;
              if (this.field_D &&
                var7 == -1 + this.field_E) {
                for (var10Lifetime2 = 0; we.field_M > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = rh.field_O[var10Lifetime2] * this.field_F;
                  var6Lifetime2 = this.a(var8Lifetime2 * var4_intLifetime2 >> 12, 255, var18Lifetime2, var12Lifetime2, var14Lifetime2, var11Lifetime2, var17Lifetime2);
                  var6Lifetime2 = param0[var10Lifetime2] + (var6Lifetime2 * var9Lifetime2 >> 12);
                  param0[var10Lifetime2] = (var6Lifetime2 >> 1) + 2048;
                }
              } else {
                for (var10Lifetime2 = 0; we.field_M > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = this.field_F * rh.field_O[var10Lifetime2];
                  var6Lifetime2 = this.a(var8Lifetime2 * var4_intLifetime2 >> 12, 255, var18Lifetime2, var12Lifetime2, var14Lifetime2, var11Lifetime2, var17Lifetime2);
                  param0[var10Lifetime2] = param0[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("kg.K(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 >= -75) {
          field_I = (String) null;
        }
        field_G = null;
        field_I = null;
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
        var18 = Vertigo2.field_L ? 1 : 0;
        var13 = param0 >> 12;
        var12 = 1 + var13;
        param0 = param0 & 4095;
        var13 = var13 & param1;
        if (param3 <= var12) {
          var12 = 0;
        }
        var11 = param0 - 4096;
        var12 = var12 & 255;
        var10 = -4096 + param5;
        var15 = ue.field_G[param0];
        var14 = this.field_B[var13 + param6] & 3;
        if (var14 <= 1) {
          if (var14 == 0) {
            stackIn_10_0 = param5 + param0;
          } else {
            stackIn_10_0 = param5 - param0;
          }
          var8 = stackIn_10_0;
        } else {
          if (var14 == 2) {
            stackIn_6_0 = param0 - param5;
          } else {
            stackIn_6_0 = -param0 - param5;
          }
          var8 = stackIn_6_0;
        }
        var14Lifetime1 = this.field_B[var12 + param6] & 3;
        if (var14Lifetime1 <= 1) {
          if (var14Lifetime1 != 0) {
            stackIn_19_0 = param5 - var11;
          } else {
            stackIn_19_0 = var11 + param5;
          }
          var9 = stackIn_19_0;
        } else {
          if (var14Lifetime1 == 2) {
            stackIn_15_0 = -param5 + var11;
          } else {
            stackIn_15_0 = -var11 - param5;
          }
          var9 = stackIn_15_0;
        }
        var14Lifetime2 = 3 & this.field_B[param2 + var13];
        var16 = ((var9 - var8) * var15 >> 12) + var8;
        if (var14Lifetime2 <= 1) {
          if (var14Lifetime2 != 0) {
            stackIn_28_0 = var10 - param0;
          } else {
            stackIn_28_0 = var10 + param0;
          }
          var8Lifetime1 = stackIn_28_0;
        } else {
          if (var14Lifetime2 != 2) {
            stackIn_24_0 = -var10 - param0;
          } else {
            stackIn_24_0 = -var10 + param0;
          }
          var8Lifetime1 = stackIn_24_0;
        }
        var14Lifetime3 = 3 & this.field_B[param2 + var12];
        if (1 >= var14Lifetime3) {
          if (var14Lifetime3 == 0) {
            stackIn_37_0 = var10 + var11;
          } else {
            stackIn_37_0 = var10 - var11;
          }
          var9Lifetime1 = stackIn_37_0;
        } else {
          if (2 != var14Lifetime3) {
            stackIn_33_0 = -var10 - var11;
          } else {
            stackIn_33_0 = var11 - var10;
          }
          var9Lifetime1 = stackIn_33_0;
        }
        var17 = (var15 * (var9Lifetime1 - var8Lifetime1) >> 12) + var8Lifetime1;
        return ((var17 - var16) * param4 >> 12) + var16;
    }

    final void a(byte param0, int param1, ed param2) {
        int dupTemp$0 = 0;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            this.g(-114);
          }
          var4_int = param1;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_E = param2.h(-11);
            } else {
              if (var4_int == 2) {
                this.field_H = param2.n(param0 - 108);
                if (this.field_H >= 0) {
                  return;
                }
                this.field_K = new short[this.field_E];
                for (var4_int = 0; this.field_E > var4_int; var4_int++) {
                  this.field_K[var4_int] = (short)param2.n(2);
                }
              } else {
                if (var4_int == 3) {
                  dupTemp$0 = param2.h(param0 ^ -101);
                  this.field_A = dupTemp$0;
                  this.field_F = dupTemp$0;
                  return;
                }
                if (var4_int == 4) {
                  this.field_C = param2.h(-11);
                  return;
                }
                if (var4_int == 5) {
                  this.field_F = param2.h(-11);
                  return;
                }
                if (var4_int == 6) {
                  this.field_A = param2.h(param0 - 121);
                  return;
                }
              }
            }
          } else {
            stackIn_18_1 = (param2.h(-11) == 1);
            this.field_D = stackIn_18_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("kg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 5865) {
          field_I = (String) null;
        }
        if (this.field_H > 0) {
          this.field_K = new short[this.field_E];
          this.field_z = new short[this.field_E];
          for (var2 = 0; this.field_E > var2; var2++) {
            this.field_K[var2] = (short)(int)(Math.pow((double)((float)this.field_H / 4096.0f), (double)var2) * 4096.0);
            this.field_z[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (null != this.field_K &&
            this.field_E == this.field_K.length) {
            this.field_z = new short[this.field_E];
            for (var2 = 0; var2 < this.field_E; var2++) {
              this.field_z[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
    }

    final static boolean h(int param0) {
        int var1 = -55 % ((51 - param0) / 47);
        return nm.field_J;
    }

    public kg() {
        super(0, true);
        this.field_B = new byte[512];
        this.field_F = 4;
        this.field_A = 4;
        this.field_E = 4;
        this.field_H = 1638;
        this.field_C = 0;
        this.field_D = true;
    }

    static {
        field_G = new uj(1);
        field_I = "Asking to join <%0>'s game...";
    }
}
