/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wla extends k {
    private int field_k;
    private int field_p;
    private int field_m;
    private int field_l;
    private int[] field_o;
    static String field_n;

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5 = param2;
              if (var5 == 0) {
                this.field_k = param1.e((byte) 95);
                break L1;
              } else {
                if (var5 == 1) {
                  this.field_p = param1.e((byte) 54);
                  break L1;
                } else {
                  if (-3 == (var5 ^ -1)) {
                    this.field_l = param1.e((byte) 118);
                    break L1;
                  } else {
                    if (-4 == (var5 ^ -1)) {
                      this.field_m = param1.e((byte) 108);
                      break L1;
                    } else {
                      if (-5 == (var5 ^ -1)) {
                        var4_int = param1.a(3);
                        this.field_o[0] = dda.a(var4_int, 16711680) << -1753758108;
                        this.field_o[2] = dda.a(var4_int, 255) >> 219524460;
                        this.field_o[1] = dda.a(4080, var4_int >> 867727044);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                wla.d(-67);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("wla.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public wla() {
        super(1, false);
        this.field_k = 409;
        this.field_p = 4096;
        this.field_l = 4096;
        this.field_m = 4096;
        this.field_o = new int[3];
    }

    public static void d(int param0) {
        if (param0 != 1) {
            wla.d(110);
        }
        field_n = null;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        L0: {
          var16 = BachelorFridge.field_y;
          var27 = this.field_h.a(param1, -858);
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (!param0) {
            break L0;
          } else {
            this.field_k = 28;
            break L0;
          }
        }
        L1: {
          if (this.field_h.field_b) {
            var38 = this.a((byte) -120, 0, param1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var29 = var27[0];
            var21 = var29;
            var8 = var21;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L2: while (true) {
              if (var11 >= hh.field_d) {
                break L1;
              } else {
                L3: {
                  var13 = var39[var11];
                  var12 = -this.field_o[0] + var13;
                  if ((var12 ^ -1) <= -1) {
                    break L3;
                  } else {
                    var12 = -var12;
                    break L3;
                  }
                }
                if (var12 > this.field_k) {
                  var29 = var27[0];
                  var32 = var27[1];
                  var40 = var38[1];
                  var29[var11] = var13;
                  var9[var11] = var40[var11];
                  var10[var11] = var41[var11];
                  var11++;
                  continue L2;
                } else {
                  L4: {
                    var29 = var27[0];
                    var32 = var27[1];
                    var40 = var38[1];
                    var14 = var40[var11];
                    var12 = -this.field_o[1] + var14;
                    if (-1 < (var12 ^ -1)) {
                      var12 = -var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (this.field_k >= var12) {
                    L5: {
                      var15 = var41[var11];
                      var12 = -this.field_o[2] + var15;
                      if (-1 < (var12 ^ -1)) {
                        var12 = -var12;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var12 > this.field_k) {
                      var29[var11] = var13;
                      var32[var11] = var14;
                      var33[var11] = var15;
                      var11++;
                      continue L2;
                    } else {
                      var8[var11] = var13 * this.field_m >> -1473340692;
                      var9[var11] = var14 * this.field_l >> 1757431980;
                      var10[var11] = this.field_p * var15 >> 1041614252;
                      var11++;
                      continue L2;
                    }
                  } else {
                    var29[var11] = var13;
                    var32[var11] = var14;
                    var10[var11] = var41[var11];
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    static {
        field_n = "From <%0>: ";
    }
}
