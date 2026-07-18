/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends li {
    int field_n;
    static lg field_p;
    static String field_z;
    static cr field_s;
    static String field_o;
    static String field_v;
    static boolean field_q;
    static int field_u;
    static v field_y;
    static int field_w;
    static er field_r;
    static String[] field_t;
    int field_x;

    public static void a() {
        field_t = null;
        field_o = null;
        field_v = null;
        field_y = null;
        field_r = null;
        field_p = null;
        field_z = null;
        field_s = null;
    }

    final static wp a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wp stackIn_4_0 = null;
        wp stackIn_8_0 = null;
        wp stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        wp stackIn_26_0 = null;
        wp stackIn_40_0 = null;
        wp stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
        wp stackOut_7_0 = null;
        wp stackOut_44_0 = null;
        wp stackOut_39_0 = null;
        wp stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        wp stackOut_25_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackOut_3_0 = ab.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = cg.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var2_int > var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (gi.field_q.indexOf(var5) == -1) {
                          stackOut_44_0 = bp.field_A;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      } else {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (var4 == var2_int + -1) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = bp.field_A;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (34 != param0.charAt(var2_int - 1)) {
                  stackOut_12_0 = bp.field_A;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (-1 + var2_int > var4) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (92 == var5) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L5;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_25_0 = bp.field_A;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("qn.A(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L7;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ',' + 0 + ')');
        }
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "This is your RuneScape clan if you have one.";
        field_v = "Press F10 to open Quick Chat.";
        field_o = "<%0> has not yet unlocked this option for use.";
        field_t = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_y = null;
    }
}
