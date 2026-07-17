/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_c;
    static String[] field_a;
    static String field_b;

    final static String a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!rs.a(param0.charAt(var2_int), (byte) -52)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!rs.a(param0.charAt(var3 - 1), (byte) -52)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_27_0 = var5.toString();
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (String) (Object) stackIn_26_0;
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (!ph.a(-14, (char) var7)) {
                              break L6;
                            } else {
                              var8 = pv.a(124, (char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$1 = var5.append(var8);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("k.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + 0 + 41);
        }
        return stackIn_28_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -13) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"N", "E", "S", "W"};
        field_b = "Difficulty: ";
    }
}
