/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends k {
    static du field_l;
    static int[] field_k;

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param1.b(16711935) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((jq) this).field_f = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                int[] discarded$2 = ((jq) this).a(-28, -75);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("jq.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Canvas param0) {
        try {
            if (jv.field_j == 11) {
                dja.b(false);
            }
            int discarded$0 = -36;
            nl.a(qd.field_q, mp.field_p, wk.field_b);
            int discarded$1 = 0;
            av.a(0, -77, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jq.D(" + (param0 != null ? "{...}" : "null") + ',' + -128 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          var3 = ((jq) this).field_j.a(param0, -1);
          if (((jq) this).field_j.field_m) {
            var15 = ((jq) this).a(0, param0, (byte) 116);
            var14 = ((jq) this).a(1, param0, (byte) 115);
            var13 = ((jq) this).a(2, param0, (byte) 118);
            var7 = 0;
            L1: while (true) {
              if (var7 >= hh.field_d) {
                break L0;
              } else {
                var8 = var13[var7];
                if (var8 == 4096) {
                  var3[var7] = var15[var7];
                  var7++;
                  continue L1;
                } else {
                  if (0 != var8) {
                    var3[var7] = var8 * var15[var7] + var14[var7] * (-var8 + 4096) >> 12;
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var14[var7];
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param1 == 0) {
            break L2;
          } else {
            field_l = null;
            break L2;
          }
        }
        return var3;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = BachelorFridge.field_y;
          var51 = ((jq) this).field_h.a(param1, -858);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!((jq) this).field_h.field_b) {
            break L0;
          } else {
            var54 = ((jq) this).a(2, param1, (byte) 114);
            var52 = ((jq) this).a((byte) -112, 0, param1);
            var53 = ((jq) this).a((byte) -98, 1, param1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var56 = var52[1];
            var57 = var52[2];
            var58 = var53[0];
            var59 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L1: while (true) {
              if (hh.field_d <= var16) {
                break L0;
              } else {
                var17 = var54[var16];
                if (4096 != var17) {
                  var58 = var53[0];
                  if (var17 == 0) {
                    var58 = var53[0];
                    var7[var16] = var58[var16];
                    var8[var16] = var59[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L1;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var55[var16] * var17 - -(var18 * var58[var16]) >> 12;
                    var8[var16] = var59[var16] * var18 + var17 * var56[var16] >> 12;
                    var9[var16] = var60[var16] * var18 + var57[var16] * var17 >> 12;
                    var16++;
                    continue L1;
                  }
                } else {
                  var7[var16] = var55[var16];
                  var8[var16] = var56[var16];
                  var9[var16] = var57[var16];
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_k = null;
            break L2;
          }
        }
        return var3;
    }

    public static void b() {
        field_k = null;
        field_l = null;
    }

    final static rga a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        rga var7 = null;
        int var8 = 0;
        rga stackIn_4_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_10_0 = null;
        rga stackIn_16_0 = null;
        rga stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        rga stackOut_3_0 = null;
        rga stackOut_18_0 = null;
        rga stackOut_15_0 = null;
        rga stackOut_9_0 = null;
        rga stackOut_6_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = uc.field_j;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int <= 255) {
                var3 = fda.a(-1, '.', param1);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (~var5 <= ~var4.length) {
                      stackOut_18_0 = lia.a(-58, var3[var3.length - 1]);
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      int discarded$2 = 5431;
                      var7 = ol.a(var6);
                      if (var7 != null) {
                        stackOut_15_0 = (rga) var7;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = uc.field_j;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = rm.field_c;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("jq.C(").append(117).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    public jq() {
        super(3, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new du(14, 0, 4, 1);
    }
}
