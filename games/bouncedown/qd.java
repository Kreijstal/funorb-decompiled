/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static boolean field_a;
    static int field_b;

    final static jb a(int param0, int param1, si param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        jb var7 = null;
        java.awt.Frame var8 = null;
        jb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var8 = ed.a(4147, param2, 0, 0, param1, param5);
              var6 = var8;
              if (param3 >= 121) {
                break L1;
              } else {
                field_a = false;
                break L1;
              }
            }
            if (var8 != null) {
              var7 = new jb();
              var7.field_e = var8;
              java.awt.Component discarded$2 = var7.field_e.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param1, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (jb) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("qd.B(").append(0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final static lj a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lj stackIn_4_0 = null;
        lj stackIn_8_0 = null;
        lj stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        lj stackIn_26_0 = null;
        lj stackIn_40_0 = null;
        lj stackIn_45_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_3_0 = null;
        lj stackOut_7_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        lj stackOut_25_0 = null;
        lj stackOut_12_0 = null;
        lj stackOut_39_0 = null;
        lj stackOut_44_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var7 = Bounce.field_N;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = uc.field_E;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = lk.field_t;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var4 < -1 + var2_int) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L2;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                stackOut_25_0 = mh.field_R;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_12_0 = mh.field_R;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                var3 = 0;
                var4 = 26;
                var5 = 0;
                L4: while (true) {
                  if (var2_int > var5) {
                    L5: {
                      var6 = param0.charAt(var5);
                      if (46 == var6) {
                        L6: {
                          if (var5 == 0) {
                            break L6;
                          } else {
                            if (var2_int - 1 == var5) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = mh.field_R;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      } else {
                        if (ve.field_c.indexOf(var6) == -1) {
                          stackOut_44_0 = mh.field_R;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          var3 = 0;
                          break L5;
                        }
                      }
                    }
                    var5++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("qd.A(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + 96 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
