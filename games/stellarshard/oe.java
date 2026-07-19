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
        Object stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_29_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var9 = stellarshard.field_B;
        try {
          L0: {
            if (param0.a(param5 ^ -127)) {
              L1: {
                if (param5 == (param3 ^ -1)) {
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
                            break L3;
                          } else {
                            if (var10[var8].field_c != param2) {
                              break L3;
                            } else {
                              L4: {
                                if (-1 == (param4 ^ -1)) {
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
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(param5 ^ -2019341457, param4, param2, param1, param3);
              L6: while (true) {
                if (-1 != (var11.field_f ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_b);
                  if (var7 != null) {
                    if (2 == var11.field_f) {
                      kf.a(var7, param5 + 16711936, param0);
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_29_0 = null;
                    stackIn_30_0 = stackOut_29_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackOut_35_0 = (RuntimeException) (var6);
            stackOut_35_1 = new StringBuilder().append("oe.A(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_30_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Email is valid";
    }
}
