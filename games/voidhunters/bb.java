/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends rqa {
    static String field_o;

    final static void a(ds param0, boolean param1) {
        int var2_int = 0;
        try {
            wl.field_q = param0.e(1869) << 5;
            var2_int = param0.e((byte) -107);
            wl.field_q = wl.field_q + (var2_int >> 3);
            vga.field_d = (7 & var2_int) << 18;
            vga.field_d = vga.field_d + (param0.e(1869) << 2);
            var2_int = param0.e((byte) -118);
            jv.field_b = var2_int << 15 & 2064384;
            vga.field_d = vga.field_d + (var2_int >> 6);
            jv.field_b = jv.field_b + (param0.e((byte) -98) << 7);
            var2_int = param0.e((byte) -126);
            jv.field_b = jv.field_b + (var2_int >> 1);
            qfb.field_o = 65536 & var2_int << 16;
            qfb.field_o = qfb.field_o + param0.e(1869);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bb.C(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 105) {
            field_o = null;
        }
    }

    bb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
              if (param1 <= -119) {
                break L1;
              } else {
                bb.e((byte) -83);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(209, 82));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bb.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Make copy of clicked object";
    }
}
