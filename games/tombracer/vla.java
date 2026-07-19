/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends ci {
    static String field_m;
    private int field_n;

    final void b(byte param0) {
        if (param0 != 116) {
            this.field_n = -128;
            tka.b((byte) 48);
            return;
        }
        tka.b((byte) 48);
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int var17 = 0;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] stackIn_6_0 = null;
        int[][] stackIn_8_0 = null;
        int[][] stackOut_5_0 = null;
        int[][] stackOut_7_0 = null;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            this.b((byte) -123);
            break L0;
          }
        }
        var22 = this.field_h.a(param0, (byte) 115);
        var19 = var22;
        var18 = var19;
        var3 = var18;
        if (!this.field_h.field_f) {
          return var18;
        } else {
          var23 = this.c(1, param1 + -21, param0);
          var24 = this.c(2, -45, param0);
          var6 = var22[0];
          var7 = var22[1];
          var8 = var22[2];
          var9 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var9 >= ns.field_g) {
                  break L3;
                } else {
                  var10 = 255 & 255 * var23[var9] >> 161605196;
                  var11 = this.field_n * var24[var9] >> 823153740;
                  var12 = lm.field_r[var10] * var11 >> 1097848812;
                  var13 = ou.field_e[var10] * var11 >> 537874092;
                  var14 = (var12 >> 1381407564) + var9 & una.field_b;
                  var15 = hba.field_b & (var13 >> -983615444) + param0;
                  stackOut_5_0 = this.a(var15, 0, -1);
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var17 != 0) {
                    break L2;
                  } else {
                    var16 = stackIn_6_0;
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                    var9++;
                    if (var17 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_7_0 = (int[][]) (var18);
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            return stackIn_8_0;
          }
        }
    }

    public vla() {
        super(3, false);
        this.field_n = 32768;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        uia var15 = null;
        int[] var16 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_8_0 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var16 = this.field_i.a((byte) -128, param1);
          var3 = var16;
          if (this.field_i.field_d) {
            var20 = this.c(1, param0 + -85, param1);
            var21 = this.c(2, -119, param1);
            var6 = 0;
            L0: while (true) {
              if (var6 < ns.field_g) {
                var7 = (4094 & var20[var6]) >> -2094747676;
                var8 = this.field_n * var21[var6] >> 1537868108;
                var9 = lm.field_r[var7] * var8 >> -300688436;
                var10 = ou.field_e[var7] * var8 >> -1312890356;
                var11 = var6 + (var9 >> -2001009108) & una.field_b;
                var12 = hba.field_b & (var10 >> -846579476) + param1;
                var22 = this.c(0, -27, var12);
                stackOut_17_0 = (int[]) (var16);
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var14 == 0) {
                  stackIn_19_0[var6] = var22[var11];
                  var6++;
                  continue L0;
                } else {
                  return stackIn_18_0;
                }
              } else {
                return var16;
              }
            }
          } else {
            return var16;
          }
        } else {
          var15 = (uia) null;
          this.a((byte) 85, (uia) null, -36);
          var16 = this.field_i.a((byte) -128, param1);
          var3 = var16;
          if (this.field_i.field_d) {
            var20 = this.c(1, param0 + -85, param1);
            var21 = this.c(2, -119, param1);
            var6 = 0;
            L1: while (true) {
              if (var6 < ns.field_g) {
                var7 = (4094 & var20[var6]) >> -2094747676;
                var8 = this.field_n * var21[var6] >> 1537868108;
                var9 = lm.field_r[var7] * var8 >> -300688436;
                var10 = ou.field_e[var7] * var8 >> -1312890356;
                var11 = var6 + (var9 >> -2001009108) & una.field_b;
                var12 = hba.field_b & (var10 >> -846579476) + param1;
                var22 = this.c(0, -27, var12);
                stackOut_8_0 = (int[]) (var16);
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var14 != 0) {
                  return stackIn_11_0;
                } else {
                  stackIn_9_0[var6] = var22[var11];
                  var6++;
                  continue L1;
                }
              } else {
                return var16;
              }
            }
          } else {
            return var16;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param2;
                if (-1 == (var4_int ^ -1)) {
                  this.field_n = param1.d(122) << 157721188;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  if (1 == var4_int) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (-2 != (param1.h(255) ^ -1)) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              ((vla) (this)).field_g = stackIn_7_1 != 0;
              break L1;
            }
            if (param0 == 107) {
              break L0;
            } else {
              this.field_n = -22;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("vla.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
            return;
        }
        field_m = null;
    }

    static {
        field_m = "Orb coins: <%0>";
    }
}
