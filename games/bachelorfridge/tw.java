/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    static kv[] field_c;
    static String field_d;
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 < 44) {
            field_b = (String) null;
        }
    }

    final static void a(int param0, jfa param1, int param2) {
        int var3_int = 0;
        if (!(!bp.e(-29919))) {
            return;
        }
        try {
            sja.field_fb.c(91, (byte) 104);
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            var3_int = sja.field_fb.field_g;
            sja.field_fb.d(param0, 0);
            rha.a(param1.field_g, sja.field_fb, (byte) -81);
            int var4 = 21 / ((param2 - 3) / 60);
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var3_int);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tw.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static cq a(je param0, byte param1) {
        cq var2 = null;
        RuntimeException var2_ref = null;
        cq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_2_0 = null;
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
              var2 = new cq(param0, param0);
              if (param1 == -36) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            rma.field_d.a(var2, true);
            saa.field_a.a(param0);
            stackOut_2_0 = (cq) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("tw.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = "Rated game";
        field_b = "Sudden Death";
        field_a = new int[8192];
    }
}
