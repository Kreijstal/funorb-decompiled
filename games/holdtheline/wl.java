/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class wl {
    static String[] field_a;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        if (param0 >= param7) {
          if (param5 <= param0) {
            if (param7 >= param5) {
              qe.a(param6, param5, param0, param3, tc.field_b, false, param4, param7, param1);
              return;
            } else {
              qe.a(param4, param7, param0, param3, tc.field_b, false, param6, param5, param1);
              return;
            }
          } else {
            qe.a(param3, param7, param5, param4, tc.field_b, false, param6, param0, param1);
            return;
          }
        } else {
          if (param7 >= param5) {
            if (param0 < param5) {
              qe.a(param4, param0, param7, param6, tc.field_b, false, param3, param5, param1);
              return;
            } else {
              qe.a(param3, param5, param7, param6, tc.field_b, false, param4, param0, param1);
              return;
            }
          } else {
            qe.a(param6, param0, param5, param4, tc.field_b, false, param3, param7, param1);
            return;
          }
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Object stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_14_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_29_0 = null;
        Object stackOut_27_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_7_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (!param0.equals((Object) (Object) "B")) {
              if (!param0.equals((Object) (Object) "I")) {
                if (!param0.equals((Object) (Object) "S")) {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_14_0 = Boolean.TYPE;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (!param0.equals((Object) (Object) "D")) {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_24_0 = Character.TYPE;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            if (param1 >= 8) {
                              stackOut_29_0 = Class.forName(param0);
                              stackIn_30_0 = stackOut_29_0;
                              break L0;
                            } else {
                              stackOut_27_0 = null;
                              stackIn_28_0 = stackOut_27_0;
                              return (Class) (Object) stackIn_28_0;
                            }
                          }
                        } else {
                          stackOut_20_0 = Double.TYPE;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = Float.TYPE;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    }
                  } else {
                    stackOut_10_0 = Long.TYPE;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = Short.TYPE;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = Integer.TYPE;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("wl.C(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
        return stackIn_30_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = 5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_d = "to return to the normal view.";
        field_e = "Shield";
        field_b = "Loading fonts";
        field_c = 0;
    }
}
