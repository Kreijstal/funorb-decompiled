/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class nc {
    static dd field_d;
    static String field_c;
    static int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 < 48) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_21_0 = null;
        Class stackOut_31_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param1.equals((Object) (Object) "S")) {
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param1.equals((Object) (Object) "Z")) {
                      stackOut_17_0 = Boolean.TYPE;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_21_0 = Float.TYPE;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (!param1.equals((Object) (Object) "C")) {
                            L1: {
                              if (param0 < -88) {
                                break L1;
                              } else {
                                field_a = null;
                                break L1;
                              }
                            }
                            stackOut_31_0 = Class.forName(param1);
                            stackIn_32_0 = stackOut_31_0;
                            break L0;
                          } else {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            return stackIn_28_0;
                          }
                        } else {
                          stackOut_24_0 = Double.TYPE;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("nc.C(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L2;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    final static void a() {
        int var2 = 0;
        int var1 = -126;
        if (th.field_D <= 32) {
            lg.a(-103, 0);
        } else {
            var2 = th.field_D % 32;
            if (0 == var2) {
                var2 = 32;
            }
            lg.a(-116, th.field_D - var2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End of free game!";
    }
}
