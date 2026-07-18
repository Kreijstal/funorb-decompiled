/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends hl {
    int[] field_r;
    int field_t;
    int field_u;
    static String field_l;
    int field_j;
    long field_m;
    static ah field_n;
    int field_p;
    int field_o;
    static ll field_s;
    int field_q;
    static gn field_i;
    int field_k;

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        field_s = null;
    }

    final static float a(ei param0, byte param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float stackIn_5_0 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_4_0 = 0.0f;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_float = 0.0f;
            var3 = 0;
            L1: while (true) {
              if (var3 >= param0.field_e) {
                stackOut_4_0 = var2_float;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var2_float = var2_float + ((wc) param0.field_b[var3]).f(50);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fb.B(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 115 + ')');
        }
        return stackIn_5_0;
    }

    fb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((fb) this).field_p = param3;
            ((fb) this).field_k = param5;
            int fieldTemp$0 = mi.field_b;
            mi.field_b = mi.field_b + 1;
            ((fb) this).field_u = 65535 & fieldTemp$0;
            ((fb) this).field_t = param1;
            ((fb) this).field_o = param4;
            ((fb) this).field_j = param0;
            ((fb) this).field_q = param2;
            ((fb) this).field_r = param6;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "fb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "to over <%0> great games";
        field_s = new ll();
    }
}
