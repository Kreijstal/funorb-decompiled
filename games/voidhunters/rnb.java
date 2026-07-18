/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rnb extends rqa {
    static String field_o;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        if (param5 == param3) {
          if (param2 == param4) {
            param5++;
            og.field_r.c(param5, 1, param0, param4, param3, param2);
            if (param1 <= 1) {
              rnb.a(59, (byte) -18, 107, 110, 95, -108);
              return;
            } else {
              return;
            }
          } else {
            og.field_r.c(param5, 1, param0, param4, param3, param2);
            if (param1 <= 1) {
              rnb.a(59, (byte) -18, 107, 110, 95, -108);
              return;
            } else {
              return;
            }
          }
        } else {
          og.field_r.c(param5, 1, param0, param4, param3, param2);
          if (param1 <= 1) {
            rnb.a(59, (byte) -18, 107, 110, 95, -108);
            return;
          } else {
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 127) {
            field_o = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              si.a(90, 62, param0[0].a(83));
              if (param1 < -119) {
                break L1;
              } else {
                rnb.e((byte) -13);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rnb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    rnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a() {
        return psb.field_b != null ? true : bsa.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> might change the options - wait and see.";
    }
}
