/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ma {
    static String[] field_o;
    int field_l;
    static int field_m;
    int field_n;

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Pool.field_O;
        try {
          L0: {
            L1: {
              var5_int = param3 + param2;
              var6 = param0 - -param1;
              if (param3 > qh.field_b) {
                stackOut_5_0 = param3;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = qh.field_b;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_6_0;
              if (param0 > qh.field_c) {
                stackOut_8_0 = param0;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = qh.field_c;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (qh.field_j > var5_int) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = qh.field_j;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_12_0;
              if (var6 >= qh.field_g) {
                stackOut_14_0 = qh.field_g;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = var6;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_15_0;
              if (qh.field_b > param3) {
                break L5;
              } else {
                if (param3 >= qh.field_j) {
                  break L5;
                } else {
                  var11 = var8 * qh.field_l + param3;
                  var12 = var10 + (1 - var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 = var11 + 2 * qh.field_l;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param0 < qh.field_c) {
                break L7;
              } else {
                if (var6 < qh.field_g) {
                  var11 = qh.field_l * param0 + var7;
                  var12 = 1 + (var9 + -var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < qh.field_b) {
                break L9;
              } else {
                if (qh.field_j <= var5_int) {
                  break L9;
                } else {
                  var11 = var5_int + qh.field_l * (var8 - -(1 & -param3 + var5_int));
                  var12 = -var8 + 1 + var10 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 = var11 + 2 * qh.field_l;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (param0 < qh.field_c) {
                break L11;
              } else {
                if (var6 >= qh.field_g) {
                  break L11;
                } else {
                  var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                  var12 = -var7 + 1 - -var9 >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5, "bj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 2187 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
            return false;
        }
        return lk.field_o;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -4303) {
            boolean discarded$0 = bj.c(-44);
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
