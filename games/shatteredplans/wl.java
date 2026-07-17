/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static String field_e;
    static bi field_d;
    static String field_b;
    static String field_c;
    static vi field_a;
    static vd field_f;

    final static void a(int param0, int param1, ag[] param2) {
        ag var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ag var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 22) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var6 = param2[param0];
            var3 = var6;
            var4 = param0 + -1;
            L2: while (true) {
              if (var4 < 0) {
                param2[0] = var6;
                break L0;
              } else {
                if (param2[var4].a(var3, -101) >= 0) {
                  param2[1 + var4] = param2[var4];
                  var4--;
                  continue L2;
                } else {
                  param2[var4 - -1] = var6;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("wl.B(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Log in";
        field_b = "Players";
        field_c = "<%1> fleets have retreated to <%0>";
    }
}
