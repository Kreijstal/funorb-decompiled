/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    int field_e;
    static String field_b;
    int field_d;
    static int field_h;
    int field_f;
    static String field_c;
    int field_g;
    static int field_j;
    static String field_a;
    static int field_i;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_int = param1.charAt(0);
              if (param0 <= -54) {
                break L1;
              } else {
                ef.a(56);
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              if (var3 >= param1.length()) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int != param1.charAt(var3)) {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ef.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void a(int param0) {
        if (param0 != 31955) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "Left click to select ";
        field_j = 0;
        field_b = "ACT I: ";
        field_h = 66;
        field_c = "Snap Accuracy: ";
    }
}
