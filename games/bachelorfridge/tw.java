/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    static kv[] field_c;
    static String field_d;
    static String field_b;
    static int[] field_a;

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, jfa param1) {
        int var3_int = 0;
        if (!(!bp.e(-29919))) {
            return;
        }
        try {
            sja.field_fb.c(91, (byte) 104);
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            var3_int = sja.field_fb.field_g;
            sja.field_fb.d(param0, 0);
            rha.a(param1.field_g, (lu) (Object) sja.field_fb, (byte) -81);
            int var4 = -21;
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var3_int);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tw.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -63 + 41);
        }
    }

    final static cq a(je param0) {
        cq var2 = null;
        RuntimeException var2_ref = null;
        cq stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_0_0 = null;
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
            var2 = new cq(param0, (bw) (Object) param0);
            rma.field_d.a((bw) (Object) var2, true);
            saa.field_a.a((tda) (Object) param0);
            stackOut_0_0 = (cq) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("tw.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -36 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Rated game";
        field_b = "Sudden Death";
        field_a = new int[8192];
    }
}
