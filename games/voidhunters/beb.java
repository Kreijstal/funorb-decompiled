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
        Class stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_35_0 = null;
        Class stackIn_38_0 = null;
        Class stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_34_0 = null;
        Class stackOut_40_0 = null;
        Class stackOut_37_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_19_0 = null;
        Object stackOut_15_0 = null;
        Class stackOut_6_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_12_0 = Short.TYPE;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  if (param1 == 99) {
                    if (!param0.equals((Object) (Object) "J")) {
                      if (param0.equals((Object) (Object) "Z")) {
                        stackOut_25_0 = Boolean.TYPE;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        if (!param0.equals((Object) (Object) "F")) {
                          if (param0.equals((Object) (Object) "D")) {
                            stackOut_34_0 = Double.TYPE;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0;
                          } else {
                            if (!param0.equals((Object) (Object) "C")) {
                              stackOut_40_0 = Class.forName(param0);
                              stackIn_41_0 = stackOut_40_0;
                              break L0;
                            } else {
                              stackOut_37_0 = Character.TYPE;
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0;
                            }
                          }
                        } else {
                          stackOut_28_0 = Float.TYPE;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      }
                    } else {
                      stackOut_19_0 = Long.TYPE;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  } else {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (Class) (Object) stackIn_16_0;
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
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("beb.D(");
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L1;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
        }
        return stackIn_41_0;
    }

    public final tv a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tj stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        tj stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 66 % ((param0 - -64) / 50);
            stackOut_0_0 = new tj();
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "beb.A(" + param0 + ')');
        }
        return (tv) (Object) stackIn_1_0;
    }

    final static tv a(byte[] param0, int param1, dja param2) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        tv var4 = null;
        Object stackIn_4_0 = null;
        tv stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        tv stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (null == param0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (tv) (Object) stackIn_4_0;
            } else {
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
              stackOut_8_0 = (tv) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("beb.C(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_9_0;
    }

    public final tv[] a(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        tj[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        tj[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 11995) {
              stackOut_3_0 = new tj[param1];
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tv[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "beb.B(" + param0 + ',' + param1 + ')');
        }
        return (tv[]) (Object) stackIn_4_0;
    }

    static {
    }
}
