/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ou extends wt {
    static char[] field_n;

    ou() {
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_44_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = vu.a(127, param1);
                      if (null == var4) {
                        break L2;
                      } else {
                        if (1 > var4.length()) {
                          break L2;
                        } else {
                          L3: {
                            if (za.a((byte) 117, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                if (param0 == 19069) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      L6: {
                                        if (~var6 <= ~param1.length()) {
                                          break L6;
                                        } else {
                                          var7 = param1.charAt(var6);
                                          stackOut_33_0 = za.a((byte) 117, (char) var7);
                                          stackIn_48_0 = stackOut_33_0 ? 1 : 0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (stackIn_34_0) {
                                                  break L8;
                                                } else {
                                                  var5 = 0;
                                                  if (var8 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var5++;
                                              break L7;
                                            }
                                            L9: {
                                              if (var5 < 2) {
                                                break L9;
                                              } else {
                                                if (param2) {
                                                  break L9;
                                                } else {
                                                  stackOut_44_0 = 0;
                                                  stackIn_45_0 = stackOut_44_0;
                                                  return stackIn_45_0 != 0;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_47_0 = 0;
                                      stackIn_48_0 = stackOut_47_0;
                                      break L5;
                                    }
                                    if (stackIn_48_0 < var5) {
                                      stackOut_51_0 = 0;
                                      stackIn_52_0 = stackOut_51_0;
                                      return stackIn_52_0 != 0;
                                    } else {
                                      stackOut_53_0 = 1;
                                      stackIn_54_0 = stackOut_53_0;
                                      break L0;
                                    }
                                  }
                                } else {
                                  stackOut_29_0 = 1;
                                  stackIn_30_0 = stackOut_29_0;
                                  return stackIn_30_0 != 0;
                                }
                              }
                            }
                          }
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var3;
            stackOut_55_1 = new StringBuilder().append("ou.B(").append(param0).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L10;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + param2 + ')');
        }
        return stackIn_54_0 != 0;
    }

    public static void e(int param0) {
        try {
            field_n = null;
            if (param0 != 108) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ou.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
