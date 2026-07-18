/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ou extends wt {
    static char[] field_n;

    ou() {
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = vu.a(127, param1);
                    if (null == var4) {
                      break L1;
                    } else {
                      if (1 > var4.length()) {
                        break L1;
                      } else {
                        L2: {
                          if (za.a((byte) 117, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (za.a((byte) 117, var4.charAt(-1 + var4.length()))) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (0 < var5) {
                                    stackOut_37_0 = 0;
                                    stackIn_38_0 = stackOut_37_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (za.a((byte) 117, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_32_0 = 0;
                                    stackIn_33_0 = stackOut_32_0;
                                    return stackIn_33_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("ou.B(").append(19069).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L5;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + false + ')');
        }
        return stackIn_38_0 != 0;
    }

    public static void e() {
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
