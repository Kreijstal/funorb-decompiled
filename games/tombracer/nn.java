/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static vna field_a;
    static int field_c;

    public static void a() {
        field_a = null;
    }

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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param0;
              var6 = param1 - -param2;
              if (bea.field_b >= param0) {
                stackOut_3_0 = bea.field_b;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 > bea.field_h) {
                stackOut_6_0 = param1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = bea.field_h;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (bea.field_d <= var5_int) {
                stackOut_9_0 = bea.field_d;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var9 = stackIn_10_0;
            L4: {
              if (bea.field_k <= var6) {
                stackOut_14_0 = bea.field_k;
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
              if (param0 < bea.field_b) {
                break L5;
              } else {
                if (bea.field_d > param0) {
                  var11 = param0 + var8 * bea.field_g;
                  var12 = -var8 + var10 + 1 >> 1;
                  L6: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L5;
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 = var11 + 2 * bea.field_g;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (bea.field_h > param1) {
                break L7;
              } else {
                if (bea.field_k > var6) {
                  var11 = var7 + bea.field_g * param1;
                  var12 = -var7 + (var9 + 1) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      bea.field_l[var11] = 16777215;
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
              if (var5_int < bea.field_b) {
                break L9;
              } else {
                if (var5_int < bea.field_d) {
                  var11 = var5_int + (var8 + (-param0 + var5_int & 1)) * bea.field_g;
                  var12 = var10 + 1 + -var8 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 = var11 + 2 * bea.field_g;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (bea.field_h > param1) {
                break L11;
              } else {
                if (bea.field_k > var6) {
                  var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                  var12 = var9 + 1 + -var7 >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "nn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 3;
        field_a = new vna();
    }
}
