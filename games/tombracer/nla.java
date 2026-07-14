/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nla {
    static String field_b;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 118) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_45_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_43_0 = 0;
        var8 = -(param1 * param6) + param7 * param2;
        if (0 != var8) {
          L0: {
            var9 = param1 * param4 - param3 * param7;
            if (0 >= var8) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = stackIn_5_0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (-1 < (var9 ^ -1)) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          if ((stackIn_8_0 ^ stackIn_8_1) != 0) {
            return -1;
          } else {
            if (param0 == 2749) {
              L2: {
                var10 = 30 + -vd.b(1, var9);
                if (var10 >= param5) {
                  var11 = (var9 << param5) / var8;
                  break L2;
                } else {
                  var8 = var8 >> param5 + -var10;
                  if (-1 == (var8 >> param5 + -var10 ^ -1)) {
                    return -1;
                  } else {
                    var11 = (var9 << var10) / var8;
                    break L2;
                  }
                }
              }
              if (1 << param5 >= var11) {
                if (Math.abs(param1) <= Math.abs(param7)) {
                  var12 = param4 + (param6 * var11 >> param5);
                  if (0 > param7) {
                    if (var12 >= param7) {
                      if (-1 > (var12 ^ -1)) {
                        return -1;
                      } else {
                        return var11;
                      }
                    } else {
                      stackOut_43_0 = -1;
                      stackIn_45_0 = stackOut_43_0;
                      return stackIn_45_0;
                    }
                  } else {
                    if (0 <= var12) {
                      if (var12 > param7) {
                        return -1;
                      } else {
                        return var11;
                      }
                    } else {
                      return -1;
                    }
                  }
                } else {
                  var12 = param3 - -(param2 * var11 >> param5);
                  if (-1 < param1) {
                    if (param1 <= var12) {
                      if ((var12 ^ -1) < -1) {
                        return -1;
                      } else {
                        return var11;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    if (-1 <= var12) {
                      if (param1 < var12) {
                        return -1;
                      } else {
                        return var11;
                      }
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                return -1;
              }
            } else {
              return -58;
            }
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_a = 1;
    }
}
