/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class i {
    static bb field_b;
    static int field_a;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
    }

    final static void a(od param0, od param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4) {
        try {
            hb.a(param1.field_h, param3, param2, (byte) -41, param1.field_j, param4, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "i.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        je var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4 = (je) (Object) aa.field_e.h(-11151);
            L1: while (true) {
              if (var4 == null) {
                var2 = ql.field_i.h(-11151);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    bj.a(2591, param0);
                    var2 = ql.field_i.e(0);
                    continue L2;
                  }
                }
              } else {
                hl.a(var4, 122, param0);
                var4 = (je) (Object) aa.field_e.e(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2_ref, "i.D(" + param0 + 44 + 0 + 41);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Object var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_21_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
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
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!param1.equals((Object) (Object) "I")) {
                if (!param1.equals((Object) (Object) "S")) {
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (!param1.equals((Object) (Object) "Z")) {
                      L1: {
                        if (param0 == -32512) {
                          break L1;
                        } else {
                          var3 = null;
                          i.a((od) null, (od) null, (java.math.BigInteger) null, (java.math.BigInteger) null, -76);
                          break L1;
                        }
                      }
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_21_0 = Float.TYPE;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (!param1.equals((Object) (Object) "C")) {
                            stackOut_29_0 = Class.forName(param1);
                            stackIn_30_0 = stackOut_29_0;
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
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("i.B(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new bb();
        field_c = new int[64];
    }
}
