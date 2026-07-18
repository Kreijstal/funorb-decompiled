/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends nt {
    private int field_t;
    private double field_s;
    static int[] field_v;
    private boolean field_u;
    static String field_w;

    public static void e(int param0) {
        if (param0 != 3190) {
            return;
        }
        field_w = null;
        field_v = null;
    }

    eq(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param2, param3);
        ((eq) this).field_t = param4;
        ((eq) this).field_s = (double)param0;
        ((eq) this).field_u = param5 ? true : false;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1 < -121) {
              break L0;
            } else {
              eq.e(-79);
              break L0;
            }
          }
          if (((eq) this).field_u) {
            am.field_j[((eq) this).field_t].a((float)((eq) this).field_k, (float)((eq) this).field_o, -200 + (2048 + -(int)(2048.0 * ((((eq) this).field_s - (double)((eq) this).field_p) / ((eq) this).field_s))), 0, 3, 3 * ((eq) this).field_p << 24, 1);
            return;
          } else {
            uc.field_a.a((float)((eq) this).field_k, (float)((eq) this).field_o, -200 + -(int)(((double)(-((eq) this).field_p) + ((eq) this).field_s) / ((eq) this).field_s * 2048.0) + 2048, 0, 3, ((eq) this).field_p * 2 << 24, 1);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("eq.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[8192];
        field_w = "To Customer Support";
    }
}
