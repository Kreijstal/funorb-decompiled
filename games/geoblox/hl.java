/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends el {
    static int[] field_D;
    private dm[] field_F;
    private int field_J;
    private int field_L;
    private int field_E;
    private int field_A;
    private dm field_y;
    private dm field_z;
    private int field_H;
    int field_x;
    private dm field_M;
    private int field_I;
    static int[] field_K;
    static boolean field_G;
    boolean field_C;
    static tf field_B;

    private final dm a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dm var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Geoblox.field_C;
        var14 = new dm(this.field_H * 2, this.field_h);
        Geoblox.a(1, var14);
        var5 = this.field_h >> -1499813087;
        var6 = 0;
        L0: while (true) {
          if (this.field_h <= var6) {
            id.a(param1);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 303611585) * (-1 + this.field_H * 2) % (this.field_H * 2);
              var8 = 16711935 & param2;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (-257 < (var11 ^ -1)) {
                stackOut_4_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> -259500472;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              vb.c(var7, var6, this.field_H, var12);
              vb.c(-(2 * this.field_H) + var7, var6, this.field_H, var12);
              var9 = param0 & 65280;
              var8 = param0 & 16711935;
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1261115064;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            vb.c(this.field_H + var7, var6, this.field_H, var12);
            vb.c(-this.field_H + var7, var6, this.field_H, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_A = 8355711 & param0 >> 1658526497;
        this.field_E = param1;
        this.field_J = param1 >> -1908051263 & 8355711;
        if (param2 != -103) {
            this.e(-107);
        }
        this.field_L = param0;
        this.e(-1326628703);
    }

    private final dm g(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Geoblox.field_C;
        int var2 = this.field_h >> 1430525217;
        dm var3 = new dm(var2, this.field_h);
        if (param0 != 255) {
            return (dm) null;
        }
        Geoblox.a(1, var3);
        for (var4 = 0; var4 < this.field_h; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_h));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                vb.a(var5, var4, var8 << 2019007536 | (var8 | var8 << 407213000));
            }
        }
        id.a(true);
        return var3;
    }

    private final void a(dm param0, int param1, int param2, int param3) {
        dm discarded$1 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var5_int = param2 + this.field_r;
            uh.a(param1, this.field_M.field_r + param2, param3 ^ 6447, this.field_h + param1, var5_int - this.field_M.field_r);
            var6 = param2 + -this.field_I;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  if (param3 == -12276) {
                    break L2;
                  } else {
                    discarded$1 = this.g(1);
                    break L2;
                  }
                }
                L3: {
                  id.a(true);
                  if (this.field_M.field_r + param2 < vb.field_e) {
                    break L3;
                  } else {
                    Geoblox.a(1, this.field_z);
                    param0.b(-this.field_I, 0);
                    param0.b(2 * this.field_H - this.field_I, 0);
                    this.field_y.e(0, 0);
                    id.a(true);
                    this.field_z.b(param2, param1);
                    break L3;
                  }
                }
                L4: {
                  if (vb.field_k >= var5_int - this.field_M.field_r) {
                    Geoblox.a(param3 ^ -12275, this.field_z);
                    var7 = this.field_I + (this.field_r - this.field_M.field_r);
                    L5: while (true) {
                      if (var7 <= 2 * this.field_H) {
                        param0.b(-var7, 0);
                        param0.b(-var7 + this.field_H * 2, 0);
                        this.field_M.e(0, 0);
                        id.a(true);
                        this.field_z.b(-this.field_M.field_r + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_H;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param0.b(var6, param1);
                var6 = var6 + param0.field_r;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("hl.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = -76 % ((param2 - 1) / 43);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var6 = param0 - -this.field_v;
        int var7 = param1 - -this.field_m;
        this.a(this.field_F[0], var7, var6, -12276);
        if (-65537 < (this.field_x ^ -1)) {
            uh.a(var7, var6 - -(this.field_r * this.field_x >> 1475207664), -14045, var7 + this.field_h, this.field_r + var6);
            this.a(this.field_F[1], var7, var6, -12276);
            id.a(true);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        dm discarded$0 = null;
        super.a(param0, param1, (byte) -74, param3, param4);
        this.e(-1326628703);
        if (param2 > -6) {
            discarded$0 = this.g(109);
        }
    }

    private final void e(int param0) {
        this.field_F = new dm[]{this.a(this.field_L, true, this.field_E), this.a(this.field_A, true, this.field_J)};
        this.field_M = this.g(255);
        if (param0 != -1326628703) {
            return;
        }
        this.field_y = this.field_M.c();
        this.field_z = new dm(this.field_h >> -1326628703, this.field_h);
    }

    private hl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_E = param5;
        this.field_H = param4;
        this.field_L = param6;
        this.field_J = param7;
        this.field_A = param8;
        this.a(param3, param2, (byte) -121, param1, param0);
    }

    hl(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -1450193727 & 8355711, param6 >> -1873287327 & 8355711);
    }

    public static void f(int param0) {
        if (param0 != 407213000) {
            hl.f(93);
        }
        field_B = null;
        field_K = null;
        field_D = null;
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_C) {
                break L1;
              } else {
                this.field_I = this.field_I + 1;
                if (this.field_I <= 2 * this.field_H) {
                  break L1;
                } else {
                  this.field_I = this.field_I - 2 * this.field_H;
                  break L1;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_G = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("hl.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_D = new int[4];
        field_G = true;
    }
}
