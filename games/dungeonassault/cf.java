/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static boolean[] field_b;
    int field_a;
    static hd[] field_c;
    static String field_d;
    va field_e;
    static cn field_f;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 30) {
          cf.a(45);
          field_c = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        nl.field_g.h(param1, param3);
        if (param2 >= 125) {
          L0: {
            if (param0) {
              L1: {
                var4 = jc.field_e % nl.field_g.field_y * 2;
                if (var4 >= nl.field_g.field_y) {
                  var4 = nl.field_g.field_y - (var4 - nl.field_g.field_y);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (10 > var4) {
                var4 = 10;
                rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                break L0;
              } else {
                if (nl.field_g.field_y + -40 < var4) {
                  var4 = -40 + nl.field_g.field_y;
                  rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                  return;
                } else {
                  rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    cf(va param0, int param1) {
        try {
            ((cf) this).field_a = param1;
            ((cf) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static fa a(int param0, va param1, int param2) {
        RuntimeException var3 = null;
        fa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_0_0 = l.a(ni.b(param1, 100, param2));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cf.B(").append(100).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[]{true, true, true, true, false, false};
        field_d = "3D VIEW: ";
    }
}
