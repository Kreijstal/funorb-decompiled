/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String field_d;
    static bd field_f;
    static String[] field_a;
    static bd field_b;
    static int[] field_e;
    static int field_c;

    final static bd[] a(gb param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        bd[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bd[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param3) {
              if (rl.a(2884, param0, param1, param2)) {
                stackIn_7_0 = pa.h(14);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bd[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("mg.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bd[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -12586) {
            return;
        }
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void a(p param0, int param1, int param2, int param3) {
        try {
            si.f(param1, param2, param0.field_e * 2 - -3, 65280, 128 - param0.field_e * 4);
            si.f(param1, param2, param0.field_e + 2, 16776960, 128 + -(4 * param0.field_e));
            si.f(param1, param2, param0.field_e / param3 + 1, 16777215, 128 - param0.field_e * 4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = "Checking";
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = 0;
    }
}
