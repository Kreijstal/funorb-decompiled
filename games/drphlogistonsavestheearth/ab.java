/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static long field_a;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        field_c = null;
    }

    final static int a(int param0, String param1, String[] param2, rf param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param1);
              if (var5_int > param0) {
                break L1;
              } else {
                if (param1.indexOf("<br>") == -1) {
                  param2[0] = (String) (Object) param2;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (-1 + (var5_int + param0)) / param0;
              param0 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              if (param4 == 14074) {
                break L2;
              } else {
                field_b = -21;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    int incrementValue$2 = var6;
                    var6++;
                    param2[incrementValue$2] = param1.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_22_0 = var6;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param1.substring(var7, var9 + 1).trim();
                  var12 = param3.b(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    int incrementValue$3 = var6;
                    var6++;
                    param2[incrementValue$3] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ab.B(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param4 + 41);
        }
        return stackIn_23_0;
    }

    final static int a(int param0) {
        int var1 = -1;
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_c = "You are not currently logged in to the<nbsp>game.";
    }
}
