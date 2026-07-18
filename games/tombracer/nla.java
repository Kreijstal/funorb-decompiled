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
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nla.A(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var8_int = -(param1 * param6) + param7 * param2;
            if (0 != var8_int) {
              L1: {
                var9 = param1 * param4 - param3 * param7;
                if (0 >= var8_int) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                stackOut_7_0 = stackIn_7_0;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var9 < 0) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  break L2;
                }
              }
              if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                if (param0 == 2749) {
                  L3: {
                    L4: {
                      var10 = 30 + -vd.b(1, var9);
                      if (~var10 <= ~param5) {
                        break L4;
                      } else {
                        var8_int = var8_int >> param5 + -var10;
                        if (var8_int >> param5 + -var10 == 0) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          var11 = (var9 << var10) / var8_int;
                          if (!TombRacer.field_G) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var11 = (var9 << param5) / var8_int;
                    break L3;
                  }
                  if (~(1 << param5) <= ~var11) {
                    if (~Math.abs(param1) >= ~Math.abs(param7)) {
                      L5: {
                        L6: {
                          L7: {
                            var12 = param4 + (param6 * var11 >> param5);
                            if (0 > param7) {
                              if (~var12 > ~param7) {
                                break L6;
                              } else {
                                if (var12 <= 0) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              if (0 > var12) {
                                break L6;
                              } else {
                                if (~var12 < ~param7) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_63_0 = var11;
                          stackIn_64_0 = stackOut_63_0;
                          break L5;
                        }
                        stackOut_61_0 = -1;
                        stackIn_64_0 = stackOut_61_0;
                        break L5;
                      }
                      break L0;
                    } else {
                      L8: {
                        L9: {
                          L10: {
                            var12 = param3 - -(param2 * var11 >> param5);
                            if (param1 < 0) {
                              if (param1 > var12) {
                                break L9;
                              } else {
                                if (var12 > 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              if (var12 < 0) {
                                break L9;
                              } else {
                                if (param1 < var12) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          stackOut_44_0 = var11;
                          stackIn_47_0 = stackOut_44_0;
                          break L8;
                        }
                        stackOut_46_0 = -1;
                        stackIn_47_0 = stackOut_46_0;
                        break L8;
                      }
                      return stackIn_47_0;
                    }
                  } else {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0;
                  }
                } else {
                  stackOut_17_0 = -58;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var8, "nla.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_64_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_a = 1;
    }
}
