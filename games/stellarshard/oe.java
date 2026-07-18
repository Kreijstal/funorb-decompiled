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
        Object stackIn_31_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_30_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
                          if (var10[var8].field_f != 640) {
                            var8++;
                            break L3;
                          } else {
                            if (var10[var8].field_c != 480) {
                              var8++;
                              break L3;
                            } else {
                              L4: {
                                if (var7_int == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_a <= param3) {
                                    break L3;
                                  } else {
                                    break L4;
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
              var11 = param0.a(2019341456, 0, 480, 640, param3);
              L5: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (2 == var11.field_f) {
                      kf.a(var7, 16711935, param0);
                      stackOut_34_0 = null;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_30_0 = null;
                    stackIn_31_0 = stackOut_30_0;
                    return (java.awt.Frame) (Object) stackIn_31_0;
                  }
                } else {
                  jj.a((byte) -114, 10L);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var6;
            stackOut_36_1 = new StringBuilder().append("oe.A(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + 640 + ',' + 480 + ',' + param3 + ',' + 0 + ',' + -1 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_35_0;
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
