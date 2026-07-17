/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class beb implements dja {
    static int field_a;

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_31_0 = null;
        Class stackIn_34_0 = null;
        Class stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_11_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_35_0 = null;
        Class stackOut_33_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_6_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_11_0 = Short.TYPE;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_22_0 = Boolean.TYPE;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_30_0 = Double.TYPE;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_35_0 = Class.forName(param0);
                            stackIn_36_0 = stackOut_35_0;
                            break L0;
                          } else {
                            stackOut_33_0 = Character.TYPE;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0;
                          }
                        }
                      } else {
                        stackOut_25_0 = Float.TYPE;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      }
                    }
                  } else {
                    stackOut_17_0 = Long.TYPE;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                }
              } else {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("beb.D(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L1;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + 99 + 41);
        }
        return stackIn_36_0;
    }

    public final tv a(byte param0) {
        int var2 = 66 % ((param0 - -64) / 50);
        return (tv) (Object) new tj();
    }

    final static tv a(byte[] param0, int param1, dja param2) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        tv var4 = null;
        tv stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (null != param0) {
              L1: {
                var3 = new faa(param0);
                if (param1 == 6429) {
                  break L1;
                } else {
                  field_a = 26;
                  break L1;
                }
              }
              var4 = param2.a((byte) 52);
              var3.p(-23497);
              var4.a(var3, false);
              var3.f((byte) -87);
              stackOut_6_0 = (tv) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("beb.C(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_7_0;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new tj[param1];
    }

    static {
    }
}
