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
                if (-1 == (param0 ^ -1)) {
                  L1: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  L2: {
                    if ((param0 ^ -1) == -2) {
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
                if (-1 != (param0 ^ -1)) {
                  L3: {
                    if ((param0 ^ -1) == -2) {
                      mm.a(false, eg.field_p, 2, 1, true, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    mm.a(false, h.field_d, 2, param1 + 5630, true, 2);
                    if ((param0 ^ -1) == -2) {
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
        Object stackIn_4_0 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 2) {
                break L1;
              } else {
                el.a(115, 46);
                break L1;
              }
            }
            if (cn.a(param0, param3 + 256, param1, param2)) {
              stackOut_5_0 = ti.a(0);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ea) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2) {
            return;
        }
        field_b = null;
    }

    static {
        field_d = '"';
        field_c = false;
        field_a = "Charge: Explosives. Works underwater.";
        field_b = "Micro drill: Allows mining in mid-air.";
    }
}
