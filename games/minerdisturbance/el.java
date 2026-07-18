/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    static boolean field_c;
    static String field_a;
    static String field_b;
    static char field_d;

    final static void a(int param0, int param1) {
        L0: {
          if (al.field_s == de.field_b) {
            break L0;
          } else {
            if (aa.field_e != de.field_b) {
              if (param1 == -5629) {
                if (param0 != 0) {
                  L1: {
                    if (param0 == 1) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  L2: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if (param0 == 1) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                el.a(53, -55);
                if (param0 == 0) {
                  L3: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if (param0 == 1) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    if (param0 == 1) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static ea a(int param0, int param1, bj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (cn.a(param0, 258, param1, param2)) {
              stackOut_3_0 = ti.a(0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ea) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = '"';
        field_c = false;
        field_a = "Charge: Explosives. Works underwater.";
        field_b = "Micro drill: Allows mining in mid-air.";
    }
}
