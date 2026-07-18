/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class ah {
    static String field_c;
    static int field_b;
    static String field_d;
    static ln field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void b(byte param0) {
        if (param0 != 90) {
          ah.a((byte) 9, -104);
          vl.field_n.h(32161, 71);
          ir.a(field_a.field_a, (byte) 100, (vh) (Object) vl.field_n, field_a.field_b);
          return;
        } else {
          vl.field_n.h(32161, 71);
          ir.a(field_a.field_a, (byte) 100, (vh) (Object) vl.field_n, field_a.field_b);
          return;
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (!param0.equals((Object) (Object) "Z")) {
                      if (param0.equals((Object) (Object) "F")) {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_28_0 = Class.forName(param0);
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_26_0 = Character.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
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
          L1: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("ah.D(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 90 + ')');
        }
        return stackIn_29_0;
    }

    final static String a(int param0, byte param1, int param2) {
        return p.a(param2, 0, (byte) -123, param0);
    }

    final static void a(byte param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        iw var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (iw) (Object) cg.field_c.e((byte) 107);
            L1: while (true) {
              if (var4 == null) {
                var2 = ta.field_O.e((byte) 116);
                L2: while (true) {
                  if (var2 == null) {
                    if (param0 == 33) {
                      break L0;
                    } else {
                      ah.b((byte) -34);
                      return;
                    }
                  } else {
                    a.a(param1, (byte) -32);
                    var2 = ta.field_O.a((byte) 123);
                    continue L2;
                  }
                }
              } else {
                ot.a((byte) 112, param1, var4);
                var4 = (iw) (Object) cg.field_c.a((byte) 123);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "ah.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "Flying units cannot carry additional melee weapons.";
        field_a = new ln();
    }
}
