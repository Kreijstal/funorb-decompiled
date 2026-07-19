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
        if (!param0) {
            field_n = (ah) null;
        }
    }

    final static float a(ei param0, byte param1) {
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        float stackIn_7_0 = 0.0f;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_6_0 = 0.0f;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2_float = 0.0f;
              if (param1 > 14) {
                break L1;
              } else {
                fb.a(false);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= param0.field_e) {
                stackOut_6_0 = var2_float;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var2_float = var2_float + ((wc) (param0.field_b[var3])).f(50);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("fb.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    fb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_p = param3;
            this.field_k = param5;
            fieldTemp$0 = mi.field_b;
            mi.field_b = mi.field_b + 1;
            this.field_u = 65535 & fieldTemp$0;
            this.field_t = param1;
            this.field_o = param4;
            this.field_j = param0;
            this.field_q = param2;
            this.field_r = param6;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "to over <%0> great games";
        field_s = new ll();
    }
}
