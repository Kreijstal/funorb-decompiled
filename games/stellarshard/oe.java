/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_c;
    static jj field_a;
    static String field_d;

    final static java.awt.Frame a(ej param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        a[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        a[] var10 = null;
        re var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            if (param0.a(126)) {
              L1: {
                if (param3 == 0) {
                  var10 = dl.a(param0, false);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_f != param1) {
                            var8++;
                            break L3;
                          } else {
                            if (var10[var8].field_c != param2) {
                              var8++;
                              break L3;
                            } else {
                              L4: {
                                if (param4 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_e != param4) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_a <= param3) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var7_int = 1;
                              param3 = var10[var8].field_a;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(2019341456, param4, param2, param1, param3);
              L6: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (2 == var11.field_f) {
                      kf.a(var7, 16711935, param0);
                      stackOut_35_0 = null;
                      stackIn_36_0 = stackOut_35_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    return (java.awt.Frame) (Object) stackIn_32_0;
                  }
                } else {
                  jj.a((byte) -114, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var6;
            stackOut_37_1 = new StringBuilder().append("oe.A(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + -1 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_36_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email is valid";
    }
}
