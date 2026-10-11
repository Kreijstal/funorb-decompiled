/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsa extends ci {
    private int field_n;
    private int field_u;
    private int field_m;
    private int field_t;
    private int field_o;
    private int field_r;
    static su field_v;
    private int field_s;
    private int field_p;
    private int field_q;

    final int[][] b(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 != -1) {
          return (int[][]) null;
        }
        var20 = this.field_h.a(param0, (byte) 109);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_h.field_f) {
          var28 = this.a(param0, 0, -1);
          var30 = var28[0];
          var31 = var28[1];
          var29 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; var11 < ns.field_g; var11++) {
            this.b(2, var29[var11], var30[var11], var31[var11]);
            this.field_m = this.field_m + this.field_o;
            this.field_n = this.field_n + this.field_s;
            this.field_p = this.field_p + this.field_u;
            while (this.field_m < 0) {
              this.field_m = this.field_m + 4096;
            }
            if (this.field_n < 0) {
              this.field_n = 0;
            }
            while (this.field_m > 4096) {
              this.field_m = this.field_m - 4096;
            }
            if (this.field_p < 0) {
              this.field_p = 0;
            }
            if (this.field_n > 4096) {
              this.field_n = 4096;
            }
            if (this.field_p > 4096) {
              this.field_p = 4096;
            }
            this.a(this.field_n, 27261, this.field_m, this.field_p);
            var8[var11] = this.field_t;
            var9[var11] = this.field_r;
            var10[var11] = this.field_q;
          }
        }
        return var3;
    }

    public wsa() {
        super(1, false);
        this.field_u = 0;
        this.field_o = 0;
        this.field_s = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
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
        var14 = TombRacer.field_G ? 1 : 0;
        if (param1 != 27261) {
          wsa.c(81);
        }
        if (param3 <= 2048) {
          stackIn_5_0 = (param0 + 4096) * param3 >> 12;
        } else {
          stackIn_5_0 = param0 + (param3 - (param0 * param3 >> 12));
        }
        var5 = stackIn_5_0;
        if (0 < var5) {
          param2 = param2 * 6;
          var6 = param3 + (param3 - var5);
          var7 = (var5 - var6 << 12) / var5;
          var8 = param2 >> 12;
          var9 = -(var8 << 12) + param2;
          var10 = var5;
          var10 = var7 * var10 >> 12;
          var10 = var9 * var10 >> 12;
          var11 = var6 + var10;
          var12 = var5 - var10;
          var13 = var8;
          if (0 != var13) {
            if (var13 != 1) {
              if (var13 != 2) {
                if (var13 == 3) {
                  this.field_q = var5;
                  this.field_r = var12;
                  this.field_t = var6;
                } else {
                  if (4 == var13) {
                    this.field_r = var6;
                    this.field_t = var11;
                    this.field_q = var5;
                  } else {
                    if (var13 == 5) {
                      this.field_r = var6;
                      this.field_q = var12;
                      this.field_t = var5;
                    }
                  }
                }
              } else {
                this.field_r = var5;
                this.field_t = var6;
                this.field_q = var11;
              }
            } else {
              this.field_q = var6;
              this.field_t = var12;
              this.field_r = var5;
            }
          } else {
            this.field_r = var11;
            this.field_q = var6;
            this.field_t = var5;
          }
        } else {
          this.field_q = param3;
          this.field_r = param3;
          this.field_t = param3;
        }
    }

    public static void c(int param0) {
        if (param0 >= -27) {
          field_v = (su) null;
        }
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_26_1 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        stackIn_3_0 = (param3 >= param2) ? param3 : param2;
        var5 = stackIn_3_0;
        stackIn_6_0 = (param3 <= param2) ? param3 : param2;
        var6 = stackIn_6_0;
        stackIn_9_0 = (param1 > var5) ? param1 : var5;
        var5Lifetime1 = stackIn_9_0;
        stackIn_12_0 = (var6 > param1) ? param1 : var6;
        var6Lifetime1 = stackIn_12_0;
        this.field_p = (var6Lifetime1 + var5Lifetime1) / param0;
        var7 = var5Lifetime1 - var6Lifetime1;
        if (this.field_p <= 0) {
          this.field_n = 0;
        } else {
          if (this.field_p >= 4096) {
            this.field_n = 0;
          } else {
            stackIn_16_1 = var7 << 12;
            if (this.field_p > 2048) {
              stackIn_17_2 = 8192 - this.field_p * 2;
            } else {
              stackIn_17_2 = 2 * this.field_p;
            }
            this.field_n = stackIn_16_1 / stackIn_17_2;
          }
        }
        if (var7 <= 0) {
          this.field_m = 0;
        } else {
          var8 = (-param2 + var5Lifetime1 << 12) / var7;
          var9 = (-param3 + var5Lifetime1 << 12) / var7;
          var10 = (-param1 + var5Lifetime1 << 12) / var7;
          if (var5Lifetime1 == param2) {
            if (var6Lifetime1 == param3) {
              stackIn_34_1 = 20480 + var10;
            } else {
              stackIn_34_1 = -var9 + 4096;
            }
            this.field_m = stackIn_34_1;
          } else {
            if (param3 == var5Lifetime1) {
              if (param1 == var6Lifetime1) {
                stackIn_30_1 = var8 + 4096;
              } else {
                stackIn_30_1 = -var10 + 12288;
              }
              this.field_m = stackIn_30_1;
            } else {
              if (param2 == var6Lifetime1) {
                stackIn_26_1 = 12288 + var9;
              } else {
                stackIn_26_1 = 20480 - var8;
              }
              this.field_m = stackIn_26_1;
            }
          }
          this.field_m = this.field_m / 6;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            return;
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_o = param1.b(false);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_u = (param1.c((byte) 44) << 12) / 100;
              }
            } else {
              this.field_s = (param1.c((byte) 36) << 12) / 100;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wsa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int var7;
        var5 = 15 & param3;
        stackIn_3_0 = (var5 < 8) ? param1 : param0;
        var6 = stackIn_3_0;
        if (var5 >= 4) {
          if (12 != var5 &&
            var5 != 14) {
            stackIn_10_0 = param4;
          } else {
            stackIn_10_0 = param1;
          }
        } else {
          stackIn_10_0 = param0;
        }
        var7 = stackIn_10_0;
        if (param2 != 0) {
          return -13;
        }
        if ((1 & var5) != 0) {
          stackIn_15_0 = -var6;
        } else {
          stackIn_15_0 = var6;
        }
        if ((var5 & 2) == 0) {
          stackIn_18_1 = var7;
        } else {
          stackIn_18_1 = -var7;
        }
        return stackIn_15_0 + stackIn_18_1;
    }

    static {
        field_v = new su(11, 0, 1, 2);
    }
}
