/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends k {
    private int field_o;
    private int field_w;
    private int field_l;
    static kv field_q;
    private int field_t;
    private int field_v;
    private int field_p;
    static uq field_n;
    private int field_r;
    private int field_s;
    static int field_u;
    static be[] field_m;
    static sba field_k;
    private int field_x;

    public wt() {
        super(1, false);
        this.field_w = 0;
        this.field_l = 0;
        this.field_x = 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        var8 = BachelorFridge.field_y;
        if (param1 != 1) {
          wt.a(19, -118, 72, -6, 50, -27, -99);
        }
        if (eo.field_l <= param5 &&
          pw.field_x >= param0 &&
          an.field_q <= param3 &&
          param4 <= ha.field_n) {
          if (param2 != 1) {
            cma.a(param4, param6, param5, param0, param2, 64, param3);
          } else {
            cv.a(param6, param1 + 28849, param4, param5, param0, param3);
          }
        } else {
          if (1 == param2) {
            nha.a(param6, param4, param3, true, param5, param0);
          } else {
            faa.a(param6, param0, param5, 14040, param4, param3, param2);
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_28_1 = 0;
        int stackIn_33_1 = 0;
        int stackIn_37_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = BachelorFridge.field_y;
        stackIn_3_0 = (param3 > param1) ? param3 : param1;
        var5 = stackIn_3_0;
        if (param2 < 34) {
          return;
        }
        stackIn_8_0 = (var5 < param0) ? param0 : var5;
        var5Lifetime1 = stackIn_8_0;
        stackIn_11_0 = (param1 > param3) ? param3 : param1;
        var6 = stackIn_11_0;
        stackIn_14_0 = (var6 <= param0) ? var6 : param0;
        var6Lifetime1 = stackIn_14_0;
        var7 = -var6Lifetime1 + var5Lifetime1;
        this.field_s = (var6Lifetime1 + var5Lifetime1) / 2;
        if (0 < this.field_s &&
          this.field_s < 4096) {
          stackIn_20_1 = var7 << 12;
          if (this.field_s > 2048) {
            stackIn_21_2 = 8192 - 2 * this.field_s;
          } else {
            stackIn_21_2 = 2 * this.field_s;
          }
          this.field_v = stackIn_20_1 / stackIn_21_2;
        } else {
          this.field_v = 0;
        }
        if (var7 > 0) {
          var8 = (-param3 + var5Lifetime1 << 12) / var7;
          var9 = (-param1 + var5Lifetime1 << 12) / var7;
          var10 = (-param0 + var5Lifetime1 << 12) / var7;
          if (var5Lifetime1 != param3) {
            if (param1 != var5Lifetime1) {
              if (var6Lifetime1 != param3) {
                stackIn_37_1 = -var8 + 20480;
              } else {
                stackIn_37_1 = var9 + 12288;
              }
              this.field_o = stackIn_37_1;
            } else {
              if (var6Lifetime1 == param0) {
                stackIn_33_1 = var8 + 4096;
              } else {
                stackIn_33_1 = -var10 + 12288;
              }
              this.field_o = stackIn_33_1;
            }
          } else {
            if (var6Lifetime1 == param1) {
              stackIn_28_1 = var10 + 20480;
            } else {
              stackIn_28_1 = -var9 + 4096;
            }
            this.field_o = stackIn_28_1;
          }
          this.field_o = this.field_o / 6;
        } else {
          this.field_o = 0;
        }
        return;
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        field_n = null;
        if (param0 != 19564) {
          return;
        }
        field_q = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_w = (param1.b(true) << 12) / 100;
            } else {
              if (2 == var4_int) {
                this.field_l = (param1.b(true) << 12) / 100;
              }
            }
          } else {
            this.field_x = param1.c((byte) -85);
          }
          if (param0 != -71) {
            this.field_o = -52;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wt.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
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
        var14 = BachelorFridge.field_y;
        if (param1 > 2048) {
          stackIn_3_0 = -(param3 * param1 >> 12) + (param3 + param1);
        } else {
          stackIn_3_0 = (4096 + param3) * param1 >> 12;
        }
        var5 = stackIn_3_0;
        if (var5 > 0) {
          param2 = param2 * 6;
          var6 = param1 + (param1 - var5);
          var7 = (-var6 + var5 << 12) / var5;
          var8 = param2 >> 12;
          var9 = param2 - (var8 << 12);
          var10 = var5;
          var10 = var7 * var10 >> 12;
          var10 = var9 * var10 >> 12;
          var11 = var10 + var6;
          var12 = -var10 + var5;
          var13 = var8;
          if (var13 == 0) {
            this.field_p = var5;
            this.field_r = var11;
            this.field_t = var6;
          } else {
            if (var13 == 1) {
              this.field_p = var12;
              this.field_r = var5;
              this.field_t = var6;
            } else {
              if (var13 != 2) {
                if (var13 != 3) {
                  if (var13 == 4) {
                    this.field_p = var11;
                    this.field_r = var6;
                    this.field_t = var5;
                  } else {
                    if (var13 == 5) {
                      this.field_t = var12;
                      this.field_r = var6;
                      this.field_p = var5;
                    }
                  }
                } else {
                  this.field_t = var5;
                  this.field_p = var6;
                  this.field_r = var12;
                }
              } else {
                this.field_p = var6;
                this.field_r = var5;
                this.field_t = var11;
              }
            }
          }
        } else {
          this.field_t = param1;
          this.field_r = param1;
          this.field_p = param1;
        }
        if (param0 != -6) {
          field_m = (be[]) null;
        }
    }

    final static void b(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(param1, (byte) 109);
        var2.d(1, 0);
        if (param0 != -22908) {
          field_m = (be[]) null;
        }
        var2.d(1, 0);
    }

    final int[][] a(boolean param0, int param1) {
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
        var12 = BachelorFridge.field_y;
        if (param0) {
          wt.b(86, -47);
        }
        var20 = this.field_h.a(param1, -858);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_h.field_b) {
          var28 = this.a((byte) -77, 0, param1);
          var31 = var28[0];
          var30 = var28[1];
          var29 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; var11 < hh.field_d; var11++) {
            this.a(var29[var11], var30[var11], (byte) 127, var31[var11]);
            this.field_v = this.field_v + this.field_w;
            this.field_o = this.field_o + this.field_x;
            this.field_s = this.field_s + this.field_l;
            while (this.field_o < 0) {
              this.field_o = this.field_o + 4096;
            }
            while (this.field_o > 4096) {
              this.field_o = this.field_o - 4096;
            }
            if (this.field_v < 0) {
              this.field_v = 0;
            }
            if (this.field_s < 0) {
              this.field_s = 0;
            }
            if (this.field_v > 4096) {
              this.field_v = 4096;
            }
            if (this.field_s > 4096) {
              this.field_s = 4096;
            }
            this.a(-6, this.field_s, this.field_o, this.field_v);
            var8[var11] = this.field_p;
            var9[var11] = this.field_r;
            var10[var11] = this.field_t;
          }
        }
        return var3;
    }

    static {
        field_m = new be[6];
    }
}
