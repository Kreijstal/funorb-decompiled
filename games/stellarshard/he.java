/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class he extends gg {
    static String field_k;
    static String field_o;
    static String field_l;
    boolean field_n;
    int[] field_m;

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        int var1 = 33;
        field_l = null;
    }

    final static Class b(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
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
        Class stackOut_9_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_31_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_12_0 = null;
        Object stackOut_5_0 = null;
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
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 < -52) {
                if (param0.equals((Object) (Object) "I")) {
                  stackOut_9_0 = Integer.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!param0.equals((Object) (Object) "S")) {
                    if (!param0.equals((Object) (Object) "J")) {
                      if (param0.equals((Object) (Object) "Z")) {
                        stackOut_19_0 = Boolean.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param0.equals((Object) (Object) "F")) {
                          stackOut_23_0 = Float.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (!param0.equals((Object) (Object) "D")) {
                            if (!param0.equals((Object) (Object) "C")) {
                              stackOut_31_0 = Class.forName(param0);
                              stackIn_32_0 = stackOut_31_0;
                              break L0;
                            } else {
                              stackOut_29_0 = Character.TYPE;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          } else {
                            stackOut_26_0 = Double.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = Long.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = Short.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (Class) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("he.B(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
        return stackIn_32_0;
    }

    final static pb[] a(byte param0, int param1) {
        pb[] var2 = null;
        pb[] var3 = null;
        if (param0 > -107) {
          field_k = null;
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        } else {
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        }
    }

    he() {
        ((he) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Shoots all round";
        field_o = "Waiting for models";
        field_l = "Heavy cannon";
    }
}
