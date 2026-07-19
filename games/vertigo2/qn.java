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

    public static void a(byte param0) {
        if (param0 <= 42) {
          return;
        } else {
          field_t = null;
          field_o = null;
          field_v = null;
          field_y = null;
          field_r = null;
          field_p = null;
          field_z = null;
          field_s = null;
          return;
        }
    }

    final static wp a(String param0, int param1) {
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
        int decompiledRegionSelector0 = 0;
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
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = ab.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -65) {
                stackOut_7_0 = cg.field_a;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(param1) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int > var4) {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if ((gi.field_q.indexOf(var5) ^ -1) == 0) {
                            stackOut_44_0 = bp.field_A;
                            stackIn_45_0 = stackOut_44_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L2;
                          }
                        } else {
                          L3: {
                            if (-1 == (var4 ^ -1)) {
                              break L3;
                            } else {
                              if (var4 == var2_int + -1) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackOut_39_0 = bp.field_A;
                          stackIn_40_0 = stackOut_39_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (34 != param0.charAt(var2_int - 1)) {
                    stackOut_12_0 = bp.field_A;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (-1 + var2_int > var4) {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (92 == var5) {
                            L6: {
                              if (var3 != 0) {
                                stackOut_21_0 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                break L6;
                              } else {
                                stackOut_20_0 = 1;
                                stackIn_22_0 = stackOut_20_0;
                                break L6;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  stackOut_25_0 = bp.field_A;
                                  stackIn_26_0 = stackOut_25_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("qn.A(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L8;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_45_0;
                }
              }
            }
          }
        }
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "This is your RuneScape clan if you have one.";
        field_v = "Press F10 to open Quick Chat.";
        field_o = "<%0> has not yet unlocked this option for use.";
        field_t = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_y = null;
    }
}
