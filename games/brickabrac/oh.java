/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_h;
    String field_g;
    static int field_b;
    boolean field_c;
    String[] field_e;
    boolean field_a;
    static int field_f;
    int field_d;

    final static String b() {
        return g.field_m;
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, jp param5) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            param0 = param0 - (param5.field_E + param4);
            if (param0 < 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (~param5.field_D < ~param0) {
                L1: {
                  param1 = param1 - (param3 + param5.field_F);
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (~param1 > ~param5.field_C) {
                      L2: {
                        L3: {
                          param4 = param5.field_G[param0 + param5.field_D * param1];
                          if (param4 == 0) {
                            break L3;
                          } else {
                            if ((-16777216 & param4) == 0) {
                              break L3;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L2;
                            }
                          }
                        }
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      }
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("oh.A(").append(param0).append(44).append(param1).append(44).append(-24).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static String a(byte param0, String param1, String param2, String param3) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var4 = param2.indexOf(param3);
        while (var4 != -1) {
            param2 = param2.substring(0, var4) + param1 + param2.substring(var4 + param3.length());
            var4 = param2.indexOf(param3, param1.length() + var4);
        }
        return param2;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 57) {
            oh.a((byte) 49);
        }
    }

    oh(boolean param0) {
        ((oh) this).field_c = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 1;
    }
}
