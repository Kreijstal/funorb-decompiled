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
        }
        try {
            field_t = null;
            field_o = null;
            field_v = null;
            field_y = null;
            field_r = null;
            field_p = null;
            field_z = null;
            field_s = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qn.B(" + param0 + ')');
        }
    }

    final static wp a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wp stackIn_5_0 = null;
        wp stackIn_10_0 = null;
        wp stackIn_18_0 = null;
        int stackIn_28_0 = 0;
        wp stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        wp stackIn_54_0 = null;
        wp stackIn_62_0 = null;
        Object stackIn_66_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_4_0 = null;
        wp stackOut_9_0 = null;
        wp stackOut_53_0 = null;
        wp stackOut_61_0 = null;
        Object stackOut_65_0 = null;
        wp stackOut_17_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        wp stackOut_35_0 = null;
        Object stackOut_39_0 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_4_0 = ab.field_a;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int > 64) {
                stackOut_9_0 = cg.field_a;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (param0.charAt(param1) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if (~var2_int >= ~var4) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            var5 = param0.charAt(var4);
                            if (var5 != 46) {
                              break L4;
                            } else {
                              L5: {
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  if (var4 == var2_int + -1) {
                                    break L5;
                                  } else {
                                    if (var3 == 0) {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              stackOut_53_0 = bp.field_A;
                              stackIn_54_0 = stackOut_53_0;
                              return stackIn_54_0;
                            }
                          }
                          if (gi.field_q.indexOf(var5) == -1) {
                            stackOut_61_0 = bp.field_A;
                            stackIn_62_0 = stackOut_61_0;
                            return stackIn_62_0;
                          } else {
                            var3 = 0;
                            break L3;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_65_0 = null;
                    stackIn_66_0 = stackOut_65_0;
                    break L0;
                  }
                } else {
                  if (34 != param0.charAt(var2_int - 1)) {
                    stackOut_17_0 = bp.field_A;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L6: while (true) {
                      L7: {
                        if (-1 + var2_int <= var4) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var5 = param0.charAt(var4);
                              if (92 == var5) {
                                L10: {
                                  if (var3 != 0) {
                                    stackOut_27_0 = 0;
                                    stackIn_28_0 = stackOut_27_0;
                                    break L10;
                                  } else {
                                    stackOut_25_0 = 1;
                                    stackIn_28_0 = stackOut_25_0;
                                    break L10;
                                  }
                                }
                                var3 = stackIn_28_0;
                                if (var6 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              } else {
                                break L9;
                              }
                            }
                            L11: {
                              if (var5 != 34) {
                                break L11;
                              } else {
                                if (var3 != 0) {
                                  break L11;
                                } else {
                                  stackOut_35_0 = bp.field_A;
                                  stackIn_36_0 = stackOut_35_0;
                                  return stackIn_36_0;
                                }
                              }
                            }
                            var3 = 0;
                            break L8;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (wp) (Object) stackIn_40_0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var2;
            stackOut_67_1 = new StringBuilder().append("qn.A(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L12;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L12;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param1 + ')');
        }
        return (wp) (Object) stackIn_66_0;
    }

    private qn() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "qn.<init>()");
        }
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
