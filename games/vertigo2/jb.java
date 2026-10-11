/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends ji {
    private int field_K;
    private int field_J;
    private int field_B;
    static String field_L;
    static String field_A;
    private int field_D;
    static int field_y;
    private int field_z;
    private int field_C;
    static int[] field_H;
    private int field_I;
    static int field_G;
    private int field_F;
    private int field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        tg.a((byte) -50);
        if (param3 == -30486) {
          bi.c(param2, param0, param1, param4);
          return;
        }
        field_y = 78;
        bi.c(param2, param0, param1, param4);
    }

    public static void b(byte param0) {
        field_H = null;
        field_L = null;
        field_A = null;
        if (param0 == -118) {
          return;
        }
        field_y = 20;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param3 <= 2048) {
          stackIn_3_0 = param3 * (4096 + param0) >> 12;
        } else {
          stackIn_3_0 = -(param0 * param3 >> 12) + (param3 + param0);
        }
        var5 = stackIn_3_0;
        if (!param1) {
          return;
        }
        if (0 >= var5) {
          this.field_B = param3;
          this.field_z = param3;
          this.field_F = param3;
          return;
        }
        param2 = param2 * 6;
        var6 = -var5 + param3 + param3;
        var7 = (-var6 + var5 << 12) / var5;
        var8 = param2 >> 12;
        var9 = param2 - (var8 << 12);
        var10 = var5;
        var10 = var10 * var7 >> 12;
        var10 = var9 * var10 >> 12;
        var11 = var6 + var10;
        var12 = var5 - var10;
        var13 = var8;
        if (0 == var13) {
          this.field_z = var11;
          this.field_F = var5;
          this.field_B = var6;
          return;
        }
        if (var13 == 1) {
          this.field_F = var12;
          this.field_z = var5;
          this.field_B = var6;
          return;
        }
        if (var13 == 2) {
          this.field_z = var5;
          this.field_F = var6;
          this.field_B = var11;
          return;
        }
        if (3 == var13) {
          this.field_z = var12;
          this.field_F = var6;
          this.field_B = var5;
          return;
        }
        if (var13 == 4) {
          this.field_z = var6;
          this.field_B = var5;
          this.field_F = var11;
          return;
        }
        if (var13 != 5) {
          return;
        }
        this.field_z = var6;
        this.field_F = var5;
        this.field_B = var12;
        return;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_D = (param2.g(111) << 12) / 100;
            } else {
              if (var4_int == 2) {
                this.field_I = (param2.g(81) << 12) / 100;
              }
            }
          } else {
            this.field_J = param2.n(2);
          }
          if (param0 != 110) {
            this.field_z = -99;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public jb() {
        super(1, false);
        this.field_J = 0;
        this.field_D = 0;
        this.field_I = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_1 = 0;
        int stackIn_33_1 = 0;
        int stackIn_44_1 = 0;
        int stackIn_48_1 = 0;
        int stackIn_53_1 = 0;
        int stackIn_63_1 = 0;
        int stackIn_67_1 = 0;
        int stackIn_72_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        stackIn_3_0 = (param1 < param2) ? param2 : param1;
        var5 = stackIn_3_0;
        if (param3 != 12288) {
          return;
        }
        stackIn_8_0 = (var5 < param0) ? param0 : var5;
        var5Lifetime1 = stackIn_8_0;
        stackIn_11_0 = (param1 > param2) ? param2 : param1;
        var6 = stackIn_11_0;
        stackIn_14_0 = (var6 <= param0) ? var6 : param0;
        var6Lifetime1 = stackIn_14_0;
        var7 = var5Lifetime1 - var6Lifetime1;
        this.field_E = (var5Lifetime1 + var6Lifetime1) / 2;
        if (this.field_E <= 0) {
          this.field_K = 0;
          if (var7 <= 0) {
            this.field_C = 0;
            return;
          }
          var8 = (var5Lifetime1 - param2 << 12) / var7;
          var9 = (var5Lifetime1 - param1 << 12) / var7;
          var10 = (var5Lifetime1 - param0 << 12) / var7;
          if (var5Lifetime1 == param2) {
            if (var6Lifetime1 != param1) {
              stackIn_53_1 = -var9 + 4096;
            } else {
              stackIn_53_1 = var10 + 20480;
            }
            this.field_C = stackIn_53_1;
          } else {
            if (var5Lifetime1 != param1) {
              if (param2 == var6Lifetime1) {
                stackIn_48_1 = 12288 + var9;
              } else {
                stackIn_48_1 = 20480 - var8;
              }
              this.field_C = stackIn_48_1;
            } else {
              if (param0 == var6Lifetime1) {
                stackIn_44_1 = 4096 + var8;
              } else {
                stackIn_44_1 = -var10 + 12288;
              }
              this.field_C = stackIn_44_1;
            }
          }
          this.field_C = this.field_C / 6;
          return;
        }
        if (this.field_E >= 4096) {
          this.field_K = 0;
          if (var7 <= 0) {
            this.field_C = 0;
          } else {
            var8Lifetime1 = (var5Lifetime1 - param2 << 12) / var7;
            var9Lifetime1 = (var5Lifetime1 - param1 << 12) / var7;
            var10Lifetime1 = (var5Lifetime1 - param0 << 12) / var7;
            if (var5Lifetime1 == param2) {
              if (var6Lifetime1 != param1) {
                stackIn_72_1 = -var9Lifetime1 + 4096;
              } else {
                stackIn_72_1 = var10Lifetime1 + 20480;
              }
              this.field_C = stackIn_72_1;
            } else {
              if (var5Lifetime1 != param1) {
                if (param2 == var6Lifetime1) {
                  stackIn_67_1 = 12288 + var9Lifetime1;
                } else {
                  stackIn_67_1 = 20480 - var8Lifetime1;
                }
                this.field_C = stackIn_67_1;
              } else {
                if (param0 == var6Lifetime1) {
                  stackIn_63_1 = 4096 + var8Lifetime1;
                } else {
                  stackIn_63_1 = -var10Lifetime1 + 12288;
                }
                this.field_C = stackIn_63_1;
              }
            }
            this.field_C = this.field_C / 6;
          }
        } else {
          stackIn_18_1 = var7 << 12;
          if (this.field_E > 2048) {
            stackIn_19_2 = -(this.field_E * 2) + 8192;
          } else {
            stackIn_19_2 = this.field_E * 2;
          }
          this.field_K = stackIn_18_1 / stackIn_19_2;
          if (var7 <= 0) {
            this.field_C = 0;
          } else {
            var8Lifetime1 = (var5Lifetime1 - param2 << 12) / var7;
            var9Lifetime1 = (var5Lifetime1 - param1 << 12) / var7;
            var10Lifetime1 = (var5Lifetime1 - param0 << 12) / var7;
            if (var5Lifetime1 == param2) {
              if (var6Lifetime1 != param1) {
                stackIn_33_1 = -var9Lifetime1 + 4096;
              } else {
                stackIn_33_1 = var10Lifetime1 + 20480;
              }
              this.field_C = stackIn_33_1;
            } else {
              if (var5Lifetime1 == param1) {
                if (param0 == var6Lifetime1) {
                  stackIn_29_1 = 4096 + var8Lifetime1;
                } else {
                  stackIn_29_1 = -var10Lifetime1 + 12288;
                }
                this.field_C = stackIn_29_1;
              } else {
                if (param2 == var6Lifetime1) {
                  stackIn_25_1 = 12288 + var9Lifetime1;
                } else {
                  stackIn_25_1 = 20480 - var8Lifetime1;
                }
                this.field_C = stackIn_25_1;
              }
            }
            this.field_C = this.field_C / 6;
          }
        }
        return;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var25;
        int[] var26;
        int[] var27;
        int[][] var32;
        int[][] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        int var11Lifetime1;
        int[][] var3Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        int[] var10Lifetime1;
        int[][] var13Lifetime1;
        int[][] var15Lifetime1;
        int[][] var20Lifetime1;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var20 = this.field_v.a(param1, -2);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!this.field_v.field_c) {
            return var3;
          }
          var33 = this.c(0, 3, param1);
          var36 = var33[0];
          var35 = var33[1];
          var34 = var33[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; we.field_M > var11; var11++) {
            this.a(var34[var11], var35[var11], var36[var11], 12288);
            this.field_E = this.field_E + this.field_I;
            this.field_K = this.field_K + this.field_D;
            this.field_C = this.field_C + this.field_J;
            while (this.field_C < 0) {
              this.field_C = this.field_C + 4096;
            }
            if (0 > this.field_K) {
              this.field_K = 0;
            }
            while (4096 < this.field_C) {
              this.field_C = this.field_C - 4096;
            }
            if (this.field_E < 0) {
              this.field_E = 0;
            }
            if (this.field_K > 4096) {
              this.field_K = 4096;
            }
            if (this.field_E > 4096) {
              this.field_E = 4096;
            }
            this.a(this.field_K, true, this.field_C, this.field_E);
            var8[var11] = this.field_F;
            var9[var11] = this.field_z;
            var10[var11] = this.field_B;
          }
          return var3;
        }
        this.field_K = -88;
        var20Lifetime1 = this.field_v.a(param1, -2);
        var15Lifetime1 = var20Lifetime1;
        var13Lifetime1 = var15Lifetime1;
        var3Lifetime1 = var13Lifetime1;
        if (!this.field_v.field_c) {
          return var3Lifetime1;
        }
        var32 = this.c(0, 3, param1);
        var27 = var32[0];
        var23 = var27;
        var26 = var32[1];
        var22 = var26;
        var25 = var32[2];
        var21 = var25;
        var8Lifetime1 = var20Lifetime1[0];
        var9Lifetime1 = var20Lifetime1[1];
        var10Lifetime1 = var20Lifetime1[2];
        for (var11Lifetime1 = 0; we.field_M > var11Lifetime1; var11Lifetime1++) {
          this.a(var25[var11Lifetime1], var26[var11Lifetime1], var27[var11Lifetime1], 12288);
          this.field_E = this.field_E + this.field_I;
          this.field_K = this.field_K + this.field_D;
          this.field_C = this.field_C + this.field_J;
          while (this.field_C < 0) {
            this.field_C = this.field_C + 4096;
          }
          if (0 > this.field_K) {
            this.field_K = 0;
          }
          while (4096 < this.field_C) {
            this.field_C = this.field_C - 4096;
          }
          if (this.field_E < 0) {
            this.field_E = 0;
          }
          if (this.field_K > 4096) {
            this.field_K = 4096;
          }
          if (this.field_E > 4096) {
            this.field_E = 4096;
          }
          this.a(this.field_K, true, this.field_C, this.field_E);
          var8Lifetime1[var11Lifetime1] = this.field_F;
          var9Lifetime1[var11Lifetime1] = this.field_z;
          var10Lifetime1[var11Lifetime1] = this.field_B;
        }
        return var3Lifetime1;
    }

    static {
        field_A = "Reload game";
        field_H = new int[8192];
        field_L = "If you jump while standing on a fan, you go twice as high. You need to do this to reach the top of this level. Remember to paint the fan, too!";
        field_y = 72;
        field_G = -1;
    }
}
