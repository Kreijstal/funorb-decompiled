/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String field_a;
    static int field_b;
    static int field_c;
    static int[] field_d;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1.length()) {
                if (param0 == 96) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  field_c = -105;
                  return false;
                }
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (eh.a((char) var3, false)) {
                    break L2;
                  } else {
                    if (!wc.a(48, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("la.A(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 64) {
            return 110;
        }
        int var3 = param2 >> 31 & param1 - 1;
        return var3 + ((param2 >>> 31) + param2) % param1;
    }

    final static void a(int param0) {
        re.a(0);
        if (kj.field_E != null) {
            wf.a(kj.field_E, false);
        }
        te.a((byte) 98);
        li.a(1392);
        vf.a(79);
        if (jb.b(-125)) {
            d.field_b.d((byte) 76, 1);
            nf.a(0, (byte) 95);
        }
        ec.a((byte) 27);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        int var1 = -33;
    }

    final static void a(int param0, we param1, int param2) {
        ia var3 = null;
        try {
            var3 = d.field_b;
            var3.d((byte) 73, param2);
            var3.a(2, -111);
            var3.a(param0, -73);
            var3.a(param1.field_g, -86);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "la.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Collecting the same power-up as the currently active laser will increase the power of all your weapons.";
        field_b = 64;
        field_c = 0;
    }
}
